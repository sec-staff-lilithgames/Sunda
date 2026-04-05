package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpl extends zzgpa {
    private final transient zzgpm zza;

    public zzgpl(zzgpm zzgpmVar) {
        this.zza = zzgpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgpj(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return new zzgpj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgpa
    public final int zzg(Object[] objArr, int i10) {
        zzgrt zzgrtVarListIterator = ((zzgpe) this.zza.map.values()).listIterator(0);
        while (zzgrtVarListIterator.hasNext()) {
            i10 = ((zzgpa) zzgrtVarListIterator.next()).zzg(objArr, i10);
        }
        return i10;
    }
}
