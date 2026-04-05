package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaaq extends zzacc implements zzadm {
    private static final zzaaq zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzn;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private zzaae zzu;
    private zzaak zzv;
    private byte zzx = 2;
    private zzacn zzm = zzadu.zze();
    private boolean zzo = true;
    private zzack zzs = zzacg.zzf();
    private zzacn zzt = zzadu.zze();
    private zzacn zzw = zzadu.zze();

    static {
        zzaaq zzaaqVar = new zzaaq();
        zzd = zzaaqVar;
        zzacf.zzao(zzaaq.class, zzaaqVar);
    }

    private zzaaq() {
    }

    public static zzaaq zze() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i11 == 2) {
            return new zzadv(zzd, "\u0001\u0012\u0000\u0001\u0001ϧ\u0012\u0000\u0004\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004\u0010ဇ\n\u0011᠌\u000b\u0013ࠞ\u0014\u001b\u0015ᐉ\f\u0016ဉ\rϧЛ", new Object[]{"zze", "zzf", zzaag.zza, "zzg", "zzk", "zzi", "zzh", zzaal.zza, "zzl", "zzm", zzaap.class, "zzn", "zzo", "zzp", "zzj", "zzq", "zzr", zzaam.zza, "zzs", zzaan.zza, "zzt", zzaai.class, "zzu", "zzv", "zzw", zzabl.class});
        }
        if (i11 == 3) {
            return new zzaaq();
        }
        zzabm zzabmVar = null;
        if (i11 == 4) {
            return new zzaaf(zzabmVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
