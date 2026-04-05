package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvn extends zzdvr {
    private final CsiParamDefaults zzf;

    public zzdvn(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiParamDefaults csiParamDefaults, CsiUrlBuilder csiUrlBuilder, Context context) {
        super(executor, zzuVar, csiUrlBuilder, context);
        this.zzf = csiParamDefaults;
        csiParamDefaults.set(this.zza);
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
