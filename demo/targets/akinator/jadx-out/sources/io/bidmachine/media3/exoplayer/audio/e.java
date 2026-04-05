package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {
    public static void registerAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        hn.d.getAudioManager(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
    }

    public static void unregisterAudioDeviceCallback(Context context, AudioDeviceCallback audioDeviceCallback) {
        hn.d.getAudioManager(context).unregisterAudioDeviceCallback(audioDeviceCallback);
    }
}
