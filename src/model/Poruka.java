/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author vldmrk
 */
public class Poruka implements Serializable {

    private int id;
    private User posiljalac;
    private User primalac;
    private String text;
    private Date vreme;

    public Poruka() {
    }

    public Poruka(int id, User posiljalac, User primalac, String text, Date vreme) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.text = text;
        this.vreme = vreme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(User posiljalac) {
        this.posiljalac = posiljalac;
    }

    public User getPrimalac() {
        return primalac;
    }

    public void setPrimalac(User primalac) {
        this.primalac = primalac;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getVreme() {
        return vreme;
    }

    public void setVreme(Date vreme) {
        this.vreme = vreme;
    }

    @Override
    public String toString() {
        return "Poruka{" + "posiljalac=" + posiljalac + ", primalac=" + primalac + ", text=" + text + ", vreme=" + vreme + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Poruka other = (Poruka) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        if (!Objects.equals(this.posiljalac, other.posiljalac)) {
            return false;
        }
        if (!Objects.equals(this.primalac, other.primalac)) {
            return false;
        }
        return Objects.equals(this.vreme, other.vreme);
    }

}
