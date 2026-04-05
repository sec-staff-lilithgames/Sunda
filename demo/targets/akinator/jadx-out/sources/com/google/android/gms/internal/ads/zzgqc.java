package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgqc extends zzgrr {
    final /* synthetic */ zzgqd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgqc(zzgqd zzgqdVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgqdVar);
        this.zza = zzgqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
