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
public final class d extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public a f85582h;

    public d(String baseLogiqueId, String joueurId, String deviceUid, boolean z10) {
        e0.checkNotNullParameter(baseLogiqueId, "baseLogiqueId");
        e0.checkNotNullParameter(joueurId, "joueurId");
        e0.checkNotNullParameter(deviceUid, "deviceUid");
        addParameter("basel_id", baseLogiqueId.toString());
        addParameter("joueur_id", joueurId.toString());
        addParameter("device_uid", deviceUid);
        addParameter("device_filtre_items", z10 ? "true" : "false");
    }

    public final a getInfoVote() {
        return this.f85582h;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 10000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return a.b.l(DtbConstants.HTTP, c.f85581a.getADRESSE_CLASSEMENT$akinatorGL_gplayFreemiumRelease(), ":18666/get_aki_awards_to_vote.php");
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, IOException {
        e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            c cVar = c.f85581a;
            e0.checkNotNull(document);
            a internalListVote$akinatorGL_gplayFreemiumRelease = cVar.parseInternalListVote$akinatorGL_gplayFreemiumRelease(document);
            this.f85582h = internalListVote$akinatorGL_gplayFreemiumRelease;
            return internalListVote$akinatorGL_gplayFreemiumRelease != null ? 0 : 400;
        } catch (Exception e10) {
            Log.e("CheatManagement", "parseWSResponse() error: " + e10);
            return 400;
        }
    }

    public final void setInfoVote(a aVar) {
        this.f85582h = aVar;
    }
}
