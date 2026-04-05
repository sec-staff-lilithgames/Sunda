package sa;

import ca.m;
import ca.r;
import com.digidust.elokence.akinator.webservices.cheatmanagement.CheatManagement$AwardsToVote;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import qb.c0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f85581a = new c();

    public final String getADRESSE_CLASSEMENT$akinatorGL_gplayFreemiumRelease() {
        return "classement.akinator.com";
    }

    public final a getListAwardsToVote() {
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        Integer numValueOf = currentInstance != null ? Integer.valueOf(currentInstance.getBaseLogiqueId()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            Timber.Forest.tag("CheatManagement").e("baseLogiqueId is null or <= 0", new Object[0]);
            return null;
        }
        String string = numValueOf.toString();
        String idJoueurAccount = m.sharedInstance().isUserConnected() ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        e0.checkNotNull(idJoueurAccount);
        d dVar = new d(string, idJoueurAccount, jb.c.f69226m.sharedInstance().getDeviceId(), m.sharedInstance().isChildProtectEnabled());
        int iCall = dVar.call();
        if (iCall == 0) {
            Timber.Forest.tag("CheatManagement").d("returnCode is ok", new Object[0]);
            return dVar.getInfoVote();
        }
        Timber.Forest.tag("CheatManagement").e("returnCode is not ok : %s", Integer.valueOf(iCall));
        return null;
    }

    public final b getPlayerScore() {
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        Integer numValueOf = currentInstance != null ? Integer.valueOf(currentInstance.getBaseLogiqueId()) : null;
        if (numValueOf != null && numValueOf.intValue() > 0) {
            String string = numValueOf.toString();
            String idJoueurAccount = m.sharedInstance().isUserConnected() ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
            e0.checkNotNull(idJoueurAccount);
            e eVar = new e(string, idJoueurAccount, jb.c.f69226m.sharedInstance().getDeviceId());
            if (eVar.call() == 0) {
                return eVar.getPlayerScore();
            }
        }
        return null;
    }

    public final b parseClassement$akinatorGL_gplayFreemiumRelease(Document doc) throws DOMException, NumberFormatException {
        int i10;
        e0.checkNotNullParameter(doc, "doc");
        doc.getDocumentElement().normalize();
        if (c0.testNodeCompletion(doc) != 0) {
            return null;
        }
        NodeList elementsByTagName = doc.getElementsByTagName("SCORE");
        int i11 = -1;
        int i12 = 0;
        if (elementsByTagName == null || elementsByTagName.getLength() != 1) {
            i10 = -1;
        } else {
            String textContent = elementsByTagName.item(0).getTextContent();
            e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
            i10 = Integer.parseInt(textContent);
        }
        NodeList elementsByTagName2 = doc.getElementsByTagName("POSITION");
        if (elementsByTagName2 != null && elementsByTagName2.getLength() == 1) {
            String textContent2 = elementsByTagName2.item(0).getTextContent();
            e0.checkNotNullExpressionValue(textContent2, "getTextContent(...)");
            i11 = Integer.parseInt(textContent2);
        }
        NodeList elementsByTagName3 = doc.getElementsByTagName("NB_JOUEURS");
        if (elementsByTagName3 != null && elementsByTagName3.getLength() == 1) {
            String textContent3 = elementsByTagName3.item(0).getTextContent();
            e0.checkNotNullExpressionValue(textContent3, "getTextContent(...)");
            i12 = Integer.parseInt(textContent3);
        }
        return new b(i10, i11, i12);
    }

    public final a parseInternalListVote$akinatorGL_gplayFreemiumRelease(Document doc) throws DOMException, NumberFormatException {
        int i10;
        int i11;
        int i12;
        int i13;
        e0.checkNotNullParameter(doc, "doc");
        doc.getDocumentElement().normalize();
        if (c0.testNodeCompletion(doc) != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList elementsByTagName = doc.getElementsByTagName("SCORE");
        if (elementsByTagName == null || elementsByTagName.getLength() != 1) {
            i10 = 0;
        } else {
            String textContent = elementsByTagName.item(0).getTextContent();
            e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
            i10 = Integer.parseInt(textContent);
        }
        NodeList elementsByTagName2 = doc.getElementsByTagName("MORE_VOTES");
        if (elementsByTagName2 == null || elementsByTagName2.getLength() != 1) {
            i11 = 0;
        } else {
            String textContent2 = elementsByTagName2.item(0).getTextContent();
            e0.checkNotNullExpressionValue(textContent2, "getTextContent(...)");
            i11 = Integer.parseInt(textContent2);
        }
        NodeList elementsByTagName3 = doc.getElementsByTagName("VOTES");
        if (elementsByTagName3 == null || elementsByTagName3.getLength() != 1) {
            return null;
        }
        Node nodeItem = elementsByTagName3.item(0);
        e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
        NodeList elementsByTagName4 = ((Element) nodeItem).getElementsByTagName("VOTE");
        int length = elementsByTagName4.getLength();
        for (int i14 = 0; i14 < length; i14++) {
            Node nodeItem2 = elementsByTagName4.item(i14);
            Element element = nodeItem2 instanceof Element ? (Element) nodeItem2 : null;
            if (element != null) {
                NodeList elementsByTagName5 = element.getElementsByTagName("AWARD_ID");
                if (elementsByTagName5 == null || elementsByTagName5.getLength() != 1) {
                    i12 = -1;
                } else {
                    String textContent3 = elementsByTagName5.item(0).getTextContent();
                    e0.checkNotNullExpressionValue(textContent3, "getTextContent(...)");
                    i12 = Integer.parseInt(textContent3);
                }
                NodeList elementsByTagName6 = element.getElementsByTagName("SESSION_ID");
                if (elementsByTagName6 == null || elementsByTagName6.getLength() != 1) {
                    i13 = 0;
                } else {
                    String textContent4 = elementsByTagName6.item(0).getTextContent();
                    e0.checkNotNullExpressionValue(textContent4, "getTextContent(...)");
                    i13 = Integer.parseInt(textContent4);
                }
                NodeList elementsByTagName7 = element.getElementsByTagName("NOM");
                String textContent5 = (elementsByTagName7 == null || elementsByTagName7.getLength() != 1) ? null : elementsByTagName7.item(0).getTextContent();
                NodeList elementsByTagName8 = element.getElementsByTagName(NativeAdContent.ViewTag.AD_DESCRIPTION);
                String textContent6 = (elementsByTagName8 == null || elementsByTagName8.getLength() != 1) ? null : elementsByTagName8.item(0).getTextContent();
                Timber.Forest.tag("CheatManagement").d("Add : type = %s, nom = %s, description = %s, sessionId = %s", Integer.valueOf(i12), textContent5, textContent6, Integer.valueOf(i13));
                if (textContent5 == null) {
                    textContent5 = "";
                }
                if (textContent6 == null) {
                    textContent6 = "";
                }
                arrayList.add(new CheatManagement$AwardsToVote(i12, textContent5, textContent6, i13));
            }
        }
        return new a(i10, i11, arrayList);
    }

    public final void sendVote(int i10, int i11) {
        lb.c currentInstance = m.sharedInstance().getCurrentInstance();
        Integer numValueOf = currentInstance != null ? Integer.valueOf(currentInstance.getBaseLogiqueId()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            return;
        }
        String string = numValueOf.toString();
        String idJoueurAccount = m.sharedInstance().isUserConnected() ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        e0.checkNotNull(idJoueurAccount);
        new f(string, idJoueurAccount, String.valueOf(i11), String.valueOf(i10), jb.c.f69226m.sharedInstance().getDeviceId()).call();
    }
}
