package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgpo<E> extends zzgpa<E> implements Set<E> {
    private transient zzgpe zza;

    public static zzgpo zzh() {
        return zzgrf.zza;
    }

    public static zzgpo zzi(Object obj) {
        return new zzgrp(obj);
    }

    public static zzgpo zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgpo zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgpo zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgpo zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 6;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i10, objArr2);
    }

    public static int zzn(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            zzgmd.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgpo zzo(Collection collection) {
        if ((collection instanceof zzgpo) && !(collection instanceof SortedSet)) {
            zzgpo zzgpoVar = (zzgpo) collection;
            if (!zzgpoVar.zzf()) {
                return zzgpoVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgpo zzp(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgrp(objArr[0]) : zzgrf.zza;
    }

    public static zzgpn zzs(int i10) {
        zzgoc.zzb(i10, "expectedSize");
        return new zzgpn(i10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgpo zzv(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzgrf.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgrp(obj);
        }
        int iZzn = zzn(i10);
        Object[] objArr2 = new Object[iZzn];
        int i11 = iZzn - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzgqx.zzb(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZza = zzgox.zza(iHashCode);
            while (true) {
                int i15 = iZza & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgrp(obj4);
        }
        if (zzn(i13) < iZzn / 2) {
            return zzv(i13, objArr);
        }
        if (zzw(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzgrf(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgpo) && zzq() && ((zzgpo) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgro.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgro.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgrs iterator();

    @Override // com.google.android.gms.internal.ads.zzgpa
    public zzgpe zze() {
        zzgpe zzgpeVar = this.zza;
        if (zzgpeVar != null) {
            return zzgpeVar;
        }
        zzgpe zzgpeVarZzr = zzr();
        this.zza = zzgpeVarZzr;
        return zzgpeVarZzr;
    }

    public boolean zzq() {
        return false;
    }

    public zzgpe zzr() {
        Object[] array = toArray();
        int i10 = zzgpe.zzd;
        return zzgpe.zzt(array, array.length);
    }
}
