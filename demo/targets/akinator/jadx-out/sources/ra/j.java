package ra;

import com.applovin.sdk.AppLovinEventTypes;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends b {

    /* renamed from: k, reason: collision with root package name */
    public String f84069k;

    /* renamed from: l, reason: collision with root package name */
    public String f84070l;

    /* renamed from: m, reason: collision with root package name */
    public String f84071m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f84072n;

    public j(String email, String password, boolean z10) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(email, "email");
        e0.checkNotNullParameter(password, "password");
        this.f84065i = AppLovinEventTypes.USER_LOGGED_IN;
        if (z10) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String strK = a.b.k("produisentdoitrecuperationassurer", password);
            Charset UTF_8 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = strK.getBytes(UTF_8);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AkApplication.a aVar = AkApplication.f21719f;
            e0.checkNotNull(bArrDigest);
            password = aVar.bytesToHex(bArrDigest);
        }
        ca.m.sharedInstance().setUserPassword(password);
        ca.m.sharedInstance().setUserMail(email);
        addParameterForPost("email", email);
        addParameterForPost("password", password);
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
        this.f84069k = parseWSKey(obj);
        this.f84070l = parseWSName(obj);
        this.f84071m = parseWSUserID(obj);
        try {
            this.f84072n = parseWSAdm(obj);
        } catch (Exception unused) {
        }
    }

    public final String getKey() {
        return this.f84069k;
    }

    public final String getName() {
        return this.f84070l;
    }

    public final String getUserId() {
        return this.f84071m;
    }

    public final boolean isKnownDevice() {
        return this.f84072n;
    }

    public final boolean parseWSAdm(JSONObject obj) throws nb.b {
        e0.checkNotNullParameter(obj, "obj");
        try {
            return e0.areEqual(obj.getString("admin"), "1");
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String parseWSKey(JSONObject obj) throws nb.b {
        e0.checkNotNullParameter(obj, "obj");
        try {
            return obj.getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String parseWSName(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
        try {
            return obj.getString("pseudo");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String parseWSUserID(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
        try {
            return obj.getString("user_id");
        } catch (JSONException unused) {
            return null;
        }
    }
}
