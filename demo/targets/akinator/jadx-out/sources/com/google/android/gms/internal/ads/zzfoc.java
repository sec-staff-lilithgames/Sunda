package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfoc {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    public /* synthetic */ zzfoc(zzfob zzfobVar, byte[] bArr) {
        this.zza = zzfobVar.zzb();
        this.zzb = zzfobVar.zzc();
        this.zzc = zzfobVar.zzd();
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfoc) {
            zzfoc zzfocVar = (zzfoc) obj;
            if (this.zza.equals(zzfocVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfocVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
