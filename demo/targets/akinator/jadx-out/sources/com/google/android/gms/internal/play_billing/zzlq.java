package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlq extends zzhk implements zzin {
    private static final zzlq zzb;
    private int zzd;
    private zzki zze;

    static {
        zzlq zzlqVar = new zzlq();
        zzb = zzlqVar;
        zzhk.zzx(zzlq.class, zzlqVar);
    }

    private zzlq() {
    }

    public static /* synthetic */ void zzC(zzlq zzlqVar, zzki zzkiVar) {
        zzkiVar.getClass();
        zzlqVar.zze = zzkiVar;
        zzlqVar.zzd |= 1;
    }

    public static zzlo zzc() {
        return (zzlo) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzlq();
        }
        zzlp zzlpVar = null;
        if (i11 == 4) {
            return new zzlo(zzlpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
