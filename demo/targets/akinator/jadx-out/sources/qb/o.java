package qb;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o extends z {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f82705o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lb.e session, String mObjectId) {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(mObjectId, "mObjectId");
        this.f82705o = new ArrayList();
        this.f82730i = "get_questions_to_ask_for_object.php";
        addParameter("object_id", mObjectId);
    }

    public final List<lb.d> getListQuestions() {
        return this.f82705o;
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException, l {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("QUESTION");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            Element element = nodeItem instanceof Element ? (Element) nodeItem : null;
            if (element != null) {
                if (!k0.equals("QUESTION", element.getTagName(), true)) {
                    throw new b0();
                }
                lb.d dVar = new lb.d();
                NodeList elementsByTagName2 = element.getElementsByTagName("ANSWER");
                if (elementsByTagName2.getLength() == 0) {
                    throw new b0("NONE ANSWER FOUND");
                }
                int length2 = elementsByTagName2.getLength();
                for (int i11 = 0; i11 < length2; i11++) {
                    dVar.f72796c.add(elementsByTagName2.item(i11).getTextContent());
                }
                NodeList elementsByTagName3 = element.getElementsByTagName("TEXT");
                if (elementsByTagName3.getLength() == 0) {
                    throw new b0("QUESTION TEXT NOT FOUND");
                }
                dVar.f72795b = elementsByTagName3.item(0).getTextContent();
                NodeList elementsByTagName4 = element.getElementsByTagName("ID");
                if (elementsByTagName4.getLength() == 0) {
                    throw new b0("QUESTION ID NOT FOUND");
                }
                try {
                    String textContent = elementsByTagName4.item(0).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
                    dVar.f72794a = Integer.parseInt(textContent);
                    this.f82705o.add(dVar);
                } catch (Exception unused) {
                    throw new b0("QUESTION ID NOT A NUMBER");
                }
            }
        }
    }
}
