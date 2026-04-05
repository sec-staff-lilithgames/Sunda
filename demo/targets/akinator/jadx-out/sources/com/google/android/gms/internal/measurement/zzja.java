package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzja extends zzmf implements zznn {
    private static final zzja zzf;
    private int zzb;
    private zzmo zzd = zzmf.zzcv();
    private zziw zze;

    static {
        zzja zzjaVar = new zzja();
        zzf = zzjaVar;
        zzmf.zzcp(zzja.class, zzjaVar);
    }

    private zzja() {
    }

    public final List zza() {
        return this.zzd;
    }

    public final zziw zzb() {
        zziw zziwVar = this.zze;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", zzje.class, "zze"});
        }
        if (i11 == 3) {
            return new zzja();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zziz(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
