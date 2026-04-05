package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzgmq extends zzgll {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzgmq(zzgms zzgmsVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgll
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i10 = this.zzc;
        while (true) {
            int i11 = this.zzc;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i11);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzc = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzc = iZzd;
            }
            if (iZzd != i10) {
                if (i10 < iZzc) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i12 = this.zzd;
                if (i12 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i10) {
                        charSequence.charAt(length - 1);
                    }
                    iZzc = length;
                } else {
                    this.zzd = i12 - 1;
                }
                return this.zzb.subSequence(i10, iZzc).toString();
            }
            int i13 = iZzd + 1;
            this.zzc = i13;
            if (i13 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
