package smartHomeAutomation;
public class DeviceControl{
	void controlDevice(int deviceId, String command){
		System.out.println("Device Id - "+deviceId+" Command - "+command);
	}
	void controlDevice(int deviceId, String command,int setting){
		System.out.println("Device Id - "+deviceId+" Command - "+command+" Setting -"+setting);
	}
	void controlDevice(int deviceId, String command,int setting,String optionalMode){
		System.out.println("Device Id - "+deviceId+" Command - "+command+" Setting -"+setting+" Optional Mode - "+optionalMode);
	}
}
