package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzabh extends zzacc implements zzadm {
    private static final zzabh zzd;
    private int zze;
    private boolean zzf;
    private zzaae zzh;
    private boolean zzi;
    private byte zzk = 2;
    private double zzg = -1.0d;
    private zzacn zzj = zzadu.zze();

    static {
        zzabh zzabhVar = new zzabh();
        zzd = zzabhVar;
        zzacf.zzao(zzabh.class, zzabhVar);
    }

    private zzabh() {
    }

    public static zzabh zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0005\u0000\u0001\u0010ϧ\u0005\u0000\u0001\u0002\u0010က\u0001\u0014ဇ\u0000!ဇ\u0003\"ᐉ\u0002ϧЛ", new Object[]{"zze", "zzg", "zzf", "zzi", "zzh", "zzj", zzabl.class});
        }
        if (i11 == 3) {
            return new zzabh();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzabg(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
