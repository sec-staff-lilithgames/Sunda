package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zziu extends zzmf implements zznn {
    private static final zziu zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        zziu zziuVar = new zziu();
        zzj = zziuVar;
        zzmf.zzcp(zziu.class, zziuVar);
    }

    private zziu() {
    }

    public static zzit zzm() {
        return (zzit) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzb & 16) != 0;
    }

    public final float zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return (this.zzb & 32) != 0;
    }

    public final double zzk() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zziu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzit(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final /* synthetic */ void zzn(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void zzq() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void zzr(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    public final /* synthetic */ void zzs() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void zzt(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    public final /* synthetic */ void zzu() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
