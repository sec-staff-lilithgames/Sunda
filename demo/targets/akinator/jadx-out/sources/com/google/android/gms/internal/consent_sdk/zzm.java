package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzm implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzm(zzdr zzdrVar, zzdr zzdrVar2) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzl((Application) this.zza.zza(), (zzam) this.zzb.zza());
    }
}
