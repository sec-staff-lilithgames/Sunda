package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o {
    public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        ((AudioManager) com.google.android.exoplayer2.util.a.checkNotNull((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
        ((AudioManager) com.google.android.exoplayer2.util.a.checkNotNull((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
