package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzuz {
    private static final zzuu zza = new zzux();
    private static final zzut zzb = new zzuy();

    public static zzur zza(Set set) {
        zzur zzurVar = new zzur(zza, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzurVar.zzd((zzui) it.next());
        }
        return zzurVar;
    }
}
