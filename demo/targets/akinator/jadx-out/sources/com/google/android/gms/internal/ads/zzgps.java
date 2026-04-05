package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgps {
    public static boolean zza(Iterable iterable, zzgme zzgmeVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgmeVar.getClass();
            return zzc((List) iterable, zzgmeVar);
        }
        Iterator it = iterable.iterator();
        zzgmeVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzgmeVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgrs it = ((zzgrj) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgme zzgmeVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzgmeVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgmeVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgmeVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void zzd(List list, zzgme zzgmeVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzgmeVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }
}
