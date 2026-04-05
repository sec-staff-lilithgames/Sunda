package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgro {
    public static zzgrn zza(Set set, Set set2) {
        zzgmd.zzk(set, "set1");
        zzgmd.zzk(set2, "set2");
        return new zzgrj(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgme zzgmeVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (!(sortedSet instanceof zzgrk)) {
                return new zzgrl(sortedSet, zzgmeVar);
            }
            zzgrk zzgrkVar = (zzgrk) sortedSet;
            return new zzgrl((SortedSet) zzgrkVar.zza, zzgmh.zzb(zzgrkVar.zzb, zzgmeVar));
        }
        if (!(set instanceof zzgrk)) {
            set.getClass();
            return new zzgrk(set, zzgmeVar);
        }
        zzgrk zzgrkVar2 = (zzgrk) set;
        return new zzgrk((Set) zzgrkVar2.zza, zzgmh.zzb(zzgrkVar2.zzb, zzgmeVar));
    }

    public static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgqv) {
            collection = ((zzgqv) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
