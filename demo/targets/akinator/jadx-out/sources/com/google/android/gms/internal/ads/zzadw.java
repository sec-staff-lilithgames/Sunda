package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadw {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadw() {
    }

    public final boolean zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!zzadx.zzl(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.zza = i11;
        this.zzb = zzadx.zza[3 - i12];
        int i16 = zzadx.zzb[i14];
        this.zzd = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.zzd = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.zzd = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        this.zzg = zzadx.zzm(i11, i12);
        if (i12 == 3) {
            int i18 = i11 == 3 ? zzadx.zzc[i15] : zzadx.zzd[i15];
            this.zzf = i18;
            this.zzc = (((i18 * 12) / i16) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? zzadx.zze[i15] : zzadx.zzf[i15];
                this.zzf = i19;
                this.zzc = a.b.a(i19, 144, i16, i17);
            } else {
                int i20 = zzadx.zzg[i15];
                this.zzf = i20;
                this.zzc = a.b.a(i12 == 1 ? 72 : 144, i20, i16, i17);
            }
        }
        this.zze = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzadw(zzadw zzadwVar) {
        this.zza = zzadwVar.zza;
        this.zzb = zzadwVar.zzb;
        this.zzc = zzadwVar.zzc;
        this.zzd = zzadwVar.zzd;
        this.zze = zzadwVar.zze;
        this.zzf = zzadwVar.zzf;
        this.zzg = zzadwVar.zzg;
    }
}
