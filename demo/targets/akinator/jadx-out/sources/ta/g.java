package ta;

import ca.r;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qb.c0;
import sv.j0;
import timber.log.Timber;
import tu.v;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f86657a = new g();

    public static v a(Element element, int i10) throws DOMException {
        String str;
        String str2;
        NodeList elementsByTagName;
        if (i10 == 1) {
            str = "NB_BRONZE";
            str2 = "ELEMENT_BRONZE";
        } else if (i10 == 2) {
            str = "NB_SILVER";
            str2 = "ELEMENT_SILVER";
        } else if (i10 == 3) {
            str = "NB_GOLD";
            str2 = "ELEMENT_GOLD";
        } else if (i10 == 4) {
            str = "NB_PLATINUM";
            str2 = "ELEMENT_PLATINUM";
        } else if (i10 != 5) {
            str = null;
            str2 = null;
        } else {
            str = "NB_BLACK";
            str2 = "ELEMENT_BLACK";
        }
        if (str2 == null || (elementsByTagName = element.getElementsByTagName(str)) == null || elementsByTagName.getLength() != 1) {
            return null;
        }
        String textContent = elementsByTagName.item(0).getTextContent();
        e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
        Integer intOrNull = j0.toIntOrNull(textContent);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        if (iIntValue <= 0) {
            return new v(0, null);
        }
        NodeList elementsByTagName2 = element.getElementsByTagName(str2);
        if (elementsByTagName2 == null || elementsByTagName2.getLength() <= 0) {
            return new v(Integer.valueOf(iIntValue), null);
        }
        ArrayList arrayList = new ArrayList();
        int length = elementsByTagName2.getLength();
        for (int i11 = 0; i11 < length; i11++) {
            Node nodeItem = elementsByTagName2.item(i11);
            e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
            Element element2 = (Element) nodeItem;
            NodeList elementsByTagName3 = element2.getElementsByTagName("NOM");
            String textContent2 = "";
            String textContent3 = (elementsByTagName3 == null || elementsByTagName3.getLength() != 1) ? "" : elementsByTagName3.item(0).getTextContent();
            NodeList elementsByTagName4 = element2.getElementsByTagName(NativeAdContent.ViewTag.AD_DESCRIPTION);
            if (elementsByTagName4 != null && elementsByTagName4.getLength() == 1) {
                textContent2 = elementsByTagName4.item(0).getTextContent();
            }
            arrayList.add(new v(textContent3, textContent2));
        }
        return new v(Integer.valueOf(iIntValue), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[PHI: r12
      0x00de: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v13 int), (r12v13 int) binds: [B:27:0x0080, B:29:0x0086, B:38:0x00ba, B:40:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(org.w3c.dom.Element r27, java.lang.String r28) throws org.w3c.dom.DOMException {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.g.b(org.w3c.dom.Element, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ta.c c(org.w3c.dom.Document r19, java.lang.String r20) throws org.w3c.dom.DOMException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.g.c(org.w3c.dom.Document, java.lang.String):ta.c");
    }

    public final ArrayList<c> call() throws SAXException, IOException {
        String rawResponse;
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        int baseLogiqueId = currentInstance.getBaseLogiqueId();
        if (baseLogiqueId <= 0) {
            return null;
        }
        String idJoueurAccount = ca.m.sharedInstance().isUserConnected() ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        String deviceId = jb.c.f69226m.sharedInstance().getDeviceId();
        boolean zIsChildProtectEnabled = ca.m.sharedInstance().isChildProtectEnabled();
        e0.checkNotNull(idJoueurAccount);
        a aVar = new a(baseLogiqueId, idJoueurAccount, deviceId, zIsChildProtectEnabled);
        if (aVar.call() != 0 || (rawResponse = aVar.getRawResponse()) == null) {
            return null;
        }
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(rawResponse)));
            e0.checkNotNullExpressionValue(document, "parse(...)");
            document.getDocumentElement().normalize();
            if (c0.testNodeCompletion(document) == 0) {
                return p0.arrayListOf(c(document, "CLASSEMENT_PRECEDENT"), c(document, "CLASSEMENT_ACTUEL"));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getADRESSE_CLASSEMENT() {
        return "classement.akinator.com";
    }

    public final ArrayList<c> call(int i10) throws SAXException, IOException {
        String idJoueur;
        String rawResponse;
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        int baseLogiqueId = currentInstance.getBaseLogiqueId();
        if (baseLogiqueId > 0) {
            if (ca.m.sharedInstance().isUserConnected()) {
                idJoueur = r.sharedInstance().getIdJoueurAccount();
            } else {
                idJoueur = r.sharedInstance().getIdJoueur();
            }
            String str = idJoueur;
            String deviceId = jb.c.f69226m.sharedInstance().getDeviceId();
            boolean zIsChildProtectEnabled = ca.m.sharedInstance().isChildProtectEnabled();
            e0.checkNotNull(str);
            b bVar = new b(baseLogiqueId, i10, str, deviceId, zIsChildProtectEnabled);
            if (bVar.call() == 0 && (rawResponse = bVar.getRawResponse()) != null) {
                try {
                    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(rawResponse)));
                    e0.checkNotNullExpressionValue(document, "parse(...)");
                    c cVarC = c(document, "RESULT");
                    if (i10 == 0) {
                        return p0.arrayListOf(cVarC, cVarC);
                    }
                    return p0.arrayListOf(null, cVarC);
                } catch (Exception e10) {
                    Timber.Forest.tag("LoadClassement").e(e10, "Unable to read get_classement XML", new Object[0]);
                }
            }
        }
        return null;
    }
}
