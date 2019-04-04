public class Monster {
    private String name;

    Monster(String name){
        this.name = name;
    }

    public String attack(){
        System.out.println("Unspecified monster attacks!");
        return "An unspecified attack comes on!";
    }
}

//Fire
class FireMonster extends Monster{
    FireMonster(String name){
        super(name);
    }

    @Override
    public String attack(){
        return "The Fire monster used Firebreath!";
    }
}
//Water
class WaterMonster extends Monster{
    WaterMonster(String name){
        super(name);
    }

    @Override
    public String attack(){
        return "The Water monster used Hydro pump!";
    }
}
//Stone
class StoneMonster extends Monster{
    StoneMonster(String name){
        super(name);
    }

    @Override
    public String attack(){
        return "The Stone monster used Rock Blast!";
    }
}
