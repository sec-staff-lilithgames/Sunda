package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhr implements zzifh {
    private zzfhr(zzfhq zzfhqVar) {
    }

    public static zzfhr zza(zzfhq zzfhqVar) {
        return new zzfhr(zzfhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzifp.zzb(defaultClock);
        return defaultClock;
    }
}
