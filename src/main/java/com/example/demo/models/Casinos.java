package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Casinos{
    @Id
    @Column(name = "id_casino")
    private long idcasino;

    @Column(name = "namecasino")
    private String namecasino;

    @Column(name= "addresscasino")
    private String addresscasino;

    @Column(name = "descriptioncasino")
    private String descriptioncasino;


    @ManyToOne (fetch = FetchType.LAZY )
    @JoinColumn(name="id_cliente")    
    private Clients client;


    @OneToMany(mappedBy = "Casinos", cascade = CascadeType.ALL)
    private List<Machines> machines = new ArrayList<>();


    public void setIdCasino(long val)
    {
        idcasino = val;
    }
    public void setNameCasino(String val)
    {
        namecasino = val;
    }
    public void setAddressCasino(String val)
    {
        addresscasino = val;
    }
    public void setDescriptionCasino(String val)
    {
        descriptioncasino = val;
    }
    public void setClients(Clients cliente)
    {
        client = cliente;
    }
    public long getIdCasino()
    {
        return idcasino;
    }
    public String getNameCasino()
    {
        return namecasino;
    }
    public String getAddressCasino()
    {
        return addresscasino;
    }

    public String getDescriptionCasino()
    {
        return descriptioncasino;
    }

    public Clients getClients() {
		return client;
	}

    public List<Machines> getMachines()
    {
        return machines;
    }

}