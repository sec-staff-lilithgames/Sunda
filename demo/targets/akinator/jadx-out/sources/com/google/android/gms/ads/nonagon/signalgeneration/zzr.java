package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzdvn;
import com.google.android.gms.internal.ads.zzfjn;
import com.google.android.gms.internal.ads.zzifh;
import com.google.android.gms.internal.ads.zzifq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzr implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzr(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzr zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzr(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzo(((zzcjv) this.zza).zza(), (zzdvn) this.zzb.zzb(), zzfjn.zzc());
    }
}
