package qb;

import lb.s0;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lb.e session, int i10, String objectId, int i11, boolean z10, int i12) {
        s0.c settings;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        s0 s0VarSharedInstance = s0.f72971j.sharedInstance();
        int mPartnerId = (s0VarSharedInstance == null || (settings = s0VarSharedInstance.getSettings()) == null) ? 0 : settings.getMPartnerId();
        this.f82730i = "trace_game.php";
        addParameter("mode", String.valueOf(i10));
        addParameter("objet_id", objectId);
        addParameter("nb_joueurs", String.valueOf(i11));
        addParameter("trouve", z10 ? "1" : "0");
        addParameter("nb_questions", String.valueOf(i12));
        addParameter("partner_id", String.valueOf(mPartnerId));
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }
}
