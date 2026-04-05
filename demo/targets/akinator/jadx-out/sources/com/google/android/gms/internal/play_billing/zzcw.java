package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcw extends zzcv implements NavigableSet, zzdu {
    final transient Comparator zza;
    transient zzcw zzb;

    public zzcw(Comparator comparator) {
        this.zza = comparator;
    }

    public static zzdr zzq(Comparator comparator) {
        if (zzdc.zza.equals(comparator)) {
            return zzdr.zzc;
        }
        int i10 = zzco.zzd;
        return new zzdr(zzdk.zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzcx.zza(zzp(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.play_billing.zzdu
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        zzcw zzcwVar = this.zzb;
        if (zzcwVar != null) {
            return zzcwVar;
        }
        zzcw zzcwVarZzl = zzl();
        this.zzb = zzcwVarZzl;
        zzcwVarZzl.zzb = this;
        return zzcwVarZzl;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return zzda.zza(zzm(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzm(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return zzcx.zza(zzp(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return zzda.zza(zzm(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzp(obj, true);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcv, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzdw iterator();

    public abstract zzcw zzl();

    public abstract zzcw zzm(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzcw subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) <= 0) {
            return zzo(obj, z10, obj2, z11);
        }
        throw new IllegalArgumentException();
    }

    public abstract zzcw zzo(Object obj, boolean z10, Object obj2, boolean z11);

    public abstract zzcw zzp(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* renamed from: zzr */
    public abstract zzdw descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return zzm(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return zzp(obj, z10);
    }
}
