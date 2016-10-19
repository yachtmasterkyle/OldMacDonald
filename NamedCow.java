class NamedCow extends Cow
{
	private String cowName;
	public NamedCow(String type, String name, String sound)
	{
		cowName = name;
		myType = type;
		mySound = sound;
	}
	public String getName()
	{
		return cowName;
	}
}