/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recepcija.controller;

import java.util.List;
import recepcija.model.Soba;
import recepcija.pomocno.HibernateUtil;

/**
 *
 * @author Petar
 */
public class ObradaSoba {

    private Obrada<Soba> obrada;

    public ObradaSoba() {
        obrada = new Obrada<>();
    }

    public List<Soba> getSobe(String uvjet) {
        return HibernateUtil.getSession().createQuery(
        " from Soba a where a.obrisano=false "
                + " "
        
        

        
        )
               
    }
}
