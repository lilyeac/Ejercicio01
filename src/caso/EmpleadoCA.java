package caso;


public class EmpleadoCA {

	
			
			private static String tipo;
			private static double salario=0;
	     	private static double ventasMes=0;
			private static int horaExtra;
			
			public static float calculaSalarioBruto(String tipo,
					float ventasMes, float horasExtra){
				
				if(tipo == "vendedor"&& salario==1000){
					if(ventasMes >=1000) {
						salario=salario+100;
						horaExtra=20;
					}
					else if(ventasMes<=1500) {
						salario =salario+200;
					}
					 
									
				else {
					salario=1500;
					
				}
				}
				return horasExtra;
			}
		
					
}	