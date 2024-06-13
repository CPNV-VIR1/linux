package ch.cpnves.payroll.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Bottle {

    private @Id
    @GeneratedValue Long id;
    private String name;

    public Bottle(){}

    public Bottle(String name){
        this.setName(name);
    }

    public Long getID(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Bottle bottle))
            return false;
        return Objects.equals(this.id, bottle.id) && Objects.equals(this.name, bottle.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString(){
        return "Bottle{" + "id=" + this.getID() + ", name='" + this.getName() + '\'' + '}';
    }
}
