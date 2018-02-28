/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo5.it.www.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author c1042421
 */
public class DrieCijfers {
    private String naam;
    private ArrayList<Integer> pogingen;

    public DrieCijfers(String naam) {
        this.naam = naam;
        this.pogingen = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    
    public void doePoging() {
        int getal =(int) (900 * Math.random()) + 100;
        pogingen.add(getal);
    }
    
    public void sorteer() {
        Collections.sort(pogingen, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               return (int)o1 - (int)o2;
            }
        });
    }
    
    public int getAantalPogingen() {
        return pogingen.size();
    }
    
    public boolean isZelfdeDrie() {
        int index = getAantalPogingen() -1;
        int getal = pogingen.get(index);
        
        int c1, c2, c3, tussen;
        
        c1 = getal / 100;
        tussen = getal % 100;
        c2 = tussen / 10;
        c3 = tussen % 10;
        
        return c1 == c2 && c2 == c3;
    }

    @Override
    public String toString() {
        String val = "De lijst van " + naam + ": ";
        
        for (Integer poging : pogingen) {
            val += poging.toString() + " ";
        }
        
        return val;
    }
    
    
}
