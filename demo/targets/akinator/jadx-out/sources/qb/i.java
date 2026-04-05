package qb;

import hr.kNq.ikJMrW;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class i extends z {
    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lb.e session, String objetId, String newName, String newDesc, String oldName, String oldDesc, String com2) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(objetId, "objetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(newName, "newName");
        kotlin.jvm.internal.e0.checkNotNullParameter(newDesc, "newDesc");
        kotlin.jvm.internal.e0.checkNotNullParameter(oldName, "oldName");
        kotlin.jvm.internal.e0.checkNotNullParameter(oldDesc, "oldDesc");
        kotlin.jvm.internal.e0.checkNotNullParameter(com2, "com");
        this.f82730i = "signaler_nom_incorrect.php";
        addParameter("objet_id", objetId);
        addParameter("nouveau_nom", newName);
        addParameter(ikJMrW.PXDUkbvHQnR, newDesc);
        addParameter("ancien_nom", oldName);
        addParameter("ancienne_desc", oldDesc);
        addParameter("commentaire", com2);
    }
}
