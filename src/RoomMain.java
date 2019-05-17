import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj actualną temperaturę w stopniach Celsjusza w liczbach całkowitych");
        int actTemp = in.nextInt();

        Room room =  new Room(actTemp, true, 15);

        room.coolRom();
        System.out.println(room.actTemp);
        System.out.println(room.coolRom());
        System.out.println("Room status: Actual temperature" + room.actTemp +
                " Minimal  temperature " + room.minTemp +" Stan klimatyzacji " + room.clima );

        //room.clima =true;
        //room.actTemp = 10;
        room.coolRom();
        System.out.println("Room status: Actual temperature" + room.actTemp +
                " Minimal  temperature " + room.minTemp +" Stan klimatyzacji " + room.clima );
        System.out.println(room.coolRom());





    }
}
