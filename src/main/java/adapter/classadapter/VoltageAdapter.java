package adapter.classadapter;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    public int output5V() {
        //TODO Auto-generated method stub/获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成5v
        return dstV;
    }
}
