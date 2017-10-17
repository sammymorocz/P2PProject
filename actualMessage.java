

public class actualMessage extends Message
{
	private byte mssgType;
	private byte[] mssgPayload;

	/**
	 * Standard message containing the payload to be sent.
	 * @param messageType One byte representing the type of message (choke, unchoke, etc.). See project description.
	 * @param messagePayload Payload of the message. Length is read from this
	 */
	public actualMessage(byte mssgType, byte[] mssgPayload)
	{

		ByteBuffer buffer = ByteBuffer.allocate(mssgPayload + 4 + 1);

		//int mssgLength = mssgPayload.length + 1;
		// First four bytes are the length (not including these four bytes)
		buffer.putInt(mssgPayload.length+1);

						//*******************MESSAGE LENGTH SHOULD BE 4 BYTES WHY ARE WE USING PAYLOAD + 1


		// Single-byte message type (choke, unchoke, etc.)
		buffer.put(mssgType);
		// Payload
		buffer.put(mssgPayload);
		
		this.mssgContent = buffer.array();
		this.mssgType = mssgType;
		this.mssgPayload = mssgPayload;
	}

	public byte getMssgType() {
		return mssgType;
	}
	public byte[] getMssgPayload() {
		return mssgPayload;
	}
}