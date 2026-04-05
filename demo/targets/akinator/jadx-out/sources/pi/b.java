package pi;

import com.sfbx.appconsent.core.BuildConfig;
import hi.f0;
import org.json.JSONObject;
import pi.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements i {
    public static d a(f0 f0Var) {
        return new d(f0Var.getCurrentTimeMillis() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, BuildConfig.VERSION_CODE, 10.0d, 1.2d, 60);
    }

    @Override // pi.i
    public d buildFromJson(f0 f0Var, JSONObject jSONObject) {
        return a(f0Var);
    }
}
