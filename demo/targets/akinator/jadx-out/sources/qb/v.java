package qb;

import java.util.ArrayList;
import org.w3c.dom.Document;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(lb.e session, ArrayList<String> idsBase, boolean z10) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(idsBase, "idsBase");
        this.f82730i = "signaler_doublon.php";
        addParameter("ids_doublons", y0.joinToString$default(idsBase, ",", null, null, 0, null, null, 62, null));
        if (z10) {
            addParameter("org", "SSL");
        } else {
            addParameter("org", "LST");
        }
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }
}
