package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzfmx;
import com.google.android.gms.internal.ads.zzfmy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbt extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final String zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbt(Context context, String str, String str2, zzfmy zzfmyVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zzc(this.zzb, null);
        } else {
            new zzfmx(zzvVar.zza(), this.zza, zzcbv.zze, null, null).zza(this.zzb);
        }
    }
}
