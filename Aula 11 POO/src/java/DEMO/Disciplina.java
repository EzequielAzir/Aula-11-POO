/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DEMO;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fatec
 */
public class Disciplina {
    
    private String Sigla;
    private String Nome;
    private String Emenda;
    private String DiaSemana;
    private String Horario;

    public Disciplina(String Sigla, String Nome, String Emenda, String DiaSemana, String Horario) {
        this.Sigla = Sigla;
        this.Nome = Nome;
        this.Emenda = Emenda;
        this.DiaSemana = DiaSemana;
        this.Horario = Horario;
    }       

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmenda() {
        return Emenda;
    }

    public void setEmenda(String Emenda) {
        this.Emenda = Emenda;
    }

    public String getDiaSemana() {
        return DiaSemana;
    }

    public void setDiaSemana(String DiaSemana) {
        this.DiaSemana = DiaSemana;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}

