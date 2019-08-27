/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author vasil
 */
@Stateless
public class testEjb {
    public String say(){
        return "say";
    }
}
