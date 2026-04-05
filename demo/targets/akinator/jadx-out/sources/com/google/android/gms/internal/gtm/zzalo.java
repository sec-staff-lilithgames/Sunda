package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalo extends zzacf implements zzadm {
    private static final zzalo zza;
    private int zzd;
    private int zze;
    private long zzh;
    private int zzi;
    private int zzj;
    private zzalk zzr;
    private String zzf = "";
    private String zzg = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private zzacn zzp = zzacf.zzai();
    private zzacn zzq = zzacf.zzai();

    static {
        zzalo zzaloVar = new zzalo();
        zza = zzaloVar;
        zzacf.zzao(zzalo.class, zzaloVar);
    }

    private zzalo() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacf
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzacf.zzal(zza, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\f\u001b\r\u001b\u000fဉ\u000b", new Object[]{"zzd", "zze", zzalg.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzalm.class, "zzq", zzalm.class, "zzr"});
        }
        if (i11 == 3) {
            return new zzalo();
        }
        zzamq zzamqVar = null;
        if (i11 == 4) {
            return new zzaln(zzamqVar);
        }
        if (i11 == 5) {
            return zza;
        }
        throw null;
    }
}
