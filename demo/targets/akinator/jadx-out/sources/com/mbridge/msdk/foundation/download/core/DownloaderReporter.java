package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.p0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DownloaderReporter {
    private static final String KEY = "key=";
    private static final String TAG = "DownloaderReporter";
    private final Map<String, String> _params;
    private final String _reportKey;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private final Map<String, String> _params;
        private final String _reportKey;

        public Builder(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("reportKey can not be empty");
            }
            this._reportKey = str;
            this._params = new HashMap();
        }

        public Builder add(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    this._params.put(str, str2);
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public DownloaderReporter build() {
            return new DownloaderReporter(this);
        }
    }

    private void addUrlParams(Map<String, String> map, JSONObject jSONObject) throws JSONException {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, encodeValue(map.get(str)));
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private String encodeValue(String str) {
        try {
            return URLEncoder.encode(str, G5.N);
        } catch (Exception unused) {
            return str;
        }
    }

    public void report() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY, this._reportKey);
            addUrlParams(this._params, jSONObject);
            d.b().a(jSONObject);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private DownloaderReporter(Builder builder) {
        this._reportKey = builder._reportKey;
        this._params = builder._params;
    }
}
