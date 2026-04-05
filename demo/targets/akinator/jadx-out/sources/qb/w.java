package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import lb.e;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(lb.e session, int i10) {
        e.i currentSessionProgression;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82730i = "soundlike_acceptance.php";
        addParameter("base", "0");
        lb.e mSession = getMSession();
        Integer numValueOf = null;
        addParameter("channel", mSession != null ? mSession.getChannel() : null);
        lb.e mSession2 = getMSession();
        addParameter("session", mSession2 != null ? mSession2.getSession() : null);
        lb.e mSession3 = getMSession();
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, mSession3 != null ? mSession3.getSignature() : null);
        lb.e mSession4 = getMSession();
        if (mSession4 != null && (currentSessionProgression = mSession4.getCurrentSessionProgression()) != null) {
            numValueOf = Integer.valueOf(currentSessionProgression.getStep());
        }
        addParameter("step", String.valueOf(numValueOf));
        addParameter("number", String.valueOf(i10));
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        xmlResponse.getElementsByTagName("ID");
    }
}
