package lab5;

public class Player {
    private String name;
    private String team;


    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setTeam(String t){
        this.team = t;
    }

    public boolean isSameTeam(Player p){
        if (this.team.equals(p.getTeam())){
            return true;
        }else{
            return false;
        }
    } 
}
