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
public class Machines {
   
    @Id
    @Column(name = "id_machine")
    private long idmachine;

    @Column(name = "reference" )
    private String reference;

    @Column(name = "model")
    private String model;

    @ManyToOne(fetch  = FetchType.LAZY)
    @JoinColumn(name="id_casino")
    private Casinos casinos;


    @OneToMany(mappedBy = "Machines", cascade = CascadeType.ALL )
    private List<Games> games = new ArrayList<>();


    public void setIdMachine(long val)
    {
        idmachine = val;
    }
    public void setReference(String val)
    {
        reference = val;
    }
    public void setModel(String val)
    {
        model = val;
    }
    public void setCasinos(Casinos casinos)
    {
        this.casinos = casinos;
    }
    public long getIdMachine()
    {
        return idmachine;
    }
    public String getReference()
    {
        return reference;
    }
    public String getModel()
    {
        return model;
    }
    public Casinos getCasinos()
    {
        return casinos;
    }
    public List<Games> getGames()
    {
        return games;
    }


}