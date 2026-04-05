package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzis extends zzmf implements zznn {
    private static final zzis zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzis zzisVar = new zzis();
        zzg = zzisVar;
        zzmf.zzcp(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static zzil zzb() {
        return (zzil) zzg.zzck();
    }

    public static zzis zzc() {
        return zzg;
    }

    public final zzin zza() {
        zzin zzinVarZzb = zzin.zzb(this.zze);
        return zzinVarZzb == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarZzb;
    }

    public final /* synthetic */ void zzd(zzin zzinVar) {
        this.zze = zzinVar.zza();
        this.zzb |= 2;
    }

    public final int zzf() {
        int iZza = zzir.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzg() {
        int iZza = zzip.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzh(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", zziq.zza, "zze", zzim.zza, "zzf", zzio.zza});
        }
        if (i11 == 3) {
            return new zzis();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzil(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
