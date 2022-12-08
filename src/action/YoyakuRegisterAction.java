package action;

import java.sql.Date;
import java.sql.Time;

import db.YoyakuRegisterDBAccess;


public class YoyakuRegisterAction {
    public int execute(int insid, Date resdate, Time strtime, Time fintime, int custid, String purpose, String place) throws Exception {
        YoyakuRegisterDBAccess crdb = new YoyakuRegisterDBAccess();
        int res = crdb.registerYoyaku(insid, resdate, strtime, fintime, custid, purpose, place);
        return res;
    }
}