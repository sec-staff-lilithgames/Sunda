package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zziw extends zzmf implements zznn {
    private static final zziw zzd;
    private zzmo zzb = zzmf.zzcv();

    static {
        zziw zziwVar = new zziw();
        zzd = zziwVar;
        zzmf.zzcp(zziw.class, zziwVar);
    }

    private zziw() {
    }

    public static zziw zzc() {
        return zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zziy.class});
        }
        if (i11 == 3) {
            return new zziw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zziv(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
