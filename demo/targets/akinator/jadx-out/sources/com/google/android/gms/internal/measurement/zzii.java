package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzii extends zzmf implements zznn {
    private static final zzii zzg;
    private zzmn zzb = zzmf.zzct();
    private zzmn zzd = zzmf.zzct();
    private zzmo zze = zzmf.zzcv();
    private zzmo zzf = zzmf.zzcv();

    static {
        zzii zziiVar = new zzii();
        zzg = zziiVar;
        zzmf.zzcp(zzii.class, zziiVar);
    }

    private zzii() {
    }

    public static zzih zzi() {
        return (zzih) zzg.zzck();
    }

    public static zzii zzj() {
        return zzg;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final List zzc() {
        return this.zzd;
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final List zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zze.size();
    }

    public final List zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzf.size();
    }

    public final /* synthetic */ void zzk(Iterable iterable) {
        zzmn zzmnVar = this.zzb;
        if (!zzmnVar.zza()) {
            this.zzb = zzmf.zzcu(zzmnVar);
        }
        zzks.zzce(iterable, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", zzhq.class, "zzf", zzik.class});
        }
        if (i11 == 3) {
            return new zzii();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzih(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final /* synthetic */ void zzm() {
        this.zzb = zzmf.zzct();
    }

    public final /* synthetic */ void zzn(Iterable iterable) {
        zzmn zzmnVar = this.zzd;
        if (!zzmnVar.zza()) {
            this.zzd = zzmf.zzcu(zzmnVar);
        }
        zzks.zzce(iterable, this.zzd);
    }

    public final /* synthetic */ void zzo() {
        this.zzd = zzmf.zzct();
    }

    public final /* synthetic */ void zzp(Iterable iterable) {
        zzmo zzmoVar = this.zze;
        if (!zzmoVar.zza()) {
            this.zze = zzmf.zzcw(zzmoVar);
        }
        zzks.zzce(iterable, this.zze);
    }

    public final /* synthetic */ void zzq() {
        this.zze = zzmf.zzcv();
    }

    public final /* synthetic */ void zzr(Iterable iterable) {
        zzmo zzmoVar = this.zzf;
        if (!zzmoVar.zza()) {
            this.zzf = zzmf.zzcw(zzmoVar);
        }
        zzks.zzce(iterable, this.zzf);
    }

    public final /* synthetic */ void zzs() {
        this.zzf = zzmf.zzcv();
    }
}
