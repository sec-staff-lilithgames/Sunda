package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyo {
    public static final /* synthetic */ zzhvi zza(zzhvi zzhviVar, zzhvi zzhviVar2, ArrayDeque arrayDeque) {
        zzb(zzhviVar, arrayDeque);
        zzb(zzhviVar2, arrayDeque);
        zzhvi zzhyqVar = (zzhvi) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzhyqVar = new zzhyq((zzhvi) arrayDeque.pop(), zzhyqVar, null);
        }
        return zzhyqVar;
    }

    private static final void zzb(zzhvi zzhviVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzhviVar.zzg()) {
            if (!(zzhviVar instanceof zzhyq)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzhviVar.getClass())));
            }
            zzhyq zzhyqVar = (zzhyq) zzhviVar;
            zzb(zzhyqVar.zzB(), arrayDeque);
            zzb(zzhyqVar.zzC(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzhviVar.zzc(), arrayDeque);
        int iZzh = zzhyq.zzh(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzhvi) arrayDeque.peek()).zzc() >= iZzh) {
            arrayDeque.push(zzhviVar);
            return;
        }
        int iZzh2 = zzhyq.zzh(iZzc);
        zzhvi zzhyqVar2 = (zzhvi) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzhvi) arrayDeque.peek()).zzc() >= iZzh2) {
                break;
            } else {
                zzhyqVar2 = new zzhyq((zzhvi) arrayDeque.pop(), zzhyqVar2, bArr);
            }
        }
        zzhyq zzhyqVar3 = new zzhyq(zzhyqVar2, zzhviVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzhvi) arrayDeque.peek()).zzc() >= zzhyq.zzh(zzc(zzhyqVar3.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzhyqVar3 = new zzhyq((zzhvi) arrayDeque.pop(), zzhyqVar3, bArr);
            }
        }
        arrayDeque.push(zzhyqVar3);
    }

    private static final int zzc(int i10, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzhyq.zza, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
