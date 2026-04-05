package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcaa {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcaf zzd;

    private zzcaa() {
        throw null;
    }

    public final zzcaa zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzcaa zzb(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzcaa zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcaa zzd(zzcaf zzcafVar) {
        this.zzd = zzcafVar;
        return this;
    }

    public final zzcag zze() {
        zzifp.zzc(this.zza, Context.class);
        zzifp.zzc(this.zzb, Clock.class);
        zzifp.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzifp.zzc(this.zzd, zzcaf.class);
        return new zzcab(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzcaa(byte[] bArr) {
    }
}
