package io.bidmachine.media3.exoplayer;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f61560a;

    public t(u uVar) {
        this.f61560a = uVar;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        u uVar = this.f61560a;
        uVar.f61571c.setStateInBackground(Boolean.valueOf(uVar.a()));
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        u uVar = this.f61560a;
        uVar.f61571c.setStateInBackground(Boolean.valueOf(uVar.a()));
    }
}
