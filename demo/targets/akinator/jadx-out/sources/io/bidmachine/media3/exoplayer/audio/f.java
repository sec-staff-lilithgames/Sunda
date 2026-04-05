package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioCapabilitiesReceiver f60938a;

    public f(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
        this.f60938a = audioCapabilitiesReceiver;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f60938a;
        audioCapabilitiesReceiver.a(d.c(audioCapabilitiesReceiver.f60892a, audioCapabilitiesReceiver.f60900i, audioCapabilitiesReceiver.f60899h));
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f60938a;
        if (io.bidmachine.media3.common.util.a1.contains(audioDeviceInfoArr, audioCapabilitiesReceiver.f60899h)) {
            audioCapabilitiesReceiver.f60899h = null;
        }
        audioCapabilitiesReceiver.a(d.c(audioCapabilitiesReceiver.f60892a, audioCapabilitiesReceiver.f60900i, audioCapabilitiesReceiver.f60899h));
    }
}
