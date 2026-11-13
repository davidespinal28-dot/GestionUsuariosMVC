/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionusuariosmvc;

import Controlador.UsuarioController;
import Vista.UsuarioView;

/**
 *
 * @author davidespinal
 */
public class Main {
    public static void main(String[] args) {
        UsuarioView vista = new UsuarioView();
        UsuarioController controlador;
        controlador = new UsuarioController(vista);
        
        controlador.iniciar();
    }
}
