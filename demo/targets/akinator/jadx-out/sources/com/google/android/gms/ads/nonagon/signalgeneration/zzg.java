package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcjv;
import com.google.android.gms.internal.ads.zzckk;
import com.google.android.gms.internal.ads.zzcnc;
import com.google.android.gms.internal.ads.zzeth;
import com.google.android.gms.internal.ads.zzifh;
import com.google.android.gms.internal.ads.zzifq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzg implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzg(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar4;
    }

    public static zzg zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzg(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzf(((zzcjv) this.zza).zza(), zzcnc.zza(), zzeth.zzc(), ((zzckk) this.zzb).zza());
    }
}
