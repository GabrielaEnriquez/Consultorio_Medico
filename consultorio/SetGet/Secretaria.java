/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico.SetGet;

/**
 *
 * @author Lupita
 */
public class Secretaria {
    String usuario;
    String password;
    String encabezadoCorreo;
    String direccionDestino;
    String direccionConsultorio;
    String descripcionCorreo;
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncabezadoCorreo() {
        return encabezadoCorreo;
    }

    public void setEncabezadoCorreo(String encabezadoCorreo) {
        this.encabezadoCorreo = encabezadoCorreo;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getDireccionConsultorio() {
        return direccionConsultorio;
    }

    public void setDireccionConsultorio(String direccionConsultorio) {
        this.direccionConsultorio = direccionConsultorio;
    }

    public String getDescripcionCorreo() {
        return descripcionCorreo;
    }

    public void setDescripcionCorreo(String descripcionCorreo) {
        this.descripcionCorreo = descripcionCorreo;
    }
    
}
