public class RoomMain {
    public static void main(String[] args) {
        Room room =  new Room(18, true, 15);

        room.coolRom();
        System.out.println(room.coolRom());
        System.out.println("Room status: Actual temperature" + room.actTemp +
                " Minimal  temperature " + room.minTemp +" Stan klimatyzacji " + room.clima );

        room.clima =true;
        room.actTemp = 10;
        room.coolRom();
        System.out.println("Room status: Actual temperature" + room.actTemp +
                " Minimal  temperature " + room.minTemp +" Stan klimatyzacji " + room.clima );
        System.out.println(room.coolRom());





    }
}
