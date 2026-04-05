package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceData;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaz extends com.google.android.gms.analytics.zzj {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap map = new HashMap();
        map.put(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, this.zzc);
        map.put("screenColors", 0);
        map.put("screenWidth", Integer.valueOf(this.zza));
        map.put("screenHeight", Integer.valueOf(this.zzb));
        map.put("viewportWidth", 0);
        map.put("viewportHeight", 0);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzaz zzazVar = (zzaz) zzjVar;
        int i10 = this.zza;
        if (i10 != 0) {
            zzazVar.zza = i10;
        }
        int i11 = this.zzb;
        if (i11 != 0) {
            zzazVar.zzb = i11;
        }
        if (TextUtils.isEmpty(this.zzc)) {
            return;
        }
        zzazVar.zzc = this.zzc;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
