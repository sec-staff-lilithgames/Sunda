package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcl {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;
    private int zzp;

    public zzcl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final zzcl zza(CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = null;
        return this;
    }

    @Pure
    public final CharSequence zzb() {
        return this.zza;
    }

    public final zzcl zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        this.zza = null;
        return this;
    }

    public final zzcl zzd(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcl zze(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcl zzf(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcl zzg(int i10) {
        this.zzg = i10;
        return this;
    }

    @Pure
    public final int zzh() {
        return this.zzg;
    }

    public final zzcl zzi(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcl zzj(int i10) {
        this.zzi = i10;
        return this;
    }

    @Pure
    public final int zzk() {
        return this.zzi;
    }

    public final zzcl zzl(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcl zzm(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcl zzn(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcl zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzcl zzp(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcl zzq(int i10) {
        this.zzp = i10;
        return this;
    }

    public final zzcm zzr() {
        return new zzcm(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, this.zzp, null);
    }

    public /* synthetic */ zzcl(zzcm zzcmVar, byte[] bArr) {
        this.zza = zzcmVar.zza;
        this.zzb = zzcmVar.zzd;
        this.zzc = zzcmVar.zzb;
        this.zzd = zzcmVar.zzc;
        this.zze = zzcmVar.zze;
        this.zzf = zzcmVar.zzf;
        this.zzg = zzcmVar.zzg;
        this.zzh = zzcmVar.zzh;
        this.zzi = zzcmVar.zzi;
        this.zzj = zzcmVar.zzl;
        this.zzk = zzcmVar.zzm;
        this.zzl = zzcmVar.zzj;
        this.zzm = zzcmVar.zzk;
        this.zzn = zzcmVar.zzn;
        this.zzo = zzcmVar.zzo;
        this.zzp = zzcmVar.zzp;
    }
}
