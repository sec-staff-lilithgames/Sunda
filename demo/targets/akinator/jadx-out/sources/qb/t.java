package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t extends z {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f82722o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(lb.e session, String searchSequence, int i10) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(searchSequence, "searchSequence");
        this.f82722o = new ArrayList();
        this.f82730i = "suggestions.php";
        addParameter("session", session.getSession());
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, session.getSignature());
        addParameter("name", searchSequence);
        addParameter("nb_items", String.valueOf(i10));
    }

    public final ArrayList<String> getListOfSuggestions() {
        return this.f82722o;
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("ELEMENT");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            NodeList childNodes = elementsByTagName.item(i10).getChildNodes();
            int length2 = childNodes.getLength();
            String textContent = null;
            for (int i11 = 0; i11 < length2; i11++) {
                Node nodeItem = childNodes.item(i11);
                if (kotlin.jvm.internal.e0.areEqual(nodeItem.getNodeName(), "NAME")) {
                    textContent = nodeItem.getTextContent();
                }
            }
            if (textContent != null) {
                this.f82722o.add(textContent);
            }
        }
    }
}
