package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzbun {
    private final zzcgy zza;
    private final String zzb;

    public zzbun(zzcgy zzcgyVar, String str) {
        this.zza = zzcgyVar;
        this.zzb = str;
    }

    public final void zzg(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            zzcgy zzcgyVar = this.zza;
            if (zzcgyVar != null) {
                zzcgyVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzi(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzk(String str) throws JSONException {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e10);
        }
    }

    public final void zzl(int i10, int i11, int i12, int i13, float f10, int i14) throws JSONException {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e10);
        }
    }
}
