package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Games {

    @Id
    @Column(name = "idgame")
    private Long idgame;

    @Column(name = "namegame" )
    private String namegame;

    @Column(name = "typegame")
    private String typegame;

    @Column(name = "descriptiongame")
    private String descriptiongame;


    @ManyToOne(fetch  = FetchType.LAZY)
    @JoinColumn(name = "id_machine")


    private Machines machines;

    public void setIdGame(Long id)
    {
        idgame = id;
    }
    public void setNameGame(String val)
    {
        namegame = val;
    }
    public void setTypeGame(String val)
    {
        typegame = val;
    }
    public void setDescriptionGame(String val)
    {
        descriptiongame = val;
    }

    public Long getIdGame()
    {
        return idgame;
    }
    public String getNameGame()
    {
        return namegame;
    }
    public String getTypeGame()
    {
        return typegame;
    }
    public String getDescriptionGame()
    {
        return descriptiongame;
    }

    public Machines getMachines() {
		return machines;
	}
}