package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Logger {
    public static final Companion Companion = new Companion(null);
    private static boolean enabled;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int d(String tag, String message) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.d(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int e(String tag, String message) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean z10) {
            Logger.enabled = z10;
        }

        public final String eraseSensitiveData(String str) {
            e0.checkNotNullParameter(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            e0.checkNotNullExpressionValue(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new x(patternCompile).replace(str, "xxx.xxx.xxx.xxx");
        }

        public final int i(String tag, String message) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        private Companion() {
        }

        public final int e(String tag, String message, Throwable throwable) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int i(String tag, String message, Throwable throwable) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.i(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final int w(String tag, String message, Throwable throwable) {
            e0.checkNotNullParameter(tag, "tag");
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.w(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }
    }

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int i(String str, String str2) {
        return Companion.i(str, str2);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }

    public static final int e(String str, String str2, Throwable th2) {
        return Companion.e(str, str2, th2);
    }

    public static final int i(String str, String str2, Throwable th2) {
        return Companion.i(str, str2, th2);
    }

    public static final int w(String str, String str2, Throwable th2) {
        return Companion.w(str, str2, th2);
    }
}
