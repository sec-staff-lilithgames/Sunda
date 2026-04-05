package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcok implements zzcnu {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcok(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zza(Map map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z10 = Boolean.parseBoolean(str);
        zzgVar.zzw(z10);
        if (z10) {
            com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
        }
    }
}
