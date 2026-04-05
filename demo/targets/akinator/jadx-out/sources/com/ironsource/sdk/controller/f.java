package com.ironsource.sdk.controller;

import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0241a f38552c = new C0241a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f38553a;

        /* renamed from: b, reason: collision with root package name */
        private final JSONObject f38554b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C0241a {
            public /* synthetic */ C0241a(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final a a(String jsonStr) throws JSONException {
                e0.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id2 = jSONObject.getString(b.f38556b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                e0.checkNotNullExpressionValue(id2, "id");
                return new a(id2, jSONObjectOptJSONObject);
            }

            private C0241a() {
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            e0.checkNotNullParameter(msgId, "msgId");
            this.f38553a = msgId;
            this.f38554b = jSONObject;
        }

        public final String a() {
            return this.f38553a;
        }

        public final JSONObject b() {
            return this.f38554b;
        }

        public final String c() {
            return this.f38553a;
        }

        public final JSONObject d() {
            return this.f38554b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e0.areEqual(this.f38553a, aVar.f38553a) && e0.areEqual(this.f38554b, aVar.f38554b);
        }

        public int hashCode() {
            int iHashCode = this.f38553a.hashCode() * 31;
            JSONObject jSONObject = this.f38554b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f38553a + ", params=" + this.f38554b + ")";
        }

        public final a a(String msgId, JSONObject jSONObject) {
            e0.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f38553a;
            }
            if ((i10 & 2) != 0) {
                jSONObject = aVar.f38554b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return f38552c.a(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f38555a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final String f38556b = "msgId";

        /* renamed from: c, reason: collision with root package name */
        public static final String f38557c = "adId";

        /* renamed from: d, reason: collision with root package name */
        public static final String f38558d = "params";

        /* renamed from: e, reason: collision with root package name */
        public static final String f38559e = "success";

        /* renamed from: f, reason: collision with root package name */
        public static final String f38560f = "reason";

        /* renamed from: g, reason: collision with root package name */
        public static final String f38561g = "command";

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f38562a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38563b;

        /* renamed from: c, reason: collision with root package name */
        private final JSONObject f38564c;

        /* renamed from: d, reason: collision with root package name */
        private String f38565d;

        public c(String adId, String command, JSONObject params) {
            e0.checkNotNullParameter(adId, "adId");
            e0.checkNotNullParameter(command, "command");
            e0.checkNotNullParameter(params, "params");
            this.f38562a = adId;
            this.f38563b = command;
            this.f38564c = params;
            this.f38565d = w0.i.c("randomUUID().toString()");
        }

        public final String a() {
            return this.f38562a;
        }

        public final String b() {
            return this.f38563b;
        }

        public final JSONObject c() {
            return this.f38564c;
        }

        public final String d() {
            return this.f38562a;
        }

        public final String e() {
            return this.f38563b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return e0.areEqual(this.f38565d, cVar.f38565d) && e0.areEqual(this.f38562a, cVar.f38562a) && e0.areEqual(this.f38563b, cVar.f38563b) && e0.areEqual(this.f38564c.toString(), cVar.f38564c.toString());
        }

        public final String f() {
            return this.f38565d;
        }

        public final JSONObject g() {
            return this.f38564c;
        }

        public final String h() {
            String string = new JSONObject().put(b.f38556b, this.f38565d).put(b.f38557c, this.f38562a).put("params", this.f38564c).toString();
            e0.checkNotNullExpressionValue(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            String str = this.f38562a;
            String str2 = this.f38563b;
            JSONObject jSONObject = this.f38564c;
            StringBuilder sbB = b3.h.b("MessageToController(adId=", str, ", command=", str2, ", params=");
            sbB.append(jSONObject);
            sbB.append(")");
            return sbB.toString();
        }

        public final c a(String adId, String command, JSONObject params) {
            e0.checkNotNullParameter(adId, "adId");
            e0.checkNotNullParameter(command, "command");
            e0.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.f38562a;
            }
            if ((i10 & 2) != 0) {
                str2 = cVar.f38563b;
            }
            if ((i10 & 4) != 0) {
                jSONObject = cVar.f38564c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final void a(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            this.f38565d = str;
        }
    }
}
