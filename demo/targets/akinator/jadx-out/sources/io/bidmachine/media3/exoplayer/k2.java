package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import com.applovin.impl.k9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f61323a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61324b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f61325c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f61326d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f61327a;

        /* renamed from: b, reason: collision with root package name */
        public PowerManager.WakeLock f61328b;

        public a(Context context) {
            this.f61327a = context;
        }

        public void updateWakeLock(boolean z10, boolean z11) {
            if (z10 && this.f61328b == null) {
                PowerManager powerManager = (PowerManager) this.f61327a.getSystemService("power");
                if (powerManager == null) {
                    io.bidmachine.media3.common.util.b0.w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f61328b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f61328b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public k2(Context context, Looper looper, io.bidmachine.media3.common.util.g gVar) {
        this.f61323a = new a(context.getApplicationContext());
        this.f61324b = ((io.bidmachine.media3.common.util.q0) gVar).createHandler(looper, null);
    }

    public void setEnabled(boolean z10) {
        if (this.f61325c == z10) {
            return;
        }
        this.f61325c = z10;
        this.f61324b.post(new j2(this, z10, this.f61326d, 0));
    }

    public void setStayAwake(boolean z10) {
        if (this.f61326d == z10) {
            return;
        }
        this.f61326d = z10;
        if (this.f61325c) {
            this.f61324b.post(new k9(this, z10, 4));
        }
    }
}
