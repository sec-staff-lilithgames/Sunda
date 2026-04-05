package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdr extends zzcw {
    static final zzdr zzc;
    final transient zzco zzd;

    static {
        int i10 = zzco.zzd;
        zzc = new zzdr(zzdk.zza, zzdc.zza);
    }

    public zzdr(zzco zzcoVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        zzco zzcoVar = this.zzd;
        int iZzt = zzt(obj, true);
        if (iZzt == zzcoVar.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzdb) {
            collection = ((zzdb) collection).zza();
        }
        if (!zzdv.zza(((zzcw) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdx zzdxVarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzdxVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzdxVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzcw) this).zza.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zzdxVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzdxVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzdv.zza(((zzcw) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzdx zzdxVarListIterator = this.zzd.listIterator(0);
            while (zzdxVarListIterator.hasNext()) {
                E next = zzdxVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzcw) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzs = zzs(obj, true) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object higher(Object obj) {
        zzco zzcoVar = this.zzd;
        int iZzt = zzt(obj, false);
        if (iZzt == zzcoVar.size()) {
            return null;
        }
        return this.zzd.get(iZzt);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.zzd.get(r0.size() - 1);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzs = zzs(obj, false) - 1;
        if (iZzs == -1) {
            return null;
        }
        return this.zzd.get(iZzs);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zza(Object[] objArr, int i10) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    public final zzco zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj
    /* renamed from: zze */
    public final zzdw iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzl() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzcw) this).zza);
        return isEmpty() ? zzcw.zzq(comparatorReverseOrder) : new zzdr(this.zzd.zzh(), comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzm(Object obj, boolean z10) {
        return zzu(0, zzs(obj, z10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzo(Object obj, boolean z10, Object obj2, boolean z11) {
        return zzp(obj, z10).zzm(obj2, z11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final zzcw zzp(Object obj, boolean z10) {
        return zzu(zzt(obj, z10), this.zzd.size());
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw, java.util.NavigableSet
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzdw descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    public final int zzs(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int zzt(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzcw) this).zza);
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final zzdr zzu(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.zzd.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return zzcw.zzq(((zzcw) this).zza);
        }
        zzco zzcoVar = this.zzd;
        return new zzdr(zzcoVar.subList(i10, i11), ((zzcw) this).zza);
    }
}
