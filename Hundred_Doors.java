/*
There are 100 doors in a row that are all initially closed.
You make 100 passes by the doors.
The first time through, visit every door and  toggle  the door  (if the door is closed,  open it;   if it is open,  close it).
The second time, only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.
The third time, visit every 3rd door   (door #3, #6, #9, ...), etc,   until you only visit the 100th door.
Q: what state are the doors in after the last pass?   Which are open, which are closed?
*/


public class Hundred_Doors
{
    public static void main(String[] args)
    {
        int i = 0;
        boolean[] DoorCondition = new boolean[100];
        for (i = 0;i<100;i++)
            {
                DoorCondition[i] = false;
            }
    //First Pass (Every Door)
        for(i = 0; i<100; i++)
            {
                DoorCondition[i] = true;
            }
    //Second Pass (Every other Door)
        for (i = 0; i<100;i+=2)
            {
                if (DoorCondition[i]==true)
                    DoorCondition[i] = false;
                else if (DoorCondition[i] == false)
                    DoorCondition[i] = true;
            }
    //Third Pass (Every Third Door)
        for (i = 0; i<100;i+=3)
            {
                if (DoorCondition[i]==true)
                    DoorCondition[i] = false;
                else if (DoorCondition[i] == false)
                    DoorCondition[i] = true;
            }
        for(i = 0; i<100; i++)
            {
                if (DoorCondition[i]==true)
                    System.out.println("Door Number "+ (i+1) + " is open");
            }

    }
}
