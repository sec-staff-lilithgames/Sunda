package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f61003a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioCapabilitiesReceiver f61004b;

    /* renamed from: c, reason: collision with root package name */
    public o0 f61005c = new AudioRouting.OnRoutingChangedListener() { // from class: io.bidmachine.media3.exoplayer.audio.o0
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            p0 p0Var = this.f60996a;
            if (p0Var.f61005c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            p0Var.f61004b.setRoutedDevice(routedDevice);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [io.bidmachine.media3.exoplayer.audio.o0] */
    public p0(AudioTrack audioTrack, AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
        this.f61003a = audioTrack;
        this.f61004b = audioCapabilitiesReceiver;
        audioTrack.addOnRoutingChangedListener(this.f61005c, new Handler(Looper.myLooper()));
    }

    public void release() {
        this.f61003a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) io.bidmachine.media3.common.util.a.checkNotNull(this.f61005c));
        this.f61005c = null;
    }
}
