package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import java.util.ArrayList;

import javax.persistence.CascadeType;

@Entity
public class Clients {

    @Id
    @Column(name = "id_cliente")
    private long idclient;

    @Column(name = "fullnameclient")
    private String fullnameclient;

    @Column(name = "addressclient")
    private String addressclient;

    @Column(name = "phoneclient")
    private String phoneclient;

    @OneToMany(mappedBy = "Clients", cascade = CascadeType.ALL )
    private List<Casinos> casinos= new ArrayList<>();

    
    public void setIdClient(long val)
    {
        idclient = val;
    }
    public void setFullnameClient(String val)
    {
        fullnameclient = val;
    }

    public void setAddressClient(String val)
    {
        addressclient = val;
    }

    public void setPhoneClient(String val)
    {
        phoneclient = val;
    }

    public Long getIdClient()
    {
        return idclient;
    }
    public String getFullnameClient()
    {
        return fullnameclient;
    }
    public String getAddressClient()
    {
        return addressclient;
    }
    public String setPhoneClient()
    {
        return phoneclient; 
    }

    public List<Casinos> getCasinos()
    {
        return casinos;
    }

    


}