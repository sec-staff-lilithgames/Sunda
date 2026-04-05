package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqr {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfqq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfqn.zzb() != zzfpa.CTV) {
            return 2;
        }
        return zza;
    }
}
