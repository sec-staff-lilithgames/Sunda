package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class StreamVolumeManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27016a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f27017b;

    /* renamed from: c, reason: collision with root package name */
    public final g3 f27018c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f27019d;

    /* renamed from: e, reason: collision with root package name */
    public VolumeChangeReceiver f27020e;

    /* renamed from: f, reason: collision with root package name */
    public int f27021f;

    /* renamed from: g, reason: collision with root package name */
    public int f27022g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27023h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VolumeChangeReceiver extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f27024b = 0;

        public VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            streamVolumeManager.f27017b.post(new h3(streamVolumeManager));
        }
    }

    public StreamVolumeManager(Context context, Handler handler, g3 g3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f27016a = applicationContext;
        this.f27017b = handler;
        this.f27018c = g3Var;
        AudioManager audioManager = (AudioManager) com.google.android.exoplayer2.util.a.checkStateNotNull((AudioManager) applicationContext.getSystemService("audio"));
        this.f27019d = audioManager;
        this.f27021f = 3;
        this.f27022g = a(audioManager, 3);
        int i10 = this.f27021f;
        this.f27023h = com.google.android.exoplayer2.util.n1.f28506a >= 23 ? audioManager.isStreamMute(i10) : a(audioManager, i10) == 0;
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f27020e = volumeChangeReceiver;
        } catch (RuntimeException e10) {
            com.google.android.exoplayer2.util.f0.w("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            com.google.android.exoplayer2.util.f0.w("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void b() {
        int i10 = this.f27021f;
        AudioManager audioManager = this.f27019d;
        int iA = a(audioManager, i10);
        int i11 = this.f27021f;
        boolean zIsStreamMute = com.google.android.exoplayer2.util.n1.f28506a >= 23 ? audioManager.isStreamMute(i11) : a(audioManager, i11) == 0;
        if (this.f27022g == iA && this.f27023h == zIsStreamMute) {
            return;
        }
        this.f27022g = iA;
        this.f27023h = zIsStreamMute;
        ((p0) this.f27018c).onStreamVolumeChanged(iA, zIsStreamMute);
    }

    public void decreaseVolume(int i10) {
        if (this.f27022g <= getMinVolume()) {
            return;
        }
        this.f27019d.adjustStreamVolume(this.f27021f, -1, i10);
        b();
    }

    public int getMaxVolume() {
        return this.f27019d.getStreamMaxVolume(this.f27021f);
    }

    public int getMinVolume() {
        if (com.google.android.exoplayer2.util.n1.f28506a >= 28) {
            return this.f27019d.getStreamMinVolume(this.f27021f);
        }
        return 0;
    }

    public int getVolume() {
        return this.f27022g;
    }

    public void increaseVolume(int i10) {
        if (this.f27022g >= getMaxVolume()) {
            return;
        }
        this.f27019d.adjustStreamVolume(this.f27021f, 1, i10);
        b();
    }

    public boolean isMuted() {
        return this.f27023h;
    }

    public void release() {
        VolumeChangeReceiver volumeChangeReceiver = this.f27020e;
        if (volumeChangeReceiver != null) {
            try {
                this.f27016a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e10) {
                com.google.android.exoplayer2.util.f0.w("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f27020e = null;
        }
    }

    public void setMuted(boolean z10, int i10) {
        int i11 = com.google.android.exoplayer2.util.n1.f28506a;
        AudioManager audioManager = this.f27019d;
        if (i11 >= 23) {
            audioManager.adjustStreamVolume(this.f27021f, z10 ? -100 : 100, i10);
        } else {
            audioManager.setStreamMute(this.f27021f, z10);
        }
        b();
    }

    public void setStreamType(int i10) {
        if (this.f27021f == i10) {
            return;
        }
        this.f27021f = i10;
        b();
        ((p0) this.f27018c).onStreamTypeChanged(i10);
    }

    public void setVolume(int i10, int i11) {
        if (i10 < getMinVolume() || i10 > getMaxVolume()) {
            return;
        }
        this.f27019d.setStreamVolume(this.f27021f, i10, i11);
        b();
    }
}
