import java.util.TimeZone;

/**
 * Created by Volodymyr.Gergel on 3/10/2016.
 */
public class AllAvailableTimeZones2 {
    public static void main(String[] args) {
        System.out.println("All Available TimeZones \n");
        String[] idArr = TimeZone.getAvailableIDs();
        for (int cnt = 0; cnt < idArr.length; cnt++) {
            TimeZone tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(tz.getDisplayName() + tz.getID()
                    + ";hour offset=(" + tz.getRawOffset() / (1000 * 60 *
                    60) + ")");
        }
    }
}
