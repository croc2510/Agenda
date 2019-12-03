package com.softtek.java.util;

import java.util.UUID;

public class Util {
	public String generateId() {
		String uuid = UUID.randomUUID().toString();
		return uuid;
	}

}
