package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhfj implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhfj(zzhfm zzhfmVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhfmVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhfl(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
