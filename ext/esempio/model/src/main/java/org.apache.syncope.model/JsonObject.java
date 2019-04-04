package org.apache.syncope.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * <p>Model di riferimento per la chiamata JSON</p>
 *
 * @author Mattia Di Federico
 * @since 1.0-SNAPSHOT
 * @version 1.0-SNAPSHOT
 */
@XmlRootElement( name = "JsonObject", namespace = "http://difedericomattia.example.com" )
@XmlType( name = "JsonObject", namespace = "http://difedericomattia.example.com",
        propOrder = { "nome", "cognome", "eta", "dataNascita" } )
@XmlAccessorType( XmlAccessType.FIELD )
public class JsonObject {
    private String nome;
    private String cognome;
    private int eta;
    private Date dataNascita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }


    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
