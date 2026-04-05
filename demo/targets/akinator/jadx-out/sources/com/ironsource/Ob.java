package com.ironsource;

import com.ironsource.sdk.controller.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ob {

    /* renamed from: d, reason: collision with root package name */
    public static final a f35128d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f35129a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35130b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f35131c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Ob a(String jsonStr) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(f.b.f38557c);
            String command = jSONObject.getString(f.b.f38561g);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adId, "adId");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(command, "command");
            return new Ob(adId, command, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public Ob(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        this.f35129a = adId;
        this.f35130b = command;
        this.f35131c = jSONObject;
    }

    public final String a() {
        return this.f35129a;
    }

    public final String b() {
        return this.f35130b;
    }

    public final JSONObject c() {
        return this.f35131c;
    }

    public final String d() {
        return this.f35129a;
    }

    public final String e() {
        return this.f35130b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ob)) {
            return false;
        }
        Ob ob2 = (Ob) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35129a, ob2.f35129a) && kotlin.jvm.internal.e0.areEqual(this.f35130b, ob2.f35130b) && kotlin.jvm.internal.e0.areEqual(this.f35131c, ob2.f35131c);
    }

    public final JSONObject f() {
        return this.f35131c;
    }

    public int hashCode() {
        int iE = p0.o2.e(this.f35129a.hashCode() * 31, 31, this.f35130b);
        JSONObject jSONObject = this.f35131c;
        return iE + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        String str = this.f35129a;
        String str2 = this.f35130b;
        JSONObject jSONObject = this.f35131c;
        StringBuilder sbB = b3.h.b("MessageToNative(adId=", str, ", command=", str2, ", params=");
        sbB.append(jSONObject);
        sbB.append(")");
        return sbB.toString();
    }

    public final Ob a(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        return new Ob(adId, command, jSONObject);
    }

    public static /* synthetic */ Ob a(Ob ob2, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ob2.f35129a;
        }
        if ((i10 & 2) != 0) {
            str2 = ob2.f35130b;
        }
        if ((i10 & 4) != 0) {
            jSONObject = ob2.f35131c;
        }
        return ob2.a(str, str2, jSONObject);
    }

    public static final Ob a(String str) throws JSONException {
        return f35128d.a(str);
    }
}
