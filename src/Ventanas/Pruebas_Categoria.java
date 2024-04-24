/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ventanas;

import Clases.Categoria;
import Clases.Categoria_Producto;
import Clases.Productos;
import dao.DaoCategoria;
import dao.DaoCategoria_Productos;
import dao.DaoProductos;
import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Pruebas_Categoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoProductos dao = new DaoProductos();
        DaoCategoria daoC = new DaoCategoria();
        DaoCategoria_Productos daoc_p = new DaoCategoria_Productos();
        ArrayList<Categoria> categorias = new ArrayList<>();
        ArrayList<Categoria_Producto> Cat_P = new ArrayList<>();
        ArrayList<String> categoriastab = new ArrayList<>();

        categoriastab.clear();
        ArrayList<Productos> productosList = dao.readProductos();
        for (int i = 0; i < productosList.size(); i++) {
            Cat_P = daoc_p.readClase_Ps(productosList.get(i).getId());
            System.out.println("Producto id " + productosList.get(i).getId());
            if (Cat_P.isEmpty()) {
                categoriastab.add("no hay nada");
            } else {
                categoriastab.add("ojo");
            }

            System.out.println("\n");

            Cat_P.clear();
        }

        for (int i = 0; i < categoriastab.size(); i++) {
            System.out.println(categoriastab.get(i));
        }

    }

}
