package qb;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import lb.e;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import sv.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class z extends d0 {

    /* renamed from: k, reason: collision with root package name */
    public static final a f82725k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static int f82726l = 7000;

    /* renamed from: m, reason: collision with root package name */
    public static int f82727m = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;

    /* renamed from: n, reason: collision with root package name */
    public static int f82728n = 10000;

    /* renamed from: h, reason: collision with root package name */
    public lb.e f82729h;

    /* renamed from: i, reason: collision with root package name */
    public String f82730i;

    /* renamed from: j, reason: collision with root package name */
    public String f82731j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final int getTIMEOUT_COURT() {
            return z.f82727m;
        }

        public final int getTIMEOUT_DEFAULT_ANSWERS() {
            return z.f82728n;
        }

        public final int getTIMEOUT_LONG() {
            return z.f82726l;
        }

        public final void setTIMEOUT_COURT(int i10) {
            z.f82727m = i10;
        }

        public final void setTIMEOUT_DEFAULT_ANSWERS(int i10) {
            z.f82728n = i10;
        }

        public final void setTIMEOUT_LONG(int i10) {
            z.f82726l = i10;
        }
    }

    public z(lb.e eVar) {
        new ArrayList();
        this.f82729h = eVar;
        this.f82731j = eVar != null ? eVar.getBaseUrlWS() : null;
    }

    public final lb.e getMSession() {
        return this.f82729h;
    }

    @Override // qb.d0
    public int getMTimeout() {
        return f82726l;
    }

    @Override // qb.d0
    public String getMUrl() {
        return this.f82731j + '/' + this.f82730i;
    }

    public abstract void parseAkWSResponse(Document document);

    public final ArrayList<String> parseWSProbaAnswers(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        ArrayList<String> arrayList = new ArrayList<>();
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("PROBA_ANSWER");
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(elementsByTagName.item(i10).getTextContent());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String parseWSProgression(Document xmlResponse) throws DOMException, b0 {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("PROGRESSION");
        if (elementsByTagName.getLength() == 0) {
            throw new b0("PROGRESSION NOT FOUND");
        }
        String textContent = elementsByTagName.item(0).getTextContent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
        return textContent;
    }

    public final String parseWSQuestionAnswers(Document xmlResponse, ArrayList<e.d> retour) throws DOMException, b0 {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(retour, "retour");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("ANSWER");
        if (elementsByTagName.getLength() == 0) {
            throw new b0("NONE ANSWER FOUND");
        }
        int length = elementsByTagName.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            retour.add(new e.d(i10, elementsByTagName.item(i10).getTextContent()));
        }
        NodeList elementsByTagName2 = xmlResponse.getElementsByTagName("QUESTION");
        if (elementsByTagName2.getLength() == 0) {
            throw new b0("QUESTION NOT FOUND");
        }
        String textContent = elementsByTagName2.item(0).getTextContent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
        return textContent;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws SAXException, IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(response)));
            int iTestNodeCompletion = c0.testNodeCompletion(document);
            if (iTestNodeCompletion == 0 || iTestNodeCompletion == 800) {
                kotlin.jvm.internal.e0.checkNotNull(document);
                parseAkWSResponse(document);
            }
            lb.e eVar = this.f82729h;
            if (eVar != null) {
                eVar.handleWSCallCompleted$limuleapi_release(this);
            }
            return iTestNodeCompletion;
        } catch (Exception unused) {
            return 400;
        }
    }

    public final String parseWSStep(Document xmlResponse) throws DOMException, b0 {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("STEP");
        if (elementsByTagName.getLength() == 0) {
            throw new b0("STEP NOT FOUND");
        }
        String textContent = elementsByTagName.item(0).getTextContent();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, "getTextContent(...)");
        return textContent;
    }

    public final ArrayList<Float> parseWSTrouvitudes(Document xmlResponse) {
        String textContent;
        Float floatOrNull;
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        ArrayList<Float> arrayList = new ArrayList<>();
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("TROUVITUDES_REPONSES");
        if (elementsByTagName.getLength() == 1) {
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                Node nodeItem = childNodes.item(i10);
                if (kotlin.jvm.internal.e0.areEqual(nodeItem.getNodeName(), "REPONSE") && (textContent = nodeItem.getTextContent()) != null && (floatOrNull = i0.toFloatOrNull(textContent)) != null) {
                    arrayList.add(Float.valueOf(floatOrNull.floatValue()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public void parseWsResponseWithWarning(Document xmlResponse, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }
}
