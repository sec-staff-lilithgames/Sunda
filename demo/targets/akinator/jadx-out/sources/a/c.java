package a;

import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class c {
    public static final String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return "_COROUTINE";
    }

    public static final StackTraceElement access$artificialFrame(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(b.k(GalEuEfxjome.dRx, str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
