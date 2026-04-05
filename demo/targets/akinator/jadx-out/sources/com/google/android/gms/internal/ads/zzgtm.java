package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtm extends zzgtl {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgto.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgto.class, "remainingField");

    private zzgtm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zza(zzgto zzgtoVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgtoVar, null, set2) && atomicReferenceFieldUpdater.get(zzgtoVar) == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzb(zzgto zzgtoVar) {
        return zzb.decrementAndGet(zzgtoVar);
    }

    public /* synthetic */ zzgtm(byte[] bArr) {
        super(null);
    }
}
