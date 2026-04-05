package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import com.pairip.VMRunner;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;
import io.bidmachine.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class StreamVolumeManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60858a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f60859b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.e f60860c;

    /* renamed from: d, reason: collision with root package name */
    public AudioManager f60861d;

    /* renamed from: e, reason: collision with root package name */
    public VolumeChangeReceiver f60862e;

    /* renamed from: f, reason: collision with root package name */
    public int f60863f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class VolumeChangeReceiver extends BroadcastReceiver {
        public VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("HPIzn2LOLknEVVm1", new Object[]{this, context, intent});
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f60865a;

        /* renamed from: b, reason: collision with root package name */
        public final int f60866b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f60867c;

        /* renamed from: d, reason: collision with root package name */
        public final int f60868d;

        /* renamed from: e, reason: collision with root package name */
        public final int f60869e;

        public a(int i10, int i11, boolean z10, int i12, int i13) {
            this.f60865a = i10;
            this.f60866b = i11;
            this.f60867c = z10;
            this.f60868d = i12;
            this.f60869e = i13;
        }
    }

    public StreamVolumeManager(Context context, g2 g2Var, final int i10, Looper looper, Looper looper2, io.bidmachine.media3.common.util.g gVar) {
        this.f60858a = context.getApplicationContext();
        this.f60859b = g2Var;
        io.bidmachine.media3.common.util.e eVar = new io.bidmachine.media3.common.util.e(new a(i10, 0, false, 0, 0), looper, looper2, gVar, new f0(this, 10));
        this.f60860c = eVar;
        eVar.runInBackground(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a2
            @Override // java.lang.Runnable
            public final void run() {
                StreamVolumeManager streamVolumeManager = this.f60890b;
                Context context2 = streamVolumeManager.f60858a;
                streamVolumeManager.f60861d = (AudioManager) io.bidmachine.media3.common.util.a.checkStateNotNull((AudioManager) context2.getSystemService("audio"));
                StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.new VolumeChangeReceiver();
                try {
                    context2.registerReceiver(volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
                    streamVolumeManager.f60862e = volumeChangeReceiver;
                } catch (RuntimeException e10) {
                    io.bidmachine.media3.common.util.b0.w("StreamVolumeManager", "Error registering stream volume receiver", e10);
                }
                streamVolumeManager.f60860c.setStateInBackground(streamVolumeManager.a(i10));
            }
        });
    }

    public final a a(int i10) {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f60861d);
        return new a(i10, hn.d.getStreamVolume(this.f60861d, i10), hn.d.isStreamMute(this.f60861d, i10), hn.d.getStreamMinVolume(this.f60861d, i10), hn.d.getStreamMaxVolume(this.f60861d, i10));
    }

    public void decreaseVolume(int i10) {
        this.f60860c.updateStateAsync(new in.c(3), new b2(this, i10, 1));
    }

    public int getMaxVolume() {
        return ((a) this.f60860c.get()).f60869e;
    }

    public int getMinVolume() {
        return ((a) this.f60860c.get()).f60868d;
    }

    public int getVolume() {
        return ((a) this.f60860c.get()).f60866b;
    }

    public void increaseVolume(int i10) {
        this.f60860c.updateStateAsync(new in.c(4), new b2(this, i10, 0));
    }

    public boolean isMuted() {
        return ((a) this.f60860c.get()).f60867c;
    }

    public void release() {
        this.f60860c.updateStateAsync(new in.c(5), new d2(this, 0));
    }

    public void setMuted(final boolean z10, final int i10) {
        this.f60860c.updateStateAsync(new mh.v0() { // from class: io.bidmachine.media3.exoplayer.e2
            @Override // mh.v0
            public final Object apply(Object obj) {
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                StreamVolumeManager streamVolumeManager = this.f61188b;
                streamVolumeManager.getClass();
                int i11 = aVar.f60865a;
                boolean z11 = aVar.f60867c;
                boolean z12 = z10;
                return new StreamVolumeManager.a(i11, z11 == z12 ? aVar.f60866b : z12 ? 0 : streamVolumeManager.f60863f, z12, aVar.f60868d, aVar.f60869e);
            }
        }, new mh.v0() { // from class: io.bidmachine.media3.exoplayer.f2
            @Override // mh.v0
            public final Object apply(Object obj) {
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                StreamVolumeManager streamVolumeManager = this.f61197b;
                streamVolumeManager.getClass();
                boolean z11 = aVar.f60867c;
                int i11 = aVar.f60865a;
                boolean z12 = z10;
                if (z11 == z12) {
                    return aVar;
                }
                io.bidmachine.media3.common.util.a.checkNotNull(streamVolumeManager.f60861d);
                if (io.bidmachine.media3.common.util.a1.f60679a >= 23) {
                    streamVolumeManager.f60861d.adjustStreamVolume(i11, z12 ? -100 : 100, i10);
                } else {
                    streamVolumeManager.f60861d.setStreamMute(i11, z12);
                }
                return streamVolumeManager.a(i11);
            }
        });
    }

    public void setStreamType(int i10) {
        this.f60860c.updateStateAsync(new g0(i10, 2), new b2(this, i10, 2));
    }

    public void setVolume(final int i10, final int i11) {
        this.f60860c.updateStateAsync(new g0(i10, 1), new mh.v0() { // from class: io.bidmachine.media3.exoplayer.c2
            @Override // mh.v0
            public final Object apply(Object obj) {
                StreamVolumeManager.a aVar = (StreamVolumeManager.a) obj;
                StreamVolumeManager streamVolumeManager = this.f61147b;
                streamVolumeManager.getClass();
                int i12 = aVar.f60866b;
                int i13 = aVar.f60865a;
                int i14 = i10;
                if (i14 == i12 || i14 < aVar.f60868d || i14 > aVar.f60869e) {
                    return aVar;
                }
                ((AudioManager) io.bidmachine.media3.common.util.a.checkNotNull(streamVolumeManager.f60861d)).setStreamVolume(i13, i14, i11);
                return streamVolumeManager.a(i13);
            }
        });
    }
}
