
package br.com.cooperativa.service;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 *
 * @author ezequiel
 */
public class FacesMessages implements Serializable {
    private void add(String message, Severity severity ){
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg = new FacesMessage(message);
        msg.setSeverity(severity);
        
        context.addMessage(null, msg);
        
    }
    
    public void info(String message){
        add(message, FacesMessage.SEVERITY_INFO);
        
    }
    
    public void erro(String message){
        add(message, FacesMessage.SEVERITY_ERROR);
        
    }
    
    public void alerta(String message){
        add(message, FacesMessage.SEVERITY_WARN);
    }
    
    
    
}
