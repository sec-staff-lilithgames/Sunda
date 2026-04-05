package h5;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f58698a = new c();

    public final int adServicesVersion() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f58697a.getAdServicesVersion();
        }
        return 0;
    }

    public final int extServicesVersionS() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f58696a.getAdExtServicesVersionS();
        }
        return 0;
    }
}
