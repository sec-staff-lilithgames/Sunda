package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcos implements zzcnu {
    private final zzdyo zza;

    public zzcos(zzdyo zzdyoVar) {
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zza(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}
