
package PDFEClases;


public class Ccontador {
    //declarar variables
    private int contar;

    //constructor por defecto
    public Ccontador() {
    }

    //constructor con parámetros
    public Ccontador(int contar) {
        if (contar < 0) {
            this.contar = 0;
        } else {
            this.contar = contar;
        }
    }

    public int getContar() {
        return contar;
    }

    public void setContar(int contar) {
         if (contar < 0) {
            this.contar = 0;
        } else {
            this.contar = contar;
        }
    }

   

    //método incrementar contador
    public void incrementar() {
        contar++;
    }

    //método decrementar contador
    public void decrementar() {
        contar--;
        if (contar < 0) {
            contar = 0;
        }
    }
}
