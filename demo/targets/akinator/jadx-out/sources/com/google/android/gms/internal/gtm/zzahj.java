package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahj extends zzacf implements zzadm {
    private static final zzahj zza;
    private byte zze = 2;
    private zzacn zzd = zzacf.zzai();

    static {
        zzahj zzahjVar = new zzahj();
        zza = zzahjVar;
        zzacf.zzao(zzahj.class, zzahjVar);
    }

    private zzahj() {
    }

    public static zzahj zze() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzahi.class});
        }
        if (i11 == 3) {
            return new zzahj();
        }
        zzahm zzahmVar = null;
        if (i11 == 4) {
            return new zzahg(zzahmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
