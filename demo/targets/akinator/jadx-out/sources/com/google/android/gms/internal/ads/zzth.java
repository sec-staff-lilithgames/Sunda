package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzth {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzth(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzth.class) {
            zzth zzthVar = (zzth) obj;
            if (TextUtils.equals(this.zza, zzthVar.zza) && this.zzb == zzthVar.zzb && this.zzc == zzthVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o2.B(this.zza.hashCode() + 31, 31, true != this.zzb ? 1237 : 1231, 31) + (true != this.zzc ? 1237 : 1231);
    }
}
