package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxq {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcbv.zza.submit(new zzbxo(this, context));
    }

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
