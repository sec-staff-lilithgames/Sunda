package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfiq {
    private final HashMap zza = new HashMap();

    public final zzfip zza(zzfig zzfigVar, Context context, zzfhy zzfhyVar, zzfiv zzfivVar) {
        HashMap map = this.zza;
        zzfip zzfipVar = (zzfip) map.get(zzfigVar);
        if (zzfipVar != null) {
            return zzfipVar;
        }
        zzfid zzfidVar = new zzfid(zzfij.zza(zzfigVar, context));
        zzfip zzfipVar2 = new zzfip(zzfidVar, new zzfiy(zzfidVar, zzfhyVar, zzfivVar));
        map.put(zzfigVar, zzfipVar2);
        return zzfipVar2;
    }
}
