package ot;

import android.os.Handler;
import android.os.Looper;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f79835a = nt.a.initMainThreadScheduler(new a());

    public static m0 from(Looper looper) {
        return from(looper, false);
    }

    public static m0 mainThread() {
        return nt.a.onMainThreadScheduler(f79835a);
    }

    public static m0 from(Looper looper, boolean z10) {
        if (looper != null) {
            return new f(z10, new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }
}
