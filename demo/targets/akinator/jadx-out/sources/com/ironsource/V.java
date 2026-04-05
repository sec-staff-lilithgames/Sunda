package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface V {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements V {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f35589a;

        public a(JSONObject applicationConfig) {
            kotlin.jvm.internal.e0.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.f35589a = applicationConfig;
        }

        @Override // com.ironsource.V
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.f35589a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.V
        public int b() {
            int iOptInt = this.f35589a.optInt("debugMode", 0);
            if (this.f35589a.optBoolean(b.f35594e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.V
        public String c() {
            String strOptString = this.f35589a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35590a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final String f35591b = "controllerUrl";

        /* renamed from: c, reason: collision with root package name */
        public static final String f35592c = "controllerConfig";

        /* renamed from: d, reason: collision with root package name */
        public static final String f35593d = "debugMode";

        /* renamed from: e, reason: collision with root package name */
        public static final String f35594e = "adptDebugMode";

        private b() {
        }
    }

    JSONObject a();

    int b();

    String c();
}
