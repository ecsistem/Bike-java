/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

/**
 *
 * @author edson
 */
public class Bicicleta {
    private int velocidade, marcha, VelocidadeMaxima;

    public Bicicleta() {
        this.velocidade = 0;
        this.VelocidadeMaxima = 100;
        this.marcha = 0;
    }

    public Bicicleta(int velocidade, int marcha, int limite) {
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.VelocidadeMaxima = limite;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(int VelocidadeMaxima) {
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    public void aumentarMarcha() {
        if (marcha < 7) {
            marcha++;
        } else {
            System.out.println("Você atingiu a marcha máxima.");
        }
    }

    public void diminuirMarcha() {
        if (marcha > 0) {
            marcha--;
        } else {
            System.out.println("Você está na marcha mais baixa.");
        }
    }

    public void acelerar() {
        setVelocidade((velocidade < VelocidadeMaxima) ? velocidade + 1 : velocidade);
        switch (velocidade) {
            case 10:
                aumentarMarcha();
                break;
            case 20:
                aumentarMarcha();
                break;
            case 40:
                aumentarMarcha();
                break;
            case 50:
                aumentarMarcha();
                break;
            case 60:
                aumentarMarcha();
                break;
            case 70:
                aumentarMarcha();
                break;
            case 85:
                aumentarMarcha();
                break;
            default:
                break;
        }
    }

    public void frear() {
        setVelocidade((velocidade > 0) ? velocidade - 1 : velocidade);
        switch (velocidade) {
            case 9:
                diminuirMarcha();
                break;
            case 19:
                diminuirMarcha();
                break;
            case 39:
                diminuirMarcha();
                break;
            case 49:
                diminuirMarcha();
                break;
            case 59:
                diminuirMarcha();
                break;
            case 69:
                diminuirMarcha();
                break;
            case 84:
                diminuirMarcha();
                break;
            default:
                break;
        }
    }

    public String imprimirEstados() {
        return "Bicicleta{" + "velocidade=" + velocidade + ", marcha=" + marcha + ", VelocidadeMaxima=" + VelocidadeMaxima + '}';
    }
}