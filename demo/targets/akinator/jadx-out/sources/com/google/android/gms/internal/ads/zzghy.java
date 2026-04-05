package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzghy {
    private final Set zza;
    private final zzgip zzb;

    public zzghy(zzgip zzgipVar, Set set) {
        this.zza = set;
        this.zzb = zzgipVar;
    }

    public final void zza(List list) {
        this.zzb.zza(list);
    }

    public final Map zzb() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgia) it.next()).zzb(map);
        }
        return map;
    }

    public final Map zzc(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgia) it.next()).zzc(map, context, view);
        }
        return map;
    }

    public final Map zzd() {
        HashMap map = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgia) it.next()).zzd(map);
        }
        return map;
    }
}
