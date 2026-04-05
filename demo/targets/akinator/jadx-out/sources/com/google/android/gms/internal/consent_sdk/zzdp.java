package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdp implements zzdo {
    private final Object zza;

    private zzdp(Object obj) {
        this.zza = obj;
    }

    public static zzdo zzb(Object obj) {
        if (obj != null) {
            return new zzdp(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        return this.zza;
    }
}
