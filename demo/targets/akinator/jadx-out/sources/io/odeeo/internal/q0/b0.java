package io.odeeo.internal.q0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b0 implements d {
    @Override // io.odeeo.internal.q0.d
    public n createHandler(Looper looper, Handler.Callback callback) {
        return new c0(new Handler(looper, callback));
    }

    @Override // io.odeeo.internal.q0.d
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.odeeo.internal.q0.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // io.odeeo.internal.q0.d
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.odeeo.internal.q0.d
    public void onThreadBlocked() {
    }
}
