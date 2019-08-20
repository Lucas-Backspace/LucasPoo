package jogo;

//@author Aluno Lucas P.

public class Dado {
    
    private int valorFace = 0;
    
    public int getValorFace(){
        return valorFace;
    }
    public void setValorFace(){
        valorFace = (int) (1 + Math.random()*6);
    }
    
    

    /*
    public void setValorFace(int valorFace) {
        this.valorFace = valorFace;
    }
    */
    
}
