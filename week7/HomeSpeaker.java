class HomeSpeaker extends Speaker{
    public HomeSpeaker(){
        super(0, null);
    }
    public HomeSpeaker(int power, String type){
        this.type = type;
        if(power > 1000 && power < 5000){
            this.power = power;
        } else {
            this.power = 2000;
        }
    }
    @Override
    public int getPower(){
       return this.power; 
    }
}