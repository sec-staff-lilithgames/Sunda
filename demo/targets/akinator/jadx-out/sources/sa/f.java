package sa;

import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import org.xml.sax.InputSource;
import qb.c0;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends d0 {
    public f(String baseLogiqueId, String joueurId, String sessionId, String vote, String deviceUid) {
        e0.checkNotNullParameter(baseLogiqueId, "baseLogiqueId");
        e0.checkNotNullParameter(joueurId, "joueurId");
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(vote, "vote");
        e0.checkNotNullParameter(deviceUid, "deviceUid");
        addParameter("basel_id", baseLogiqueId.toString());
        addParameter("joueur_id", joueurId.toString());
        addParameter("session_id", sessionId.toString());
        addParameter("vote", vote.toString());
        addParameter("device_uid", deviceUid);
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 10000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return a.b.l(DtbConstants.HTTP, c.f85581a.getADRESSE_CLASSEMENT$akinatorGL_gplayFreemiumRelease(), ":18666/vote_aki_award.php");
    }

    @Override // qb.d0
    public int parseWSResponse(String response) {
        e0.checkNotNullParameter(response, "response");
        try {
            return c0.testNodeCompletion(DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)))) == 0 ? 0 : 400;
        } catch (Exception e10) {
            Log.e("SendVoteWS", "parseWSResponse() error: " + e10);
            return 400;
        }
    }
}
