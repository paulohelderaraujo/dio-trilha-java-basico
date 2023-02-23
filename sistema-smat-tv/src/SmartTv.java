public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o Canal para: " + canal);

    }

    public void canalVolume(){
        canal--;
        System.out.println("Diminuir o Volume para: " + volume);

    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o Volume para: " + volume);
    }    

    public void ligar (){
        ligada=true;
    }
    
    public void desligar (){
        ligada=false;
    }
}
