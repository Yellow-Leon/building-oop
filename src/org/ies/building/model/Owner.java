package org.ies.building.model;

import java.util.Objects;

public class Owner {
    private String nif;
    private String name;
    private String lastname;

    public Owner(String nif, String name, String lastname) {
        this.nif = nif;
        this.name = name;
        this.lastname = lastname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(nif, owner.nif) && Objects.equals(name, owner.name) && Objects.equals(lastname, owner.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, lastname);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
