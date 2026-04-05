package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import android.util.Log;
import b0.e2;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbe extends com.google.android.gms.analytics.zzj {
    private int zza;

    public zzbe() {
        UUID uuidRandomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (uuidRandomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (uuidRandomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        Preconditions.checkNotZero(leastSignificantBits);
        this.zza = leastSignificantBits;
    }

    public final String toString() {
        HashMap map = new HashMap();
        map.put("screenName", null);
        Boolean bool = Boolean.FALSE;
        map.put("interstitial", bool);
        map.put("automatic", bool);
        e2.v(this.zza, map, "screenId", 0, "referrerScreenId");
        map.put("referrerScreenName", null);
        map.put("referrerUri", null);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbe zzbeVar = (zzbe) zzjVar;
        TextUtils.isEmpty(null);
        int i10 = this.zza;
        if (i10 != 0) {
            zzbeVar.zza = i10;
        }
        TextUtils.isEmpty(null);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        TextUtils.isEmpty(null);
    }

    public final int zzd() {
        return this.zza;
    }
}
