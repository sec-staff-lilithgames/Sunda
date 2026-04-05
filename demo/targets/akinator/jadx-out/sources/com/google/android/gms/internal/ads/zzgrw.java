package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgrw extends zzgry {
    private zzgrw(zzgru zzgruVar, Character ch2) {
        super(zzgruVar, ch2);
        zzgmd.zza(zzgruVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgry, com.google.android.gms.internal.ads.zzgrz
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgmd.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i15 = bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i16 = bArr[i12 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzgru zzgruVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzgruVar.zza(i17 >>> 18));
            appendable.append(zzgruVar.zza((i17 >>> 12) & 63));
            appendable.append(zzgruVar.zza((i17 >>> 6) & 63));
            appendable.append(zzgruVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgry, com.google.android.gms.internal.ads.zzgrz
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgrx {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgru zzgruVar = this.zzb;
        if (!zzgruVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgrx(o2.l(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzc = (zzgruVar.zzc(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzgruVar.zzc(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzc2 = iZzc | (zzgruVar.zzc(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzc2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzc2 | zzgruVar.zzc(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgry
    public final zzgrz zzc(zzgru zzgruVar, Character ch2) {
        return new zzgrw(zzgruVar, ch2);
    }

    public zzgrw(String str, String str2, Character ch2) {
        this(new zzgru(str, str2.toCharArray()), ch2);
    }
}
