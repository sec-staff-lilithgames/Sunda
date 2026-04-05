package com.google.android.gms.internal.ads;

import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhvi implements Iterable<Byte>, Serializable {
    public static final zzhvi zzb = new zzhvg(zzhxb.zzb);
    private int zza = 0;

    static {
        int i10 = zzhuv.zza;
    }

    public static int zzA(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(e2.n(new StringBuilder(String.valueOf(i10).length() + 21), "Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length())));
        }
        throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i11, i12, "End index: ", " >= ", new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length())));
    }

    private static zzhvi zzd(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(o2.k(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (zzhvi) it.next();
        }
        int i11 = i10 >>> 1;
        zzhvi zzhviVarZzd = zzd(it, i11);
        zzhvi zzhviVarZzd2 = zzd(it, i10 - i11);
        if (Integer.MAX_VALUE - zzhviVarZzd.zzc() >= zzhviVarZzd2.zzc()) {
            return zzhyq.zzd(zzhviVarZzd, zzhviVarZzd2);
        }
        int iZzc = zzhviVarZzd.zzc();
        int iZzc2 = zzhviVarZzd2.zzc();
        throw new IllegalArgumentException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iZzc, iZzc2, "ByteString would be too long: ", "+", new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length())));
    }

    public static zzhvi zzr(byte[] bArr, int i10, int i11) {
        zzA(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzhvg(bArr2);
    }

    public static zzhvi zzs(String str) {
        return new zzhvg(str.getBytes(zzhxb.zza));
    }

    public static zzhvi zzt(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public static zzhvh zzx() {
        return new zzhvh(128);
    }

    public static void zzz(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(o2.l(i10, "Index < 0: ", new StringBuilder(String.valueOf(i10).length() + 11)));
            }
            throw new ArrayIndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "Index > length: ", ", ", new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length())));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzo = this.zza;
        if (iZzo == 0) {
            int iZzc = zzc();
            iZzo = zzo(iZzc, 0, iZzc);
            if (iZzo == 0) {
                iZzo = 1;
            }
            this.zza = iZzo;
        }
        return iZzo;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return j1.o2.o(a.b.r(zzc(), "<ByteString@", hexString, " size=", " contents=\""), zzc() <= 50 ? zzhza.zza(this) : zzhza.zza(zzi(0, 47)).concat(APSSharedUtil.TRUNCATE_SEPARATOR), "\">");
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzc();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzg();

    public abstract zzhvi zzi(int i10, int i11);

    public abstract ByteBuffer zzj();

    public abstract void zzk(zzhuz zzhuzVar) throws IOException;

    public abstract String zzl(Charset charset);

    public abstract boolean zzm();

    public abstract int zzn(int i10, int i11, int i12);

    public abstract int zzo(int i10, int i11, int i12);

    public abstract zzhvn zzp();

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzhvd iterator() {
        return new zzhva(this);
    }

    @Deprecated
    public final void zzu(byte[] bArr, int i10, int i11, int i12) {
        zzA(0, i12, zzc());
        zzA(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }

    public final byte[] zzv() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzhxb.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzw() {
        return zzc() == 0 ? "" : zzl(zzhxb.zza);
    }

    public final int zzy() {
        return this.zza;
    }
}
