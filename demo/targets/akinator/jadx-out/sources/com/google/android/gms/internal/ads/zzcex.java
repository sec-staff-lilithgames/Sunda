package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcex implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcdr zzcdrVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcew zzcewVar = (zzcew) it.next();
            if (zzcewVar.zza == zzcdrVar) {
                arrayList.add(zzcewVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcew) it2.next()).zzb.zzl();
        }
        return true;
    }

    public final zzcew zzb(zzcdr zzcdrVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcew zzcewVar = (zzcew) it.next();
            if (zzcewVar.zza == zzcdrVar) {
                return zzcewVar;
            }
        }
        return null;
    }

    public final void zzc(zzcew zzcewVar) {
        this.zza.add(zzcewVar);
    }

    public final void zzd(zzcew zzcewVar) {
        this.zza.remove(zzcewVar);
    }
}
