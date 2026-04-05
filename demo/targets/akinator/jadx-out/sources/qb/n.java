package qb;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public final lb.a f82702h;

    /* renamed from: i, reason: collision with root package name */
    public final int f82703i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82704j;

    public n(String serviceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceId, "serviceId");
        this.f82702h = new lb.a();
        this.f82703i = 10000;
        this.f82704j = "https://lb.elokence.com/ws/params_server/get_params.php";
        addParameter("composant", "APP_AKINATOR");
        addParameter("service_id", serviceId);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static void a(Document document, lb.a aVar) throws DOMException, b0 {
        NodeList elementsByTagName = document.getElementsByTagName("PARAMETERS");
        if (elementsByTagName.getLength() == 0) {
            throw new b0("PARAMETERS NOT FOUND");
        }
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            NodeList childNodes = elementsByTagName.item(i10).getChildNodes();
            int length2 = childNodes.getLength();
            for (int i11 = 0; i11 < length2; i11++) {
                NodeList childNodes2 = childNodes.item(i11).getChildNodes();
                int length3 = childNodes2.getLength();
                String textContent = "";
                String textContent2 = "";
                for (int i12 = 0; i12 < length3; i12++) {
                    Node nodeItem = childNodes2.item(i12);
                    String nodeName = nodeItem.getNodeName();
                    if (kotlin.jvm.internal.e0.areEqual(nodeName, "NAME")) {
                        textContent = nodeItem.getTextContent();
                    } else if (kotlin.jvm.internal.e0.areEqual(nodeName, "VAL")) {
                        textContent2 = nodeItem.getTextContent();
                    }
                }
                switch (textContent.hashCode()) {
                    case -1314949466:
                        if (textContent.equals("dureeMaxDepuisDernierePartieDansSession")) {
                            aVar.setDureeMaxDepuisDernierePartieDansSession$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case -1014723450:
                        if (textContent.equals("nbPartiesSessionAvantLancementPubAudio")) {
                            aVar.setNbPartiesSessionAvantLancementPubAudio$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case -371639768:
                        if (textContent.equals("nbPartiesReproposeInscriptionClassement")) {
                            aVar.setNbPartieReproposeInscriptionClassement$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 232435304:
                        if (textContent.equals("nbPartiesAvantPremierLancementPubAudio")) {
                            aVar.setNbPartiesAvantPremierLancementPubAudio$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 1115746717:
                        if (textContent.equals("delaiTimerBannComm")) {
                            aVar.setDelaiTimerBanniereCom$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 1139147875:
                        if (textContent.equals("timeoutCourtCNX")) {
                            aVar.setTimeoutCourt$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 1782810800:
                        if (textContent.equals("timeoutLongCNX")) {
                            aVar.setTimeoutLong$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 1941939301:
                        if (textContent.equals("disponibiliteAccessoires")) {
                            aVar.setDisponibiliteAccessoires$limuleapi_release(Boolean.parseBoolean(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 1982165111:
                        if (textContent.equals("coeffVitesseAnimations")) {
                            aVar.setCoeffAnimationSpeed$limuleapi_release(Float.parseFloat(textContent2));
                            break;
                        } else {
                            break;
                        }
                    case 2026208863:
                        if (textContent.equals("limitAwardIdRare")) {
                            aVar.setLimitAwardIdRare$limuleapi_release(Integer.parseInt(textContent2));
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
    }

    public final lb.a getConfig() {
        return this.f82702h;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return this.f82703i;
    }

    @Override // qb.d0
    public String getMUrl() {
        return this.f82704j;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            kotlin.jvm.internal.e0.checkNotNull(document);
            a(document, this.f82702h);
            return 0;
        } catch (Exception unused) {
            return 400;
        }
    }
}
