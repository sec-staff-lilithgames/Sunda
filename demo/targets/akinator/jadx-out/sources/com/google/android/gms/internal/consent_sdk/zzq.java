package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzq(zzdr zzdrVar, zzdr zzdrVar2) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzn zza() {
        return new zzn((Application) this.zza.zza(), (zzaq) this.zzb.zza());
    }
}
