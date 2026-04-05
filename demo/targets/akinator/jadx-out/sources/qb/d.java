package qb;

import android.util.Base64;
import com.ironsource.Y1;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lb.e;
import lb.s0;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends z {

    /* renamed from: o, reason: collision with root package name */
    public final int f82662o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f82663p;

    /* renamed from: q, reason: collision with root package name */
    public String f82664q;

    /* renamed from: r, reason: collision with root package name */
    public String f82665r;

    /* renamed from: s, reason: collision with root package name */
    public String f82666s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f82667t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f82668u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f82669v;

    public /* synthetic */ d(lb.e eVar, int i10, HashMap map, int i11, kotlin.jvm.internal.u uVar) {
        this(eVar, i10, (i11 & 4) != 0 ? null : map);
    }

    public final ArrayList<e.d> getAnswers() {
        return this.f82663p;
    }

    public final HashMap<String, String> getExtra() {
        return this.f82669v;
    }

    @Override // qb.z, qb.d0
    public int getMTimeout() {
        return this.f82662o;
    }

    public final ArrayList<String> getProbaAnswers() {
        return this.f82667t;
    }

    public final float getProgression() {
        try {
            String str = this.f82665r;
            if (str != null) {
                return Float.parseFloat(str);
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final String getQuestion() {
        return this.f82664q;
    }

    public final int getStep() {
        try {
            String str = this.f82666s;
            if (str != null) {
                return Integer.parseInt(str);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final ArrayList<Float> getTrouvitudes() {
        return this.f82668u;
    }

    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws DOMException {
        HashMap map;
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        Timber.Forest.tag("Webservice").d("parseWSResponse AkAnswerWS", new Object[0]);
        this.f82666s = parseWSStep(xmlResponse);
        this.f82665r = parseWSProgression(xmlResponse);
        this.f82664q = parseWSQuestionAnswers(xmlResponse, this.f82663p);
        this.f82668u = parseWSTrouvitudes(xmlResponse);
        lb.e mSession = getMSession();
        if (mSession != null ? mSession.isReverseModeActivited() : false) {
            this.f82667t = parseWSProbaAnswers(xmlResponse);
        }
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("OPTIONS");
        if (elementsByTagName.getLength() == 1) {
            map = new HashMap();
            NodeList childNodes = elementsByTagName.item(0).getChildNodes();
            int length = childNodes.getLength();
            for (int i10 = 0; i10 < length; i10++) {
                Node nodeItem = childNodes.item(i10);
                String nodeName = nodeItem.getNodeName();
                kotlin.jvm.internal.e0.checkNotNull(nodeName);
                if (nodeName.length() > 0) {
                    String textContent = nodeItem.getTextContent();
                    kotlin.jvm.internal.e0.checkNotNull(textContent);
                    if (textContent.length() > 0) {
                        map.put(nodeName, textContent);
                    }
                }
            }
        } else {
            map = null;
        }
        this.f82669v = map;
        Timber.Tree treeTag = Timber.Forest.tag("Webservice");
        StringBuilder sb2 = new StringBuilder("Parsed: step=");
        sb2.append(this.f82666s);
        sb2.append(" progression=");
        sb2.append(this.f82665r);
        sb2.append(" trouvitudesSize=");
        ArrayList arrayList = this.f82668u;
        sb2.append(arrayList != null ? Integer.valueOf(arrayList.size()) : null);
        sb2.append(" trouvitudes=");
        sb2.append(this.f82668u);
        treeTag.d(sb2.toString(), new Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(lb.e session, int i10, HashMap<String, String> map) throws NoSuchAlgorithmException {
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82662o = z.f82725k.getTIMEOUT_DEFAULT_ANSWERS();
        this.f82663p = new ArrayList();
        Timber.Forest.tag("Webservice").d("init AkAnswerWS", new Object[0]);
        this.f82730i = "answer.php";
        addParameter("base", "0");
        addParameter("channel", session.getChannel());
        addParameter("session", session.getSession());
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, session.getSignature());
        if (i10 == -1) {
            addParameter("step", Y1.f35726f);
        } else {
            e.i currentSessionProgression = session.getCurrentSessionProgression();
            kotlin.jvm.internal.e0.checkNotNull(currentSessionProgression);
            addParameter("step", String.valueOf(currentSessionProgression.getStep()));
        }
        if (session.isChildProtected()) {
            addParameter("question_filter", "cat=1");
        }
        addParameter("answer", String.valueOf(i10));
        if (i10 != -1) {
            e.i currentSessionProgression2 = session.getCurrentSessionProgression();
            kotlin.jvm.internal.e0.checkNotNull(currentSessionProgression2);
            if (currentSessionProgression2.getStep() == 0 && session.getChallengeAuth().length() > 0) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    String str = s0.f72971j.sharedInstance().getSettings().getMPartnerAuthKey() + session.getChallengeAuth();
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    byte[] bytes = str.getBytes(UTF_8);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    addParameter("reponse_challenge", Base64.encodeToString(messageDigest.digest(bytes), 2));
                } catch (NoSuchAlgorithmException e10) {
                    Timber.Forest.tag("ElokAPI_Auth").e(e10, "Phone unable to hash", new Object[0]);
                }
            }
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                addParameter(entry.getKey(), entry.getValue());
            }
        }
    }
}
