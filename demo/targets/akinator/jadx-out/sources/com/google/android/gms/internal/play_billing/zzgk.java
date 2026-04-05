package com.google.android.gms.internal.play_billing;

import a.b;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgk implements Iterable, Serializable {
    public static final zzgk zzb = new zzgi(zzhp.zzb);
    private int zza = 0;

    static {
        int i10 = zzfy.zza;
    }

    public static int zzh(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(o2.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(i.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(i.a(i11, i12, "End index: ", " >= "));
    }

    public static zzgk zzj(byte[] bArr, int i10, int i11) {
        zzh(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgi(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgd(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return j1.o2.o(b.r(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzjh.zza(this) : zzjh.zza(zzf(0, 47)).concat(APSSharedUtil.TRUNCATE_SEPARATOR), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract int zze(int i10, int i11, int i12);

    public abstract zzgk zzf(int i10, int i11);

    public abstract void zzg(zzgc zzgcVar) throws IOException;

    public final int zzi() {
        return this.zza;
    }
}
