package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaqy implements zzaqp {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaqy(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqp
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
