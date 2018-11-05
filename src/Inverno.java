public class Inverno {
    //declarando as variaveis
    int temperaturaDia1, temperaturaDia2, temperaturaDia3;

    //método contrutor inicial
    public Inverno(int temperaturaDia1, int temperaturaDia2, int temperaturaDia3) {

        this.temperaturaDia1 = temperaturaDia1;
        this.temperaturaDia2 = temperaturaDia2;
        this.temperaturaDia3 = temperaturaDia3;
    }

    public String definirOHumorDasPessoas() {
        if(temperaturaDia1 > temperaturaDia2 && temperaturaDia2 <= temperaturaDia3){
            return ":)";
        }else if (temperaturaDia1 < temperaturaDia2 && temperaturaDia2 >= temperaturaDia3){
            return   ":(";
        }else if (temperaturaDia1 < temperaturaDia2 && temperaturaDia2 < temperaturaDia3){
            if((temperaturaDia2 - temperaturaDia1) <(temperaturaDia3 - temperaturaDia2)){
                return ":)";
            }
            return ":(";
        }else if ((temperaturaDia2 - temperaturaDia1) > (temperaturaDia3 - temperaturaDia2)){
            return ":(";
        }else if (temperaturaDia1 > temperaturaDia2 && temperaturaDia2 > temperaturaDia3){
            return ":)";
        }else if ((temperaturaDia2 - temperaturaDia1) < (temperaturaDia3 - temperaturaDia2)){
            return ":)";
        }else if (temperaturaDia1 == temperaturaDia2 && temperaturaDia2 <= temperaturaDia3){
            return ":)";
        }else if (temperaturaDia1 == temperaturaDia2 && temperaturaDia2 <= temperaturaDia3){
            return ":)";
        }else if (temperaturaDia1 == temperaturaDia2 && temperaturaDia2 >= temperaturaDia3){
            return ":(";
        }
        return null;
    }
}
