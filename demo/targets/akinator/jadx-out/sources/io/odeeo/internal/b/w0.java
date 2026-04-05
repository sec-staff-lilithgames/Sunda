package io.odeeo.internal.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f63060a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f63061b;

    /* renamed from: c, reason: collision with root package name */
    public final b f63062c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f63063d;

    /* renamed from: e, reason: collision with root package name */
    public c f63064e;

    /* renamed from: f, reason: collision with root package name */
    public int f63065f;

    /* renamed from: g, reason: collision with root package name */
    public int f63066g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63067h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void onStreamTypeChanged(int i10);

        void onStreamVolumeChanged(int i10, boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w0.this.f63061b.post(new com.unity3d.services.banners.view.a(w0.this, 28));
        }
    }

    public w0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f63060a = applicationContext;
        this.f63061b = handler;
        this.f63062c = bVar;
        AudioManager audioManager = (AudioManager) io.odeeo.internal.q0.a.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.f63063d = audioManager;
        this.f63065f = 3;
        this.f63066g = b(audioManager, 3);
        this.f63067h = a(audioManager, this.f63065f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f63064e = cVar;
        } catch (RuntimeException e10) {
            io.odeeo.internal.q0.p.w("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public void decreaseVolume() {
        if (this.f63066g <= getMinVolume()) {
            return;
        }
        this.f63063d.adjustStreamVolume(this.f63065f, -1, 1);
        a();
    }

    public int getMaxVolume() {
        return this.f63063d.getStreamMaxVolume(this.f63065f);
    }

    public int getMinVolume() {
        if (io.odeeo.internal.q0.g0.f65861a >= 28) {
            return this.f63063d.getStreamMinVolume(this.f63065f);
        }
        return 0;
    }

    public int getVolume() {
        return this.f63066g;
    }

    public void increaseVolume() {
        if (this.f63066g >= getMaxVolume()) {
            return;
        }
        this.f63063d.adjustStreamVolume(this.f63065f, 1, 1);
        a();
    }

    public boolean isMuted() {
        return this.f63067h;
    }

    public void release() {
        c cVar = this.f63064e;
        if (cVar != null) {
            try {
                this.f63060a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                io.odeeo.internal.q0.p.w("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f63064e = null;
        }
    }

    public void setMuted(boolean z10) {
        if (io.odeeo.internal.q0.g0.f65861a >= 23) {
            this.f63063d.adjustStreamVolume(this.f63065f, z10 ? -100 : 100, 1);
        } else {
            this.f63063d.setStreamMute(this.f63065f, z10);
        }
        a();
    }

    public void setStreamType(int i10) {
        if (this.f63065f == i10) {
            return;
        }
        this.f63065f = i10;
        a();
        this.f63062c.onStreamTypeChanged(i10);
    }

    public void setVolume(int i10) {
        if (i10 < getMinVolume() || i10 > getMaxVolume()) {
            return;
        }
        this.f63063d.setStreamVolume(this.f63065f, i10, 1);
        a();
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            io.odeeo.internal.q0.p.w("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void a() {
        int iB = b(this.f63063d, this.f63065f);
        boolean zA = a(this.f63063d, this.f63065f);
        if (this.f63066g == iB && this.f63067h == zA) {
            return;
        }
        this.f63066g = iB;
        this.f63067h = zA;
        this.f63062c.onStreamVolumeChanged(iB, zA);
    }

    public static boolean a(AudioManager audioManager, int i10) {
        if (io.odeeo.internal.q0.g0.f65861a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }
}
