/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petstore;
import Bussiness.*;
import Data.*;
import JFrameMain.*;
import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author voanh
 */
public class PetStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        jF_ChuCuaHang a = new jF_ChuCuaHang();
        a.setVisible(true);
        */
        
        jFLogin a = new jFLogin();
        a.setVisible(true);

    }
}
