package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkd extends zzhk implements zzin {
    private static final zzkd zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzkd zzkdVar = new zzkd();
        zzb = zzkdVar;
        zzhk.zzx(zzkd.class, zzkdVar);
    }

    private zzkd() {
    }

    public static /* synthetic */ void zzC(zzkd zzkdVar, zzlb zzlbVar) {
        zzlbVar.getClass();
        zzkdVar.zzf = zzlbVar;
        zzkdVar.zze = 2;
    }

    public static /* synthetic */ void zzD(zzkd zzkdVar, zzlx zzlxVar) {
        zzlxVar.getClass();
        zzkdVar.zzf = zzlxVar;
        zzkdVar.zze = 3;
    }

    public static /* synthetic */ void zzE(zzkd zzkdVar, int i10) {
        zzkdVar.zzg = i10 - 1;
        zzkdVar.zzd |= 1;
    }

    public static zzkb zzc() {
        return (zzkb) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, zzlb.class, zzlx.class, zzlh.class});
        }
        if (i11 == 3) {
            return new zzkd();
        }
        zzkc zzkcVar = null;
        if (i11 == 4) {
            return new zzkb(zzkcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
