package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagg extends zzagq {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzagg(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagg.class == obj.getClass()) {
            zzagg zzaggVar = (zzagg) obj;
            if (this.zzc == zzaggVar.zzc && Objects.equals(this.zza, zzaggVar.zza) && Objects.equals(this.zzb, zzaggVar.zzb) && Arrays.equals(this.zzd, zzaggVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zzc;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        return Arrays.hashCode(this.zzd) + o2.B(i11, 31, iHashCode2, 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        com.google.android.gms.internal.play_billing.a.B(sb2, str, ": mimeType=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
