package org.example.utente.personale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmministratoreTest {

    @Test
    public void testGetName() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        assertEquals("John", amministratore.getName());
    }

    @Test
    public void testGetSurname() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        assertEquals("Doe", amministratore.getSurname());
    }

    @Test
    public void testGetDepartment() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        assertEquals("HR", amministratore.getDepartment());
    }

    @Test
    public void testSetName() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        amministratore.setName("Jane");
        assertEquals("Jane", amministratore.getName());
    }

    @Test
    public void testSetSurname() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        amministratore.setSurname("Foe");
        assertEquals("Foe", amministratore.getSurname());
    }

    @Test
    public void testSetDepartment() {
        Amministratore amministratore = new Amministratore("John", "Doe", "HR");
        amministratore.setDepartment("IT");
        assertEquals("IT", amministratore.getDepartment());
    }

}
