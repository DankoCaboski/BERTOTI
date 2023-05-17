package Back.Models;

public class Mesa {
    Integer npessoas;
    int nmesa;


    public Mesa(int nmesa) {
        this.nmesa = nmesa;
        this.npessoas = 0;
    }

    public Integer getNpessoas() {
        return npessoas;
    }

    public void setNpessoas(Integer npessoas) {
        this.npessoas = npessoas;
    }

    public int getNmesa() {
        return nmesa;
    }

    private void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public boolean isOcuped(){
        if(npessoas>0) return false;
        else{
            return true;
        }
    }
}
