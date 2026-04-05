package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzik extends zzmf implements zznn {
    private static final zzik zzf;
    private int zzb;
    private int zzd;
    private zzmn zze = zzmf.zzct();

    static {
        zzik zzikVar = new zzik();
        zzf = zzikVar;
        zzmf.zzcp(zzik.class, zzikVar);
    }

    private zzik() {
    }

    public static zzij zzf() {
        return (zzij) zzf.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final long zze(int i10) {
        return this.zze.zzc(i10);
    }

    public final /* synthetic */ void zzg(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void zzh(Iterable iterable) {
        zzmn zzmnVar = this.zze;
        if (!zzmnVar.zza()) {
            this.zze = zzmf.zzcu(zzmnVar);
        }
        zzks.zzce(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzik();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzij(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
