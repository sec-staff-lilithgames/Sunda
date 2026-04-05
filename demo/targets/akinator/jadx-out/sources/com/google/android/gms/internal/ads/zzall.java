package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzall {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzale zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzall zzB(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzall zzD(boolean z10) {
        this.zzq = z10 ? 1 : 0;
        return this;
    }

    public final zzale zzE() {
        return this.zzr;
    }

    public final zzall zzF(zzale zzaleVar) {
        this.zzr = zzaleVar;
        return this;
    }

    public final zzall zzG(float f10) {
        this.zzk = f10;
        return this;
    }

    public final zzall zzH(int i10) {
        this.zzj = i10;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzall zzK(String str) {
        this.zzt = str;
        return this;
    }

    public final String zzL() {
        return this.zzt;
    }

    public final zzall zzM(String str) {
        this.zzu = str;
        return this;
    }

    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i10 = this.zzh;
        if (i10 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzall zzc(boolean z10) {
        this.zzf = z10 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzall zze(boolean z10) {
        this.zzg = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzf(boolean z10) {
        this.zzh = z10 ? 1 : 0;
        return this;
    }

    public final zzall zzg(boolean z10) {
        this.zzi = z10 ? 1 : 0;
        return this;
    }

    public final String zzh() {
        return this.zza;
    }

    public final zzall zzi(String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzall zzk(int i10) {
        this.zzb = i10;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzall zzn(int i10) {
        this.zzd = i10;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzall zzp(float f10) {
        this.zzs = f10;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzall zzr(zzall zzallVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzallVar != null) {
            if (!this.zzc && zzallVar.zzc) {
                zzk(zzallVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzallVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzallVar.zzi;
            }
            if (this.zza == null && (str = zzallVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzallVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzallVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzallVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzallVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzallVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzallVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzallVar.zzj;
                this.zzk = zzallVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzallVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzallVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzallVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzallVar.zzu;
            }
            if (!this.zze && zzallVar.zze) {
                zzn(zzallVar.zzd);
            }
            if (this.zzm == -1 && (i10 = zzallVar.zzm) != -1) {
                this.zzm = i10;
            }
        }
        return this;
    }

    public final zzall zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final String zzt() {
        return this.zzl;
    }

    public final zzall zzu(int i10) {
        this.zzm = i10;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzall zzw(int i10) {
        this.zzn = i10;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzall zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
