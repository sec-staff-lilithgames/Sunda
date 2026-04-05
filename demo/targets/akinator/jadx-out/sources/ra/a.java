package ra;

import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends b {

    /* renamed from: k, reason: collision with root package name */
    public int f84063k;

    public a(String email) {
        e0.checkNotNullParameter(email, "email");
        addParameterForPost("email", email);
        this.f84065i = "account-status";
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
        this.f84063k = obj.getInt("status_account");
    }

    public final int getStatusAccount() {
        return this.f84063k;
    }
}
