/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author soulw
 */
public class Operations {
    private int firstIndex;
    private int secondIndex;
    
    public void setFirstIndex(int index){
        this.firstIndex=index;
    }
    public void setSecondIndex(int index){
        this.secondIndex=index;
    }
    public int getFirstIndex(){
        return this.firstIndex+1;
    }
    public int getSecondIndex(){
        return this.secondIndex+1;
    }
    
    public float conversor(float valor){
        float conversion=0;
        switch(getFirstIndex()){
            case 1://USD
                switch(getSecondIndex()){
                    case 1://USD
                        conversion=valor*1;
                        break;
                    case 2://MXN
                        conversion=(float) ((valor) * (17.42));
                        break;
                    case 3://AUD
                        conversion=(float) ((valor) * (1.50));
                        break;
                    case 4://YEN
                        conversion=(float) ((valor) * (136.39));
                        break;
                }
                break;
            case 2://MXN
                switch(getSecondIndex()){
                    case 1://USD
                        conversion=(float) (valor*0.057);
                        break;
                    case 2://MXN
                        conversion=(float) ((valor) * (1));
                        break;
                    case 3://AUD
                        conversion=(float) ((valor) * (0.086));
                        break;
                    case 4://YEN
                        conversion=(float) ((valor) * (7.8));
                        break;
                }     
                break;
            case 3://AUD
                switch(getSecondIndex()){
                    case 1://USD
                        conversion=(float) (valor*0.67);
                        break;
                    case 2://MXN
                        conversion=(float) ((valor) * (11.65));
                        break;
                    case 3://AUD
                        conversion=(float) ((valor) * (1));
                        break;
                    case 4://YEN
                        conversion=(float) ((valor) * (90.79));
                        break;
                }     
                break;
            case 4://YEN
                switch(getSecondIndex()){
                    case 1://USD
                        conversion=(float) (valor*0.0073);
                        break;
                    case 2://MXN
                        conversion=(float) ((valor) * (0.13));
                        break;
                    case 3://AUD
                        conversion=(float) ((valor) * (0.011));
                        break;
                    case 4://YEN
                        conversion=(float) ((valor) * (1));
                        break;
                }     
                break;
        }
        return conversion;
    }
}
