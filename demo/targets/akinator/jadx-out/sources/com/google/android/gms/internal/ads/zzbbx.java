package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbbx implements Comparator {
    public zzbbx(zzbbz zzbbzVar) {
        Objects.requireNonNull(zzbbzVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcc zzbccVar = (zzbcc) obj;
        zzbcc zzbccVar2 = (zzbcc) obj2;
        int i10 = zzbccVar.zzc - zzbccVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbccVar.zza, zzbccVar2.zza);
    }
}
