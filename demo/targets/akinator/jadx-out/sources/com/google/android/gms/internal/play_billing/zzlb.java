package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlb extends zzhk implements zzin {
    private static final zzlb zzb;
    private int zzd;
    private int zze;

    static {
        zzlb zzlbVar = new zzlb();
        zzb = zzlbVar;
        zzhk.zzx(zzlb.class, zzlbVar);
    }

    private zzlb() {
    }

    public static /* synthetic */ void zzC(zzlb zzlbVar, int i10) {
        zzlbVar.zze = i10 - 1;
        zzlbVar.zzd |= 1;
    }

    public static zzky zzc() {
        return (zzky) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
        }
        if (i11 == 3) {
            return new zzlb();
        }
        zzla zzlaVar = null;
        if (i11 == 4) {
            return new zzky(zzlaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
