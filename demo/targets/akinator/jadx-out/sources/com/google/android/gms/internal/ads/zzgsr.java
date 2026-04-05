package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgsr implements Serializable {
    private static final zzgsr zza = new zzgsr(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgsr(int[] iArr, int i10, int i11) {
        this.zzb = iArr;
        this.zzc = i11;
    }

    public static zzgsr zza() {
        return zza;
    }

    public static zzgsr zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgsr(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgsr)) {
            return false;
        }
        zzgsr zzgsrVar = (zzgsr) obj;
        int i10 = this.zzc;
        if (i10 != zzgsrVar.zzc) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (zzd(i11) != zzgsrVar.zzd(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i10]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.zzc;
        if (i10 == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.zzb;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i10) {
        zzgmd.zzm(i10, this.zzc, "index");
        return this.zzb[i10];
    }
}
