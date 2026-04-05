package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzxj extends zzacf implements zzadm {
    public static final zzace zza;
    private static final zzxj zzd;
    private int zze;
    private zzxg zzh;
    private int zzi;
    private int zzj;
    private int zzm;
    private boolean zzo;
    private long zzp;
    private zzxm zzq;
    private byte zzs = 2;
    private int zzf = -1;
    private int zzg = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzn = -1;
    private int zzr = -1;

    static {
        zzxj zzxjVar = new zzxj();
        zzd = zzxjVar;
        zzacf.zzao(zzxj.class, zzxjVar);
        zza = zzacf.zzac(zzaii.zze(), zzxjVar, zzxjVar, null, 15872052, zzaex.zzk, zzxj.class);
    }

    private zzxj() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i11 == 2) {
            return zzacf.zzal(zzd, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\u0005င\u0005\u0006င\u0006\u0007င\u0007\bင\u0004\tင\b\nဇ\t\u000bင\u0001\fစ\n\rᐉ\u000b\u000eင\f\u000fဉ\u0002", new Object[]{"zze", "zzf", "zzi", "zzk", "zzl", "zzm", "zzj", "zzn", "zzo", "zzg", "zzp", "zzq", "zzr", "zzh"});
        }
        if (i11 == 3) {
            return new zzxj();
        }
        zzxk zzxkVar = null;
        if (i11 == 4) {
            return new zzxi(zzxkVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
