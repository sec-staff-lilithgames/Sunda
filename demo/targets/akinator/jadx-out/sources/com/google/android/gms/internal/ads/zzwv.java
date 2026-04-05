package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwv {
    public static final zzwv zza = new zzwv(new zzbg[0]);
    public final int zzb;
    private final zzgpe zzc;
    private int zzd;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
    }

    public zzwv(zzbg... zzbgVarArr) {
        this.zzc = zzgpe.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbg) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzdt.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwv.class == obj.getClass()) {
            zzwv zzwvVar = (zzwv) obj;
            if (this.zzb == zzwvVar.zzb && this.zzc.equals(zzwvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i10) {
        return (zzbg) this.zzc.get(i10);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgpe zzc() {
        return zzgpe.zzq(zzgqe.zzc(this.zzc, zzwu.zza));
    }
}
