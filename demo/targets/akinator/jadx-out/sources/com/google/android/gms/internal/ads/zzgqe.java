package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgqe {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i10) {
        zzgoc.zzb(i10, "initialArraySize");
        return new ArrayList(i10);
    }

    public static List zzc(List list, zzglu zzgluVar) {
        return list instanceof RandomAccess ? new zzgqb(list, zzgluVar) : new zzgqd(list, zzgluVar);
    }
}
