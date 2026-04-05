package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfu<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzil {
    private static void zza(List list, int i10) {
        String strK = o2.k(list.size() - i10, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i10) {
                throw new NullPointerException(strK);
            }
            list.remove(size);
        }
    }

    public static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzhp.zzb;
        iterable.getClass();
        if (iterable instanceof zzhy) {
            List listZza = ((zzhy) iterable).zza();
            zzhy zzhyVar = (zzhy) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    String strK = o2.k(zzhyVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzhyVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strK);
                        }
                        zzhyVar.remove(size2);
                    }
                } else if (obj instanceof zzgk) {
                    zzhyVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzgk.zzj(bArr2, 0, bArr2.length);
                    zzhyVar.zzb();
                } else {
                    zzhyVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzit) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof zziv) {
                ((zziv) list).zzf(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i10 = 0; i10 < size5; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                zza(list, size4);
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract zzfu zzb();
}
