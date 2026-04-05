package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.DtbDeviceRegistration;
import com.ironsource.G7;
import com.ironsource.H5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3472u3 implements F7 {
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    String H;
    String I;
    Set<Integer> J;
    private F5 K;
    private C3161ca L;
    private Ne M;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39012l;

    /* renamed from: p, reason: collision with root package name */
    private G4 f39016p;

    /* renamed from: q, reason: collision with root package name */
    private AbstractC3186e f39017q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<C5> f39018r;

    /* renamed from: t, reason: collision with root package name */
    private int f39020t;

    /* renamed from: u, reason: collision with root package name */
    private M8 f39021u;

    /* renamed from: v, reason: collision with root package name */
    private Context f39022v;

    /* renamed from: z, reason: collision with root package name */
    private int[] f39026z;

    /* renamed from: a, reason: collision with root package name */
    final int f39001a = 1;

    /* renamed from: b, reason: collision with root package name */
    final int f39002b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f39003c = 5000;

    /* renamed from: d, reason: collision with root package name */
    final int f39004d = 90000;

    /* renamed from: e, reason: collision with root package name */
    final int f39005e = 1024;

    /* renamed from: f, reason: collision with root package name */
    final int f39006f = 5;

    /* renamed from: g, reason: collision with root package name */
    final String f39007g = "supersonic_sdk.db";

    /* renamed from: h, reason: collision with root package name */
    final String f39008h = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: i, reason: collision with root package name */
    final String f39009i = "placement";

    /* renamed from: j, reason: collision with root package name */
    private final String f39010j = "abt";

    /* renamed from: k, reason: collision with root package name */
    private final String f39011k = Q6.Z0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39013m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f39014n = false;

    /* renamed from: o, reason: collision with root package name */
    private int f39015o = -1;

    /* renamed from: s, reason: collision with root package name */
    private boolean f39019s = true;

    /* renamed from: w, reason: collision with root package name */
    private int f39023w = 100;

    /* renamed from: x, reason: collision with root package name */
    private int f39024x = 5000;

    /* renamed from: y, reason: collision with root package name */
    private int f39025y = 1;
    private Map<String, String> D = new HashMap();
    private Map<String, String> E = new HashMap();
    private String F = "";
    private final Object N = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3472u3.this.a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u3$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5 f39028a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSource.a f39029b;

        public b(C5 c52, IronSource.a aVar) {
            this.f39028a = c52;
            this.f39029b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            this.f39028a.a("eventSessionId", AbstractC3472u3.this.f39021u.b());
            this.f39028a.a("essn", Integer.valueOf(AbstractC3472u3.this.f39021u.c()));
            String strA = IronSourceUtils.a(AbstractC3472u3.this.f39022v);
            if (AbstractC3472u3.this.g(this.f39028a)) {
                this.f39028a.a("connectionType", strA);
            }
            if (AbstractC3472u3.p(this.f39028a, AbstractC3472u3.this, strA)) {
                C5 c52 = this.f39028a;
                c52.a(AbstractC3472u3.this.b(c52));
            }
            String strD = C3137b4.d(AbstractC3472u3.this.f39022v);
            if (strD != null) {
                this.f39028a.a("rawConnectionType", strD);
            }
            int iA = AbstractC3472u3.this.a(this.f39028a.c(), this.f39029b);
            if (iA != e.NOT_SUPPORTED.b()) {
                this.f39028a.a("adUnit", Integer.valueOf(iA));
            }
            AbstractC3472u3.this.a(this.f39028a, "reason");
            AbstractC3472u3.this.a(this.f39028a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC3472u3.this.E.isEmpty()) {
                for (Map.Entry entry : AbstractC3472u3.this.E.entrySet()) {
                    if (!this.f39028a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f39028a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC3472u3.this.i(this.f39028a)) {
                if (AbstractC3472u3.this.h(this.f39028a) && !AbstractC3472u3.this.e(this.f39028a)) {
                    this.f39028a.a("sessionDepth", Integer.valueOf(AbstractC3472u3.this.c(this.f39028a)));
                }
                if (AbstractC3472u3.this.j(this.f39028a)) {
                    AbstractC3472u3.this.f(this.f39028a);
                }
                long jA = AbstractC3472u3.this.f39021u.a();
                if (jA > 0) {
                    this.f39028a.a("firstSessionTimestamp", Long.valueOf(jA));
                }
                IronLog.EVENT.verbose(this.f39028a.toString());
                AbstractC3472u3.this.f39018r.add(this.f39028a);
                AbstractC3472u3.this.f39020t++;
            }
            AbstractC3472u3 abstractC3472u3 = AbstractC3472u3.this;
            boolean zA = abstractC3472u3.a(abstractC3472u3.B) ? AbstractC3472u3.this.a(this.f39028a.c(), AbstractC3472u3.this.B) : AbstractC3472u3.this.d(this.f39028a);
            AbstractC3472u3 abstractC3472u32 = AbstractC3472u3.this;
            if (!abstractC3472u32.f39013m && zA) {
                abstractC3472u32.f39013m = true;
            }
            if (abstractC3472u32.f39016p != null) {
                if (abstractC3472u32.g()) {
                    AbstractC3472u3.this.f();
                    return;
                }
                AbstractC3472u3 abstractC3472u33 = AbstractC3472u3.this;
                if (abstractC3472u33.b((ArrayList<C5>) abstractC3472u33.f39018r) || zA) {
                    AbstractC3472u3.this.a();
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u3$c */
    public class c implements G7 {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(G7.a aVar) {
            try {
                if (aVar.c()) {
                    AbstractC3472u3 abstractC3472u3 = AbstractC3472u3.this;
                    ArrayList<C5> arrayListA = abstractC3472u3.f39016p.a(abstractC3472u3.I);
                    AbstractC3472u3.this.f39020t = arrayListA.size() + AbstractC3472u3.this.f39018r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC3472u3.this.a(AbstractC3472u3.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
            }
            a(aVar.b());
        }

        public void a(ArrayList<C5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                    IronLog.INTERNAL.error("clearData exception: " + e10.getMessage());
                }
            }
        }

        @Override // com.ironsource.G7
        public synchronized void a(G7.a aVar) {
            AbstractC3472u3.this.K.a(new gi(1, this, aVar));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3472u3.this.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.u3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a, reason: collision with root package name */
        private int f39039a;

        e(int i10) {
            this.f39039a = i10;
        }

        public int b() {
            return this.f39039a;
        }
    }

    public static /* bridge */ /* synthetic */ boolean p(C5 c52, AbstractC3472u3 abstractC3472u3, String str) {
        return abstractC3472u3.a(str, c52);
    }

    public abstract int c(C5 c52);

    public abstract void d();

    public abstract boolean d(C5 c52);

    public abstract String e(int i10);

    public abstract void f(C5 c52);

    public abstract boolean j(C5 c52);

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(C5 c52) {
        return c52.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<C5> arrayListA;
        try {
            this.f39013m = false;
            ArrayList<C5> arrayList = new ArrayList<>();
            try {
                synchronized (this.N) {
                    arrayListA = this.f39016p.a(this.I);
                    this.f39016p.b(this.I);
                }
                H5.c cVar = new H5.c(new H5.a(arrayListA, this.f39018r), this.f39024x);
                this.f39016p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th2) {
                C3422r4.d().a(th2);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th2.getMessage());
                arrayList.clear();
                arrayList.addAll(this.f39018r);
            }
            if (arrayList.size() > 0) {
                this.f39018r.clear();
                this.f39020t = 0;
                JSONObject jSONObjectB = N6.a().b();
                try {
                    a(jSONObjectB);
                    String strB = b();
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObjectB.put("abt", strB);
                    }
                    String strP = com.ironsource.mediationsdk.r.m().p();
                    if (!TextUtils.isEmpty(strP)) {
                        jSONObjectB.put(Q6.Z0, strP);
                    }
                    Map<String, String> mapC = c();
                    if (!mapC.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapC.entrySet()) {
                            if (!jSONObjectB.has(entry.getKey())) {
                                jSONObjectB.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectA = new M5().a();
                    Iterator<String> itKeys = jSONObjectA.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectB.put(next, jSONObjectA.get(next));
                    }
                } catch (Throwable th3) {
                    C3422r4.d().a(th3);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th3.getMessage());
                }
                String strA = this.f39017q.a(arrayList, jSONObjectB);
                if (TextUtils.isEmpty(strA)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (this.f39014n) {
                    try {
                        strA = Base64.encodeToString(S9.a(strA, this.f39015o), 0);
                    } catch (Exception e10) {
                        C3422r4.d().a(e10);
                    }
                }
                C3535xf.f39230a.a(new N5(new c(), strA, this.f39017q.b(), arrayList));
            }
        } catch (Throwable th4) {
            C3422r4.d().a(th4);
            IronLog.INTERNAL.error("Send event exception: " + th4.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f39020t >= this.f39023w || this.f39013m) && this.f39012l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(C5 c52) {
        if (c52 == null) {
            return false;
        }
        if (a(this.f39026z)) {
            return !a(c52.c(), this.f39026z);
        }
        if (a(this.A)) {
            return a(c52.c(), this.A);
        }
        return true;
    }

    public synchronized void a(Context context, C3161ca c3161ca) {
        String strA = IronSourceUtils.a(context, this.I, this.H);
        this.H = strA;
        b(strA);
        this.f39017q.a(IronSourceUtils.b(context, this.I, (String) null));
        this.f39016p = G4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new a());
        this.f39026z = IronSourceUtils.c(context, this.I);
        this.A = IronSourceUtils.b(context, this.I);
        this.B = IronSourceUtils.d(context, this.I);
        this.C = IronSourceUtils.a(context, this.I);
        this.L = c3161ca;
        this.f39022v = context;
    }

    @Override // com.ironsource.F7
    public void c(int[] iArr, Context context) {
        this.A = iArr;
        IronSourceUtils.b(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void d(int i10) {
        if (i10 > 0) {
            this.f39024x = i10;
        }
    }

    public void e() {
        this.f39018r = new ArrayList<>();
        this.f39020t = 0;
        this.f39017q = K5.a(this.H, this.G);
        F5 f52 = new F5(j1.o2.o(new StringBuilder(), this.I, "EventThread"));
        this.K = f52;
        f52.start();
        this.K.a();
        this.f39021u = Mb.U().m();
        this.J = new HashSet();
        d();
    }

    public void h() {
        this.K.a(new d());
    }

    private void b(String str) {
        AbstractC3186e abstractC3186e = this.f39017q;
        if (abstractC3186e == null || !abstractC3186e.c().equals(str)) {
            this.f39017q = K5.a(str, this.G);
        }
    }

    @Override // com.ironsource.F7
    public void d(int[] iArr, Context context) {
        this.C = iArr;
        IronSourceUtils.a(context, this.I, iArr);
    }

    public boolean g(C5 c52) {
        return (c52.c() == D5.CONSENT_TRUE_CODE.b() || c52.c() == D5.CONSENT_FALSE_CODE.b() || c52.c() == D5.SET_META_DATA.b() || c52.c() == D5.SET_META_DATA_AFTER_INIT.b() || c52.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    public boolean h(C5 c52) {
        return (c52.c() == D5.FIRST_INSTANCE.b() || c52.c() == D5.FIRST_INSTANCE_RESULT.b() || c52.c() == D5.INIT_COMPLETE.b() || c52.c() == D5.SDK_INIT_FAILED.b() || c52.c() == D5.SDK_INIT_SUCCESS.b() || c52.c() == D5.USING_CACHE_FOR_INIT_EVENT.b() || c52.c() == D5.CONSENT_TRUE_CODE.b() || c52.c() == D5.CONSENT_FALSE_CODE.b() || c52.c() == D5.SET_META_DATA.b() || c52.c() == D5.SET_META_DATA_AFTER_INIT.b() || c52.c() == D5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.F7
    public void c(int i10) {
        this.f39015o = i10;
    }

    @Override // com.ironsource.F7
    public void b(int i10) {
        if (i10 > 0) {
            this.f39025y = i10;
        }
    }

    public void c(boolean z10) {
        this.f39012l = z10;
    }

    @Override // com.ironsource.F7
    public void b(int[] iArr, Context context) {
        this.f39026z = iArr;
        IronSourceUtils.c(context, this.I, iArr);
    }

    public Map<String, String> c() {
        return this.D;
    }

    @Override // com.ironsource.F7
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3186e abstractC3186e = this.f39017q;
        if (abstractC3186e != null) {
            abstractC3186e.a(str);
        }
        IronSourceUtils.e(context, this.I, str);
    }

    @Override // com.ironsource.F7
    public void b(boolean z10) {
        this.f39014n = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<C5> arrayList) {
        return arrayList != null && arrayList.size() >= this.f39025y;
    }

    public synchronized void a(Ne ne2) {
        this.M = ne2;
    }

    public String b() {
        return this.F;
    }

    private synchronized boolean a(String str, C5 c52) {
        boolean zContains;
        try {
            if (!str.equalsIgnoreCase("none")) {
                return false;
            }
            if (a(this.C)) {
                zContains = a(c52.c(), this.C);
            } else {
                zContains = this.J.contains(Integer.valueOf(c52.c()));
            }
            return zContains;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b(Map<String, String> map) {
        this.E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(C5 c52) {
        JSONObject jSONObjectB = c52.b();
        if (jSONObjectB == null) {
            return false;
        }
        return jSONObjectB.has("sessionDepth");
    }

    @Override // com.ironsource.F7
    public synchronized void a(C5 c52) {
        a(c52, (IronSource.a) null);
    }

    public synchronized void a(C5 c52, IronSource.a aVar) {
        if (c52 != null) {
            if (this.f39019s) {
                this.K.a(new b(c52, aVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<C5> a(ArrayList<C5> arrayList, String str) throws JSONException {
        String strA = a(str, 1024);
        Iterator<C5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(strA);
        }
        return arrayList;
    }

    public void a(ArrayList<C5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.f39016p.a(arrayList, this.I);
                this.f39020t = this.f39016p.a(this.I).size() + this.f39018r.size();
            }
        }
    }

    @Override // com.ironsource.F7
    public void a(int i10) {
        if (i10 > 0) {
            this.f39023w = i10;
        }
    }

    @Override // com.ironsource.F7
    public void a(int[] iArr, Context context) {
        this.B = iArr;
        IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.F7
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.F7
    public void a(boolean z10) {
        this.f39019s = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.f39016p.a(this.f39018r, this.I);
            this.f39018r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, int[] iArr) {
        if (a(iArr)) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        try {
            C3161ca c3161ca = this.L;
            if (c3161ca != null) {
                if (c3161ca.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(C3161ca.f36142n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            Ne ne2 = this.M;
            if (ne2 != null) {
                String strB = ne2.b();
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put(DtbDeviceRegistration.CONFIG_SEGMENT_ID_KEY, strB);
                }
                JSONObject jSONObjectA = this.M.a();
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public int f(int i10) {
        return a(i10, (IronSource.a) null);
    }

    public void a(String str) {
        this.F = str;
    }

    public void a(Map<String, String> map) {
        this.D.putAll(map);
    }

    public void a(Map<String, Object> map, int i10, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i10));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(C5 c52, String str, int i10) {
        JSONObject jSONObjectB = c52.b();
        if (jSONObjectB == null || !jSONObjectB.has(str)) {
            return;
        }
        try {
            c52.a(str, a(jSONObjectB.optString(str, null), i10));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String a(String str, int i10) {
        return (TextUtils.isEmpty(str) || str.length() <= i10) ? str : str.substring(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C5 c52, String str) {
        a(c52, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, IronSource.a aVar) {
        int iB = e.NOT_SUPPORTED.b();
        if (aVar != IronSource.a.REWARDED_VIDEO && ((i10 < 1000 || i10 >= 2000) && (i10 < 91000 || i10 >= 92000))) {
            if (aVar != IronSource.a.f37252c && ((i10 < 2000 || i10 >= 3000) && (i10 < 92000 || i10 >= 93000))) {
                if (aVar == IronSource.a.BANNER || ((i10 >= 3000 && i10 < 4000) || (i10 >= 93000 && i10 < 94000))) {
                    return e.BANNER.b();
                }
                return (aVar == IronSource.a.NATIVE_AD || (i10 >= 4000 && i10 < 5000) || (i10 >= 94000 && i10 < 95000)) ? e.NATIVE_AD.b() : iB;
            }
            return e.INTERSTITIAL.b();
        }
        return e.REWARDED_VIDEO.b();
    }

    public void a(C3161ca c3161ca) {
        this.L = c3161ca;
    }

    public void a(Runnable runnable) {
        this.K.a(runnable);
    }
}
