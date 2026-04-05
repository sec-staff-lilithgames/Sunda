package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.ironsource.C3284j8;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcpx implements zzbqi {
    private final Context zza;
    private final zzbar zzb;
    private final PowerManager zzc;

    public zzcpx(Context context, zzbar zzbarVar) {
        this.zza = context;
        this.zzb = zzbarVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcqa zzcqaVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbat zzbatVar = zzcqaVar.zzf;
        if (zzbatVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbar zzbarVar = this.zzb;
            if (zzbarVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zzbatVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbarVar.zzb()).put("activeViewJSON", zzbarVar.zzc()).put("timestamp", zzcqaVar.zzd).put("adFormat", zzbarVar.zza()).put("hashCode", zzbarVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcqaVar.zzb).put("isNative", zzbarVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            jSONObjectPut.put(C3191e4.i.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbatVar.zzb).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbatVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put(yFkbx.kVLExSewyiCJdA, jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put(TtmlNode.LEFT, rect.left).put(TtmlNode.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbatVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbatVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put(TtmlNode.LEFT, rect3.left).put(TtmlNode.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zzbatVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbatVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put(TtmlNode.LEFT, rect4.left).put(TtmlNode.RIGHT, rect4.right)).put("localVisibleBoxVisible", zzbatVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbatVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put(TtmlNode.LEFT, rect5.left).put(TtmlNode.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C3284j8.f37010k, zzcqaVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbH)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbatVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put(TtmlNode.LEFT, rect6.left).put(TtmlNode.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcqaVar.zze)) {
                jSONObject3.put("doneReasonCode", ApsMetricsDataMap.APSMETRICS_FIELD_URL);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
