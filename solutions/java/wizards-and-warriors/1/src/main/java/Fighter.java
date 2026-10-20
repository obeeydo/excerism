class Fighter {

    boolean isVulnerable() {

        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return 1;
    }

}

// TODO: define the Wizard class
class Wizard{

}
