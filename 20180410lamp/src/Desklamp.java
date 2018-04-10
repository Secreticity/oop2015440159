
public class Desklamp {

	//Field
	private boolean isOn;  //True : Light ON, False : Light OFF
	
	//Method
	public void turnOn() {
		this.isOn = true;
	}
	public void turnOff() {
		this.isOn = false;
	}
	public boolean isOn() {
		return isOn;
	}
	public String toString() {
		if(isOn == true)
			return "Light is ON";
		else
			return "Light is OFF";
	}
}
