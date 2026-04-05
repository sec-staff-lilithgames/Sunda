package ra;

import ao.kwoC.zAQQWzBxnS;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m extends b {
    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }

    public m(String langue, String str, String username, String password, String email) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(str, zAQQWzBxnS.DpdpBVWtK);
        e0.checkNotNullParameter(username, "username");
        e0.checkNotNullParameter(password, "password");
        e0.checkNotNullParameter(email, "email");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String strK = a.b.k("produisentdoitrecuperationassurer", password);
        Charset UTF_8 = StandardCharsets.UTF_8;
        e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = strK.getBytes(UTF_8);
        e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AkApplication.a aVar = AkApplication.f21719f;
        e0.checkNotNull(bArrDigest);
        String strBytesToHex = aVar.bytesToHex(bArrDigest);
        ca.m.sharedInstance().setUserPassword(strBytesToHex);
        addParameterForPost("langue", langue);
        addParameterForPost("pseudo", username);
        addParameterForPost("password", strBytesToHex);
        addParameterForPost("email", email);
        addParameterForPost("url", "ak://akinator/activation");
        addParameterForPost("basel_id", str);
        this.f84065i = a.b.k("register/", langue);
    }
}
