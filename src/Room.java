public class Room {
    int area;
    int actTemp;
    boolean clima;
    int minTemp;

    public Room(int actTemp, boolean clima, int minTemp) {
        this.actTemp = actTemp;
        this.clima = clima;
        this.minTemp = minTemp;
    }
    boolean coolRom (){
        if(clima && actTemp > minTemp){
            actTemp = actTemp-1;
            return true;
        }
        else if (!clima || actTemp <= minTemp);
        return false;
       }



}
