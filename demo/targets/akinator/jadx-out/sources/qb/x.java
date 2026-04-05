package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Locale;
import lb.e;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x extends z {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f82724o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lb.e session, String searchName) {
        e.i currentSessionProgression;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        kotlin.jvm.internal.e0.checkNotNullParameter(searchName, "searchName");
        this.f82724o = new ArrayList();
        this.f82730i = "soundlike_search.php";
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
        addParameter("name", searchName);
        if (session.isChildProtected()) {
            addParameter("contrainte", "etat='EN'");
        }
    }

    public final ArrayList<e.b> getListofLimuleObjects() {
        return this.f82724o;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("ELEMENT");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = elementsByTagName.item(i10);
            e.b bVar = new e.b();
            NodeList childNodes = nodeItem.getChildNodes();
            int length2 = childNodes.getLength();
            for (int i11 = 0; i11 < length2; i11++) {
                Node nodeItem2 = childNodes.item(i11);
                String nodeName = nodeItem2.getNodeName();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(nodeName, "getNodeName(...)");
                String lowerCase = nodeName.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -1724546052:
                        if (lowerCase.equals("description")) {
                            bVar.setDescription(nodeItem2.getTextContent());
                            break;
                        } else {
                            break;
                        }
                    case 3373707:
                        if (lowerCase.equals("name")) {
                            bVar.setName(nodeItem2.getTextContent());
                            break;
                        } else {
                            break;
                        }
                    case 1471898766:
                        if (lowerCase.equals("absolute_picture_path")) {
                            bVar.setPicturePath(nodeItem2.getTextContent());
                            break;
                        } else {
                            break;
                        }
                    case 1652271989:
                        if (lowerCase.equals("id_base")) {
                            bVar.setIdBase(nodeItem2.getTextContent());
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f82724o.add(bVar);
        }
    }
}
