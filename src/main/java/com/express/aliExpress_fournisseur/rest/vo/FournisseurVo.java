/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_fournisseur.rest.vo;

import java.io.Serializable;

/**
 *
 * @author Ibtissam
 */
public class FournisseurVo implements Serializable{
    
    private String reference;
    private String login;
    private String motDePasse;
    
    private PaysVo paysVo;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public PaysVo getPaysVo() {
        return paysVo;
    }

    public void setPaysVo(PaysVo paysVo) {
        this.paysVo = paysVo;
    }
    
}
