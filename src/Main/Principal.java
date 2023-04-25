/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
        try {
            ServidorSocket servidor = new ServidorSocket();
            servidor.rodarServidor();
        } catch (Exception e) {
            System.out.println("Exceção:" + e);
        }
    }
}
