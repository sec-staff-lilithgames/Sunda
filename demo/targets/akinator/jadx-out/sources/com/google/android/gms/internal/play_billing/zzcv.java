package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcv extends zzcj implements Set {
    private transient zzco zza;

    public static int zzh(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcv zzl(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzdq.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdt(obj);
        }
        int iZzh = zzh(i10);
        Object[] objArr2 = new Object[iZzh];
        int i11 = iZzh - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzdd.zza(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZza = zzcg.zza(iHashCode);
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
            return new zzdt(obj4);
        }
        if (zzh(i13) < iZzh / 2) {
            return zzl(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzdq(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzds.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public zzco zzd() {
        zzco zzcoVar = this.zza;
        if (zzcoVar != null) {
            return zzcoVar;
        }
        zzco zzcoVarZzi = zzi();
        this.zza = zzcoVarZzi;
        return zzcoVarZzi;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public abstract zzdw iterator();

    public zzco zzi() {
        Object[] array = toArray();
        int i10 = zzco.zzd;
        return zzco.zzj(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
