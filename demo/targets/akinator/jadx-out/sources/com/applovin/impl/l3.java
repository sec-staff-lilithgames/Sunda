package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b0;
import com.applovin.impl.b3;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x6;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l3 extends p2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f14304e;

    /* renamed from: f, reason: collision with root package name */
    private List f14305f;

    /* renamed from: g, reason: collision with root package name */
    private List f14306g;

    /* renamed from: h, reason: collision with root package name */
    private List f14307h;

    /* renamed from: i, reason: collision with root package name */
    private List f14308i;

    /* renamed from: j, reason: collision with root package name */
    private String f14309j;

    /* renamed from: k, reason: collision with root package name */
    private String f14310k;

    /* renamed from: l, reason: collision with root package name */
    private String f14311l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14312m;

    /* renamed from: n, reason: collision with root package name */
    private final StringBuilder f14313n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f14314o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14315p;

    /* renamed from: q, reason: collision with root package name */
    private List f14316q;

    /* renamed from: r, reason: collision with root package name */
    private List f14317r;

    /* renamed from: s, reason: collision with root package name */
    private List f14318s;

    /* renamed from: t, reason: collision with root package name */
    private List f14319t;

    /* renamed from: u, reason: collision with root package name */
    private List f14320u;

    /* renamed from: v, reason: collision with root package name */
    private List f14321v;

    /* renamed from: w, reason: collision with root package name */
    private List f14322w;

    /* renamed from: x, reason: collision with root package name */
    private List f14323x;

    /* renamed from: y, reason: collision with root package name */
    private List f14324y;

    /* renamed from: z, reason: collision with root package name */
    private List f14325z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14326a;

        static {
            int[] iArr = new int[b0.b.values().length];
            f14326a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14326a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14326a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14326a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14326a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        MICRO_SDK_PARTNER_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public l3(Context context) {
        super(context);
        this.f14313n = new StringBuilder("");
        this.f14314o = new AtomicBoolean();
        this.f14316q = new ArrayList();
        this.f14317r = new ArrayList();
        this.f14318s = new ArrayList();
        this.f14319t = new ArrayList();
        this.f14320u = new ArrayList();
        this.f14321v = new ArrayList();
        this.f14322w = new ArrayList();
        this.f14323x = new ArrayList();
        this.f14324y = new ArrayList();
        this.f14325z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    private List g() {
        boolean zC = this.f14304e.t0().c();
        List listB = this.f14304e.t0().b();
        return zC ? a((String) null, a(listB, false)) : a(a(listB, true), (String) null);
    }

    private List j() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f15022a.getPackageManager().getPackageInfo(this.f15022a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(o2.a().d("Package Name").c(this.f15022a.getPackageName()).a());
        o2.b bVarD = o2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(o2.a().d("OS").c(k7.d()).a());
        arrayList.add(o2.a().d("Account").c(StringUtils.isValidString(this.f14311l) ? this.f14311l : "None").a());
        arrayList.add(o2.a().d("Mediation Provider").c(StringUtils.isValidString(this.f14304e.V()) ? this.f14304e.V() : "None").a());
        arrayList.add(o2.a().d("OM SDK Version").c(this.f14304e.e0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.G0()));
        return arrayList;
    }

    private o2 l() {
        String strD = this.f14304e.s0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f14304e.s0().j());
        o2.b bVarD = o2.a(o2.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        o2.b bVarC = bVarD.c(strD);
        if (this.f14312m) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f15022a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z10 = this.f14304e.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f15022a));
            }
        }
        return bVarC.a();
    }

    private o2 m() {
        return o2.a().d("MAX Terms and Privacy Policy Flow").a(this.f15022a).a(true).a();
    }

    private o2 n() {
        boolean zHasSupportedCmp = this.f14304e.t().hasSupportedCmp();
        return o2.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f15022a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(o2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f14304e.a(v4.I3);
        o2.b bVarD = o2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(e());
        if (this.f14304e.I0()) {
            String strA = k7.a(this.f14304e.o0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(strA) ? strA : "None"));
        }
        if (this.f14304e.y().j()) {
            arrayList.add(m());
            arrayList.add(n());
            return arrayList;
        }
        if (this.f14304e.y().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private o2 r() {
        return o2.a().d("Network Consent Statuses").a(this.f15022a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.f14304e.s0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new p4(p0.b(), false, this.f15022a));
        }
        arrayList.add(new p4(p0.a(), true, this.f15022a));
        return arrayList;
    }

    private o2 u() {
        return o2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f15022a)).b("Terms Flow has been replaced").a(this.f14304e.y().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        sb2.append("\nDev Build - " + k7.c(this.f14304e));
        sb2.append("\nTest Mode - ".concat(this.f14304e.t0().c() ? "enabled" : Y1.f35725e));
        sb2.append("\nTarget SDK - " + this.f14304e.B().E().get("target_sdk"));
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f14304e.a(v4.I3);
        String strB = j.b();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb2.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb2.append(sb4.toString());
        if (this.f14304e.I0()) {
            String strA = k7.a(this.f14304e.o0());
            StringBuilder sb5 = new StringBuilder("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(strA) ? strA : "None");
            sb2.append(sb5.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(p0.a(this.f15022a));
        sb2.append(this.f14304e.y().e());
        sb2.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb2.append(this.f14304e.s0().i());
        sb2.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb2.append(((x6) it.next()).e());
        }
        sb2.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f14317r.iterator();
        while (it2.hasNext()) {
            a(sb2, ((b3) it2.next()).j());
        }
        Iterator it3 = this.f14318s.iterator();
        while (it3.hasNext()) {
            a(sb2, ((b3) it3.next()).j());
        }
        Iterator it4 = this.f14316q.iterator();
        while (it4.hasNext()) {
            a(sb2, ((b3) it4.next()).j());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator it5 = this.f14306g.iterator();
        while (it5.hasNext()) {
            a(sb2, ((n) it5.next()).e());
        }
        sb2.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb2.toString());
        this.f14313n.append(sb2.toString());
    }

    public boolean a(o2 o2Var) {
        if (o2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(o2Var.k().toString());
    }

    public void b(boolean z10) {
        this.f14315p = z10;
    }

    @Override // com.applovin.impl.p2
    public List c(int i10) {
        return i10 == e.APP_INFO.ordinal() ? this.f14323x : i10 == e.MAX.ordinal() ? this.f14324y : i10 == e.PRIVACY.ordinal() ? this.f14325z : i10 == e.ADS.ordinal() ? this.A : i10 == e.INCOMPLETE_NETWORKS.ordinal() ? this.B : i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? this.C : i10 == e.COMPLETED_NETWORKS.ordinal() ? this.D : this.E;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14305f.iterator();
        while (it.hasNext()) {
            arrayList.add(((b3) it.next()).t());
        }
        String strK = this.f14304e.s0().k();
        if (strK != null) {
            String strC = this.f14304e.s0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                x6 x6Var = (x6) it2.next();
                if (x6Var.f() == x6.a.TCF_VENDOR && x6Var.d() != null) {
                    x6Var.a(Boolean.valueOf(z6.a(strK, x6Var.d().intValue() - 1)));
                } else if (x6Var.f() == x6.a.ATP_NETWORK && x6Var.d() != null) {
                    x6Var.a(z6.a(x6Var.d().intValue(), strC));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((x6) it3.next()).a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.p2
    public o2 e(int i10) {
        return i10 == e.APP_INFO.ordinal() ? new t4("APP INFO") : i10 == e.MAX.ordinal() ? new t4("MAX") : i10 == e.PRIVACY.ordinal() ? new t4("PRIVACY") : i10 == e.ADS.ordinal() ? new t4("ADS") : i10 == e.INCOMPLETE_NETWORKS.ordinal() ? new t4("INCOMPLETE SDK INTEGRATIONS") : i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal() ? new t4("APPLOVIN MICRO SDK PARTNERS") : i10 == e.COMPLETED_NETWORKS.ordinal() ? new t4("COMPLETED SDK INTEGRATIONS") : new t4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.f14306g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f14310k;
    }

    public String i() {
        return this.f14309j;
    }

    public List k() {
        return this.f14320u;
    }

    public List o() {
        return this.f14307h;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f14325z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.f14316q);
            this.C = a(this.f14317r);
            this.D = a(this.f14318s);
            c();
            return;
        }
        if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.f14313n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.f14304e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f14314o.get() + "}";
    }

    public List v() {
        return this.f14322w;
    }

    public List w() {
        return this.f14321v;
    }

    public boolean x() {
        return this.f14315p;
    }

    public boolean y() {
        return this.f14314o.get();
    }

    @Override // com.applovin.impl.p2
    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o oVarF = ((n) it.next()).f();
            Iterator it2 = oVarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((f8) it2.next()).b());
            }
            Iterator it3 = oVarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((f8) it3.next()).b());
            }
        }
        this.f14320u = new ArrayList(hashSet);
        this.f14321v = new ArrayList(hashSet2);
        Collections.sort(this.f14320u);
        Collections.sort(this.f14321v);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z10, com.applovin.impl.sdk.k kVar) {
        this.f14304e = kVar;
        this.f14305f = list;
        this.f14306g = list2;
        this.f14307h = list3;
        this.f14308i = list4;
        this.f14309j = str;
        this.f14310k = str2;
        this.f14311l = str3;
        this.f14312m = z10;
        if (list != null && this.f14314o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.f14318s);
            this.f14323x.addAll(j());
            this.f14324y.addAll(q());
            this.f14325z.addAll(s());
            this.A.addAll(g());
            this.B = a(this.f14316q);
            this.C = a(this.f14317r);
            this.D = a(this.f14318s);
            this.E = a(this.f14319t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f15022a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new m9(this, 10));
    }

    @Override // com.applovin.impl.p2
    public int d(int i10) {
        if (i10 == e.APP_INFO.ordinal()) {
            return this.f14323x.size();
        }
        if (i10 == e.MAX.ordinal()) {
            return this.f14324y.size();
        }
        if (i10 == e.PRIVACY.ordinal()) {
            return this.f14325z.size();
        }
        if (i10 == e.ADS.ordinal()) {
            return this.A.size();
        }
        if (i10 == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i10 == e.MICRO_SDK_PARTNER_NETWORKS.ordinal()) {
            return this.C.size();
        }
        if (i10 == e.COMPLETED_NETWORKS.ordinal()) {
            return this.D.size();
        }
        return this.E.size();
    }

    private o2 b(String str, String str2) {
        o2.b bVarD = o2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(m0.a(R.color.applovin_sdk_xmarkColor, this.f15022a));
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3 b3Var = (b3) it.next();
            if (!b3Var.H()) {
                if (b3Var.q() != b3.a.INCOMPLETE_INTEGRATION && b3Var.q() != b3.a.INVALID_INTEGRATION) {
                    if (b3Var.q() == b3.a.COMPLETE) {
                        if (b3Var.z()) {
                            this.f14317r.add(b3Var);
                        } else {
                            this.f14318s.add(b3Var);
                        }
                    } else if (b3Var.q() == b3.a.MISSING) {
                        this.f14319t.add(b3Var);
                    }
                } else if (b3Var.z()) {
                    this.f14317r.add(b3Var);
                } else {
                    this.f14316q.add(b3Var);
                }
            }
        }
    }

    private o2 e() {
        String strO;
        o2.b bVarD = o2.a().d("Ad Review Version");
        String strB = j.b();
        if (StringUtils.isValidString(strB)) {
            String strA = j.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f14304e.j0())) {
                strO = null;
            } else {
                strO = j1.o2.o(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f14304e.I0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
        } else {
            strO = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (strO != null) {
            bVarD.b("MAX Ad Review").a(strO).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.f15022a)).a(true);
        } else {
            bVarD.c(strB);
        }
        return bVarD.a();
    }

    private o2 b(String str) {
        o2.b bVarA = o2.a();
        if (this.f14304e.t0().c()) {
            bVarA.a(this.f15022a);
        }
        o2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f14304e.t0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3 b3Var = (b3) it.next();
            if (b3Var.y() == b3.b.READY) {
                this.f14322w.add(b3Var);
            }
        }
    }

    @Override // com.applovin.impl.b0.a
    public void a(z zVar, String str) {
        String strA;
        c cVarA;
        c cVar;
        String strL;
        List<a0> listA = b0.a(zVar, this.f14308i);
        if (listA.isEmpty()) {
            strL = a.b.l("All required entries found at ", str, ".");
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : listA) {
                this.f14304e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = this.f14304e.O();
                    StringBuilder sbT = a.b.t(str, " is missing a required entry: ");
                    sbT.append(a0Var2.d());
                    oVarO.b("MediationDebuggerListAdapter", sbT.toString());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, a0Var.d());
                cVarA = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str2 = strA;
            cVar = cVarA;
            strL = str2;
        }
        this.f14324y.add(a(strL, cVar));
        c();
    }

    @Override // com.applovin.impl.b0.a
    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.f14304e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f14304e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.f14324y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (str.length() + string.length() >= ((Integer) this.f14304e.a(v4.f16015r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", string);
            this.f14313n.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(o2.a().d("View Ad Units (" + this.f14306g.size() + ")").a(this.f15022a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f14307h.isEmpty()) {
            arrayList.add(o2.a().d("Selective Init Ad Units (" + this.f14307h.size() + ")").a(this.f15022a).a(true).a());
        }
        arrayList.add(o2.a().d("Test Mode Enabled").c(String.valueOf(this.f14304e.t0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new w3((b3) it.next(), this.f15022a));
        }
        return arrayList;
    }

    private o2 a(String str) {
        o2.b bVarA = o2.a();
        if (!this.f14304e.t0().c()) {
            bVarA.a(this.f15022a);
        }
        o2.b bVarD = bVarA.d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f14304e.t0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private o2 a(boolean z10) {
        return o2.a().d("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f15022a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z10).a();
    }

    private o2 a(String str, c cVar) {
        int i10;
        int iA;
        if (cVar == c.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            iA = m0.a(R.color.applovin_sdk_checkmarkColor, this.f15022a);
        } else if (cVar == c.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            iA = m0.a(R.color.applovin_sdk_warningColor, this.f15022a);
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            iA = m0.a(R.color.applovin_sdk_xmarkColor, this.f15022a);
        }
        return o2.a().d("app-ads.txt").a(i10).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = a.f14326a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i10 == 3) {
            return a.b.l("Unable to find app-ads.txt file or parse entries of the file at ", str, ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i10 == 4) {
            return e3.g.l("Text file at ", str, " is missing the required AppLovin line:\n\n", str2, "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
        }
        if (i10 != 5) {
            return "";
        }
        return a.b.l("Text file at ", str, " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private c a(b0.b bVar) {
        int i10 = a.f14326a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return c.ERROR;
        }
        if (i10 != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z10) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z10) {
            for (r2 r2Var : this.f14320u) {
                if (list.equals(r2Var.b())) {
                    return r2Var.a();
                }
            }
            for (r2 r2Var2 : this.f14321v) {
                if (list.equals(r2Var2.b())) {
                    return r2Var2.a();
                }
            }
        } else {
            for (b3 b3Var : this.f14322w) {
                if (list.equals(b3Var.u())) {
                    return b3Var.g();
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        return sb2.toString();
    }
}
