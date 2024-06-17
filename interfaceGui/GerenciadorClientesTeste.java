/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceGui;

import a3.GerenciadorCliente;

/**
 *
 * @author gabri
 */
public class GerenciadorClientesTeste {
    
      private static GerenciadorCliente instance;

    private GerenciadorClientesTeste() {
    }

    public static synchronized GerenciadorCliente getInstance() {
        if (instance == null) {
            instance = new GerenciadorCliente(10); // inicializa com tamanho inicial de 10
        }
        return instance;
    }
}
