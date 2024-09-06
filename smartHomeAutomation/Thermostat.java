package smartHomeAutomation;

public class Thermostat extends SmartDevice{

	public Thermostat(int deviceId) {
		super(deviceId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void opertor(String command, int setting, String optional) {
		if(command!=null) {
			super.command=command;
		}
		if(setting!=0) {
			super.setting=setting;
		}
		if(optional!=null) {
			super.optional=optional;
		}
	}

}
