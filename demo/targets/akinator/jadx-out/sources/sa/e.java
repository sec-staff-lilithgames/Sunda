package sa;

import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public b f85583h;

    public e(String baseLogiqueId, String joueurId, String deviceUid) {
        e0.checkNotNullParameter(baseLogiqueId, "baseLogiqueId");
        e0.checkNotNullParameter(joueurId, "joueurId");
        e0.checkNotNullParameter(deviceUid, "deviceUid");
        addParameter("basel_id", baseLogiqueId);
        addParameter("joueur_id", joueurId);
        addParameter("device_uid", deviceUid);
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 10000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return a.b.l(DtbConstants.HTTP, c.f85581a.getADRESSE_CLASSEMENT$akinatorGL_gplayFreemiumRelease(), ":18666/get_informations_joueur.php");
    }

    public final b getPlayerScore() {
        return this.f85583h;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, IOException {
        e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            c cVar = c.f85581a;
            e0.checkNotNull(document);
            b classement$akinatorGL_gplayFreemiumRelease = cVar.parseClassement$akinatorGL_gplayFreemiumRelease(document);
            this.f85583h = classement$akinatorGL_gplayFreemiumRelease;
            return classement$akinatorGL_gplayFreemiumRelease != null ? 0 : 400;
        } catch (Exception e10) {
            Log.e("GetPlayerScoreWS", "parseWSResponse() error: " + e10);
            return 400;
        }
    }

    public final void setPlayerScore(b bVar) {
        this.f85583h = bVar;
    }
}
