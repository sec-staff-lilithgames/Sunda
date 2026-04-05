package io.odeeo.internal.b;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final PowerManager f62607a;

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f62608b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62609c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62610d;

    public a1(Context context) {
        this.f62607a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public final void a() {
        PowerManager.WakeLock wakeLock = this.f62608b;
        if (wakeLock == null) {
            return;
        }
        if (this.f62609c && this.f62610d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.f62608b == null) {
            PowerManager powerManager = this.f62607a;
            if (powerManager == null) {
                io.odeeo.internal.q0.p.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f62608b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f62609c = z10;
        a();
    }

    public void setStayAwake(boolean z10) {
        this.f62610d = z10;
        a();
    }
}
