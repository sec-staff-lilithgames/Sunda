package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C3191e4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzay extends com.google.android.gms.analytics.zzj {
    private final Map zza = new HashMap();

    public final String toString() {
        return com.google.android.gms.analytics.zzj.zza(this.zza);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzay zzayVar = (zzay) zzjVar;
        Preconditions.checkNotNull(zzayVar);
        zzayVar.zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith(C3191e4.i.f36527c)) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
