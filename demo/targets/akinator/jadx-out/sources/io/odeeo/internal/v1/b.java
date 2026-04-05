package io.odeeo.internal.v1;

import android.media.AudioManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {
    public static final float getDeviceVolumePercent(AudioManager audioManager, int i10) {
        e0.checkNotNullParameter(audioManager, "<this>");
        float streamMaxVolume = audioManager.getStreamMaxVolume(i10);
        Float fValueOf = Float.valueOf(streamMaxVolume);
        if (streamMaxVolume == 0.0f) {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return 0.0f;
        }
        return (audioManager.getStreamVolume(i10) / fValueOf.floatValue()) * 100.0f;
    }

    public static /* synthetic */ float getDeviceVolumePercent$default(AudioManager audioManager, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 3;
        }
        return getDeviceVolumePercent(audioManager, i10);
    }

    public static final String getDeviceVolumeStr(AudioManager audioManager, int i10) {
        e0.checkNotNullParameter(audioManager, "<this>");
        String str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(getDeviceVolumePercent(audioManager, i10))}, 1));
        e0.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static /* synthetic */ String getDeviceVolumeStr$default(AudioManager audioManager, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 3;
        }
        return getDeviceVolumeStr(audioManager, i10);
    }
}
