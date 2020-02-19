/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royalfurniture;

import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class Validation {
    public void char_validation(java.awt.event.KeyEvent evt, JTextField t)
    {
        char ch=evt.getKeyChar();
        if(!Character.isDigit(ch)||(evt.getKeyCode()==evt.VK_DELETE)||(evt.getKeyCode()==evt.VK_BACK_SPACE))
        {
            
        }
        else
        {
            evt.consume();
        }
    }
    
    public void num_validation(java.awt.event.KeyEvent evt,JTextField t)
    {
        char ch=evt.getKeyChar();
        if(Character.isDigit(ch)||(evt.getKeyCode()==evt.VK_DELETE)||(evt.getKeyCode()==evt.VK_BACK_SPACE)||(evt.getKeyCode()==evt.VK_ENTER)||(evt.getKeyChar()=='.'))
        {
                     
        }
        else
        {
            evt.consume();
        }
    }
}
