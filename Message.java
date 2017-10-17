

public abstract class Message {

	byte[] mssgContent;

	public byte[] getBytes() {
		return mssgContent;
	}
	public void setBytes(byte[] mssgContent) {
		this.mssgContent = mssgContent;
	}

}