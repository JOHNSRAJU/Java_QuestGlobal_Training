package smartHomeAutomation;
public class Main {
	public static void main(String[] args) {
		SmartDevice light =  new Light(1);
		SmartDevice fan = new Fan(2);
		SmartDevice thermostat = new Thermostat(3);
		light.controlDevice(light.deviceId, "ON");
		light.opertor("ON", 0, null);
		fan.controlDevice(fan.deviceId, "ON",5);
		fan.opertor("ON", 5, null);
		thermostat.controlDevice(light.deviceId, "ON",3,"Power saving");
		thermostat.opertor("ON", 3, "Power Saving");
		
	}
}
