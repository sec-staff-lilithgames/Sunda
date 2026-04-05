package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcom implements zzcnu {
    private final zzfft zza;

    public zzcom(zzfft zzfftVar) {
        this.zza = zzfftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(Boolean.parseBoolean(str));
        } catch (Exception e10) {
            throw new IllegalStateException("Invalid render_in_browser state", e10);
        }
    }
}
