package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgoo {
    public static Object zza(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(o2.l(i10, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i10).length() + 41)));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static int zzb(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static void zzc(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static int zzd(int i10) {
        return (i10 + 1) * (i10 < 32 ? 4 : 2);
    }

    public static int zze(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iZzb = zzgox.zzb(obj);
        int i13 = iZzb & i10;
        int iZzb2 = zzb(obj3, i13);
        if (iZzb2 != 0) {
            int i14 = ~i10;
            int i15 = iZzb & i14;
            int i16 = -1;
            while (true) {
                i11 = iZzb2 - 1;
                int i17 = iArr[i11];
                i12 = i17 & i10;
                if ((i17 & i14) != i15 || !Objects.equals(obj, objArr[i11]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i11]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i16 = i11;
                    iZzb2 = i12;
                } else {
                    break;
                }
            }
            if (i16 == -1) {
                zzc(obj3, i13, i12);
                return i11;
            }
            iArr[i16] = (iArr[i16] & i14) | (i12 & i10);
            return i11;
        }
        return -1;
    }
}
