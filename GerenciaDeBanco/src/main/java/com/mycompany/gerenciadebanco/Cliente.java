package com.mycompany.gerenciadebanco;

public class  Cliente{
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
    
    public Cliente (String nome, String sobrenome,String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
        public double getSaldo() {
        return saldo;
    }
    //Metodo da classe cliente
    public void consultarSaldo(){
        System.out.println("Seu saldo atual R$ " + saldo);
} //Fim metodo consultarSaldo
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    } //fim do metodo depositar
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
            
        } else {
            System.out.println("Saldo insuficiente ou valor do saldo ivalido");
        }    
    } //Fim do metodo sacar
} //Fim da classe cliente
