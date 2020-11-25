package examen.pkg1_jorgevegam;

import java.awt.Color;

public class OBJ_HOGAR extends PRODUCTOS{
    private String DESCRI_HOGAR;
    private String INTRUCCIONES_FUNCI;
    private int GARANTIA;

    public OBJ_HOGAR() {
    }

    public OBJ_HOGAR(String DESCRI_HOGAR, String INTRUCIONES_FUNCI, int GARANTIA, String TIPO, Color COLOR, String DESCRI_ARTI, String ESTILO, int TAMA, float COD, Persona REGISTRADOR) {
        super(TIPO, COLOR, DESCRI_ARTI, ESTILO, TAMA, COD, REGISTRADOR);
        this.DESCRI_HOGAR = DESCRI_HOGAR;
        this.INTRUCCIONES_FUNCI = INTRUCIONES_FUNCI;
        setGARANTIA(GARANTIA);
    }

    public int getGARANTIA() {
        return GARANTIA;
    }

    public void setGARANTIA(int GARANTIA) {
        if (GARANTIA>=0) {
            this.GARANTIA = GARANTIA;
        }
        
    }

    public String getDESCRI_HOGAR() {
        return DESCRI_HOGAR;
    }

    public void setDESCRI_HOGAR(String DESCRI_HOGAR) {
        this.DESCRI_HOGAR = DESCRI_HOGAR;
    }

    public String getINTRUCCIONES_FUNCI() {
        return INTRUCCIONES_FUNCI;
    }

    public void setINTRUCCIONES_FUNCI(String INTRUCCIONES_FUNCI) {
        this.INTRUCCIONES_FUNCI = INTRUCCIONES_FUNCI;
    }

    @Override
    public String toString() {
        return "OBJETOS DE HOGAR\n" + "DESCRIPCION: " + DESCRI_HOGAR + ", INSTRUCCIONES DE FUNCIONAMIENTO: " + INTRUCCIONES_FUNCI + ", TIEMPO DE GARANTIA: " + GARANTIA;
    }
    
}
