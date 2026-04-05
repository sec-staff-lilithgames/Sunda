package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zziey extends AbstractList {
    private static final zziez zzc = zziez.zzb(zziey.class);
    final List zza;
    final Iterator zzb;

    public zziey(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.zza;
        if (list.size() > i10) {
            return list.get(i10);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zziex(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zziez zziezVar = zzc;
        zziezVar.zza("potentially expensive size() call");
        zziezVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }
}
