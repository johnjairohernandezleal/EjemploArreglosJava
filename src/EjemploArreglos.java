public class EjemploArreglos {

    public static void main(String[] args) {
        // declaracion de un arreglo de enteros
        int edades[];
        // 2 instanciar el arreglo de enteros
        edades = new int[3];
        //3 inicializamos los valores del arreglo enteros
        edades[0]=30;
        edades[1]= 15;
        edades[2]= 20;

        // imprimimos los valores del arreglo a la salida estandar
        // 4.leemos cada valor del arreglo
        System.out.println("arreglo de enteros en la posicion 0 = " + edades[0]);
        System.out.println("arreglo de enteros en la posicion 1 = " + edades[1]);
        System.out.println("arreglo de enteros en la posicion 2 = " + edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("i + edades = " + i + " :"+ edades[i]);
            
        }
         // declaracion de arreglo tipo Object
        Persona personas[];
        //2 Instancia del arreglo tipo Object
        personas = new Persona[4];
        //3 inicializacion de valores del arreglo
         personas[0]= new Persona("juan");
        personas[1]= new Persona("karla");
        // imprimir los valores del arreglo
        System.out.println("arreglo personas en el indice 0: " + personas[0]);
        System.out.println("arreglo personas en el indice 1: " + personas[1]);
        System.out.println("arreglo personas en el indice 2: " + personas[2]);
        System.out.println("arreglo personas en el indice 3: " + personas[3]);


        // arreglo utilizando notacion simplificada
        String nombres[]={"sara","laura","carlos","carmen"};
        //imprimir los elementos de un arreglo
        for (int i = 0; i< nombres.length ; i++) {
            System.out.println(" el arreglo string indice " + i + ":" + nombres[i]);

        }


            

    }
}
