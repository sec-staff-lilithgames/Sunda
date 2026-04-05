package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzak extends zzag implements List, RandomAccess {
    private static final zzao zza = new zzai(zzam.zza, 0);

    public static zzak zzi(Object[] objArr, int i10) {
        return i10 == 0 ? zzam.zza : new zzam(objArr, i10);
    }

    public static zzak zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzam.zza;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return zzm(next);
        }
        zzah zzahVar = new zzah(4);
        zzahVar.zzb(next);
        zzahVar.zzc(it);
        zzahVar.zzc = true;
        return zzi(zzahVar.zza, zzahVar.zzb);
    }

    public static zzak zzk(Collection collection) {
        if (!(collection instanceof zzag)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzal.zza(array, length);
            return zzi(array, length);
        }
        zzak zzakVarZzd = ((zzag) collection).zzd();
        if (!zzakVarZzd.zzf()) {
            return zzakVarZzd;
        }
        Object[] array2 = zzakVarZzd.toArray();
        return zzi(array2, array2.length);
    }

    public static zzak zzl() {
        return zzam.zza;
    }

    public static zzak zzm(Object obj) {
        Object[] objArr = {obj};
        zzal.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzak zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzal.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!zzu.zza(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzu.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.common.zzag
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzag
    /* renamed from: zze */
    public final zzan iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzak subList(int i10, int i11) {
        zzv.zzc(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzam.zza : new zzaj(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzao listIterator(int i10) {
        zzv.zzb(i10, size(), "index");
        return isEmpty() ? zza : new zzai(this, i10);
    }

    @Override // com.google.android.gms.internal.common.zzag
    @Deprecated
    public final zzak zzd() {
        return this;
    }
}
