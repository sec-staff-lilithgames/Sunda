package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzgry extends zzgrz {
    private volatile zzgrz zza;
    final zzgru zzb;
    final Character zzc;

    public zzgry(zzgru zzgruVar, Character ch2) {
        this.zzb = zzgruVar;
        boolean z10 = true;
        if (ch2 != null && zzgruVar.zze(G5.T)) {
            z10 = false;
        }
        zzgmd.zzf(z10, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgry) {
            zzgry zzgryVar = (zzgry) obj;
            if (this.zzb.equals(zzgryVar.zzb) && Objects.equals(this.zzc, zzgryVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgru zzgruVar = this.zzb;
        sb2.append(zzgruVar);
        if (8 % zzgruVar.zzb != 0) {
            Character ch2 = this.zzc;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgmd.zzo(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zze(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgrx {
        int i10;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgru zzgruVar = this.zzb;
        if (!zzgruVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgrx(o2.l(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzgruVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzc <<= zzgruVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzc |= zzgruVar.zzc(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzgruVar.zzd;
            int i16 = i14 * zzgruVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzc >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public zzgrz zzc(zzgru zzgruVar, Character ch2) {
        return new zzgry(zzgruVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final int zzd(int i10) {
        zzgru zzgruVar = this.zzb;
        return zzgruVar.zzc * zzgsm.zzb(i10, zzgruVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgmd.zzo(i10, i10 + i11, bArr.length);
        zzgru zzgruVar = this.zzb;
        int i12 = zzgruVar.zzd;
        int i13 = 0;
        zzgmd.zza(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | (bArr[i10 + i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzgruVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzgruVar.zza(zzgruVar.zza & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzc != null) {
            while (i13 < i12 * 8) {
                appendable.append(G5.T);
                i13 += i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final int zzf(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final zzgrz zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    public final zzgrz zzi() {
        zzgrz zzgrzVarZzc = this.zza;
        if (zzgrzVarZzc == null) {
            zzgru zzgruVar = this.zzb;
            zzgru zzgruVarZzd = zzgruVar.zzd();
            zzgrzVarZzc = zzgruVarZzd == zzgruVar ? this : zzc(zzgruVarZzd, this.zzc);
            this.zza = zzgrzVarZzc;
        }
        return zzgrzVarZzc;
    }

    public zzgry(String str, String str2, Character ch2) {
        this(new zzgru(str, str2.toCharArray()), ch2);
    }
}
