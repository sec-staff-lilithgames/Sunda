package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfyt implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzfyt(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzfyt zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzfyt(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzfxt zzfxtVar = (zzfxt) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb2.append(")");
        return new zzfyy(executorService, sb2.toString(), zzfxtVar.zzl());
    }
}
