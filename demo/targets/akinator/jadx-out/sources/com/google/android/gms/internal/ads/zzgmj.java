package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmj extends zzgmq {
    final /* synthetic */ zzglr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgmj(zzgms zzgmsVar, CharSequence charSequence, zzglr zzglrVar) {
        super(zzgmsVar, charSequence);
        this.zza = zzglrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmq
    public final int zzc(int i10) {
        CharSequence charSequence = ((zzgmq) this).zzb;
        int length = charSequence.length();
        zzgmd.zzn(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgmq
    public final int zzd(int i10) {
        return i10 + 1;
    }
}
