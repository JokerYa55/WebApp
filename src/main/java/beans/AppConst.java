/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

/**
 *
 * @author vasil
 */
@ApplicationScoped
public class AppConst {

    private static final Logger LOG = Logger.getLogger(AppConst.class);

    private String id = UUID.randomUUID().toString();
    private final ConcurrentHashMap<String, Object> sessionList = new ConcurrentHashMap<String, Object>();

    public AppConst() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConcurrentHashMap<String, Object> getSessionList() {
        return sessionList;
    }

    @Override
    public String toString() {
        return "AppConst{" + "id=" + id + '}';
    }
}
