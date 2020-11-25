package examen.pkg1_jorgevegam;

import java.awt.Color;

public class ROPA extends PRODUCTOS{
    private int GARANTIA_DEVOLUCIONES;
    private String MARCA;
    private String MADE_IN;

    public ROPA() {
    }

    public ROPA(int GARANTIA, String MARCA, String MADE_IN, String TIPO, Color COLOR, String DESCRI_ARTI, String ESTILO, int TALLA_TAMA, float COD, Persona REGISTRADOR) {
        super(TIPO, COLOR, DESCRI_ARTI, ESTILO, TALLA_TAMA, COD, REGISTRADOR);
        setGARANTIA_DEVOLUCIONES(GARANTIA);
        this.MARCA = MARCA;
        this.MADE_IN = MADE_IN;
    }

    public String getMADE_IN() {
        return MADE_IN;
    }

    public void setMADE_IN(String MADE_IN) {
        this.MADE_IN = MADE_IN;
    }

    public int getGARANTIA_DEVOLUCIONES() {
        return GARANTIA_DEVOLUCIONES;
    }

    public void setGARANTIA_DEVOLUCIONES(int GARANTIA_DEVOLUCIONES) {
        if (GARANTIA_DEVOLUCIONES>0) {
            this.GARANTIA_DEVOLUCIONES = GARANTIA_DEVOLUCIONES;
        }
        
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    @Override
    public String toString() {
        return "ROPA\n" + "CODIGO: " + GARANTIA_DEVOLUCIONES + ", MARCA: " + MARCA + ",HECHO EN: " + MADE_IN;
    }
    
}
