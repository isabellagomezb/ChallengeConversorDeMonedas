
import java.util.Scanner;
import java.net.URI;

public class Principal {
    public static void main(String[] args) {
        Moneda moneda;
        int opciones = 0;
        Double cantidad = 0.0;
        ConsultarMonedas consultar = new ConsultarMonedas();
        Scanner leer = new Scanner(System.in);


        while(opciones != 7){
            System.out.println("****************************");
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("****************************");
            System.out.println("Bienevido(a) al conversor de Monedas");
            System.out.println("Ingresa la opción que deseas: \n"+
                    "1. Dólar a Peso Argentino \n" +
                    "2. Peso Argentino a Dólar \n" +
                    "3. Dólar a Peso Colombiano \n" +
                    "4. Peso Colombiano a Dólar \n" +
                    "5. Real Brasileño a Peso Colombiano \n" +
                    "6. Peso Colombiano a Real Brasileño \n" +
                    "7. Salir");

            try {
                opciones = Integer.parseInt(leer.nextLine());

                switch (opciones){
                    case 1:
                        System.out.println("Dólar a Peso Argentino");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("USD", "ARS", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(USD)" + "son " + moneda.result()+"(ARS)");
                        break;

                    case 2:
                        System.out.println("Peso Argentino a Dólar");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("ARS", "USD", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(ARS)" + "son " + moneda.result()+"(USD)");
                        break;

                    case 3:
                        System.out.println("Dólar a Peso Colombiano ");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("USD", "COP", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(USD)" + "son " + moneda.result()+"(COP)");
                        break;

                    case 4:
                        System.out.println("Peso Colombiano a Dólar");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("COP", "USD", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(COP)" + "son " + moneda.result()+"(USD)");
                        break;

                    case 5:
                        System.out.println("Real Brasileño a Peso Colombiano");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("BRL", "COP", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(BRL)" + "son " + moneda.result()+"(COP)");
                        break;


                    case 6:
                        System.out.println("Peso Colombiano a Real Brasileño");
                        System.out.println("Cantidad que desea convertir:");
                        cantidad = Double.parseDouble(leer.nextLine());
                        moneda = consultar.convertirMoneda("COP", "BRL", cantidad);
                        System.out.println("La tasa de conversión es de: "+ moneda.conversion_rates());
                        System.out.println(cantidad + "(COP)" + "son " + moneda.result()+"(BRL)");
                        break;



                }
            } catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }
}