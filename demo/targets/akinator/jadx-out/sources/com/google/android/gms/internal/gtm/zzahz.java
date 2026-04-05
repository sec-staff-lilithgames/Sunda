package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahz extends zzacf implements zzadm {
    private static final zzahz zza;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzahz zzahzVar = new zzahz();
        zza = zzahzVar;
        zzacf.zzao(zzahz.class, zzahzVar);
    }

    private zzahz() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0002\u0000\u0001\r\u0018\u0002\u0000\u0000\u0000\rင\u0000\u0018ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzahz();
        }
        zzahy zzahyVar = null;
        if (i11 == 4) {
            return new zzahx(zzahyVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
