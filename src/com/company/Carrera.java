package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Carrera {
    private Integer distancia;
    private Integer premioEnDolares;
    private Integer nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehículos;

    public Carrera(Integer distancia, Integer premioEnDolares, Integer nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    private Carrera() {
        listaDeVehículos = new ArrayList<>();
    }

    //todo podría mejorar el método creando un nuevo que defina si puedo o no agregar las cantidades.
    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente) {
        //contar la cantidad de vehículos que tiene la lista
        int cantidadDeVehículosAlMomento = 0;
        for (Vehiculo listaDeVehículo : listaDeVehículos) {
            cantidadDeVehículosAlMomento++;
        }
        //continuar si hay cupo
        if (cantidadDeVehiculosPermitidos >= cantidadDeVehículosAlMomento) {
            //llama al constructor del VehiculoAuto y le asigna los valores
            Vehiculo unVehiculo = new VehiculoAuto(velocidad, aceleracion, anguloDeGuiro, patente);
            //agrega a la lista de Vehiculos el auto asignado
            listaDeVehículos.add(unVehiculo);
            System.out.println("Se a agregado el vehículo patente: " + unVehiculo.getPatente());
        } else System.out.println("La cantidad de vehículos permitida ya está llena");
    }

    public void darDeAltaMoto(Integer velocidad, Integer aceleracion, Integer anguloDeGuiro, String patente) {
        //contar la cantidad de vehículos que tiene la lista
        int cantidadDeVehículosAlMomento = 0;
        for (Vehiculo listaDeVehículo : listaDeVehículos) {
            cantidadDeVehículosAlMomento++;
        }
        //continuar si hay cupo
        if (cantidadDeVehiculosPermitidos >= cantidadDeVehículosAlMomento) {
            //llama al constructor del VehiculoAuto y le asigna los valores
            Vehiculo unVehiculo = new VehiculoMoto(velocidad, aceleracion, anguloDeGuiro, patente);
            //agrega a la lista de Vehiculos el auto asignado
            listaDeVehículos.add(unVehiculo);
            System.out.println("Se a agregado el vehículo patente: " + unVehiculo.getPatente());
        } else System.out.println("La cantidad de vehículos permitida ya está llena");
    }

    public void eliminarVehiculo(Vehiculo unVehiculo) {
        //tengo que comprar cada vehículo con el equals --> primero cambiar el equals.
        //recorro el arraylist y si es equals lo elimino
        for (Vehiculo listaDeVehículo : listaDeVehículos) {
            if (unVehiculo.equals(listaDeVehículo)) {
                listaDeVehículos.remove(unVehiculo);
            }
        }
    }

    public void eliminarVehiculoConPatente(String unaPatente) {
        for (Vehiculo listaDeVehículo : listaDeVehículos) {
            if (unaPatente.equals(listaDeVehículo.getPatente())) {
                listaDeVehículos.remove(listaDeVehículo);
            }
        }
    }
}
