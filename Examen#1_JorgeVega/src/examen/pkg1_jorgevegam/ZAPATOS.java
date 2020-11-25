package examen.pkg1_jorgevegam;

import java.awt.Color;

public class ZAPATOS extends PRODUCTOS{
    private int GARANTIA_DEVOLUCIONES;
    private String DESCRI_ZAPA;
    private int COMODIDAD;

    public ZAPATOS() {
    }

    public ZAPATOS(int GARANTIA, String DESCRI_ZAPATOS, int COMODIDAD, String TIPO, Color COLOR, String DESCRI_ARTI, String ESTILO, int TALLA_TAMA, float COD, Persona REGISTRADOR) {
        super(TIPO, COLOR, DESCRI_ARTI, ESTILO, TALLA_TAMA, COD, REGISTRADOR);
        setGARANTIA_DEVOLUCIONES(GARANTIA);
        this.DESCRI_ZAPA = DESCRI_ZAPATOS;
        setCOMODIDAD(COMODIDAD);
    }

    public int getCOMODIDAD() {
        return COMODIDAD;
    }

    public void setCOMODIDAD(int COMODIDAD) {
        if (COMODIDAD>0 && COMODIDAD<11) {
            this.COMODIDAD = COMODIDAD;
        }
    }

    public int getGARANTIA_DEVOLUCIONES() {
        return GARANTIA_DEVOLUCIONES;
    }

    public void setGARANTIA_DEVOLUCIONES(int GARANTIA_DEVOLUCIONES) {
        if (GARANTIA_DEVOLUCIONES>0) {
            this.GARANTIA_DEVOLUCIONES = GARANTIA_DEVOLUCIONES;
        }
        
    }

    public String getDESCRI_ZAPA() {
        return DESCRI_ZAPA;
    }

    public void setDESCRI_ZAPA(String DESCRI_ZAPA) {
        this.DESCRI_ZAPA = DESCRI_ZAPA;
    }

    @Override
    public String toString() {
        return "ZAPATOS\n" + "MESES PARA CAMBIO O DEVOLUCIONES: " + GARANTIA_DEVOLUCIONES + ", DESCRIPCION: " + DESCRI_ZAPA + ", COMODIDAD: " + COMODIDAD;
    }
    
}
