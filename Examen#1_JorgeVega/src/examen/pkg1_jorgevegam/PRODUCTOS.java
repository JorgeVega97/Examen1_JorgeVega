package examen.pkg1_jorgevegam;

import java.awt.Color;

public abstract class PRODUCTOS {
    private String TIPO;
    private Color COLOR;
    private String DESCRI_ARTI;
    private String ESTILO;
    private int TALLA_TAMA;
    private float CODIGO;
    private Persona REGISTRADOR;

    public PRODUCTOS() {
    }

    public PRODUCTOS(String TIPO, Color COLOR, String DESCRI_ARTI, String ESTILO, int TALLA_TAMA, float COD, Persona REGISTRADOR) {
        this.TIPO = TIPO;
        this.COLOR = COLOR;
        this.DESCRI_ARTI = DESCRI_ARTI;
        this.ESTILO = ESTILO;
        setTALLA_TAMA(TALLA_TAMA);
        setCODIGO(COD);
        this.REGISTRADOR = REGISTRADOR;
    }

    public String getESTILO() {
        return ESTILO;
    }

    public void setESTILO(String ESTILO) {
        this.ESTILO = ESTILO;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(Color COLOR) {
        this.COLOR = COLOR;
    }

    public String getDESCRI_ARTI() {
        return DESCRI_ARTI;
    }

    public void setDESCRI_ARTI(String DESCRI_ARTI) {
        this.DESCRI_ARTI = DESCRI_ARTI;
    }

    public int getTALLA_TAMA() {
        return TALLA_TAMA;
    }

    public void setTALLA_TAMA(int TALLA_TAMA) {
        if (TALLA_TAMA>0) {
            this.TALLA_TAMA = TALLA_TAMA;
        }
        
    }

    public float getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(float CODIGO) {
        if (CODIGO>=0.0 && CODIGO<=100.0) {
            this.CODIGO = CODIGO;
        }
        
    }

    public Persona getREGISTRADOR() {
        return REGISTRADOR;
    }

    public void setREGISTRADOR(Persona REGISTRADOR) {
        this.REGISTRADOR = REGISTRADOR;
    }

    @Override
    public String toString() {
        return "ARTICULO\n" + "TIPO: " + TIPO + ", COLOR: " + COLOR + ", DESCRIPCION: " + DESCRI_ARTI + ", ESTILO: " + ESTILO + ", TALLA_TAMANO: " + TALLA_TAMA + ", CODIGO: " + CODIGO + ", REGISTRADOR: " + REGISTRADOR;
    }

}
