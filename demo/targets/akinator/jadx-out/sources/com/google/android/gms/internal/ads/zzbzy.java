package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbzy {
    private final Clock zza;
    private final zzbzw zzb;

    public zzbzy(Clock clock, zzbzw zzbzwVar) {
        this.zza = clock;
        this.zzb = zzbzwVar;
    }

    public static zzbzy zza(Context context) {
        return zzcag.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfv zzfvVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }
}
