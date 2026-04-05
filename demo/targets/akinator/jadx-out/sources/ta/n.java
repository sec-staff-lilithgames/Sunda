package ta;

import ca.r;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.internal.e0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import qb.c0;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f86685h = 20000;

    /* renamed from: i, reason: collision with root package name */
    public final String f86686i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f86687j;

    public n(String str, boolean z10) {
        this.f86687j = z10;
        this.f86686i = str;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return this.f86685h;
    }

    @Override // qb.d0
    public String getMUrl() {
        return this.f86686i;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, DOMException, IOException {
        NodeList elementsByTagName;
        e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            document.getDocumentElement().normalize();
            int iTestNodeCompletion = c0.testNodeCompletion(document);
            if (iTestNodeCompletion == 0) {
                boolean z10 = this.f86687j;
                if ((z10 ? e0.areEqual(r.sharedInstance().getIdJoueurAccount(), "none") : e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) && (elementsByTagName = document.getElementsByTagName("JOUEUR_ID")) != null && elementsByTagName.getLength() == 1) {
                    String textContent = elementsByTagName.item(0).getTextContent();
                    if (z10) {
                        r.sharedInstance().setIdJoueurAccount(textContent);
                    } else {
                        r.sharedInstance().setIdJoueur(textContent);
                    }
                }
                NodeList elementsByTagName2 = document.getElementsByTagName("CLASSEMENT_ID");
                if (elementsByTagName2 != null && elementsByTagName2.getLength() == 1) {
                    ca.m.sharedInstance().updateLastClassementScore(elementsByTagName2.item(0).getTextContent());
                }
                NodeList elementsByTagName3 = document.getElementsByTagName("TRAP");
                if (elementsByTagName3 != null && elementsByTagName3.getLength() == 1) {
                    String textContent2 = elementsByTagName3.item(0).getTextContent();
                    e0.checkNotNull(textContent2);
                    ca.m.sharedInstance().setPlayerTrappable(Integer.parseInt(textContent2) == 1);
                }
            }
            return iTestNodeCompletion;
        } catch (Exception unused) {
            return 400;
        }
    }
}
