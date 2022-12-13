/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sv;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USUARIO
 */
@WebService(serviceName = "MetodosPrueba")
public class MetodosPrueba {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "potencia")
    public Double potencia(@WebParam(name = "base") double base, @WebParam(name = "exponente") double exponente) {
        double resultado = 0;
        resultado = Math.pow(base, exponente);
        return resultado;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "parimpar")
    public String parimpar(@WebParam(name = "numero") double numero) {
        String mensaje = "";
        if (numero % 2 == 0) {
            mensaje = "El número " + numero + " es par";
        } else {
            mensaje = "El número " + numero + " es impar";
        }
        return mensaje;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "diccionario")
    public String diccionario(@WebParam(name = "palabra") String palabra) {
        String respuesta = "";
        try {
            if (palabra.equals("Null")) {
                respuesta = "";
            } else {
                HashMap<String, String> hm = new HashMap<String, String>();
                hm.put("Programación", "Es el proceso de crear un conjunto de instrucciones que le dicen a una computadora como realizar algún tipo de tarea.");
                hm.put("Socket", "Designa un concepto abstracto por el cual dos procesos pueden intercambiar cualquier flujo de datos, generalmente de manera fiable y ordenada.");
                hm.put("Python", "Es un lenguaje de alto nivel de programación interpretado cuya filosofía hace hincapié en la legibilidad de su código");
                hm.put("Oracle", "Se encarga de la gestión de bases de datos, la gestión del almacenamiento, la alta disponibilidad y la escalabilidad");
                hm.put("Java", "Es multiplataforma, capaz de ejecutarse en la mayoría de sistemas operativos y dispositivos, con una única base de código.");
                hm.put("Navegador", "Son programas de ordenador diseñados para facilitar la visualización de páginas Web en Internet.");
                hm.put("Software", "Es un término genérico que designa al conjunto de programas de distinto tipo que hacen posible operar con el ordenador.");
                hm.put("Hardware", "Conjunto de componentes materiales de un sistema informático que representa cada una de las partes físicas que forman un ordenador.");
                hm.put("Monitor", "Pantalla de visualización que se usa para presentar la salida de un computador, una cámara, una videograbadora u otro generador de video.");
                hm.put("CPU", "Es el componente del computador y otros dispositivos programables, que interpreta las instrucciones contenidas en los programas y procesa los datos.");
                boolean res = hm.containsKey(palabra);
                if (res == true) {
                    String definicion = hm.get(palabra);
                    respuesta = "La definición es: " + definicion;
                } else {
                    respuesta = "No se encuentra la palabra";
                }
            }
        } catch (Exception e) {
            respuesta = "Campo Vacío";
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operaciones")
    public String operaciones(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2) {
        String respuesta = "";
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        respuesta = "La suma es: " + suma + " ******* " + "La resta es: " + resta + " ******* " + 
                "La multiplicación es: " + multiplicacion + " ******* " + "La división es: " + division;
        
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "desplazamiento")
    public String desplazamiento(@WebParam(name = "velocidad") double velocidad, @WebParam(name = "tiempo") double tiempo, @WebParam(name = "aceleracion") double aceleracion) {
        String respuesta = "";
        double resultado = ((velocidad * tiempo) + (aceleracion / 2) * (Math.pow(tiempo, 2)));
        respuesta = "El desplazamiento es: " + resultado;
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "gravitacionuniversal")
    public String gravitacionuniversal(@WebParam(name = "masa1") double masa1, @WebParam(name = "masa2") double masa2, @WebParam(name = "distancia") double distancia) {
        String respuesta = "";
        double total=(Math.pow(6.67*10, -11)) *((masa1 * masa2)/(Math.pow(distancia, 2)));
        respuesta = "La fuerza es: " + total + " N";
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "alturamaxima")
    public String alturamaxima(@WebParam(name = "velocidad") double velocidad, @WebParam(name = "angulo") double angulo) {
        String respuesta = "";
        double total=(Math.pow((velocidad * Math.sin(angulo)),2))/(2*9.8);
        respuesta = "La altura máxima es: " + total + " mtrs";
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        if (usuario.equals("BryamTenecota") && contraseña.equals("Bryam123")){
            return true;
        } else{
            return false;
        }
    }

    
}
