package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import lb.e;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sv.i0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends z {

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f82677o;

    /* renamed from: p, reason: collision with root package name */
    public String f82678p;

    /* renamed from: q, reason: collision with root package name */
    public String f82679q;

    /* renamed from: r, reason: collision with root package name */
    public String f82680r;

    /* renamed from: s, reason: collision with root package name */
    public HashMap f82681s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f82682t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lb.e session) {
        e.i currentSessionProgression;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82677o = new ArrayList();
        this.f82730i = "cancel_answer.php";
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
    }

    public final ArrayList<e.d> getAnswers() {
        return this.f82677o;
    }

    public final HashMap<String, String> getExtra() {
        return this.f82681s;
    }

    public final float getProgression() {
        try {
            String str = this.f82679q;
            if (str != null) {
                return Float.parseFloat(str);
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final String getQuestion() {
        return this.f82678p;
    }

    public final int getStep() {
        try {
            String str = this.f82680r;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final ArrayList<Float> getTrouvitudes() {
        try {
            return this.f82682t;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        HashMap map;
        String textContent;
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        this.f82680r = parseWSStep(xmlResponse);
        this.f82679q = parseWSProgression(xmlResponse);
        this.f82678p = parseWSQuestionAnswers(xmlResponse, this.f82677o);
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("OPTIONS");
        ArrayList arrayList = null;
        if (elementsByTagName.getLength() == 1) {
            map = new HashMap();
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                Node nodeItem = childNodes.item(i10);
                String nodeName = nodeItem.getNodeName();
                kotlin.jvm.internal.e0.checkNotNull(nodeName);
                if (nodeName.length() > 0 && (textContent = nodeItem.getTextContent()) != null && textContent.length() != 0) {
                    map.put(nodeName, textContent);
                }
            }
        } else {
            map = null;
        }
        this.f82681s = map;
        NodeList elementsByTagName2 = xmlResponse.getElementsByTagName("TROUVITUDES_REPONSES");
        if (elementsByTagName2.getLength() != 0) {
            NodeList childNodes2 = elementsByTagName2.item(0).getChildNodes();
            ArrayList arrayList2 = new ArrayList();
            int length2 = childNodes2.getLength();
            for (int i11 = 0; i11 < length2; i11++) {
                Node nodeItem2 = childNodes2.item(i11);
                if (kotlin.jvm.internal.e0.areEqual(nodeItem2.getNodeName(), "REPONSE")) {
                    String textContent2 = nodeItem2.getTextContent();
                    String string = textContent2 != null ? n0.trim(textContent2).toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    Float floatOrNull = i0.toFloatOrNull(string);
                    if (floatOrNull != null) {
                        arrayList2.add(floatOrNull);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        this.f82682t = arrayList;
    }
}
