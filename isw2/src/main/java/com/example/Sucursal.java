package com.example;

public class Sucursal {

    int numSuc;
    String calle;
    int altura;
    String codPost;

    public Sucursal(){};

    public Sucursal(int numSuc, String calle, int altura, String codPost) {
        this.numSuc = numSuc;
        this.calle = calle;
        this.altura = altura;
        this.codPost = codPost;
    }

    public int getNumSuc() {
        return numSuc;
    }

    public void setNumSuc(int numSuc) {
        this.numSuc = numSuc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCodPost() {
        return codPost;
    }

    public void setCodPost(String codPost) {
        this.codPost = codPost;
    }

    @Override
    public String toString() {
        return "Sucursal [numSuc=" + numSuc + ", calle=" + calle + ", altura=" + altura + ", codPost=" + codPost + "]";
    }
    
    
    
    
    
}
