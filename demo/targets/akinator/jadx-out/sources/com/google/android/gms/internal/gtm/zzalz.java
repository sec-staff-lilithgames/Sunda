package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalz extends zzacf implements zzadm {
    private static final zzalz zza;
    private int zzd = 0;
    private Object zze;

    static {
        zzalz zzalzVar = new zzalz();
        zza = zzalzVar;
        zzacf.zzao(zzalz.class, zzalzVar);
    }

    private zzalz() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", zzajo.class, zzake.class, zzakh.class, zzale.class, zzamn.class, zzakb.class});
        }
        if (i11 == 3) {
            return new zzalz();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzaly(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
