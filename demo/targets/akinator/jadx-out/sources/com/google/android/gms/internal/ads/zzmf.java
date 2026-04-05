package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzmf extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzmf(int i10, int i11) {
        super(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? e2.n(new StringBuilder(String.valueOf(i11).length() + 31), "Player stuck suppressed for ", i11, " ms") : e2.n(new StringBuilder(String.valueOf(i11).length() + 43), "Player stuck playing without ending for ", i11, " ms") : e2.n(new StringBuilder(String.valueOf(i11).length() + 45), "Player stuck playing with no progress for ", i11, " ms") : e2.n(new StringBuilder(String.valueOf(i11).length() + 47), "Player stuck buffering with no progress for ", i11, " ms") : e2.n(new StringBuilder(String.valueOf(i11).length() + 46), "Player stuck buffering and not loading for ", i11, " ms"));
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmf.class == obj.getClass()) {
            zzmf zzmfVar = (zzmf) obj;
            if (this.zza == zzmfVar.zza && this.zzb == zzmfVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }
}
