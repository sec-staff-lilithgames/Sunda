package ra;

import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends b {
    public d(String token) {
        e0.checkNotNullParameter(token, "token");
        addParameterForPost("token", token);
        this.f84065i = "delete";
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }
}
