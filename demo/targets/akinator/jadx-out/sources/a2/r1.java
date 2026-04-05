package a2;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r1 {
    public static final boolean access$isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
