package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjz extends zzhk implements zzin {
    private static final zzjz zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzki zzh;

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzhk.zzx(zzjz.class, zzjzVar);
    }

    private zzjz() {
    }

    public static zzjz zzC(byte[] bArr, zzgw zzgwVar) throws zzhr {
        return (zzjz) zzhk.zzq(zzb, bArr, zzgwVar);
    }

    public static /* synthetic */ void zzD(zzjz zzjzVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzjzVar.zzh = zzkiVar;
        zzjzVar.zzd |= 2;
    }

    public static /* synthetic */ void zzE(zzjz zzjzVar, zzlb zzlbVar) {
        zzlbVar.getClass();
        zzjzVar.zzf = zzlbVar;
        zzjzVar.zze = 4;
    }

    public static /* synthetic */ void zzF(zzjz zzjzVar, int i10) {
        zzjzVar.zzg = i10 - 1;
        zzjzVar.zzd |= 1;
    }

    public static zzjx zzc() {
        return (zzjx) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, "zzh", zzlb.class});
        }
        if (i11 == 3) {
            return new zzjz();
        }
        zzjy zzjyVar = null;
        if (i11 == 4) {
            return new zzjx(zzjyVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
