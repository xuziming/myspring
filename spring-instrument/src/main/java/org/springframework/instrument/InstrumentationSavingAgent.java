package org.springframework.instrument;

import java.lang.instrument.Instrumentation;

public class InstrumentationSavingAgent {

	private static volatile Instrumentation instrumentation;

	public static void premain(String agentArgs, Instrumentation inst) {
		instrumentation = inst;
	}

	public static void agentmain(String agentArgs, Instrumentation inst) {
		instrumentation = inst;
	}

	public static Instrumentation getInstrumentation() {
		return instrumentation;
	}

}