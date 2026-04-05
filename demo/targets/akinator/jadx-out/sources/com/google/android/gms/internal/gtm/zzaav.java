package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaav extends zzacc implements zzadm {
    private static final zzaav zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzk;
    private zzaae zzl;
    private byte zzn = 2;
    private String zzj = "";
    private zzacn zzm = zzadu.zze();

    static {
        zzaav zzaavVar = new zzaav();
        zzd = zzaavVar;
        zzacf.zzao(zzaav.class, zzaavVar);
    }

    private zzaav() {
    }

    public static zzaav zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004\u000bဇ\u0005\fᐉ\u0006ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzabl.class});
        }
        if (i11 == 3) {
            return new zzaav();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzaau(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
