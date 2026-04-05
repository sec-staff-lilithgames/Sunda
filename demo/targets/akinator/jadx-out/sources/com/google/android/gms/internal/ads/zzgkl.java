package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgkl extends zzgjj {
    final /* synthetic */ zzgkn zza;
    private final zzgks zzb;

    public zzgkl(zzgkn zzgknVar, zzgks zzgksVar) {
        Objects.requireNonNull(zzgknVar);
        this.zza = zzgknVar;
        this.zzb = zzgksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjk
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        zzgkq zzgkqVarZzd = zzgkr.zzd();
        zzgkqVarZzd.zza(i10);
        if (string != null) {
            zzgkqVarZzd.zzb(string);
        }
        zzgkqVarZzd.zzc(i11);
        this.zzb.zza(zzgkqVarZzd.zzd());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}
