package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface V1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements V1 {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f35598a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.V1
        public com.ironsource.mediationsdk.demandOnly.p a(String instanceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.f35598a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new p.a(strOptString) : new p.b();
        }

        public a(JSONObject jSONObject) {
            this.f35598a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
