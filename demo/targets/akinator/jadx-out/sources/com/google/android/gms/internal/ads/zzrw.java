package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzrw implements zzrz {
    @Override // com.google.android.gms.internal.ads.zzrz
    public final zzrs zza(zzru zzruVar, zzv zzvVar) {
        if (zzvVar.zzs == null) {
            return null;
        }
        return new zzsa(new zzrr(new zzsc(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzs != null ? 1 : 0;
    }
}
