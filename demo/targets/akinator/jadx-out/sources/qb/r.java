package qb;

import com.ironsource.C3352n2;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import lb.e;
import lb.s0;
import lb.z0;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import timber.log.Timber;
import uu.j1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends z {
    public s0 A;

    /* renamed from: o, reason: collision with root package name */
    public String f82709o;

    /* renamed from: p, reason: collision with root package name */
    public String f82710p;

    /* renamed from: q, reason: collision with root package name */
    public String f82711q;

    /* renamed from: r, reason: collision with root package name */
    public String f82712r;

    /* renamed from: s, reason: collision with root package name */
    public String f82713s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f82714t;

    /* renamed from: u, reason: collision with root package name */
    public lb.c f82715u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f82716v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f82717w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f82718x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f82719y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f82720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lb.c instance, String baseUrlWs, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Map<String, String> map, String str) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseUrlWs, "baseUrlWs");
        this.f82709o = "";
        this.f82710p = "";
        this.f82711q = "";
        this.f82712r = "";
        this.f82713s = "";
        this.f82714t = new ArrayList();
        this.f82716v = new ArrayList();
        a(instance, baseUrlWs, z12, z13, z14, map, str);
    }

    public final void a(lb.c cVar, String str, boolean z10, boolean z11, boolean z12, Map map, String str2) {
        String playerName;
        String uid;
        s0.c settings;
        String mCountryCode;
        s0.c settings2;
        s0.c settings3;
        this.f82715u = cVar;
        this.f82731j = str;
        this.A = s0.f72971j.sharedInstance();
        this.f82718x = z10;
        this.f82719y = z11;
        this.f82720z = z12;
        qv.m mVar = new qv.m(1, 8);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVar, 10));
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            ((j1) it).nextInt();
            arrayList.add(Character.valueOf((char) ov.g.f79860b.nextInt(97, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)));
        }
        String strJoinToString$default = y0.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        z0 z0Var = z0.getInstance();
        z0Var.f73059b = str;
        z0Var.f73058a = cVar;
        addParameter("base", "0");
        s0 s0Var = this.A;
        addParameter("partner", String.valueOf((s0Var == null || (settings3 = s0Var.getSettings()) == null) ? null : Integer.valueOf(settings3.getMPartnerId())));
        s0 s0Var2 = this.A;
        addParameter("premium", (s0Var2 == null || (settings2 = s0Var2.getSettings()) == null || !settings2.getMPremium()) ? "0" : "1");
        s0 s0Var3 = this.A;
        String str3 = "";
        if (s0Var3 == null || (playerName = s0Var3.getPlayerName()) == null) {
            playerName = "";
        }
        addParameter("player", playerName);
        s0 s0Var4 = this.A;
        if (s0Var4 == null || (uid = s0Var4.getUid()) == null) {
            uid = "";
        }
        addParameter("uid", uid);
        addParameter("do_geoloc", "1");
        addParameter("vd", "0");
        addParameter("prio", this.f82718x ? "1" : "0");
        addParameter("constraint", "ETAT<>'AV'");
        if (this.f82720z) {
            addParameter("constraint", "ETAT='EN' and flag_objets_consensuels='OK'");
        } else if (!cVar.isDisableChildFilter() && this.f82719y) {
            addParameter("soft_constraint", "ETAT='EN'");
            addParameter("question_filter", "cat=1");
        }
        addParameter("channel", "0");
        addParameter("plop", strJoinToString$default + str2);
        s0 s0Var5 = this.A;
        if (s0Var5 != null && (settings = s0Var5.getSettings()) != null && (mCountryCode = settings.getMCountryCode()) != null) {
            str3 = mCountryCode;
        }
        addParameter("origin", str3);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                addParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f82730i = "new_session.php";
    }

    public final ArrayList<e.d> getAnswers() {
        return this.f82714t;
    }

    public final String getChallengeAuth() {
        return this.f82712r;
    }

    public final String getChannel() {
        return this.f82709o;
    }

    public final String getFirstQuestion() {
        return this.f82713s;
    }

    public final ArrayList<String> getProbaAnswersToFirstQuestion() {
        return this.f82716v;
    }

    public final String getSession() {
        return this.f82710p;
    }

    public final String getSignature() {
        return this.f82711q;
    }

    public final boolean isChildProtect() {
        return this.f82719y;
    }

    public final boolean isChineseMode() {
        return this.f82720z;
    }

    public final boolean isPrio() {
        return this.f82718x;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) throws b0 {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        NodeList elementsByTagName = xmlResponse.getElementsByTagName("IDENTIFICATION");
        if (elementsByTagName.getLength() == 0) {
            throw new b0("IDENTIFICATION BLOCK NOT FOUND");
        }
        NodeList childNodes = elementsByTagName.item(0).getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node nodeItem = childNodes.item(i10);
            if (nodeItem == null) {
                throw new tu.t();
            }
            String nodeName = nodeItem.getNodeName();
            if (nodeName != null) {
                switch (nodeName.hashCode()) {
                    case -1591996810:
                        if (nodeName.equals("SESSION")) {
                            this.f82710p = nodeItem.getTextContent();
                            break;
                        } else {
                            break;
                        }
                    case -1548536796:
                        if (nodeName.equals("CHALLENGE_AUTH")) {
                            this.f82712r = nodeItem.getTextContent();
                            break;
                        } else {
                            break;
                        }
                    case -434788200:
                        if (nodeName.equals("SIGNATURE")) {
                            this.f82711q = nodeItem.getTextContent();
                            break;
                        } else {
                            break;
                        }
                    case 1456933091:
                        if (nodeName.equals("CHANNEL")) {
                            this.f82709o = nodeItem.getTextContent();
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        ArrayList<e.d> arrayList = this.f82714t;
        this.f82713s = parseWSQuestionAnswers(xmlResponse, arrayList);
        ArrayList<Float> wSTrouvitudes = parseWSTrouvitudes(xmlResponse);
        Timber.Forest.tag("QuestionActivity").d("firstQuestion=" + this.f82713s + " firstTrouvitudes=" + wSTrouvitudes, new Object[0]);
        ArrayList<String> arrayList2 = this.f82716v;
        arrayList2.clear();
        ArrayList<String> wSProbaAnswers = parseWSProbaAnswers(xmlResponse);
        if (wSProbaAnswers != null) {
            arrayList2.addAll(wSProbaAnswers);
            this.f82717w = true;
        }
        lb.c cVar = this.f82715u;
        if (cVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(C3352n2.f37922p);
            cVar = null;
        }
        String str = this.f82731j;
        kotlin.jvm.internal.e0.checkNotNull(str);
        lb.e eVar = new lb.e(cVar, str, this.f82709o, this.f82710p, this.f82711q, this.f82712r, isPrio(), isChildProtect(), isChineseMode(), this.f82717w);
        eVar.setActive(true);
        eVar.updateSessionState(this.f82713s, arrayList, 0, 0.0f, wSTrouvitudes, null);
        if (this.f82717w) {
            eVar.updateSessionReverseMode(arrayList2);
        }
        this.f82729h = eVar;
    }

    @Override // qb.z
    public void parseWsResponseWithWarning(Document xmlResponse, int i10) throws b0 {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
        parseAkWSResponse(xmlResponse);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lb.c instance, String baseUrlWs, boolean z10, boolean z11, boolean z12, boolean z13, Map<String, String> map, String str) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(baseUrlWs, "baseUrlWs");
        this.f82709o = "";
        this.f82710p = "";
        this.f82711q = "";
        this.f82712r = "";
        this.f82713s = "";
        this.f82714t = new ArrayList();
        this.f82716v = new ArrayList();
        a(instance, baseUrlWs, z12, z13, false, map, str);
    }
}
