/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
@SessionScoped
public class SessionData implements Serializable, Cloneable {

    private static final Logger LOG = Logger.getLogger(SessionData.class);
    private String sesionId;

    public SessionData() {
    }

    public String getSesionId() {
        return sesionId;
    }

    public void setSesionId(String sesionId) {
        this.sesionId = sesionId;
    }

    @Override
    public String toString() {
        return "SessionData{" + "sesionId=" + sesionId + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
