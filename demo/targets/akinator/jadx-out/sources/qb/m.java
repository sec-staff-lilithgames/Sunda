package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import lb.e;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(lb.e session, Integer num) {
        e.i currentSessionProgression;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82730i = "exclusion.php";
        addParameter("base", "0");
        lb.e mSession = getMSession();
        String str = "";
        addParameter("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameter("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        if (mSession3 != null && (signature = mSession3.getSignature()) != null) {
            str = signature;
        }
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, str);
        lb.e mSession4 = getMSession();
        addParameter("step", String.valueOf((mSession4 == null || (currentSessionProgression = mSession4.getCurrentSessionProgression()) == null) ? null : Integer.valueOf(currentSessionProgression.getStep())));
        if (num != null) {
            addParameter("nb", String.valueOf(num.intValue()));
        }
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }

    public /* synthetic */ m(lb.e eVar, Integer num, int i10, kotlin.jvm.internal.u uVar) {
        this(eVar, (i10 & 2) != 0 ? null : num);
    }
}
