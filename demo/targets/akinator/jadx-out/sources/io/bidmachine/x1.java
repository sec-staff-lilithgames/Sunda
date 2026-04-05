package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x1 {
    public static Float a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3) - (Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0);
        return streamMaxVolume == 0 ? Float.valueOf(0.0f) : Float.valueOf((streamVolume - r5) / streamMaxVolume);
    }
}
