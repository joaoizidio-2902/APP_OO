/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cg3023087
 */
public class Tipo_Carro {
    private String Modelo_Carro, Placa_Carro, Quilometragem_Carro, Dono_Carro;

    public Tipo_Carro(String Modelo_Carro, String Placa_Carro, String Quilometragem_Carro, String Dono_Carro) {
        this.Modelo_Carro = Modelo_Carro;
        this.Placa_Carro = Placa_Carro;
        this.Quilometragem_Carro = Quilometragem_Carro;
        this.Dono_Carro = Dono_Carro;
    }
    public Tipo_Carro(String Modelo_Carro, String Placa_Carro, String Dono_Carro) {
        this.Modelo_Carro = Modelo_Carro;
        this.Placa_Carro = Placa_Carro;
        this.Dono_Carro = Dono_Carro;
    }

    public String getDono_Carro() {
        return Dono_Carro;
    }

    public void setDono_Carro(String Dono_Carro) {
        this.Dono_Carro = Dono_Carro;
    }

    public String getModelo_Carro() {
        return Modelo_Carro;
    }

    public void setModelo_Carro(String Modelo_Carro) {
        this.Modelo_Carro = Modelo_Carro;
    }

    public String getPlaca_Carro() {
        return Placa_Carro;
    }

    public void setPlaca_Carro(String Placa_Carro) {
        this.Placa_Carro = Placa_Carro;
    }

    public String getQuilometragem_Carro() {
        return Quilometragem_Carro;
    }

    public void setQuilometragem_Carro(String Quilometragem_Carro) {
        this.Quilometragem_Carro = Quilometragem_Carro;
    }
}
