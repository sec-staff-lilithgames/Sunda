package ra;

import com.digidust.elokence.akinator.factories.AkApplication;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends b {
    public l(String newPassword, String token) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(newPassword, "newPassword");
        e0.checkNotNullParameter(token, "token");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String strK = a.b.k("produisentdoitrecuperationassurer", newPassword);
        Charset UTF_8 = StandardCharsets.UTF_8;
        e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = strK.getBytes(UTF_8);
        e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AkApplication.a aVar = AkApplication.f21719f;
        e0.checkNotNull(bArrDigest);
        addParameterForPost("new_password", aVar.bytesToHex(bArrDigest));
        addParameterForPost("token", token);
        this.f84065i = "new_pass";
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }
}
