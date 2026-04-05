package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmk extends zzgmq {
    final /* synthetic */ zzgls zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgmk(zzgms zzgmsVar, CharSequence charSequence, zzgls zzglsVar) {
        super(zzgmsVar, charSequence);
        this.zza = zzglsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmq
    public final int zzc(int i10) {
        Matcher matcher = ((zzglv) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgmq
    public final int zzd(int i10) {
        return ((zzglv) this.zza).zza.end();
    }
}
