package lb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazon.device.ads.DtbConstants;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import qb.z;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f72971j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    public static s0 f72972k;

    /* renamed from: e, reason: collision with root package name */
    public Context f72977e;

    /* renamed from: g, reason: collision with root package name */
    public String f72979g;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f72973a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Object f72974b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f72975c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final c f72976d = new c();

    /* renamed from: f, reason: collision with root package name */
    public boolean f72978f = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f72980h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public long f72981i = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f72982a;

        /* renamed from: b, reason: collision with root package name */
        public final lb.a f72983b;

        public a(int i10, lb.a aVar) {
            this.f72982a = i10;
            this.f72983b = aVar;
        }

        public final lb.a getConfig() {
            return this.f72983b;
        }

        public final int getReturnCode() {
            return this.f72982a;
        }

        public final void setReturnCode(int i10) {
            this.f72982a = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final s0 sharedInstance() {
            if (s0.f72972k == null) {
                s0.f72972k = new s0(null);
            }
            s0 s0Var = s0.f72972k;
            kotlin.jvm.internal.e0.checkNotNull(s0Var);
            return s0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: f, reason: collision with root package name */
        public boolean f72989f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f72990g;

        /* renamed from: a, reason: collision with root package name */
        public String f72984a = "";

        /* renamed from: b, reason: collision with root package name */
        public int f72985b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f72986c = "";

        /* renamed from: d, reason: collision with root package name */
        public int f72987d = -1;

        /* renamed from: e, reason: collision with root package name */
        public String f72988e = "";

        /* renamed from: h, reason: collision with root package name */
        public String f72991h = "";

        /* renamed from: i, reason: collision with root package name */
        public int f72992i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f72993j = -1;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }
        }

        static {
            new a(null);
        }

        public final String getMCountryCode() {
            return this.f72991h;
        }

        public final boolean getMFast() {
            return this.f72990g;
        }

        public final int getMHauteurPhoto() {
            return this.f72992i;
        }

        public final int getMLargeurPhoto() {
            return this.f72993j;
        }

        public final String getMMediaFootprint() {
            return this.f72988e;
        }

        public final int getMMediaId() {
            return this.f72987d;
        }

        public final String getMPartnerAuthKey() {
            return this.f72986c;
        }

        public final int getMPartnerId() {
            return this.f72985b;
        }

        public final boolean getMPremium() {
            return this.f72989f;
        }

        public final String getMUid() {
            return this.f72984a;
        }

        public final void loadSettings(Context appContext) {
            kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
            SharedPreferences sharedPreferences = appContext.getSharedPreferences("SessionFactorySettings", 0);
            this.f72985b = sharedPreferences.getInt("mPartnerId", 0);
            String string = sharedPreferences.getString("mPartnerAuthKey", "");
            kotlin.jvm.internal.e0.checkNotNull(string);
            this.f72986c = string;
            this.f72987d = sharedPreferences.getInt("mMediaId", 0);
            String string2 = sharedPreferences.getString("mCountryCode", null);
            if (string2 == null) {
                string2 = "";
            }
            this.f72991h = string2;
            this.f72989f = sharedPreferences.getBoolean("mPremium", false);
            this.f72990g = sharedPreferences.getBoolean("mFast", true);
            this.f72992i = sharedPreferences.getInt("mHauteurPhoto", 640);
            this.f72993j = sharedPreferences.getInt("mLargeurPhoto", DtbConstants.DEFAULT_PLAYER_HEIGHT);
            String string3 = sharedPreferences.getString("mMediaFootprint", "");
            kotlin.jvm.internal.e0.checkNotNull(string3);
            this.f72988e = string3;
            String string4 = sharedPreferences.getString("mUid", null);
            this.f72984a = string4 != null ? string4 : "";
        }

        public final void saveSettings(Context appContext) {
            kotlin.jvm.internal.e0.checkNotNullParameter(appContext, "appContext");
            SharedPreferences.Editor editorEdit = appContext.getSharedPreferences("SessionFactorySettings", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("mUid", this.f72984a);
                editorEdit.putInt("mPartnerId", this.f72985b);
                editorEdit.putString("mPartnerAuthKey", this.f72986c);
                editorEdit.putInt("mMediaId", this.f72987d);
                editorEdit.putString("mMediaFootprint", this.f72988e);
                editorEdit.putString("mCountryCode", this.f72991h);
                editorEdit.putBoolean("mPremium", this.f72989f);
                editorEdit.putBoolean("mFast", this.f72990g);
                editorEdit.putInt("mHauteurPhoto", this.f72992i);
                editorEdit.putInt("mLargeurPhoto", this.f72993j);
                editorEdit.commit();
            }
        }

        public final void setMCountryCode(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72991h = str;
        }

        public final void setMFast(boolean z10) {
            this.f72990g = z10;
        }

        public final void setMHauteurPhoto(int i10) {
            this.f72992i = i10;
        }

        public final void setMLargeurPhoto(int i10) {
            this.f72993j = i10;
        }

        public final void setMMediaFootprint(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72988e = str;
        }

        public final void setMMediaId(int i10) {
            this.f72987d = i10;
        }

        public final void setMPartnerAuthKey(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72986c = str;
        }

        public final void setMPartnerId(int i10) {
            this.f72985b = i10;
        }

        public final void setMPremium(boolean z10) {
            this.f72989f = z10;
        }

        public final void setMUid(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f72984a = str;
        }
    }

    public s0(kotlin.jvm.internal.u uVar) {
    }

    public static final Object access$startSessionWithOptionalParamsAsync(s0 s0Var, lb.c cVar, boolean z10, boolean z11, boolean z12, Map map, zu.d dVar) {
        if (map == null) {
            s0Var.getClass();
            map = new LinkedHashMap();
        }
        return s0Var.c(cVar, z11, z12, map, z10, dVar);
    }

    public static /* synthetic */ boolean init$default(s0 s0Var, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s0Var.init(context, z10);
    }

    public static /* synthetic */ Object startSessionAsync$default(s0 s0Var, String str, int i10, boolean z10, boolean z11, boolean z12, zu.d dVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return s0Var.startSessionAsync(str, i10, z10, z11, z12, dVar);
    }

    public static /* synthetic */ Object startSessionWithOptionalParamsAsync$default(s0 s0Var, boolean z10, String str, int i10, boolean z11, boolean z12, Map map, zu.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        return s0Var.startSessionWithOptionalParamsAsync(z10, str, i10, z11, z12, map, dVar);
    }

    public static /* synthetic */ y0 startsession$default(s0 s0Var, String str, int i10, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return s0Var.startsession(str, i10, z10, z11, z12);
    }

    public final void addListener(t0 l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l9, "l");
        synchronized (this.f72973a) {
            this.f72973a.add(l9);
        }
    }

    public final void b(int i10) {
        synchronized (this.f72973a) {
            Iterator it = this.f72973a.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                ((t0) next).onWebServiceReload(i10);
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:32:0x0114, B:35:0x011a], limit reached: 37 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00de -> B:21:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(lb.c r27, boolean r28, boolean r29, java.util.Map r30, boolean r31, zu.d r32) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.s0.c(lb.c, boolean, boolean, java.util.Map, boolean, zu.d):java.lang.Object");
    }

    public final a callCMDB(String serviceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceId, "serviceId");
        return (a) BuildersKt__BuildersKt.runBlocking$default(null, new u0(this, serviceId, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object callCMDBAsync(java.lang.String r6, zu.d<? super lb.s0.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lb.v0
            if (r0 == 0) goto L13
            r0 = r7
            lb.v0 r0 = (lb.v0) r0
            int r1 = r0.f73013l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73013l = r1
            goto L18
        L13:
            lb.v0 r0 = new lb.v0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f73011j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73013l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qb.n r6 = r0.f73010i
            tu.a0.throwOnFailure(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            tu.a0.throwOnFailure(r7)
            qb.n r7 = new qb.n
            r7.<init>(r6)
            r0.f73010i = r7
            r0.f73013l = r3
            java.lang.Object r6 = r7.callAsync(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r4 = r7
            r7 = r6
            r6 = r4
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L56
            lb.a r6 = r6.getConfig()
            goto L57
        L56:
            r6 = 0
        L57:
            lb.s0$a r0 = new lb.s0$a
            r0.<init>(r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.s0.callCMDBAsync(java.lang.String, zu.d):java.lang.Object");
    }

    @tu.f
    public final int createSessionFactory(String pUid, int i10, String pPartnerAuthKey, int i11, String pMediaFootprint, boolean z10, boolean z11, int i12, int i13, String countryCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pUid, "pUid");
        kotlin.jvm.internal.e0.checkNotNullParameter(pPartnerAuthKey, "pPartnerAuthKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(pMediaFootprint, "pMediaFootprint");
        kotlin.jvm.internal.e0.checkNotNullParameter(countryCode, "countryCode");
        this.f72978f = true;
        setGlobalParameters(pUid, i10, pPartnerAuthKey, i11, pMediaFootprint, z10, z11, i12, i13, countryCode);
        return d(true);
    }

    public final int d(boolean z10) {
        NetworkInfo activeNetworkInfo;
        synchronized (this.f72975c) {
            Timber.Forest forest = Timber.Forest;
            forest.tag("SessionFactory").d("WSC call initiated (force = " + z10, new Object[0]);
            if (this.f72977e == null) {
                forest.tag("SessionFactory").e("WSC call : AppContext is null", new Object[0]);
                return -1;
            }
            if (!z10 && System.currentTimeMillis() - this.f72981i < 300000) {
                forest.tag("SessionFactory").w("WSC call : too soon ( %s s)", Long.valueOf((System.currentTimeMillis() - this.f72981i) / 1000));
                return -4;
            }
            Context context = this.f72977e;
            kotlin.jvm.internal.e0.checkNotNull(context);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                forest.tag("SessionFactory").e("WSC call : Offline", new Object[0]);
                return -1;
            }
            if (!z10 && !this.f72978f) {
                forest.tag("SessionFactory").w("WSC call : App in background", new Object[0]);
                return -2;
            }
            String strTryToConnectWithLoadBalancing = a1.TryToConnectWithLoadBalancing(sv.k0.replace$default(sv.k0.replace$default(sv.k0.replace$default("https://lb.elokence.com/ws/instances_v3.php?media_id=<media>&footprint=<footprint>&code_pays=<country>&mode=https", "<media>", String.valueOf(this.f72976d.getMMediaId()), false, 4, (Object) null), "<footprint>", this.f72976d.getMMediaFootprint(), false, 4, (Object) null), "<country>", this.f72976d.getMCountryCode(), false, 4, (Object) null), 10000);
            if (strTryToConnectWithLoadBalancing == null) {
                forest.tag("SessionFactory").e("WSC call : failed to return instances", new Object[0]);
                return -1;
            }
            forest.tag("SessionFactory").d(strTryToConnectWithLoadBalancing, new Object[0]);
            this.f72981i = System.currentTimeMillis();
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(strTryToConnectWithLoadBalancing)));
                ArrayList arrayList = new ArrayList();
                kotlin.jvm.internal.e0.checkNotNull(document);
                int iA = a(document, arrayList);
                if (iA == 0) {
                    forest.tag("SessionFactory").d("WSC call OK", new Object[0]);
                    synchronized (this.f72974b) {
                        this.f72980h.clear();
                        this.f72980h.addAll(arrayList);
                    }
                    b(iA);
                }
                return iA;
            } catch (Exception unused) {
                Timber.Forest.tag("SessionFactory").e("WSC call : failed to parse result", new Object[0]);
                return -3;
            }
        }
    }

    public final Context getApplicationContext() {
        return this.f72977e;
    }

    public final lb.c getInstance(String langId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(langId, "langId");
        synchronized (this.f72974b) {
            Iterator it = this.f72980h.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                lb.c cVar = (lb.c) next;
                if (sv.k0.equals(cVar.f72770j, langId, true) && cVar.f72771k == i10) {
                    return cVar;
                }
            }
            return null;
        }
    }

    public final int getInstancesForLanguage(String langId, Collection<lb.c> output) {
        kotlin.jvm.internal.e0.checkNotNullParameter(langId, "langId");
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        output.clear();
        synchronized (this.f72974b) {
            Iterator it = this.f72980h.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                lb.c cVar = (lb.c) next;
                if (sv.k0.equals(cVar.f72770j, langId, true)) {
                    output.add(cVar);
                }
            }
        }
        return output.size();
    }

    public final int getInstancesForSubject(int i10, Collection<lb.c> output) {
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        output.clear();
        synchronized (this.f72974b) {
            Iterator it = this.f72980h.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                lb.c cVar = (lb.c) next;
                if (cVar.f72771k == i10) {
                    output.add(cVar);
                }
            }
        }
        return output.size();
    }

    public final int getPartnerId() {
        return this.f72976d.getMPartnerId();
    }

    public final String getPlayerName() {
        Context context = this.f72977e;
        kotlin.jvm.internal.e0.checkNotNull(context);
        return context.getResources().getBoolean(R.bool.isTablet) ? "Android-Tab" : "Android-Phone";
    }

    public final c getSettings() {
        return this.f72976d;
    }

    public final String getUid() {
        return this.f72976d.getMUid();
    }

    public final boolean init(Context applicationContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationContext, "applicationContext");
        return init$default(this, applicationContext, false, 2, null);
    }

    public final void onActivityPause() {
        this.f72978f = false;
    }

    public final void onActivityResume() {
        this.f72978f = true;
    }

    public final void removeListener(t0 l9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l9, "l");
        synchronized (this.f72973a) {
            this.f72973a.remove(l9);
        }
    }

    public final void saveSettings() {
        Context context = this.f72977e;
        if (context != null) {
            kotlin.jvm.internal.e0.checkNotNull(context);
            this.f72976d.saveSettings(context);
        }
    }

    public final void setCountry(String country) {
        kotlin.jvm.internal.e0.checkNotNullParameter(country, "country");
        this.f72976d.setMCountryCode(country);
    }

    public final void setGlobalParameters(String str, int i10, String partnerAuthKey, int i11, String mediaFootPrint, boolean z10, boolean z11, int i12, int i13, String countryCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(partnerAuthKey, "partnerAuthKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaFootPrint, "mediaFootPrint");
        kotlin.jvm.internal.e0.checkNotNullParameter(countryCode, "countryCode");
        c cVar = this.f72976d;
        if (str != null) {
            cVar.setMUid(str);
        }
        cVar.setMPartnerId(i10);
        cVar.setMPartnerAuthKey(partnerAuthKey);
        cVar.setMMediaId(i11);
        cVar.setMMediaFootprint(mediaFootPrint);
        cVar.setMPremium(z10);
        cVar.setMFast(z11);
        cVar.setMHauteurPhoto(i12);
        cVar.setMLargeurPhoto(i13);
        cVar.setMCountryCode(countryCode);
        Context context = this.f72977e;
        if (context != null) {
            kotlin.jvm.internal.e0.checkNotNull(context);
            cVar.saveSettings(context);
        }
    }

    public final void setMedia(int i10, String mediaFootprint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaFootprint, "mediaFootprint");
        c cVar = this.f72976d;
        cVar.setMMediaId(i10);
        cVar.setMMediaFootprint(mediaFootprint);
    }

    public final void setPartner(int i10, String partnerAuthKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(partnerAuthKey, "partnerAuthKey");
        c cVar = this.f72976d;
        cVar.setMPartnerId(i10);
        cVar.setMPartnerAuthKey(partnerAuthKey);
    }

    public final void setPremium(boolean z10) {
        this.f72976d.setMPremium(z10);
    }

    public final void setTimeoutsWebservices(int i10, int i11) {
        z.a aVar = qb.z.f82725k;
        aVar.setTIMEOUT_COURT(i10);
        aVar.setTIMEOUT_LONG(i11);
    }

    public final y0 startSession(String langId, int i10, boolean z10, boolean z11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(langId, "langId");
        return startsession$default(this, langId, i10, z10, z11, false, 16, null);
    }

    public final Object startSessionAsync(String str, int i10, boolean z10, boolean z11, boolean z12, zu.d<? super y0> dVar) {
        return startSessionWithOptionalParamsAsync(z12, str, i10, z10, z11, null, dVar);
    }

    public final Object startSessionWithOptionalParamsAsync(boolean z10, String str, int i10, boolean z11, boolean z12, Map<String, String> map, zu.d<? super y0> dVar) {
        lb.c s0Var = getInstance(str, i10);
        if (s0Var == null) {
            y0 y0Var = new y0();
            y0Var.f73051a = 100;
            return y0Var;
        }
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        return c(s0Var, z11, z12, map, z10, dVar);
    }

    public final y0 startsession(String langId, int i10, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(langId, "langId");
        return (y0) BuildersKt__BuildersKt.runBlocking$default(null, new x0(this, langId, i10, z10, z11, z12, null), 1, null);
    }

    public final int updateInstancesListFromWS() {
        this.f72978f = true;
        return updateInstancesListFromWSC();
    }

    public final int updateInstancesListFromWSC() {
        return d(false);
    }

    public static int a(Document document, ArrayList arrayList) throws DOMException, NumberFormatException {
        NodeList elementsByTagName;
        String str;
        String str2;
        NodeList nodeList;
        int i10;
        lb.c cVar;
        char c10;
        String str3 = "URL";
        String str4 = "getTextContent(...)";
        int i11 = 0;
        try {
            document.getDocumentElement().normalize();
            NodeList elementsByTagName2 = document.getElementsByTagName("RESULT");
            if (elementsByTagName2 != null) {
                Node nodeItem = elementsByTagName2.item(0);
                kotlin.jvm.internal.e0.checkNotNull(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                Node nodeItem2 = ((Element) nodeItem).getElementsByTagName("CODE_PAYS").item(0);
                kotlin.jvm.internal.e0.checkNotNull(nodeItem2, "null cannot be cast to non-null type org.w3c.dom.Element");
                ((Element) nodeItem2).getTextContent();
            }
            elementsByTagName = document.getElementsByTagName("INSTANCE");
        } catch (Exception e10) {
            e = e10;
        }
        try {
            if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
                Timber.Forest.tag("SessionFactory").e("WSC : malformed xml", new Object[0]);
                return 400;
            }
            arrayList.clear();
            int length = elementsByTagName.getLength();
            int i12 = 0;
            while (i12 < length) {
                try {
                    cVar = new lb.c();
                    Node nodeItem3 = elementsByTagName.item(i12);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem3, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Node nodeItem4 = ((Element) nodeItem3).getElementsByTagName("SERVICE_ID").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem4, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72763c = ((Element) nodeItem4).getTextContent();
                    Node nodeItem5 = ((Element) nodeItem3).getElementsByTagName("SERVICE_ID_ALIAS").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem5, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72764d = ((Element) nodeItem5).getTextContent();
                    Node nodeItem6 = ((Element) nodeItem3).getElementsByTagName("TRANSLATED_SUBJECT_NAME").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem6, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72769i = ((Element) nodeItem6).getTextContent();
                    Node nodeItem7 = ((Element) nodeItem3).getElementsByTagName("NB_FREE_GAMES_ALLOWED").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem7, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent = ((Element) nodeItem7).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent, str4);
                    Integer.parseInt(textContent);
                    Node nodeItem8 = ((Element) nodeItem3).getElementsByTagName("SUBJECT").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem8, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Element element = (Element) nodeItem8;
                    Node nodeItem9 = element.getElementsByTagName("SUBJ_ID").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem9, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent2 = ((Element) nodeItem9).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent2, str4);
                    cVar.f72771k = Integer.parseInt(textContent2);
                    Node nodeItem10 = element.getElementsByTagName("SUBJ_PRICE").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem10, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent3 = ((Element) nodeItem10).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent3, str4);
                    cVar.f72774n = Integer.parseInt(textContent3);
                    Node nodeItem11 = element.getElementsByTagName("SUBJ_LABEL").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem11, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72773m = ((Element) nodeItem11).getTextContent();
                    Node nodeItem12 = element.getElementsByTagName("SUBJ_PICTURE_URL").item(i11);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem12, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent4 = ((Element) nodeItem12).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNull(textContent4);
                    int iLastIndexOf$default = sv.n0.lastIndexOf$default((CharSequence) textContent4, '.', 0, false, 6, (Object) null);
                    if (iLastIndexOf$default != -1) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            nodeList = elementsByTagName;
                            i10 = length;
                            try {
                                String strSubstring = textContent4.substring(0, iLastIndexOf$default);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                sb2.append(strSubstring);
                                sb2.append("@2x");
                                String strSubstring2 = textContent4.substring(iLastIndexOf$default);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                sb2.append(strSubstring2);
                                cVar.f72775o = sb2.toString();
                                StringBuilder sb3 = new StringBuilder();
                                String strSubstring3 = textContent4.substring(0, iLastIndexOf$default);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                sb3.append(strSubstring3);
                                sb3.append("_end_game@2x");
                                String strSubstring4 = textContent4.substring(iLastIndexOf$default);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                                sb3.append(strSubstring4);
                                cVar.f72777q = sb3.toString();
                            } catch (Exception e11) {
                                e = e11;
                                str = str3;
                                str2 = str4;
                                Timber.Forest.tag("SessionFactory").e(e, "WSC : malformed instance", new Object[0]);
                                i12++;
                                elementsByTagName = nodeList;
                                length = i10;
                                str4 = str2;
                                str3 = str;
                                i11 = 0;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            nodeList = elementsByTagName;
                            i10 = length;
                            str = str3;
                            str2 = str4;
                            Timber.Forest.tag("SessionFactory").e(e, "WSC : malformed instance", new Object[0]);
                            i12++;
                            elementsByTagName = nodeList;
                            length = i10;
                            str4 = str2;
                            str3 = str;
                            i11 = 0;
                        }
                    } else {
                        nodeList = elementsByTagName;
                        i10 = length;
                        cVar.f72775o = textContent4;
                        cVar.f72777q = textContent4;
                    }
                    Node nodeItem13 = element.getElementsByTagName("SUBJ_ICON_URL").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem13, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent5 = ((Element) nodeItem13).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNull(textContent5);
                    int iLastIndexOf$default2 = sv.n0.lastIndexOf$default((CharSequence) textContent5, '.', 0, false, 6, (Object) null);
                    if (iLastIndexOf$default2 != -1) {
                        StringBuilder sb4 = new StringBuilder();
                        String strSubstring5 = textContent5.substring(0, iLastIndexOf$default2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                        sb4.append(strSubstring5);
                        sb4.append("@2x");
                        String strSubstring6 = textContent5.substring(iLastIndexOf$default2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        sb4.append(strSubstring6);
                        cVar.f72776p = sb4.toString();
                        StringBuilder sb5 = new StringBuilder();
                        String strSubstring7 = textContent5.substring(0, iLastIndexOf$default2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        sb5.append(strSubstring7);
                        sb5.append("_selected@2x");
                        String strSubstring8 = textContent5.substring(iLastIndexOf$default2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring8, "substring(...)");
                        sb5.append(strSubstring8);
                        cVar.f72778r = sb5.toString();
                    } else {
                        cVar.f72776p = textContent5;
                        cVar.f72778r = textContent5;
                    }
                    Node nodeItem14 = ((Element) nodeItem3).getElementsByTagName("LANGUAGE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem14, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Node nodeItem15 = ((Element) nodeItem14).getElementsByTagName("LANG_ID").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem15, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72770j = ((Element) nodeItem15).getTextContent();
                    Node nodeItem16 = ((Element) nodeItem3).getElementsByTagName("SOCIAL_NETWORKS_ACCOUNTS").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem16, "null cannot be cast to non-null type org.w3c.dom.Element");
                    Element element2 = (Element) nodeItem16;
                    Node nodeItem17 = element2.getElementsByTagName("URL_COMPTE_TWITTER").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem17, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72780t = ((Element) nodeItem17).getTextContent();
                    Node nodeItem18 = element2.getElementsByTagName("URL_COMPTE_TWITTER_MOBILE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem18, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72781u = ((Element) nodeItem18).getTextContent();
                    Node nodeItem19 = element2.getElementsByTagName("URL_COMPTE_FACEBOOK").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem19, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72782v = ((Element) nodeItem19).getTextContent();
                    Node nodeItem20 = element2.getElementsByTagName("URL_COMPTE_FACEBOOK_MOBILE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem20, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72783w = ((Element) nodeItem20).getTextContent();
                    Node nodeItem21 = element2.getElementsByTagName("URL_COMPTE_INSTAGRAM").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem21, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72784x = ((Element) nodeItem21).getTextContent();
                    Node nodeItem22 = element2.getElementsByTagName("URL_COMPTE_INSTAGRAM_MOBILE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem22, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72785y = ((Element) nodeItem22).getTextContent();
                    Node nodeItem23 = ((Element) nodeItem3).getElementsByTagName("RANKING_LIMIT").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem23, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent6 = ((Element) nodeItem23).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent6, str4);
                    cVar.f72762b = Integer.parseInt(textContent6);
                    Node nodeItem24 = ((Element) nodeItem3).getElementsByTagName("AWARD_ID_LIMIT").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem24, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent7 = ((Element) nodeItem24).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent7, str4);
                    cVar.f72761a = Integer.parseInt(textContent7);
                    Node nodeItem25 = ((Element) nodeItem3).getElementsByTagName(SUvoXnn.SyonQCCeSoHahac).item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem25, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.T = ((Element) nodeItem25).getTextContent();
                    Node nodeItem26 = ((Element) nodeItem3).getElementsByTagName("PRIO_AVAILABLE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem26, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent8 = ((Element) nodeItem26).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent8, str4);
                    cVar.S = Integer.parseInt(textContent8);
                    Node nodeItem27 = ((Element) nodeItem3).getElementsByTagName("BASE_LOGIQUE_ID").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem27, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent9 = ((Element) nodeItem27).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent9, str4);
                    cVar.f72765e = Integer.parseInt(textContent9);
                    Node nodeItem28 = ((Element) nodeItem3).getElementsByTagName("TYPE_SESSION").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem28, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72766f = ((Element) nodeItem28).getTextContent();
                    Node nodeItem29 = ((Element) nodeItem3).getElementsByTagName("NOM_RESEAU_ENTROPIQUE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem29, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72767g = ((Element) nodeItem29).getTextContent();
                    Node nodeItem30 = ((Element) nodeItem3).getElementsByTagName("NOM_EXTERNE_VAR_CIBLE").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem30, "null cannot be cast to non-null type org.w3c.dom.Element");
                    cVar.f72768h = ((Element) nodeItem30).getTextContent();
                    Node nodeItem31 = ((Element) nodeItem3).getElementsByTagName("TRADS_APP_ID").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem31, "null cannot be cast to non-null type org.w3c.dom.Element");
                    String textContent10 = ((Element) nodeItem31).getTextContent();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(textContent10, str4);
                    cVar.f72772l = Integer.parseInt(textContent10);
                    Node nodeItem32 = ((Element) nodeItem3).getElementsByTagName("URL_BASE_WS").item(0);
                    kotlin.jvm.internal.e0.checkNotNull(nodeItem32, "null cannot be cast to non-null type org.w3c.dom.Element");
                    try {
                        cVar.f72779s = ((Element) nodeItem32).getTextContent();
                    } catch (Exception e13) {
                        Timber.Forest.tag("SessionFactory").e(e13, "WSC : malformed baseURL", new Object[0]);
                        cVar.f72779s = null;
                    }
                    if (cVar.f72779s != null) {
                        String mTypeSession = cVar.f72766f;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mTypeSession, "mTypeSession");
                        if (sv.k0.startsWith$default(mTypeSession, "lre", false, 2, null)) {
                            cVar.f72779s += '/' + cVar.f72770j;
                        }
                    }
                    Element element3 = (Element) ((Element) nodeItem3).getElementsByTagName("CANDIDATS").item(0);
                    if (element3 != null) {
                        int length2 = element3.getElementsByTagName(str3).getLength();
                        int i13 = 0;
                        while (i13 < length2) {
                            Node nodeItem33 = element3.getElementsByTagName(str3).item(i13);
                            kotlin.jvm.internal.e0.checkNotNull(nodeItem33, "null cannot be cast to non-null type org.w3c.dom.Element");
                            String textContent11 = ((Element) nodeItem33).getTextContent();
                            String mTypeSession2 = cVar.f72766f;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mTypeSession2, "mTypeSession");
                            str = str3;
                            str2 = str4;
                            try {
                                if (sv.k0.startsWith$default(mTypeSession2, "lre", false, 2, null)) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(textContent11);
                                    c10 = '/';
                                    sb6.append('/');
                                    sb6.append(cVar.f72770j);
                                    textContent11 = sb6.toString();
                                } else {
                                    c10 = '/';
                                }
                                if (cVar.f72779s == null) {
                                    cVar.f72779s = textContent11;
                                }
                                cVar.R.add(textContent11);
                                i13++;
                                str4 = str2;
                                str3 = str;
                            } catch (Exception e14) {
                                e = e14;
                                Timber.Forest.tag("SessionFactory").e(e, "WSC : malformed instance", new Object[0]);
                                i12++;
                                elementsByTagName = nodeList;
                                length = i10;
                                str4 = str2;
                                str3 = str;
                                i11 = 0;
                            }
                        }
                    }
                    str = str3;
                    str2 = str4;
                    Element element4 = (Element) ((Element) nodeItem3).getElementsByTagName("CAPS_DISABLED").item(0);
                    if (element4 != null) {
                        int length3 = element4.getElementsByTagName("CAP").getLength();
                        for (int i14 = 0; i14 < length3; i14++) {
                            Node nodeItem34 = element4.getElementsByTagName("CAP").item(i14);
                            kotlin.jvm.internal.e0.checkNotNull(nodeItem34, "null cannot be cast to non-null type org.w3c.dom.Element");
                            String textContent12 = ((Element) nodeItem34).getTextContent();
                            if (sv.k0.equals("aki_awards", textContent12, true)) {
                                cVar.f72786z = true;
                            }
                            if (sv.k0.equals("classement_joueurs", textContent12, true)) {
                                cVar.A = true;
                            }
                            if (sv.k0.equals("custom_akinator", textContent12, true)) {
                                cVar.B = true;
                            }
                            if (sv.k0.equals("daily_challenge", textContent12, true)) {
                                cVar.C = true;
                            }
                            if (sv.k0.equals("seuil_popu", textContent12, true)) {
                                cVar.D = true;
                            }
                            if (sv.k0.equals("my_world", textContent12, true)) {
                                cVar.E = true;
                            }
                            if (sv.k0.equals("add_photo", textContent12, true)) {
                                cVar.F = true;
                            }
                            if (sv.k0.equals("add_question", textContent12, true)) {
                                cVar.G = true;
                            }
                            if (sv.k0.equals("game_report", textContent12, true)) {
                                cVar.H = true;
                            }
                            if (sv.k0.equals("child_filter", textContent12, true)) {
                                cVar.I = true;
                            }
                            if (sv.k0.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, textContent12, true)) {
                                cVar.J = true;
                            }
                            if (sv.k0.equals("add_object", textContent12, true)) {
                                cVar.K = true;
                            }
                            if (sv.k0.equals("corriger_nom", textContent12, true)) {
                                cVar.L = true;
                            }
                            if (sv.k0.equals("soundlikes_completion", textContent12, true)) {
                                cVar.O = true;
                            }
                            if (sv.k0.equals("descriptions", textContent12, true)) {
                                cVar.P = true;
                            }
                            if (sv.k0.equals("questions_supplementaires", textContent12, true)) {
                                cVar.M = true;
                            }
                            if (sv.k0.equals("vote_classement", textContent12, true)) {
                                cVar.N = true;
                            }
                            if (sv.k0.equals("signalement_doublons", textContent12, true)) {
                                cVar.Q = true;
                            }
                        }
                    }
                } catch (Exception e15) {
                    e = e15;
                    str = str3;
                    str2 = str4;
                    nodeList = elementsByTagName;
                    i10 = length;
                }
                try {
                    arrayList.add(cVar);
                } catch (Exception e16) {
                    e = e16;
                    Timber.Forest.tag("SessionFactory").e(e, "WSC : malformed instance", new Object[0]);
                    i12++;
                    elementsByTagName = nodeList;
                    length = i10;
                    str4 = str2;
                    str3 = str;
                    i11 = 0;
                }
                i12++;
                elementsByTagName = nodeList;
                length = i10;
                str4 = str2;
                str3 = str;
                i11 = 0;
            }
            return i11;
        } catch (Exception e17) {
            e = e17;
            Timber.Forest.tag("SessionFactory").e(e, "Exception while parsing WSC result", new Object[0]);
            return 400;
        }
    }

    public final boolean init(Context applicationContext, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationContext, "applicationContext");
        this.f72977e = applicationContext;
        kotlin.jvm.internal.e0.checkNotNull(applicationContext);
        this.f72976d.loadSettings(applicationContext);
        if (z10) {
            String strHash = sw.a.hash(this.f72977e, applicationContext.getPackageName(), true);
            this.f72979g = strHash;
            if (strHash == null) {
                this.f72979g = AbstractJsonLexerKt.NULL;
            }
        }
        return true;
    }
}
