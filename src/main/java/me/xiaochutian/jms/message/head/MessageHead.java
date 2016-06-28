package me.xiaochutian.jms.message.head;

/**
 * Created by Xiaochutian on 2016/5/9.
 */
public class MessageHead {
    int MajorNo;
    int CityNo;
    String LineNo;
    int SystemType;
    int SystemNo;
    int LocationNo;
    int MsgType;
    int Stamp;

    public int getMajorNo() {
        return MajorNo;
    }

    public void setMajorNo(int majorNo) {
        MajorNo = majorNo;
    }

    public int getCityNo() {
        return CityNo;
    }

    public void setCityNo(int cityNo) {
        CityNo = cityNo;
    }

    public String getLineNo() {
        return LineNo;
    }

    public void setLineNo(String lineNo) {
        LineNo = lineNo;
    }

    public int getSystemType() {
        return SystemType;
    }

    public void setSystemType(int systemType) {
        SystemType = systemType;
    }

    public int getSystemNo() {
        return SystemNo;
    }

    public void setSystemNo(int systemNo) {
        SystemNo = systemNo;
    }

    public int getLocationNo() {
        return LocationNo;
    }

    public void setLocationNo(int locationNo) {
        LocationNo = locationNo;
    }

    public int getMsgType() {
        return MsgType;
    }

    public void setMsgType(int msgType) {
        MsgType = msgType;
    }

    public int getStamp() {
        return Stamp;
    }

    public void setStamp(int stamp) {
        Stamp = stamp;
    }
}
