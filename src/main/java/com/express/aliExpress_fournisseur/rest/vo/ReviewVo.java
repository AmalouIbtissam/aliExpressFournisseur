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
public class ReviewVo implements Serializable{
    
     private String reference;
    private String commentaire;
    private String noteEvaluation;
    private String referenceCommande;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNoteEvaluation() {
        return noteEvaluation;
    }

    public void setNoteEvaluation(String noteEvaluation) {
        this.noteEvaluation = noteEvaluation;
    }

    public String getReferenceCommande() {
        return referenceCommande;
    }

    public void setReferenceCommande(String referenceCommande) {
        this.referenceCommande = referenceCommande;
    }
    
}
