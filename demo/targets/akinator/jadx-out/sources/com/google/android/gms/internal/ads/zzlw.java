package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class zzlw {
    private final zzik zza;

    @Deprecated
    public zzlw(Context context, zzls zzlsVar) {
        this.zza = new zzik(context, zzlsVar);
    }

    @Deprecated
    public final zzlw zza(final zzyr zzyrVar) {
        zzik zzikVar = this.zza;
        zzgmd.zzh(!zzikVar.zzw);
        zzyrVar.getClass();
        zzikVar.zze = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return zzyrVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlw zzb(final zzkl zzklVar) {
        zzik zzikVar = this.zza;
        zzgmd.zzh(!zzikVar.zzw);
        zzklVar.getClass();
        zzikVar.zzf = new zzgmv() { // from class: com.google.android.gms.internal.ads.zzii
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return zzklVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlx zzc() {
        zzik zzikVar = this.zza;
        zzgmd.zzh(!zzikVar.zzw);
        zzikVar.zzw = true;
        return new zzlx(zzikVar);
    }
}
