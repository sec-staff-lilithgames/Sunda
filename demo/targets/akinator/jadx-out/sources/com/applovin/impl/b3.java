package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final boolean G;
    private final x6 H;
    private final boolean I;
    private final String J;
    private final Map K;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13588a;

    /* renamed from: b, reason: collision with root package name */
    private final a f13589b;

    /* renamed from: c, reason: collision with root package name */
    private int f13590c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13591d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13592e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13593f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f13594g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13595h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13596i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13597j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f13598k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f13599l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f13600m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f13601n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f13602o;

    /* renamed from: p, reason: collision with root package name */
    private final String f13603p;

    /* renamed from: q, reason: collision with root package name */
    private final String f13604q;

    /* renamed from: r, reason: collision with root package name */
    private String f13605r;

    /* renamed from: s, reason: collision with root package name */
    private String f13606s;

    /* renamed from: t, reason: collision with root package name */
    private final String f13607t;

    /* renamed from: u, reason: collision with root package name */
    private final String f13608u;

    /* renamed from: v, reason: collision with root package name */
    private final String f13609v;

    /* renamed from: w, reason: collision with root package name */
    private final String f13610w;

    /* renamed from: x, reason: collision with root package name */
    private final int f13611x;

    /* renamed from: y, reason: collision with root package name */
    private final List f13612y;

    /* renamed from: z, reason: collision with root package name */
    private final List f13613z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f13619a;

        a(String str) {
            this.f13619a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f13619a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f13626a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13627b;

        /* renamed from: c, reason: collision with root package name */
        private final String f13628c;

        b(String str, int i10, String str2) {
            this.f13626a = str;
            this.f13627b = i10;
            this.f13628c = str2;
        }

        public String b() {
            return this.f13628c;
        }

        public String c() {
            return this.f13626a;
        }

        public int d() {
            return this.f13627b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:26|(4:111|27|105|28)|(6:113|29|(2:31|(4:33|(1:39)(1:36)|109|40)(0))(1:44)|103|45|46)|107|54|55|56|57|101|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0205, code lost:
    
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0208, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0209, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020c, code lost:
    
        r21.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        if (com.applovin.impl.sdk.o.a() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0215, code lost:
    
        r21.O().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x021e, code lost:
    
        r7 = r17;
        r0 = r18;
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c8  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b3(org.json.JSONObject r20, com.applovin.impl.sdk.k r21) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f13591d ? this.f13592e ? a.COMPLETE : this.f13594g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f13592e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f13613z.iterator();
        while (it.hasNext()) {
            if (!((m4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((j1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f13602o || com.applovin.impl.sdk.k.G0()) ? F() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f13592e;
    }

    public boolean B() {
        return this.f13593f;
    }

    public boolean C() {
        return this.f13595h;
    }

    public boolean D() {
        return this.I;
    }

    public boolean E() {
        return this.f13602o;
    }

    public boolean F() {
        if (!this.f13601n || !StringUtils.isValidString(this.f13606s)) {
            return false;
        }
        return !k7.d(this.f13606s).equals(k7.a(this.f13607t, this.f13606s.split("\\.").length));
    }

    public boolean G() {
        return this.f13591d;
    }

    public boolean H() {
        return this.f13589b == a.MISSING && this.f13598k;
    }

    public boolean I() {
        return this.G;
    }

    public boolean J() {
        return this.f13599l;
    }

    public boolean K() {
        return this.f13600m;
    }

    public String b() {
        return this.f13605r;
    }

    public String c() {
        return this.f13607t;
    }

    public Map d() {
        return this.K;
    }

    public String e() {
        return this.J;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f13604q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f13611x;
    }

    public int i() {
        return this.f13590c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f13603p);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f13589b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f13591d || TextUtils.isEmpty(this.f13606s)) ? "UNAVAILABLE" : this.f13606s);
        sb2.append("\nAdapter - ");
        if (this.f13592e && !TextUtils.isEmpty(this.f13607t)) {
            str = this.f13607t;
        }
        sb2.append(str);
        for (m4 m4Var : n()) {
            if (!m4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(m4Var.b());
                sb2.append(": ");
                sb2.append(m4Var.a());
            }
        }
        for (j1 j1Var : f()) {
            if (!j1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(j1Var.b());
                sb2.append(": ");
                sb2.append(j1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f13608u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f13603p;
    }

    public List n() {
        return this.f13613z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f13588a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f13605r.equals(string)) {
            this.f13590c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = t3.a(string, this.f13588a);
            if (maxAdapterA != null) {
                String strA = t3.a(maxAdapterA);
                if (this.f13606s.equals(strA)) {
                    return;
                }
                this.f13606s = strA;
                this.f13588a.u().a(this.f13606s, string);
            }
        }
    }

    public String p() {
        return this.f13606s;
    }

    public a q() {
        return this.f13589b;
    }

    public List r() {
        return this.f13612y;
    }

    public List s() {
        return this.B;
    }

    public x6 t() {
        return this.H;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f13603p);
        sb2.append(", displayName=");
        sb2.append(this.f13604q);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f13591d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f13606s);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f13592e);
        sb2.append(", adapterVersion=");
        return j1.o2.o(sb2, this.f13607t, "}");
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f13609v;
    }

    public String w() {
        return this.f13610w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f13596i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f13589b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && G() && A())) ? !this.f13588a.t0().c() ? b.DISABLED : (this.f13597j && (this.f13590c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f13590c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.F;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f13605r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            m4 m4Var = new m4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (m4Var.c()) {
                arrayList.add(m4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new m4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "dependencies");
        JSONArray jSONArrayT2 = b0.e2.t(jSONObject, "dependencies_v2");
        ArrayList arrayList = new ArrayList(jSONArrayT2.length() + jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new j1(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArrayT2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayT2, i11, (JSONObject) null);
            if (jSONObject3 != null && j1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new j1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b3 b3Var) {
        return this.f13604q.compareToIgnoreCase(b3Var.f13604q);
    }
}
