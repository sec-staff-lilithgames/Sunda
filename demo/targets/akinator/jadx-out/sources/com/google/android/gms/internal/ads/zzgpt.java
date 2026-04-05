package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpt extends zzgne {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgme zzb;

    public zzgpt(Iterator it, zzgme zzgmeVar) {
        this.zza = it;
        this.zzb = zzgmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgne
    public final Object zza() {
        zzgme zzgmeVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgmeVar = this.zzb;
            next = it.next();
        } while (!zzgmeVar.zza(next));
        return next;
    }
}
