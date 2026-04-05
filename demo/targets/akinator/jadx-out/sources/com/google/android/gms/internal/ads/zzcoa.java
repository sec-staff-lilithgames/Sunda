package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcoa implements zzcnu {
    private final zzdyo zza;

    public zzcoa(zzdyo zzdyoVar) {
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                this.zza.zze(zzdyk.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zze(zzdyk.FLICK);
            return;
        }
        this.zza.zze(zzdyk.NONE);
    }
}
