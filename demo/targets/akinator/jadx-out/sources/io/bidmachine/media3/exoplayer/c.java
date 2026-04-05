package io.bidmachine.media3.exoplayer;

import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import io.bidmachine.media3.exoplayer.AudioBecomingNoisyManager;
import io.bidmachine.media3.exoplayer.StreamVolumeManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61126c;

    public /* synthetic */ c(o0 o0Var, o1 o1Var) {
        this.f61125b = 5;
        this.f61126c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61125b) {
            case 0:
                AudioBecomingNoisyManager.AudioBecomingNoisyReceiver audioBecomingNoisyReceiver = (AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) this.f61126c;
                if (audioBecomingNoisyReceiver.f60829c.f60826d) {
                    ((j0) audioBecomingNoisyReceiver.f60827a).onAudioBecomingNoisy();
                    return;
                }
                return;
            case 1:
                StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
                StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.f60862e;
                io.bidmachine.media3.common.util.e eVar = streamVolumeManager.f60860c;
                if (volumeChangeReceiver == null) {
                    return;
                }
                eVar.setStateInBackground(streamVolumeManager.a(((StreamVolumeManager.a) eVar.get()).f60865a));
                return;
            case 2:
                u uVar = (u) this.f61126c;
                AudioManager audioManager = uVar.f61569a;
                if (audioManager != null) {
                    audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) io.bidmachine.media3.common.util.a.checkNotNull(uVar.f61570b));
                    return;
                }
                return;
            case 3:
                y.a((y) this.f61126c);
                return;
            case 4:
                l0 l0Var = (l0) this.f61126c;
                l0Var.H.setStateInBackground(Integer.valueOf(io.bidmachine.media3.common.util.a1.generateAudioSessionIdV21(l0Var.f61343e)));
                return;
            default:
                try {
                    o0.d((o1) this.f61126c);
                    return;
                } catch (a0 e10) {
                    io.bidmachine.media3.common.util.b0.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f61125b = i10;
        this.f61126c = obj;
    }
}
