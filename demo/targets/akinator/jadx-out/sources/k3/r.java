package k3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends x {

    /* renamed from: d, reason: collision with root package name */
    public final Context f70239d;

    /* renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f70240e;

    /* renamed from: f, reason: collision with root package name */
    public final PowerManager.WakeLock f70241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70242g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f70243h;

    public r(Context context, ComponentName componentName) {
        super(componentName);
        this.f70239d = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f70240e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f70241f = wakeLockNewWakeLock2;
        wakeLockNewWakeLock2.setReferenceCounted(false);
    }

    @Override // k3.x
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f70261a);
        if (this.f70239d.startService(intent2) != null) {
            synchronized (this) {
                try {
                    if (!this.f70242g) {
                        this.f70242g = true;
                        if (!this.f70243h) {
                            this.f70240e.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // k3.x
    public void serviceProcessingFinished() {
        synchronized (this) {
            try {
                if (this.f70243h) {
                    if (this.f70242g) {
                        this.f70240e.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                    }
                    this.f70243h = false;
                    this.f70241f.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k3.x
    public void serviceProcessingStarted() {
        synchronized (this) {
            try {
                if (!this.f70243h) {
                    this.f70243h = true;
                    this.f70241f.acquire(TTAdConstant.AD_MAX_EVENT_TIME);
                    this.f70240e.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k3.x
    public void serviceStartReceived() {
        synchronized (this) {
            this.f70242g = false;
        }
    }
}
