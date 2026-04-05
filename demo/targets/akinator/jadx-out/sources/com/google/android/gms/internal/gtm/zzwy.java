package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwy extends zzacf implements zzadm {
    public static final zzace zza;
    private static final zzwy zzd;

    static {
        zzwy zzwyVar = new zzwy();
        zzd = zzwyVar;
        zzacf.zzao(zzwy.class, zzwyVar);
        zza = zzacf.zzab(zzxd.zzc(), null, null, 330, zzaex.zze, false, Integer.class);
    }

    private zzwy() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzxe zzxeVar = null;
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new zzwy();
        }
        if (i11 == 4) {
            return new zzwx(zzxeVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
