package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhsz {
    private final byte[] zza;

    private zzhsz(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzhsz zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzhsz zzb(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i11 > length) {
            i11 = length;
        }
        return new zzhsz(bArr, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhsz) {
            return Arrays.equals(((zzhsz) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb2.toString();
        return a.b.o(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
