package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgpe extends zzgpa implements List, RandomAccess {
    private static final zzgrt zza = new zzgpc(zzgqz.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgpe zzi() {
        return zzgqz.zza;
    }

    public static zzgpe zzj(Object obj) {
        Object[] objArr = {obj};
        zzgqx.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgpe zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgqx.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgpe zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgqx.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgpe zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgqx.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgpe zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzgqx.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgpe zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgqx.zza(objArr2, i10);
        return zzt(objArr2, i10);
    }

    public static zzgpe zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzgpe zzq(Collection collection) {
        if (!(collection instanceof zzgpa)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgqx.zza(array, length);
            return zzt(array, length);
        }
        zzgpe zzgpeVarZze = ((zzgpa) collection).zze();
        if (!zzgpeVarZze.zzf()) {
            return zzgpeVarZze;
        }
        Object[] array2 = zzgpeVarZze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgpe zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgqz.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgqx.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgpe zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgqe.zza(((zzgpe) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzgqx.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzgpe zzt(Object[] objArr, int i10) {
        return i10 == 0 ? zzgqz.zza : new zzgqz(objArr, i10);
    }

    public static zzgpb zzv(int i10) {
        zzgoc.zzb(i10, "expectedSize");
        return new zzgpb(i10);
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

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection
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
                if (!Objects.equals(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.ads.zzgpa
    /* renamed from: zza */
    public final zzgrs iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public int zzg(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgpe subList(int i10, int i11) {
        zzgmd.zzo(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzgqz.zza : new zzgpd(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgrt listIterator(int i10) {
        zzgmd.zzn(i10, size(), "index");
        return isEmpty() ? zza : new zzgpc(this, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    @Deprecated
    public final zzgpe zze() {
        return this;
    }
}
