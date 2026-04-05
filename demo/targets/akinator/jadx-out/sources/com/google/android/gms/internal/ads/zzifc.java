package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzifc {
    final LinkedHashMap zza;

    public zzifc(int i10) {
        this.zza = zzife.zzc(i10);
    }

    public final zzifc zza(Object obj, zzifq zzifqVar) {
        zzifp.zza(obj, C3191e4.h.W);
        zzifp.zza(zzifqVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zzifqVar);
        return this;
    }
}
