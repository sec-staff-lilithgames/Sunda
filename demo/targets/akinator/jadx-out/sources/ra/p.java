package ra;

import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p extends b {
    public p(String email, String langue) {
        e0.checkNotNullParameter(email, "email");
        e0.checkNotNullParameter(langue, "langue");
        addParameterForPost("email", email);
        this.f84065i = "reconf/" + langue;
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }
}
