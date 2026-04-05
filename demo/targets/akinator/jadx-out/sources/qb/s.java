package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import lb.e;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s extends z {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f82721o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(lb.e session) {
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82721o = new ArrayList();
        this.f82730i = "report.php";
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
    }

    public final ArrayList<e.C0742e> getReport() {
        return this.f82721o;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("STEP");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            e.C0742e c0742e = new e.C0742e();
            NodeList childNodes = nodeItem.getChildNodes();
            int length2 = childNodes.getLength();
            for (int i11 = 0; i11 < length2; i11++) {
                Node nodeItem2 = childNodes.item(i11);
                String nodeName = nodeItem2.getNodeName();
                if (nodeName != null) {
                    switch (nodeName.hashCode()) {
                        case -1664070471:
                            if (nodeName.equals("GROUPE_GIVEN_ANSWER")) {
                                String textContent = nodeItem2.getTextContent();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
                                Integer intOrNull = j0.toIntOrNull(textContent);
                                c0742e.setGroupeGivenAnswer(intOrNull != null ? intOrNull.intValue() : -1);
                                break;
                            } else {
                                break;
                            }
                        case -383243290:
                            if (nodeName.equals("QUESTION")) {
                                c0742e.setQuestionLabel(nodeItem2.getTextContent());
                                break;
                            } else {
                                break;
                            }
                        case 944853676:
                            if (nodeName.equals("GROUPE_EXPECTED_ANSWER")) {
                                String textContent2 = nodeItem2.getTextContent();
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent2, "getTextContent(...)");
                                Integer intOrNull2 = j0.toIntOrNull(textContent2);
                                c0742e.setGroupeExpectedAnswer(intOrNull2 != null ? intOrNull2.intValue() : -1);
                                break;
                            } else {
                                break;
                            }
                        case 993491749:
                            if (nodeName.equals("EXPECTED_ANSWER")) {
                                c0742e.setAnswerExpected(nodeItem2.getTextContent());
                                break;
                            } else {
                                break;
                            }
                        case 1510121184:
                            if (nodeName.equals("GIVEN_ANSWER")) {
                                c0742e.setGivenAnswer(nodeItem2.getTextContent());
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
            this.f82721o.add(c0742e);
        }
    }
}
