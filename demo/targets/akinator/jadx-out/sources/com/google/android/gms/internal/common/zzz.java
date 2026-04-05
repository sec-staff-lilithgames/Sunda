package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzz(zzaa zzaaVar, CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzm
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i10 = this.zze;
        while (true) {
            int i11 = this.zze;
            if (i11 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i11);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i10) {
                int i12 = iZzc + 1;
                this.zze = i12;
                if (i12 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i10 < iZzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i10 != iZzd) {
                    break;
                }
                i10 = this.zze;
            }
        }
        int i13 = this.zzf;
        if (i13 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i10) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i13 - 1;
        }
        return this.zzb.subSequence(i10, iZzd).toString();
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
