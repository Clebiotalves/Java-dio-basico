public class carro {

    class carro {
        String cor;
        String modelo;
        int capacidadeTanque;
        carro(){

        }
//sobre carga no sitema
        carro(String cor,String modelo, int capacidadeTanque){
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }


        void setCor(String cor){
            this.cor = cor;
        }

        String getCor(){
            return cor;
        }
        void setmodelo(String modelo){
            this.modelo = modelo;
        }
        String getModelo(){
            return modelo;
        }
        void setcapacidadeTanque(int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }
        int getcapacidadeTanque(){
            return capacidadeTanque;
        }

        double totalCapacidadeTanque(double valorCombustivel){
            return capacidadeTanque * valorCombustivel;
        }

    }
 }

