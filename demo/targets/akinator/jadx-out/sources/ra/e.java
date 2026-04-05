package ra;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public e(String userId) {
        e0.checkNotNullParameter(userId, "userId");
        addParameter("user_id", userId);
        this.f84065i = "users/" + userId + "/all_infos";
    }

    @Override // ra.b
    public final void a(JSONObject obj) throws JSONException {
        e0.checkNotNullParameter(obj, "obj");
        try {
            if (!e0.areEqual(obj.getJSONObject("parameters").getString("infos"), AbstractJsonLexerKt.NULL) && !e0.areEqual(obj.getJSONObject("parameters").getString("infos"), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                String string = obj.getJSONObject("parameters").getString("infos");
                e0.checkNotNullExpressionValue(string, "getString(...)");
                if (string.length() != 0) {
                    Timber.Forest.tag("AkGGIIWebservice").d("Response was not empty", new Object[0]);
                    getInfoNotNull(obj);
                    new g().start();
                    return;
                }
            }
            Timber.Forest.tag("AkGGIIWebservice").d("Response was empty", new Object[0]);
            BuildersKt__Builders_commonKt.launch$default(AkApplication.f21719f.getAppScope(), null, null, new f(2, null), 3, null);
        } catch (JSONException e10) {
            if (!e0.areEqual(e10.getMessage(), "No value for infos")) {
                throw new JSONException("Error when parsing json");
            }
            BuildersKt__Builders_commonKt.launch$default(AkApplication.f21719f.getAppScope(), null, null, new f(2, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0555 A[Catch: JSONException -> 0x059d, TryCatch #9 {JSONException -> 0x059d, blocks: (B:72:0x02c2, B:77:0x02fa, B:82:0x0347, B:87:0x0396, B:92:0x03e5, B:97:0x0434, B:102:0x0483, B:107:0x04d2, B:112:0x0521, B:113:0x054f, B:115:0x0555, B:117:0x0563, B:111:0x0501, B:106:0x04b2, B:101:0x0463, B:96:0x0414, B:91:0x03c5, B:86:0x0376, B:81:0x0327, B:76:0x02e4, B:98:0x0454, B:73:0x02d5, B:88:0x03b6, B:78:0x0318, B:108:0x04f2, B:103:0x04a3, B:93:0x0405, B:83:0x0367), top: B:157:0x02c2, inners: #0, #2, #3, #5, #11, #12, #13, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getInfoNotNull(org.json.JSONObject r30) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.getInfoNotNull(org.json.JSONObject):void");
    }
}
