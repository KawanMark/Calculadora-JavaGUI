/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Div;
import model.Multi;
import model.OperacaoMatematica;
import model.Soma;
import model.Sub;
import view.Janela;

/**
 *
 * @author unifkasilva
 */
public class Controller {
    private Janela j;
    private OperacaoMatematica calc;
    private String n1, n2;
    
    public Controller(Janela j){
        this.j = j;
    }
    
    public void controlzero(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "0"); 
    }
    
    public void controlUm(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "1");
        
    }
    
    public void controlDois(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "2");
        
    }
    
    public void controlTres(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "3");
        
    }
    
    public void controlQuatro(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "4");
        
    }
    
    public void controlCinco(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "5");
        
    }
    
    public void controlSeis(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "6");
        
    }
    
    public void controlSete(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "7");
        
    }
    
    public void controlOito(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "8");
        
    }
    
    public void controlNove(){
        String texto = j.getTxtDisplay().getText();
        j.getTxtDisplay().setText(texto + "9");
        
    }
    
    public void controlSoma(){
        n1 = j.getTxtDisplay().getText();
        calc = new Soma();
        j.getTxtDisplay().setText("");
        
    }
    
    public void controlSub(){
        n1 = j.getTxtDisplay().getText();
        calc = new Sub();
        j.getTxtDisplay().setText("");
        
    }
    
    public void controlMulti(){
        n1 = j.getTxtDisplay().getText();
        calc = new Multi();
        j.getTxtDisplay().setText("");
        
    }
    
    public void controlDiv(){
        n1 = j.getTxtDisplay().getText();
        calc = new Div();
        j.getTxtDisplay().setText("");
        
    }
    
    public void controlIgual(){
        n2 = j.getTxtDisplay().getText();
        double r = calc.calcular(Double.parseDouble(n1), Double.parseDouble(n2));
        j.getTxtDisplay().setText(String.valueOf(r));
    }
    
    public void controlC(){
        j.getTxtDisplay().setText("");
    }
    
}
