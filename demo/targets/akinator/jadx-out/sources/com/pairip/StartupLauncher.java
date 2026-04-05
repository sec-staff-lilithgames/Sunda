package com.pairip;

/* loaded from: classes2.dex */
public final class StartupLauncher {
    private static boolean launchCalled = false;
    private static String startupProgramName = "ReqL9SxJHgWgm3cn";

    public static synchronized void launch() {
        if (launchCalled) {
            return;
        }
        launchCalled = true;
        VMRunner.invoke(startupProgramName, null);
    }

    private StartupLauncher() {
    }
}
