package pi;

import android.text.TextUtils;
import com.ironsource.C3352n2;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import hi.z;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f81378a;

    /* renamed from: b, reason: collision with root package name */
    public final mi.b f81379b;

    /* renamed from: c, reason: collision with root package name */
    public final ei.f f81380c;

    public c(String str, mi.b bVar) {
        ei.f logger = ei.f.getLogger();
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f81380c = logger;
        this.f81379b = bVar;
        this.f81378a = str;
    }

    public static void a(mi.a aVar, k kVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f81408a);
        aVar.header("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", z.getVersion());
        aVar.header("Accept", G5.L);
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f81409b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f81410c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f81411d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f81412e.getInstallIds().getCrashlyticsInstallId());
    }

    public static void b(mi.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.header(str, str2);
        }
    }

    public static HashMap c(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f81415h);
        map.put("display_version", kVar.f81414g);
        map.put("source", Integer.toString(kVar.f81416i));
        String str = kVar.f81413f;
        if (!TextUtils.isEmpty(str)) {
            map.put(C3352n2.f37922p, str);
        }
        return map;
    }

    public final JSONObject d(mi.c cVar) {
        int iCode = cVar.code();
        ei.f fVar = this.f81380c;
        fVar.v("Settings response code was: " + iCode);
        String str = this.f81378a;
        if (iCode != 200 && iCode != 201 && iCode != 202 && iCode != 203) {
            fVar.e("Settings request failed; (status: " + iCode + ") from " + str);
            return null;
        }
        String strBody = cVar.body();
        try {
            return new JSONObject(strBody);
        } catch (Exception e10) {
            fVar.w("Failed to parse settings JSON from " + str, e10);
            fVar.w("Settings response " + strBody);
            return null;
        }
    }

    @Override // pi.l
    public JSONObject invoke(k kVar, boolean z10) {
        String str = this.f81378a;
        ei.f fVar = this.f81380c;
        ii.g.checkBlockingThread();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            HashMap mapC = c(kVar);
            mi.a aVarHeader = this.f81379b.buildHttpGetRequest(str, mapC).header(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/" + z.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            a(aVarHeader, kVar);
            fVar.d("Requesting settings from " + str);
            fVar.v("Settings query params were: " + mapC);
            return d(aVarHeader.execute());
        } catch (IOException e10) {
            fVar.e("Settings request failed.", e10);
            return null;
        }
    }
}
