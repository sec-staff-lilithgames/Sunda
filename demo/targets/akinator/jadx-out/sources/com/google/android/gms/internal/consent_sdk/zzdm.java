package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zzb(zzdr zzdrVar, zzdr zzdrVar2) {
        zzdm zzdmVar = (zzdm) zzdrVar;
        if (zzdmVar.zza != null) {
            throw new IllegalStateException();
        }
        zzdmVar.zza = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        zzdr zzdrVar = this.zza;
        if (zzdrVar != null) {
            return zzdrVar.zza();
        }
        throw new IllegalStateException();
    }
}
