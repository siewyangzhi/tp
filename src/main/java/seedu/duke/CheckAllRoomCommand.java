package seedu.duke;

import java.math.RoundingMode;

public class CheckAllRoomCommand extends Command{
    private RoomList roomList;
    private static String TABLE_HEAD = "Type\t\tRoom Id\t\tlevel\t\tStatus";

    public CheckAllRoomCommand(){
    }


    @Override
    public void execute(){}
    @Override
    public void execute(RoomList roomList){
        this.roomList = new RoomList();
        System.out.println(TABLE_HEAD);
        for(Room room : roomList.getRoomList()){
            System.out.println(room.toString());
        }
    }


}
