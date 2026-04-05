package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzd {
    public static final zzd zza = new zzd(0, 0, 1, 1, 0, false, null);
    private AudioAttributes zzb;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, byte[] bArr) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzd.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2092275855;
    }

    public final AudioAttributes zza() {
        if (this.zzb == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i10 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.zzb = usage.build();
        }
        return this.zzb;
    }
}
