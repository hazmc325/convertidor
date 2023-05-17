package alura.convertidor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Haziel Morales
 */
public class Convertidor {

    public static void main(String[] args) {
        
        // Se elige la función que se va a ocupar, ya sea convertir monedas o convertir temperatura
        Object[] escogerFuncion = { "Convertir Monedas", "Convertir Temperatura", "Salir" };
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Convertidor Alura",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, escogerFuncion, escogerFuncion[0]);
        
        // Opcion 2 para salir
        if (opcion == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        
        // Opcion 0 para convertir monedas
        if (opcion == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");     //Formato de decimales para la conversión de monedas
            boolean continuarPrograma = true;       // Bandera para continuar con el programa
            while (continuarPrograma) {
                // Opciones de conversión de Pesos Mexicanos
                String[] opcionMonedas = { "Pesos Mexicanos a Euros","Euros a Pesos Mexicanos", "Pesos Mexicanos a Dólares Estadounidenses",
                    "Dólares Estadounidenses a Pesos Mexicanos","Pesos Mexicanos a Libras Esterlinas","Libras Esterlinas a Pesos Mexicanos",
                    "Pesos Mexicanos a Yen","Yen a Pesos Mexicanos","Pesos Mexicanos a Won", "Won a Pesos Mexicanos" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opcionMonedas, opcionMonedas[0]);
                
                //Cantidad de la moneda elegida para convertir
                String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir: ");
                double cantidad;
                try {
                    cantidad = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                //Operaciones según la conversión que se desee hacer
                switch (cambio) {
                    case "Pesos Mexicanos a Euros" -> {
                        double pesoEuro = cantidad * 0.053;
                        JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son "
                                + FormatearDecimal.format(pesoEuro) + " euros.");
                    }
                    case "Euros a Pesos Mexicanos" -> {
                        double euroPeso = cantidad * 19;
                        JOptionPane.showMessageDialog(null, cantidad + " euros son "
                                + FormatearDecimal.format(euroPeso) + " pesos mexicanos.");
                    }
                    case "Pesos Mexicanos a Dólares Estadounidenses" -> {
                        double pesoDolar = cantidad * 0.057;
                        JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son "
                                + FormatearDecimal.format(pesoDolar) + " dólares.");
                    }
                    case "Dólares Estadounidenses a Pesos Mexicanos" -> {
                        double dolarPeso = cantidad * 17.5;
                        JOptionPane.showMessageDialog(null, cantidad + " dólares son "
                                + FormatearDecimal.format(dolarPeso) + " pesos mexicanos.");
                    }
                    case "Pesos Mexicanos a Libras Esterlinas" -> {
                        double pesoLibra = cantidad * 0.046;
                        JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son "
                                + FormatearDecimal.format(pesoLibra) + " libras esterlinas.");
                    }
                    case "Libras Esterlinas a Pesos Mexicanos" -> {
                        double libraPeso = cantidad * 21.84;
                        JOptionPane.showMessageDialog(null, cantidad + " libras esterlinas son "
                                + FormatearDecimal.format(libraPeso) + " pesos mexicanos.");
                    }
                    case "Pesos Mexicanos a Yen" -> {
                        double pesoYen = cantidad * 7.8;
                        JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son "
                                + FormatearDecimal.format(pesoYen) + " yenes japoneses.");
                    }
                    case "Yen a Pesos Mexicanos" -> {
                        double yenPeso = cantidad * 0.13;
                        JOptionPane.showMessageDialog(null, cantidad + " yenes japoneses son "
                                + FormatearDecimal.format(yenPeso) + " pesos mexicanos.");
                    }
                    case "Pesos Mexicanos a Won" -> {
                        double pesoWon = cantidad * 76.74;
                        JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son "
                                + FormatearDecimal.format(pesoWon) + " wones surcoreanos.");
                    }
                    case "Won a Pesos Mexicanos" -> {
                        double wonPeso = cantidad * 0.013;
                        JOptionPane.showMessageDialog(null, cantidad + " wones surcoreanos son "
                                + FormatearDecimal.format(wonPeso) + " pesos mexicanos.");
                    }
                    default -> {
                    }
                }

                // Continuar o salir del programa
                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_OPTION);
                if (confirmar == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }
        
        // Opción 1 para convertir temperaturas
        if (opcion == 1) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##"); //Formato de decimales para temperatura
            Boolean SeguirPrograma = true;          //bandera para continuar con el programa
            while (SeguirPrograma) {

                //Opciones de conversión de temperaturas
                String[] opcionesTemp = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin", "Kelvin a Celsius",
                "Kelvin a Fahrenheit", "Fahrenheit a Kelvin"};
               
                String opcionTemp = (String) JOptionPane.showInputDialog(null, "Elija una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opcionesTemp, opcionesTemp[0]);
                
                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                // Operaciones de conversión
                double resultado;
                switch (opcionTemp) {
                    case "Celsius a Fahrenheit" -> {
                        resultado = (valor * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Celsius son " + FormatearDecimal.format(resultado) + " grados Fahrenheit");
                    }
                    case "Fahrenheit a Celsius" -> {
                        resultado = (valor - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Fahrenheit son " + FormatearDecimal.format(resultado) + " grados Celsius");
                    }
                    case "Celsius a Kelvin" -> {
                        resultado = valor + 273.15;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Celsius son " + FormatearDecimal.format(resultado) + " grados Kelvin");
                    }
                    case "Kelvin a Celsius" -> {
                        resultado = valor - 273.15;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Kelvin son " + FormatearDecimal.format(resultado) + " grados Celsius");
                    }
                    case "Kelvin a Fahrenheit" -> {
                        resultado = ((valor - 273.15) * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Kelvin son " + FormatearDecimal.format(resultado) + " grados Fahrenheit");
                    }
                    case "Fahrenheit a Kelvin" -> {
                        resultado = ((valor - 32) * 5 / 9) + 273.15;
                        JOptionPane.showMessageDialog(null,
                                valor + " grados Fahrenheit son " + FormatearDecimal.format(resultado) + " grados Kelvin");
                    }
                    default -> {
                    }
                }

                // continuar o salir del programa
                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }
        }
    }
}