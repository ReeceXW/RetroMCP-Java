package org.mcphackers.mcp;

public enum TaskParameter {

	//TODO
	DEBUG("Display additional info", true),
	SIDE("Perform operation for side"),
	PATCHES("Apply patches", true),
	IGNORED_PACKAGES("Ignored packages"),
	INDENTION_STRING("Indention string"),
	FULL_BUILD("Full build", true),
	RUN_BUILD("Run build", true),
	RUN_ARGS("Run arguments"),
	SETUP_VERSION("Setup version");
	
	public final String name;
	public boolean isToggle;
	
	private TaskParameter(String name) {
		this.name = name;
		isToggle = false;
	}
	
	private TaskParameter(String name, boolean toggle) {
		this(name);
		isToggle = toggle;
	}
}