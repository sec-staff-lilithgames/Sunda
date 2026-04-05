package ra;

import kotlin.jvm.internal.e0;
import lb.b1;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends b {
    public n(String email) {
        e0.checkNotNullParameter(email, "email");
        addParameterForPost("email", email);
        this.f84065i = a.b.k("reconf/", b1.f72741d.sharedInstance().getApplicationLanguage());
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }
}
