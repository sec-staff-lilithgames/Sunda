package d6;

import android.os.Trace;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static void beginAsyncSection(String str, int i10) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void endAsyncSection(String str, int i10) {
        Trace.endAsyncSection(str, i10);
    }

    public static boolean isEnabled() {
        return Trace.isEnabled();
    }

    public static void setCounter(String str, int i10) {
        Trace.setCounter(str, i10);
    }
}
