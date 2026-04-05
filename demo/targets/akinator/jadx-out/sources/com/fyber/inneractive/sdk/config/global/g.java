package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {
    public static JSONArray a(Map map, boolean z10) throws JSONException {
        d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.config.global.features.h hVar : map.values()) {
                hVar.getClass();
                ArrayList arrayList = new ArrayList(hVar.f23291c.values());
                HashMap map2 = hVar.f23292d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    JSONObject jSONObject = new JSONObject();
                    String str = bVar != null ? bVar.f23277a : null;
                    if (!TextUtils.isEmpty(str)) {
                        k kVar = (k) map2.get(str);
                        jSONObject.put("id", str);
                        if (kVar != null) {
                            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, kVar.f23301b);
                        } else {
                            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "control");
                        }
                        if (z10) {
                            Iterator it2 = bVar.f23280d.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    dVar = null;
                                    break;
                                }
                                dVar = (d) it2.next();
                                if (c.class.equals(dVar.getClass())) {
                                    break;
                                }
                            }
                            if (dVar != null && ((c) dVar).f23282b) {
                                HashSet hashSet = ((c) dVar).f23281a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    jSONArray2.put((Long) it3.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            IAlog.a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f26748a <= 3) {
                e10.printStackTrace();
            }
            return null;
        }
    }
}
