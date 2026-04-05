package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqp implements zzeya {
    private final Set zza;

    public zzeqp(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgui.zza(new zzeqo(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 8;
    }
}
