package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzh {
    private int zza;
    private int zzb;
    private int zzc;
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzh() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzh zza(int i10) {
        this.zza = i10;
        return this;
    }

    public final zzh zzb(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzh zzc(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzh zzd(byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzh zze(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzh zzf(int i10) {
        this.zzf = i10;
        return this;
    }

    public final zzi zzg() {
        return new zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzh(zzi zziVar, byte[] bArr) {
        this.zza = zziVar.zzb;
        this.zzb = zziVar.zzc;
        this.zzc = zziVar.zzd;
        this.zzd = zziVar.zze;
        this.zze = zziVar.zzf;
        this.zzf = zziVar.zzg;
    }
}
