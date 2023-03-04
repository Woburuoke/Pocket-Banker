/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author WOBOH. E N PC
 */
@Entity(name="adverts")
public class Advert implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String header_text;
    private String main_text;
    private String description;
    
    @Column(nullable = true)
    private String photo;
    
    @Column(nullable = true)
    private String background_photo;
    
    public Advert()
    {
        
    }

    public Advert(int id, String header_text, String main_text, String description) 
    {
        this.id = id;
        this.header_text = header_text;
        this.main_text = main_text;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getHeader_text() 
    {
        return header_text;
    }

    public void setHeader_text(String header_text) 
    {
        this.header_text = header_text;
    }

    public String getMain_text() 
    {
        return main_text;
    }

    public void setMain_text(String main_text) 
    {
        this.main_text = main_text;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getPhoto() 
    {
        return photo;
    }

    public void setPhoto(String photo) 
    {
        this.photo = photo;
    }

    public String getBackground_photo() 
    {
        return background_photo;
    }

    public void setBackground_photo(String background_photo) 
    {
        this.background_photo = background_photo;
    }
    
    
}
