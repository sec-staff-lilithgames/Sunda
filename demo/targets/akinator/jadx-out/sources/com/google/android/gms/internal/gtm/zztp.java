package com.google.android.gms.internal.gtm;

import a.b;
import com.ironsource.C3271ic;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zztp extends zzti implements Set {
    private transient zztl zza;

    public static int zzf(int i10) {
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

    public static zztp zzi(Object obj, Object obj2, Object obj3) {
        return zzl(3, "", "0", "false");
    }

    public static zztp zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, C3271ic.f36943a, "HEAD", C3271ic.f36944b, "PUT");
    }

    private static zztp zzl(int i10, Object... objArr) {
        if (i10 == 0) {
            return zztx.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zztz(obj);
        }
        int iZzf = zzf(i10);
        Object[] objArr2 = new Object[iZzf];
        int i11 = iZzf - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(b.e(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzth.zza(iHashCode);
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
            return new zztz(obj4);
        }
        if (zzf(i13) < iZzf / 2) {
            return zzl(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zztx(objArr, i12, objArr2, i11, i13);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zztp) && zzk() && ((zztp) obj).zzk() && hashCode() != obj.hashCode()) {
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
        return zzty.zza(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzua iterator();

    public final zztl zzg() {
        zztl zztlVar = this.zza;
        if (zztlVar != null) {
            return zztlVar;
        }
        zztl zztlVarZzh = zzh();
        this.zza = zztlVarZzh;
        return zztlVarZzh;
    }

    public zztl zzh() {
        Object[] array = toArray();
        int i10 = zztl.zzd;
        return zztl.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
