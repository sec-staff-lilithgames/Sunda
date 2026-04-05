package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagb implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm(MimeTypes.APPLICATION_ID3);
        zztVar.zzM();
        zzt zztVar2 = new zzt();
        zztVar2.zzm(MimeTypes.APPLICATION_SCTE35);
        zztVar2.zzM();
    }

    public zzagb(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagb.class == obj.getClass()) {
            zzagb zzagbVar = (zzagb) obj;
            if (this.zzc == zzagbVar.zzc && this.zzd == zzagbVar.zzd && Objects.equals(this.zza, zzagbVar.zza) && Objects.equals(this.zzb, zzagbVar.zzb) && Arrays.equals(this.zze, zzagbVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j10 = this.zzc;
        long j11 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) j11)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j10 = this.zzd;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        int length2 = String.valueOf(j11).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length3 + 8);
        i.h(sb2, "EMSG: scheme=", str, ", id=");
        sb2.append(j10);
        e2.A(sb2, ", durationMs=", j11, ", value=");
        sb2.append(str2);
        return sb2.toString();
    }
}
