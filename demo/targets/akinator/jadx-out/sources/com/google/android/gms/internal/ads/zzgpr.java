package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzgpr<K, V> extends zzgpm<K, V> implements zzgqm<K, V> {
    private final transient zzgpo<V> emptySet;
    private transient zzgpo zza;

    public zzgpr(zzgph zzgphVar, int i10, Comparator comparator) {
        super(zzgphVar, i10);
        this.emptySet = zzgrf.zza;
    }

    public final zzgpo zza() {
        zzgpo zzgpoVar = this.zza;
        if (zzgpoVar != null) {
            return zzgpoVar;
        }
        zzgpq zzgpqVar = new zzgpq(this);
        this.zza = zzgpqVar;
        return zzgpqVar;
    }
}
