package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgmm implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgms zzb;

    public zzgmm(zzgms zzgmsVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgmsVar);
        this.zzb = zzgmsVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzglx.zzb(sb2, this, ", ");
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
