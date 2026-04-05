package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqp;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[Catch: NumberFormatException | JSONException -> 0x010c, NumberFormatException | JSONException -> 0x010c, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x010c, blocks: (B:10:0x0027, B:24:0x005b, B:24:0x005b, B:26:0x006c, B:26:0x006c, B:28:0x007e, B:28:0x007e, B:29:0x0087, B:29:0x0087, B:51:0x00fc, B:51:0x00fc, B:33:0x0094, B:33:0x0094, B:35:0x00a5, B:35:0x00a5, B:37:0x00b7, B:37:0x00b7, B:38:0x00c0, B:38:0x00c0, B:42:0x00cc, B:42:0x00cc, B:46:0x00dc, B:46:0x00dc, B:50:0x00f0, B:50:0x00f0), top: B:65:0x0027, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zza() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhd.zza():android.os.Bundle");
    }

    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzqp.zza();
                        zzic zzicVar = zzhhVar.zzu;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, obj.toString());
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                            } else if (obj instanceof Long) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, obj.toString());
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, Arrays.toString((int[]) obj));
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, Arrays.toString((long[]) obj));
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, obj.toString());
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                            } else if (obj instanceof Long) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                            } else {
                                zzicVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }
}
