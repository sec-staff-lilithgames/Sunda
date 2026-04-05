package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfou {
    public static zzfou zze(zzfov zzfovVar, zzfow zzfowVar) {
        zzfqs.zza();
        return new zzfoy(zzfovVar, zzfowVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfpb zzfpbVar, String str);
}
