package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zziex implements Iterator {
    int zza = 0;
    final /* synthetic */ zziey zzb;

    public zziex(zziey zzieyVar) {
        this.zzb = zzieyVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zziey zzieyVar = this.zzb;
        return i10 < zzieyVar.zza.size() || zzieyVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zziey zzieyVar = this.zzb;
        List list = zzieyVar.zza;
        if (i10 >= list.size()) {
            list.add(zzieyVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
