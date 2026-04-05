package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzl extends zzacf implements zzadm {
    private static final zzl zza;
    private byte zzf = 2;
    private zzacn zzd = zzacf.zzai();
    private zzacn zze = zzacf.zzai();

    static {
        zzl zzlVar = new zzl();
        zza = zzlVar;
        zzacf.zzao(zzl.class, zzlVar);
    }

    private zzl() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"zzd", zzj.class, "zze", zzf.class});
        }
        if (i11 == 3) {
            return new zzl();
        }
        zzm zzmVar = null;
        if (i11 == 4) {
            return new zzk(zzmVar);
        }
        if (i11 == 5) {
            return zza;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
