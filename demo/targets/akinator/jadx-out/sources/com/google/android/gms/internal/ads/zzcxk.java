package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcxk implements zzdac, zzczj {
    private final zzffu zza;

    public zzcxk(Context context, zzffu zzffuVar, zzbvn zzbvnVar) {
        this.zza = zzffuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        zzbvo zzbvoVar = this.zza.zzad;
        if (zzbvoVar == null || !zzbvoVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbvoVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzc(Context context) {
    }
}
