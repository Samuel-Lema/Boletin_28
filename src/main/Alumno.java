package main;

import javax.swing.JOptionPane;

public class Alumno {
    
    private String nome;
    private int nota;
    private Enderezo enderezo;
    
    class Enderezo {
        
        private String rua;
        private int numero;
        
        // Constructor

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }
        
        // Metodos de Acceso

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }
        
        // To String

        @Override public String toString() {
            return "Enderezo { " + "rua: " + rua + ", numero: " + numero + " }";
        }
    }
    
    // Constructor

    public Alumno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    // Metodos de Acceso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }
    
    // Metodo para cambiar la nota
    
    public void cambiarNota(){
        
        this.nota = Integer.parseInt(JOptionPane.showInputDialog("Añade la nueva nota"));
    }
    
    // To String

    @Override public String toString() {
        return "Alumno { " + "nome: " + nome + ", nota: " + nota + ", " + enderezo + " }";
    }
    
    
}
