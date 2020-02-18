package com.otrelo.Otrelo.model;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;

public class Member {
    Integer id = null;
    String nome = "";
    String equipe = "";
    String cargo = "";
    ArrayList<String> tarefas = new ArrayList<>();
}
