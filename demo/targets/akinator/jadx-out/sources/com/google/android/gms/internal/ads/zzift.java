package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzift implements zzifh {
    private final List zza;
    private final List zzb;

    static {
        zzifi.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzift(List list, List list2, zzifr zzifrVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzifs zza(int i10, int i11) {
        return new zzifs(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzifq) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzife.zzb(size);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((zzifq) list.get(i11)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZzb);
    }
}
