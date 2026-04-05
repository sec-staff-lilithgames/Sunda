package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaek extends zzacf implements zzadm {
    private static final zzaek zza;
    private long zzd;
    private int zze;

    static {
        zzaek zzaekVar = new zzaek();
        zza = zzaekVar;
        zzacf.zzao(zzaek.class, zzaekVar);
    }

    private zzaek() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzadv(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzaek();
        }
        zzaej zzaejVar = null;
        if (i11 == 4) {
            return new zzaei(zzaejVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
