/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciolibro1;

import java.util.Random;

/**
 *
 * @author Hermes
 */
public class ListaAleatoria
{
public static void main(String [] a)
{
 Random r;
 int d;
 Lista lista;
 int k;
 r = new Random();
 lista = new Lista(); // crea lista vacía
 k = Math.abs(r.nextInt()% 55); // número de nodos
 // se insertan elementos en la lista
 for (; k > 0; k-- )
 {
 d = r.nextInt() % 99 ;
 lista.insertarCabezaLista(d);
 }
 // recorre la lista para escribir sus elementos
 System.out.println("Elementos de la lista generados al azar");
 lista.visualizar();
}
}
