package smartHomeAutomation;
public class Fan extends SmartDevice{

	public Fan(int deviceId) {
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
		
	}

}
