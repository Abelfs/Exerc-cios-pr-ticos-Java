 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*ALGORITMO AULA 05A:

Classe ContaBanco

**ATRIBUTOS**
PUBLICO numConta:Inteiro
PROTEGIDO tipo:Caractere
PRIVADO dono:Caractere
PRIVADO saldo:Real
PRIVADO status:Lógico

**MÉTODOS**
publico Metodo abrirConta(t:caractere)
    setTipo(t)
    setStatus(verdadeiro)
    Se(t="cc") entao
        setSaldo(50)
    senao se(t="cp") entao
        setSaldo(150)
    FimSe
FimMetodo
publico Metodo fecharConta()
    Se(saldo >0) então
        Escreva("Você tem dinheiro na conta!)
    senão se(saldo <0) então
        Escreva("Você está em débito!)
    senão
        setStatus(false)
    FimSe
FimMetodo
publico Metodo depositar(v:Real)
    Se(status=verdadeiro) então
        setSaldo(getSaldo()+V)
    senão
        Escreva("É impossível depositar!)
    FimSe
FimMetodo
publico Metodo sacar(v:Real)
    Se getStatus()=verdadeiro entao
        se getSaldo()>v
            setSaldo(getSaldo()-v)
        senao
            Escreva("Saldo insuficiente)
        FimSe
    senao
        Escreva("Impossível sacar")
    FimSe
FimMetodo
publico Metodo pagarMensal()
    var v:Real
    se getTipo()="CC" então
        v=12
    senao se getTipo()="CP" entao
        v=20    
    FimSe
    se getStatus()=verdadeiro entao
        se getSaldo>v entao
          setSaldo(getSaldo()-v)
        senao
            Escreva("Saldo insuficiente!)
        FimSe
    senao
        Escreva("Impossível pagar")
    FimSe        
FimMetodo




FimClasse

**METODOS ESPECIAIS**

publico Metodo Construtor()
    saldo=0;
    status=falso;
FimMetodo

**getters & setters**
publico Metodo setNumConta(n:inteiro)
    NumConta=n;
FimMetodo
publico Metodo getNumConta()
    retorne NumConta
FimMetodo
-------------------------------------------
publico Metodo setTipo(t:caractere)
    tipo=t;
FimMetodo
publico Metodo getTipo()
    retorne tipo
FimMetodo
-------------------------------------------
publico Metodo setDono(d:caractere)
    dono=d;
FimMetodo
publico Metodo getDono()
    retorne dono
FimMetodo
-------------------------------------------
publico Metodo setSaldo(s:Real)
    saldo=s;
FimMetodo
publico Metodo setSaldo()
    retorne saldo
FimMetodo
-------------------------------------------
publico Metodo setStatus(s:Logico)
    status=s;
FimMetodo
publico Metodo getStatus()
    retorne status
FimMetodo








*/

package aula05;

/**
 *
 * @author Abel F. da Silva
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1=new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
         p1.abrirConta("CC");
         
         
        ContaBanco p2=new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
        p2.sacar(550);
        p2.fecharConta();
        
         
         
        p1.estadoAtual();
        p2.estadoAtual();       
        
    }
    
}
