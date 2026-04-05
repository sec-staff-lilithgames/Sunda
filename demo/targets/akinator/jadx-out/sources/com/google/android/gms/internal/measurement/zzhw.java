package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhw extends zzmf implements zznn {
    private static final zzhw zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private zzmo zzi = zzmf.zzcv();

    static {
        zzhw zzhwVar = new zzhw();
        zzj = zzhwVar;
        zzmf.zzcp(zzhw.class, zzhwVar);
    }

    private zzhw() {
    }

    public static zzhv zzn() {
        return (zzhv) zzj.zzck();
    }

    private final void zzz() {
        zzmo zzmoVar = this.zzi;
        if (zzmoVar.zza()) {
            return;
        }
        this.zzi = zzmf.zzcw(zzmoVar);
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final String zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final float zzh() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zzb & 16) != 0;
    }

    public final double zzj() {
        return this.zzh;
    }

    public final List zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzhw.class});
        }
        if (i11 == 3) {
            return new zzhw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzhv(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final int zzm() {
        return this.zzi.size();
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void zzq() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void zzr(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    public final /* synthetic */ void zzs() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void zzt(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    public final /* synthetic */ void zzu() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final /* synthetic */ void zzv(zzhw zzhwVar) {
        zzhwVar.getClass();
        zzz();
        this.zzi.add(zzhwVar);
    }

    public final /* synthetic */ void zzw(Iterable iterable) {
        zzz();
        zzks.zzce(iterable, this.zzi);
    }

    public final /* synthetic */ void zzx() {
        this.zzi = zzmf.zzcv();
    }
}
