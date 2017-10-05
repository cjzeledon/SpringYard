package com.theironyard.charlotte.BigCatCRUD.models;

import javax.persistence.*;

@Entity
@Table(name="bigcats")
public class BigCat {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    private String family;

    @Column
    private String genus;

    @Column
    private String species;

    @Column
    private boolean criticallyEndangered;

    @Column
    private boolean endangered;

    @Column
    private boolean threatened;

    @Column
    private Integer population;

    @Column String image;

    public BigCat() {
    }

    public BigCat(Integer id, String family, String genus, String species, boolean criticallyEndangered, boolean endangered, boolean threatened, Integer population, String image) {
        this.id = id;
        this.family = family;
        this.genus = genus;
        this.species = species;
        this.criticallyEndangered = criticallyEndangered;
        this.endangered = endangered;
        this.threatened = threatened;
        this.population = population;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isCriticallyEndangered() {
        return criticallyEndangered;
    }

    public void setCriticallyEndangered(boolean criticallyEndangered) {
        this.criticallyEndangered = criticallyEndangered;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }

    public boolean isThreatened() {
        return threatened;
    }

    public void setThreatened(boolean threatened) {
        this.threatened = threatened;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", family='" + family + '\'' +
                ", genus='" + genus + '\'' +
                ", species='" + species + '\'' +
                ", criticallyEndangered=" + criticallyEndangered +
                ", endangered=" + endangered +
                ", threatened=" + threatened +
                ", population=" + population +
                '}';

    }
}
