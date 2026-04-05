package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfxg implements zzifh {
    private final zzifq zza;

    private zzfxg(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzfxg zza(zzifq zzifqVar) {
        return new zzfxg(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzifp.zzb(dir);
        return dir;
    }
}
