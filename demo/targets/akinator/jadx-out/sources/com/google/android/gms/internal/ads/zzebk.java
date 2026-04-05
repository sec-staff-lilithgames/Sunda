package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebk {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcjn zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfgn zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzflm zzi;
    private final zzdvc zzj;
    private final zzfng zzk;
    private final zzdbs zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbxr zzq;

    public zzebk(zzcjn zzcjnVar, Context context, VersionInfoParcel versionInfoParcel, zzfgn zzfgnVar, Executor executor, String str, zzflm zzflmVar, zzdvc zzdvcVar, zzbxr zzbxrVar, zzeef zzeefVar, ScheduledExecutorService scheduledExecutorService, zzfng zzfngVar, zzdbs zzdbsVar) {
        this.zzb = zzcjnVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfgnVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzflmVar;
        zzcjnVar.zzB();
        this.zzj = zzdvcVar;
        this.zzq = zzbxrVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfngVar;
        this.zzl = zzdbsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final sh.n1 zzg(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebk.zzg(java.lang.String, java.lang.String):sh.n1");
    }

    private final void zzh(zzduq zzduqVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhK)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundleZze, zzduqVar.zza());
        }
    }

    private final String zzi(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e10.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8 A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2 A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c A[Catch: all -> 0x00dc, TryCatch #5 {all -> 0x00dc, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009e, B:27:0x00ab, B:29:0x00c5, B:33:0x00f5, B:36:0x0101, B:38:0x0109, B:40:0x010f, B:44:0x0118, B:55:0x0152, B:47:0x012c, B:54:0x013d, B:57:0x0157, B:32:0x00df, B:58:0x016b, B:65:0x0188, B:68:0x0190, B:72:0x01b2, B:74:0x01c7, B:78:0x01e8, B:80:0x01fd, B:83:0x0211, B:85:0x0217, B:86:0x0224, B:88:0x0226, B:91:0x022f, B:90:0x022c, B:79:0x01f2, B:75:0x01da, B:71:0x019e, B:62:0x0178, B:63:0x017d), top: B:123:0x0078, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sh.n1 zza() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebk.zza():sh.n1");
    }

    public final /* synthetic */ n1 zzb(zzbqf zzbqfVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcx)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzj.zze(), zzduq.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbqfVar.zzb(jSONObject);
    }

    public final /* synthetic */ n1 zzc(JSONObject jSONObject) {
        zzfgc zzfgcVar = new zzfgc(this.zze);
        String string = jSONObject.toString();
        return zzgui.zza(new zzfgf(zzfgcVar, zzfge.zza(new StringReader(string), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzeec zzeecVar) throws zzekz {
        zzh(zzduq.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                if (i10 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhJ)).intValue()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                    sb2.append("Received HTTP error code from ad server:");
                    sb2.append(i11);
                    throw new zzekz(1, sb2.toString());
                }
                zzeed zzeedVarZzb = new zzeee(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzeecVar);
                int i12 = zzeedVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhK)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i10));
                }
                if (i12 == 200) {
                    zzh(zzduq.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzeedVarZzb.zzc;
                }
                i10++;
                i11 = i12;
            } catch (Exception e10) {
                throw new zzekz(1, e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
            }
        }
    }

    public final /* synthetic */ n1 zze(List list, Exception exc) {
        zzekz zzekzVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzekzVar = new zzekz(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzekz) {
            zzekzVar = (zzekz) exc;
        } else {
            zzekzVar = new zzekz(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzekzVar.getMessage() == null ? "" : zzekzVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzgms.zza(zzglr.zzc(AbstractJsonLexerKt.COLON)).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfnc.zzd(zzfnc.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgui.zzc(zzekzVar);
    }

    public final /* synthetic */ zzdbs zzf() {
        return this.zzl;
    }
}
