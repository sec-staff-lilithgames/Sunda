package com.google.android.gms.internal.measurement;

import a.b;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import j1.o2;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh zzb = new zzlg(zzmp.zzb);
    private int zza = 0;

    static {
        int i10 = zzkv.zza;
    }

    public static zzlh zzh(byte[] bArr, int i10, int i11) {
        zzj(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzlg(bArr2);
    }

    public static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(e2.n(new StringBuilder(String.valueOf(i10).length() + 21), "Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a.m(i10, i11, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length())));
        }
        throw new IndexOutOfBoundsException(a.m(i11, i12, "End index: ", " >= ", new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length())));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzg = this.zza;
        if (iZzg == 0) {
            int iZzc = zzc();
            iZzg = zzg(iZzc, 0, iZzc);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zza = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzla(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return o2.o(b.r(zzc(), "<ByteString@", hexString, " size=", " contents=\""), zzc() <= 50 ? zzog.zza(this) : zzog.zza(zze(0, 47)).concat(APSSharedUtil.TRUNCATE_SEPARATOR), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzc();

    public abstract zzlh zze(int i10, int i11);

    public abstract void zzf(zzkz zzkzVar) throws IOException;

    public abstract int zzg(int i10, int i11, int i12);

    public final int zzi() {
        return this.zza;
    }
}
