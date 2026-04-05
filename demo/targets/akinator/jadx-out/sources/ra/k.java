package ra;

import com.digidust.elokence.akinator.factories.AkApplication;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends b {
    public k(String key, String username) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(username, "username");
        this.f84065i = "update";
        addParameterForPost("token", key);
        addParameterForPost("pseudo", username);
        addParameterForPost("origin_country", Locale.getDefault().getCountry());
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
    }

    public k(String key, String eml, String pwd, boolean z10) throws NoSuchAlgorithmException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(eml, "eml");
        e0.checkNotNullParameter(pwd, "pwd");
        this.f84065i = "update";
        addParameterForPost("token", key);
        if (z10) {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String strK = a.b.k("produisentdoitrecuperationassurer", pwd);
            Charset UTF_8 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = strK.getBytes(UTF_8);
            e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AkApplication.a aVar = AkApplication.f21719f;
            e0.checkNotNull(bArrDigest);
            String strBytesToHex = aVar.bytesToHex(bArrDigest);
            addParameterForPost("email", eml);
            addParameterForPost("password", strBytesToHex);
        } else {
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            String strK2 = a.b.k("produisentdoitrecuperationassurer", pwd);
            String strK3 = a.b.k("produisentdoitrecuperationassurer", eml);
            Charset UTF_82 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_82, "UTF_8");
            byte[] bytes2 = strK3.getBytes(UTF_82);
            e0.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            byte[] bArrDigest2 = messageDigest2.digest(bytes2);
            e0.checkNotNullExpressionValue(UTF_82, "UTF_8");
            byte[] bytes3 = strK2.getBytes(UTF_82);
            e0.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            byte[] bArrDigest3 = messageDigest2.digest(bytes3);
            AkApplication.a aVar2 = AkApplication.f21719f;
            e0.checkNotNull(bArrDigest3);
            String strBytesToHex2 = aVar2.bytesToHex(bArrDigest3);
            e0.checkNotNull(bArrDigest2);
            addParameterForPost("password", aVar2.bytesToHex(bArrDigest2));
            addParameterForPost("new_password", strBytesToHex2);
        }
        addParameterForPost("origin_country", Locale.getDefault().getCountry());
    }
}
