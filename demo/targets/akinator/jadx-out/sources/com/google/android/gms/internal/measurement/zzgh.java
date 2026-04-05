package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgh extends zzmf implements zznn {
    private static final zzgh zzg;
    private int zzb;
    private String zzd = "";
    private zzmo zze = zzmf.zzcv();
    private boolean zzf;

    static {
        zzgh zzghVar = new zzgh();
        zzg = zzghVar;
        zzmf.zzcp(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", zzgr.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzgh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzgg(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
