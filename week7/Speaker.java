class Speaker{
    protected int power;
    protected String type;

    public Speaker(){
        this.power = 0;
        this.type = null;
    }
    public Speaker(int power, String type){
        this.power = power;
        this.type = type;
    }
    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){
        return power;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}