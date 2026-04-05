package com.google.android.gms.internal.gtm;

import a.b;
import com.ironsource.C3191e4;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztz extends zztp {
    final transient Object zza;

    public zztz(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zztp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zztq(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return b.l(C3191e4.i.f36529d, this.zza.toString(), C3191e4.i.f36531e);
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti
    /* renamed from: zzd */
    public final zzua iterator() {
        return new zztq(this.zza);
    }
}
