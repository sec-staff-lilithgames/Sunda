package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final PowerManager f27869a;

    /* renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f27870b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27871c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27872d;

    public o3(Context context) {
        this.f27869a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.f27870b == null) {
            PowerManager powerManager = this.f27869a;
            if (powerManager == null) {
                com.google.android.exoplayer2.util.f0.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f27870b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f27871c = z10;
        PowerManager.WakeLock wakeLock = this.f27870b;
        if (wakeLock == null) {
            return;
        }
        if (z10 && this.f27872d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void setStayAwake(boolean z10) {
        this.f27872d = z10;
        PowerManager.WakeLock wakeLock = this.f27870b;
        if (wakeLock == null) {
            return;
        }
        if (this.f27871c && z10) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
