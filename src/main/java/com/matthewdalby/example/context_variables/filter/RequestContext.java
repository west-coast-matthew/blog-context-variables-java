package com.matthewdalby.example.context_variables.filter;

public class RequestContext {
	private static final ThreadLocal<String> currentUser = new ThreadLocal<>();

    public static String getCurrentTransactionId() {
        return currentUser.get();
    }

    public static void setCurrentTransactionId(String id) {
        currentUser.set(id);
    }

    public static void clear() {
        currentUser.remove();
    }
}
