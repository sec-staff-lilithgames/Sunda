package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdwu {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdwu(String str, byte[] bArr) {
        this.zzb = str;
    }

    public final /* synthetic */ String zza() throws JSONException {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkY);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", this.zza);
            jSONObject.put("eventCategory", this.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, this.zzc);
            jSONObject.putOpt(IronSourceConstants.EVENTS_ERROR_CODE, this.zzd);
            jSONObject.putOpt("rewardType", this.zze);
            jSONObject.putOpt(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.zzf);
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return o2.r(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public final /* synthetic */ void zzb(Long l9) {
        this.zza = l9;
    }

    public final /* synthetic */ void zzc(String str) {
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(Integer num) {
        this.zzd = num;
    }

    public final /* synthetic */ void zze(String str) {
        this.zze = str;
    }

    public final /* synthetic */ void zzf(Integer num) {
        this.zzf = num;
    }
}
