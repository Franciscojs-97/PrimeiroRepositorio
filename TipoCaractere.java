/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaPrincipal;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author franc
 */
public class TipoCaractere extends PlainDocument{

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(i, string.replaceAll("[^0-9]", ""), as); //Para aceitar apenas números de 0 a 9
    }
   
   }
    
    

