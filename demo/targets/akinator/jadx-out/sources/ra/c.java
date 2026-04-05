package ra;

import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: k, reason: collision with root package name */
    public boolean f84067k;

    public c(String token) {
        e0.checkNotNullParameter(token, "token");
        addParameterForPost("token", token);
        this.f84065i = "check-login";
    }

    @Override // ra.b
    public final void a(JSONObject obj) throws JSONException {
        e0.checkNotNullParameter(obj, "obj");
        int i10 = obj.getInt("need_resynchro");
        if (i10 == 0) {
            this.f84067k = false;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f84067k = true;
        }
    }

    public final boolean getResynchroIndicator() {
        return this.f84067k;
    }
}
