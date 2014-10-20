/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mustang
 */
public class TestAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Camaro r = new Camaro();
        r.setColor("Rojo"); r.setTransmission("Cuenta con transmicion");
        r.setNumeroDeCilindros(10); r.setMarca("Chevrolet");
        r.setVeloz(210); r.setCamVel(4);
        r.setEnc("Encendido"); r.setApag("Apagado");
        r.setTip("Camaro");
        
        System.out.println(r.getColor());
        System.out.println(r.getTransmission());
        System.out.println(r.getNumeroDeCilindros());
        System.out.println(r.getMarca());
                        
        Coche f;
        f = r;  
        System.out.println(f.getVelocidad());
        System.out.println(f.getChangeGerar());
        System.out.println(f.getEncender());
        System.out.println(f.getArrancar());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        ///////////////////////////////////////////////////////////////////////
        Ferrari r2 = new Ferrari();
        r2.setColor("Azul"); r2.setTransmission("Cuenta con transmicion");
        r2.setNumeroDeCilindros(10); r2.setMarca("Italiano");
        r2.setVeloz(310); r2.setCamVel(4);
        r2.setEnc("Encendido"); r2.setApag("Apagado");
        r2.setTip("Ferrari");
        
        System.out.println(r2.getColor());
        System.out.println(r2.getTransmission());
        System.out.println(r2.getNumeroDeCilindros());
        System.out.println(r2.getMarca());
                        
        Coche f2;
        f2 = r2;  
        System.out.println(f2.getVelocidad());
        System.out.println(f2.getChangeGerar());
        System.out.println(f2.getEncender());
        System.out.println(f2.getArrancar());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        ///////////////////////////////////////////////////////////////////////
        Jeep r3 = new Jeep();
        r3.setColor("Verde"); r3.setTransmission("Cuenta con transmicion");
        r3.setNumeroDeCilindros(10); r3.setMarca("Jeep");
        r3.setVeloz(150); r3.setCamVel(5);
        r3.setEnc("Encendido"); r3.setApag("Apagado");
        r.setTip("Jeep");
        
        System.out.println(r3.getColor());
        System.out.println(r3.getTransmission());
        System.out.println(r3.getNumeroDeCilindros());
        System.out.println(r3.getMarca());
                        
        Coche f3;
        f3 = r3;  
        System.out.println(f3.getVelocidad());
        System.out.println(f3.getChangeGerar());
        System.out.println(f3.getEncender());
        System.out.println(f3.getArrancar());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        ///////////////////////////////////////////////////////////////////////
        Vocho r4 = new Vocho();
        r4.setColor("Blanco"); r4.setTransmission("Cuenta con transmicion");
        r4.setNumeroDeCilindros(10); r4.setMarca("VW");
        r4.setVeloz(90); r4.setCamVel(1);
        r4.setEnc("Encendido"); r4.setApag("Apagado");
        r4.setTip("Vocho");
        
        System.out.println(r4.getColor());
        System.out.println(r4.getTransmission());
        System.out.println(r4.getNumeroDeCilindros());
        System.out.println(r4.getMarca());
                        
        Coche f4;
        f4 = r4;  
        System.out.println(f4.getVelocidad());
        System.out.println(f4.getChangeGerar());
        System.out.println(f4.getEncender());
        System.out.println(f4.getArrancar());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        ///////////////////////////////////////////////////////////////////////
    }
    
}
