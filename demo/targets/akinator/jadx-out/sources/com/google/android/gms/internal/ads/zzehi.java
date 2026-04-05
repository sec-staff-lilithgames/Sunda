package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import m5.b;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzehi {
    private final Context zza;

    public zzehi(Context context) {
        this.zza = context;
    }

    public final n1 zza(boolean z10) {
        try {
            m5.b bVarBuild = new b.a().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z10).build();
            k5.b bVarFrom = k5.b.from(this.zza);
            return bVarFrom != null ? bVarFrom.getTopicsAsync(bVarBuild) : zzgui.zzc(new IllegalStateException());
        } catch (Exception e10) {
            return zzgui.zzc(e10);
        }
    }
}
