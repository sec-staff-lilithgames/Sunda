package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhxn extends zzhuu implements RandomAccess, zzhwz, zzhyi {
    private static final long[] zza;
    private static final zzhxn zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzhxn(jArr, 0, false);
    }

    public zzhxn() {
        this(zza, 0, true);
    }

    public static zzhxn zzg() {
        return zzb;
    }

    private static int zzj(int i10) {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.z(i10, 3, 2, 1, 10);
    }

    private final void zzk(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
    }

    private final String zzl(int i10) {
        int i11 = this.zzd;
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, i11, "Index:", ", Size:", new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length()));
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zzea();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i10);
            System.arraycopy(this.zzc, i10, jArr2, i12, this.zzd - i10);
            this.zzc = jArr2;
        }
        this.zzc[i10] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhxb.zzb;
        collection.getClass();
        if (!(collection instanceof zzhxn)) {
            return super.addAll(collection);
        }
        zzhxn zzhxnVar = (zzhxn) collection;
        int i10 = zzhxnVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.zzc;
        if (i12 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(zzhxnVar.zzc, 0, this.zzc, this.zzd, zzhxnVar.zzd);
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
        if (!(obj instanceof zzhxn)) {
            return super.equals(obj);
        }
        zzhxn zzhxnVar = (zzhxn) obj;
        if (this.zzd != zzhxnVar.zzd) {
            return false;
        }
        long[] jArr = zzhxnVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (this.zzc[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzk(i10);
        return Long.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            long j10 = this.zzc[i11];
            byte[] bArr = zzhxb.zzb;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzea();
        zzk(i10);
        long[] jArr = this.zzc;
        long j10 = jArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzea();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i11, jArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Long.valueOf(zze(i10, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhwz
    public final long zzc(int i10) {
        zzk(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhwz
    public final void zzd(long j10) {
        zzea();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzhwz
    public final long zze(int i10, long j10) {
        zzea();
        zzk(i10);
        long[] jArr = this.zzc;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzhxa, com.google.android.gms.internal.ads.zzhwq
    /* renamed from: zzf */
    public final zzhwz zzh(int i10) {
        if (i10 >= this.zzd) {
            return new zzhxn(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhxn(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzc = jArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhuu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Long) obj).longValue());
        return true;
    }
}
