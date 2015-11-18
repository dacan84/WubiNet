package xbee;

import com.digi.xbee.api.XBee;
import com.digi.xbee.api.connection.serial.SerialPortInfo;
import com.digi.xbee.api.connection.serial.SerialPortRxTx;
import com.digi.xbee.api.models.XBee64BitAddress;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Diego on 17/11/2015.
 */

public class XBeeProxy {

    @Setter @Getter
    private SerialPortRxTx serialPort;
    private XBee xBeeDevice;
    private XBee64BitAddress xBee64BitAddress;


    public ArrayList <SerialPortInfo> getPortsAvailables() {
        return SerialPortRxTx.listSerialPortsInfo();
    }

}
