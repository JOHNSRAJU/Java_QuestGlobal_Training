package smartHomeAutomation;
abstract class SmartDevice extends DeviceControl{
	int deviceId;
	String command;
	int setting;
	String optional;
	abstract void opertor(String command,int setting,String optional);
	public SmartDevice(int deviceId) {
		this.deviceId = deviceId;
	}
}
