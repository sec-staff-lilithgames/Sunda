package ta;

import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import lb.a1;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f86665a = new j();

    public static ArrayList a(Document document) throws DOMException, NumberFormatException {
        int i10;
        int i11;
        document.getDocumentElement().normalize();
        if (a1.testNodeCompletion(document) == 0) {
            NodeList elementsByTagName = document.getElementsByTagName("AWARD");
            if (elementsByTagName.getLength() > 0) {
                ArrayList arrayList = new ArrayList();
                int length = elementsByTagName.getLength();
                for (int i12 = 0; i12 < length; i12++) {
                    Node nodeItem = elementsByTagName.item(i12);
                    e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Element element = (Element) nodeItem;
                    NodeList elementsByTagName2 = element.getElementsByTagName("AWARD_ID");
                    int i13 = -1;
                    if (elementsByTagName2 == null || elementsByTagName2.getLength() != 1) {
                        i10 = -1;
                    } else {
                        String textContent = elementsByTagName2.item(0).getTextContent();
                        e0.checkNotNull(textContent);
                        i10 = Integer.parseInt(textContent);
                    }
                    NodeList elementsByTagName3 = element.getElementsByTagName("NOM");
                    String textContent2 = (elementsByTagName3 == null || elementsByTagName3.getLength() != 1) ? null : elementsByTagName3.item(0).getTextContent();
                    NodeList elementsByTagName4 = element.getElementsByTagName(NativeAdContent.ViewTag.AD_DESCRIPTION);
                    String textContent3 = (elementsByTagName4 == null || elementsByTagName4.getLength() != 1) ? null : elementsByTagName4.item(0).getTextContent();
                    NodeList elementsByTagName5 = element.getElementsByTagName("PSEUDO");
                    String textContent4 = (elementsByTagName5 == null || elementsByTagName5.getLength() != 1) ? null : elementsByTagName5.item(0).getTextContent();
                    NodeList elementsByTagName6 = element.getElementsByTagName("POS");
                    if (elementsByTagName6 != null && elementsByTagName6.getLength() == 1) {
                        String textContent5 = elementsByTagName6.item(0).getTextContent();
                        e0.checkNotNull(textContent5);
                        i13 = Integer.parseInt(textContent5);
                    }
                    int i14 = i13;
                    NodeList elementsByTagName7 = element.getElementsByTagName("DELAI");
                    if (elementsByTagName7 == null || elementsByTagName7.getLength() != 1) {
                        i11 = 0;
                    } else {
                        String textContent6 = elementsByTagName7.item(0).getTextContent();
                        e0.checkNotNull(textContent6);
                        i11 = Integer.parseInt(textContent6);
                    }
                    e0.checkNotNull(textContent2);
                    e0.checkNotNull(textContent3);
                    e0.checkNotNull(textContent4);
                    arrayList.add(new i(i10, textContent2, textContent3, textContent4, i11, i14));
                }
                return arrayList;
            }
        }
        return null;
    }

    public final List<i> call() throws SAXException, IOException {
        if (ca.m.sharedInstance().getCurrentInstance() == null) {
            return null;
        }
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        if (currentInstance.getBaseLogiqueId() <= 0) {
            return null;
        }
        String adresse_classement = g.f86657a.getADRESSE_CLASSEMENT();
        lb.c currentInstance2 = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance2);
        String xml = a1.f72726a.getXML(a.b.o(a.b.r(currentInstance2.getBaseLogiqueId(), DtbConstants.HTTP, adresse_classement, ":18666/get_hall_of_fame.php?basel_id=", "&uid="), jb.c.f69226m.sharedInstance().getDeviceId(), "&device_filtre_items=", ca.m.sharedInstance().isChildProtectEnabled() ? "true" : "false"), 20000);
        if (xml == null) {
            return null;
        }
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
            e0.checkNotNull(document);
            return a(document);
        } catch (Exception unused) {
            return null;
        }
    }
}
