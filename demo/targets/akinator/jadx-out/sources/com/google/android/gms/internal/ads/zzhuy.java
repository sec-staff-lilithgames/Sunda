package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhuy extends zzhuu implements RandomAccess, zzhwq, zzhyi {
    private static final boolean[] zza;
    private static final zzhuy zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzhuy(zArr, 0, false);
    }

    public zzhuy() {
        this(zza, 0, true);
    }

    public static zzhuy zzd() {
        return zzb;
    }

    private static int zzi(int i10) {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.z(i10, 3, 2, 1, 10);
    }

    private final void zzj(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
    }

    private final String zzk(int i10) {
        int i11 = this.zzd;
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "Index:", ", Size:", new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i10);
            System.arraycopy(this.zzc, i10, zArr2, i12, this.zzd - i10);
            this.zzc = zArr2;
        }
        this.zzc[i10] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhxb.zzb;
        collection.getClass();
        if (!(collection instanceof zzhuy)) {
            return super.addAll(collection);
        }
        zzhuy zzhuyVar = (zzhuy) collection;
        int i10 = zzhuyVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.zzc;
        if (i12 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(zzhuyVar.zzc, 0, this.zzc, this.zzd, zzhuyVar.zzd);
        this.zzd = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhuy)) {
            return super.equals(obj);
        }
        zzhuy zzhuyVar = (zzhuy) obj;
        if (this.zzd != zzhuyVar.zzd) {
            return false;
        }
        boolean[] zArr = zzhuyVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (this.zzc[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzj(i10);
        return Boolean.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            iZzb = (iZzb * 31) + zzhxb.zzb(this.zzc[i10]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzea();
        zzj(i10);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzea();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i11, zArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        zzj(i10);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhxa, com.google.android.gms.internal.ads.zzhwq
    /* renamed from: zze */
    public final zzhwq zzh(int i10) {
        if (i10 >= this.zzd) {
            return new zzhuy(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i10) {
        zzj(i10);
        return this.zzc[i10];
    }

    public final void zzg(boolean z10) {
        zzea();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        zArr2[i11] = z10;
    }

    private zzhuy(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzc = zArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
