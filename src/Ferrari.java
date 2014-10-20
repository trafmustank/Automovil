/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mustang
 */
public class Ferrari implements Coche{
    private String color;
    private String Transmission;
    private int numeroDeCilindros;
    private String marca;
    private float veloz;
    private int camVel;
    private String enc;
    private String apag;
    private String tip;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public int getNumeroDeCilindros() {
        return numeroDeCilindros;
    }

    public void setNumeroDeCilindros(int numeroDeCilindros) {
        this.numeroDeCilindros = numeroDeCilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVeloz() {
        return veloz;
    }

    public void setVeloz(float veloz) {
        this.veloz = veloz;
    }

    public int getCamVel() {
        return camVel;
    }

    public void setCamVel(int camVel) {
        this.camVel = camVel;
    }

    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc;
    }

    public String getApag() {
        return apag;
    }

    public void setApag(String apag) {
        this.apag = apag;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    
    public float getVelocidad() {
        return veloz;
    }

    public int getChangeGerar() {
        return camVel;
    }

    public String getEncender() {
        return enc;
    }

    public String getArrancar() {
        return apag;
    }

    public String getTipo() {
        return tip;
    }
}
