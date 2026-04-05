package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhl extends zzfx implements RandomAccess, zzhn, zzit {
    private static final int[] zza;
    private static final zzhl zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzhl(iArr, 0, false);
    }

    public zzhl() {
        this(zza, 0, true);
    }

    public static zzhl zzf() {
        return zzb;
    }

    private static int zzi(int i10) {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.z(i10, 3, 2, 1, 10);
    }

    private final String zzj(int i10) {
        return i.a(i10, this.zzd, "Index:", ", Size:");
    }

    private final void zzk(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[zzi(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i10);
            System.arraycopy(this.zzc, i10, iArr2, i12, this.zzd - i10);
            this.zzc = iArr2;
        }
        this.zzc[i10] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzhp.zzb;
        collection.getClass();
        if (!(collection instanceof zzhl)) {
            return super.addAll(collection);
        }
        zzhl zzhlVar = (zzhl) collection;
        int i10 = zzhlVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.zzc;
        if (i12 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zzhlVar.zzc, 0, this.zzc, this.zzd, zzhlVar.zzd);
        this.zzd = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhl)) {
            return super.equals(obj);
        }
        zzhl zzhlVar = (zzhl) obj;
        if (this.zzd != zzhlVar.zzd) {
            return false;
        }
        int[] iArr = zzhlVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (this.zzc[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzk(i10);
        return Integer.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            i10 = (i10 * 31) + this.zzc[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzk(i10);
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i11, iArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzk(i10);
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzho
    public final /* bridge */ /* synthetic */ zzho zzd(int i10) {
        if (i10 >= this.zzd) {
            return new zzhl(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i10) {
        zzk(i10);
        return this.zzc[i10];
    }

    public final void zzg(int i10) {
        zza();
        int i11 = this.zzd;
        int length = this.zzc.length;
        if (i11 == length) {
            int[] iArr = new int[zzi(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void zzh(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzi(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhl(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzc = iArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }
}
