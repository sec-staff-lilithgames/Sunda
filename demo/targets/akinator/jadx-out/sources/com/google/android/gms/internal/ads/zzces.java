package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricReport;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.ironsource.C3191e4;
import com.ironsource.C3352n2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e3.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzces implements zzblx {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i10 = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strR = o2.r(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            com.google.android.gms.internal.play_billing.a.B(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i10);
            sb2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return i10;
    }

    private static void zzc(zzcdf zzcdfVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcdfVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strL = g.l("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strL);
                return;
            }
        }
        if (str2 != null) {
            zzcdfVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcdfVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcdfVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcdfVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i10;
        Integer numValueOf;
        int i11;
        zzcdr zzcdrVar = (zzcdr) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzcdrVar.zzdr() != null ? zzcdrVar.zzdr().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Event intended for player " + numValueOf2 + ", but sent to player " + numZza + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcdrVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcdrVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcdrVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzcdrVar.zze("onVideoEvent", map4);
            return;
        }
        zzcdg zzcdgVarZzdr = zzcdrVar.zzdr();
        if (zzcdgVarZzdr == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals(C3191e4.h.L);
        if (zEquals || zEquals2) {
            Context context = zzcdrVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbel zzbelVar = zzbeu.zzet;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcdrVar.zzy() : Math.min(iZzb3, zzcdrVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzcdrVar.zzy();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb).length() + o2.C(String.valueOf(iZzb3).length() + 72, 4, String.valueOf(iZzy)) + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iZzb3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iZzy);
                    sb3.append(", x ");
                    sb3.append(iZzb);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin = Math.min(iZzb3, zzcdrVar.zzy() - iZzb);
            }
            int i14 = iMin;
            int iZzb4 = zzb(context, map, ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcdrVar.zzx() : Math.min(iZzb4, zzcdrVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzx = zzcdrVar.zzx();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb2).length() + o2.C(String.valueOf(iZzb4).length() + 75, 4, String.valueOf(iZzx)) + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iZzb4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iZzx);
                    sb4.append(", y ");
                    sb4.append(iZzb2);
                    sb4.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                iMin2 = Math.min(iZzb4, zzcdrVar.zzx() - iZzb2);
            }
            int i15 = iMin2;
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i10 = 0;
            }
            boolean z10 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcdgVarZzdr.zzd() != null) {
                zzcdgVarZzdr.zzb(iZzb, iZzb2, i14, i15);
                return;
            }
            zzcdgVarZzdr.zzc(iZzb, iZzb2, i14, i15, i10, z10, new zzcdq((String) map.get("flags")));
            zzcdf zzcdfVarZzd = zzcdgVarZzdr.zzd();
            if (zzcdfVarZzd != null) {
                zzc(zzcdfVarZzd, map);
                return;
            }
            return;
        }
        zzcie zzcieVarZzh = zzcdrVar.zzh();
        if (zzcieVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcieVarZzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcieVarZzh.zzr();
                return;
            }
        }
        zzcdf zzcdfVarZzd2 = zzcdgVarZzdr.zzd();
        if (zzcdfVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcdrVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcdrVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcdfVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get(DTBMetricReport.TIME);
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcdfVarZzd2.zzt((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcdfVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals(ProductAction.ACTION_REMOVE)) {
            zzcdfVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcdfVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcdfVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcdfVarZzd2.zzu();
                return;
            } else {
                zzcdfVarZzd2.zzv();
                return;
            }
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            zzcdfVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzcdfVarZzd2.zzs();
            return;
        }
        if (str.equals(C3352n2.f37928v)) {
            zzcdfVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcdrVar.getContext();
                zzcdfVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcdrVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                    zzcdfVarZzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzcdfVarZzd2.zzw(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcs)).booleanValue() && TextUtils.isEmpty(str9)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i11 = 1;
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        } else {
            i11 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i11];
        strArr[0] = str9;
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                    String string2 = jSONArray.getString(i16);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcs)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcs)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb5 = new StringBuilder(str10.length() + 41);
                    sb5.append("All demuxed URLs are empty for playback: ");
                    sb5.append(str10);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzcdrVar.zzo(numValueOf.intValue());
        }
        zzcdfVarZzd2.zzo(str9, strArr);
    }
}
