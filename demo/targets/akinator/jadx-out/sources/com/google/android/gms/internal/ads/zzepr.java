package com.google.android.gms.internal.ads;

import android.content.Context;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepr implements zzeya {
    private final Context zza;

    public zzepr(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return zzgui.zza(new zzeps(m3.a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 2;
    }
}
