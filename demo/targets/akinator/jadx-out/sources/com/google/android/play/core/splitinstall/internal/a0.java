package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a0 extends b0 {
    public final void zza(Collection collection) throws IllegalAccessException, IllegalArgumentException {
        Object[] objArr = (Object[]) zzc();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(this.f29598b.getType().getComponentType(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        zze(objArr2);
    }

    public final void zzb(Collection collection) throws IllegalAccessException, IllegalArgumentException {
        Object[] objArr = (Object[]) zzc();
        int i10 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(this.f29598b.getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i10] = it.next();
            i10++;
        }
        zze(objArr2);
    }
}
