package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioCapabilitiesReceiver f27254a;

    public p(AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
        this.f27254a = audioCapabilitiesReceiver;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f27254a;
        AudioCapabilitiesReceiver.a(audioCapabilitiesReceiver, n.getCapabilities(audioCapabilitiesReceiver.f27031a));
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f27254a;
        AudioCapabilitiesReceiver.a(audioCapabilitiesReceiver, n.getCapabilities(audioCapabilitiesReceiver.f27031a));
    }
}
