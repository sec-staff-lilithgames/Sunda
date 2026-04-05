package com.google.android.gms.internal.ads;

import com.ironsource.G5;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgrz {
    private static final zzgrz zza;
    private static final zzgrz zzb;
    private static final zzgrz zzc;

    static {
        Character chValueOf = Character.valueOf(G5.T);
        zza = new zzgrw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzgrw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzgry("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzgry("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzc = new zzgrv("base16()", "0123456789ABCDEF");
    }

    public static zzgrz zzl() {
        return zza;
    }

    public static zzgrz zzm() {
        return zzb;
    }

    public static zzgrz zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgrx;

    public abstract int zzd(int i10);

    public abstract int zzf(int i10);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgrz zzh();

    public abstract zzgrz zzi();

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzgmd.zzo(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgrx e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
