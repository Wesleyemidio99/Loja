package org.example;

public class Crediario {
    private int parcelas;
    private double valor;

    private double jurosMulta = 0.20;
    private double jurosDias = 0.02;


    public Crediario(int parcelas, double valor) {
        this.parcelas = parcelas;
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void jurosParcelas(){
        double valorMes = valor / parcelas;
        double valorMulta = valorMes * (1+jurosMulta);
        double valorJurosDias = valorMes * (1+jurosDias);
    }


}
