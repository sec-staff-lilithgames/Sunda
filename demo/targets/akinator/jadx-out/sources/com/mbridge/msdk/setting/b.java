package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbDeviceRegistration;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.c0;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: c1, reason: collision with root package name */
    public static int f42596c1 = 1500;
    private boolean D0;
    private long F;
    private JSONArray F0;
    private JSONObject G0;
    private ArrayList<Integer> H;
    private d I;
    private long I0;
    private C0319b J;
    private long N0;
    private HashMap<String, String> O;
    private boolean O0;
    private String P;
    private int U;
    private String U0;
    private String X;
    private Map<String, String> Y;

    /* renamed from: a1, reason: collision with root package name */
    private int f42599a1;

    /* renamed from: b1, reason: collision with root package name */
    private String f42602b1;

    /* renamed from: h0, reason: collision with root package name */
    private int f42614h0;

    /* renamed from: k0, reason: collision with root package name */
    private String f42620k0;

    /* renamed from: l, reason: collision with root package name */
    private int f42621l;

    /* renamed from: l0, reason: collision with root package name */
    private String f42622l0;

    /* renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f42625n;

    /* renamed from: o0, reason: collision with root package name */
    private int f42628o0;

    /* renamed from: p, reason: collision with root package name */
    private long f42629p;

    /* renamed from: p0, reason: collision with root package name */
    private int f42630p0;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f42631q;

    /* renamed from: q0, reason: collision with root package name */
    private int f42632q0;

    /* renamed from: r, reason: collision with root package name */
    private String f42633r;

    /* renamed from: r0, reason: collision with root package name */
    private int f42634r0;

    /* renamed from: s, reason: collision with root package name */
    private Map<String, a> f42635s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f42637t;

    /* renamed from: u, reason: collision with root package name */
    private int f42639u;

    /* renamed from: u0, reason: collision with root package name */
    private long f42640u0;

    /* renamed from: v0, reason: collision with root package name */
    private long f42642v0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f42597a = false;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f42600b = new JSONArray();

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f42603c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private String f42605d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f42607e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f42609f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f42611g = 2;

    /* renamed from: h, reason: collision with root package name */
    private int f42613h = 0;

    /* renamed from: i, reason: collision with root package name */
    private String f42615i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f42617j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f42619k = "";

    /* renamed from: m, reason: collision with root package name */
    private int f42623m = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f42627o = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f42641v = 1;

    /* renamed from: w, reason: collision with root package name */
    private boolean f42643w = false;

    /* renamed from: x, reason: collision with root package name */
    private String f42645x = "";

    /* renamed from: y, reason: collision with root package name */
    private String f42647y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f42649z = "";
    private String A = "";
    private String B = "";
    private int C = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f40851i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f40855m;
    private int G = f42596c1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = APSAnalytics.DEFAULT_SDK_VERSION;

    /* renamed from: a0, reason: collision with root package name */
    private int f42598a0 = 30;

    /* renamed from: b0, reason: collision with root package name */
    private int f42601b0 = 9377;

    /* renamed from: c0, reason: collision with root package name */
    private int f42604c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    private int f42606d0 = 5;

    /* renamed from: e0, reason: collision with root package name */
    private int f42608e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    private int f42610f0 = 8000;

    /* renamed from: g0, reason: collision with root package name */
    private String f42612g0 = "";

    /* renamed from: i0, reason: collision with root package name */
    private int f42616i0 = 10;

    /* renamed from: j0, reason: collision with root package name */
    private int f42618j0 = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;

    /* renamed from: m0, reason: collision with root package name */
    private String f42624m0 = "";

    /* renamed from: n0, reason: collision with root package name */
    private String f42626n0 = "";

    /* renamed from: s0, reason: collision with root package name */
    private String f42636s0 = "";

    /* renamed from: t0, reason: collision with root package name */
    private String f42638t0 = "";

    /* renamed from: w0, reason: collision with root package name */
    private List<Integer> f42644w0 = new ArrayList();

    /* renamed from: x0, reason: collision with root package name */
    private int f42646x0 = 3;

    /* renamed from: y0, reason: collision with root package name */
    private int f42648y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private int f42650z0 = 3;
    private int A0 = 0;
    private int B0 = 10;
    private int C0 = 600;
    private int E0 = 0;
    private String H0 = "";
    private int J0 = 8000;
    private int K0 = 1;
    private long L0 = 10;
    private int M0 = 3;
    private int P0 = 1;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private String T0 = "";
    private int V0 = 1300;
    private int W0 = 0;
    private int X0 = 0;
    private long Y0 = 3600;
    private String Z0 = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f42651a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f42652b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f42653c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f42654d;

        public List<String> a() {
            return this.f42651a;
        }

        public List<String> b() {
            return this.f42652b;
        }

        public List<String> c() {
            return this.f42653c;
        }

        public List<String> d() {
            return this.f42654d;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f42653c = c0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f42654d = c0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f42652b = c0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f42651a = c0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
            if (gVarD != null && gVarD.G() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarD.G().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarD.G().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.f.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public long A() {
        return this.L;
    }

    public boolean A0() {
        return this.Q;
    }

    public int B() {
        return this.N;
    }

    public boolean B0() {
        return this.f42637t;
    }

    public HashMap<String, String> C() {
        return this.O;
    }

    public boolean C0() {
        return this.f42643w;
    }

    public void D(int i10) {
        this.f42599a1 = i10;
    }

    public boolean D0() {
        return this.S;
    }

    public int E() {
        return this.U;
    }

    public boolean E0() {
        return this.f42597a;
    }

    public int F() {
        return this.V;
    }

    public boolean F0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f42649z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f42645x)) ? false : true;
    }

    public Map<String, String> G() {
        return this.Y;
    }

    public boolean G0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f42649z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f42647y)) ? false : true;
    }

    public JSONArray H() {
        return this.f42600b;
    }

    public boolean H0() {
        return this.T;
    }

    public JSONArray I() {
        return this.f42603c;
    }

    public boolean I0() {
        return this.D0;
    }

    public String J() {
        return this.Z;
    }

    public boolean J0() {
        return this.O0;
    }

    public int K() {
        return this.f42608e0;
    }

    public void K0() {
        String language = Locale.getDefault().getLanguage();
        if (!G0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.B = "Confirm to close? ";
                this.f42649z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f42647y = "Continue";
            } else {
                this.B = "确认关闭？";
                this.f42649z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f42647y = "继续观看";
            }
        }
        if (F0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.B = "Confirm to close? ";
            this.f42649z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f42645x = "Continue";
            return;
        }
        this.B = "确认关闭？";
        this.f42649z = "关闭后您将不会获得任何奖励噢~ ";
        this.A = "确认关闭";
        this.f42645x = "继续试玩";
    }

    public int L() {
        return this.f42610f0;
    }

    public int M() {
        return this.f42614h0;
    }

    public int N() {
        return this.f42618j0;
    }

    public String O() {
        return this.f42620k0;
    }

    public String P() {
        return this.f42622l0;
    }

    public String Q() {
        return this.Z0;
    }

    public long R() {
        return this.Y0;
    }

    public int S() {
        return this.f42599a1;
    }

    public String T() {
        return this.f42624m0;
    }

    public String U() {
        return this.f42626n0;
    }

    public int V() {
        return this.f42628o0;
    }

    public int W() {
        return this.f42630p0;
    }

    public int X() {
        return this.f42632q0;
    }

    public int Y() {
        return this.f42634r0;
    }

    public long Z() {
        return this.f42640u0;
    }

    public long a0() {
        if (this.f42642v0 <= 0) {
            this.f42642v0 = 7200L;
        }
        return this.f42642v0;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public int b0() {
        return this.f42646x0;
    }

    public void c(int i10) {
        this.f42607e = i10;
    }

    public int c0() {
        return this.f42648y0;
    }

    public void d(long j10) {
        this.Y0 = j10;
    }

    public int d0() {
        return this.f42650z0;
    }

    public void e(int i10) {
        this.f42611g = i10;
    }

    public int e0() {
        return this.A0;
    }

    public void f(int i10) {
        this.f42613h = i10;
    }

    public int f0() {
        return this.B0;
    }

    public void g(int i10) {
        this.f42621l = i10;
    }

    public int g0() {
        return this.C0;
    }

    public void h(int i10) {
        this.f42623m = i10;
    }

    public int h0() {
        return this.E0;
    }

    public void i(int i10) {
        this.f42627o = i10;
    }

    public JSONArray i0() {
        return this.F0;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f42631q;
    }

    public JSONObject j0() {
        return this.G0;
    }

    public String k() {
        return this.f42633r;
    }

    public String k0() {
        return this.H0;
    }

    public Map<String, a> l() {
        return this.f42635s;
    }

    public long l0() {
        return this.I0;
    }

    public int m() {
        return this.f42639u;
    }

    public int m0() {
        return this.J0;
    }

    public int n() {
        return this.f42641v;
    }

    public int n0() {
        return this.K0;
    }

    public String o() {
        return this.f42645x;
    }

    public long o0() {
        return this.L0 * 1000;
    }

    public String p() {
        return this.f42647y;
    }

    public int p0() {
        return this.M0;
    }

    public String q() {
        return this.f42649z;
    }

    public long q0() {
        return this.N0;
    }

    public String r() {
        return this.A;
    }

    public int r0() {
        return this.P0;
    }

    public String s() {
        return this.B;
    }

    public int s0() {
        return this.Q0;
    }

    public void t(String str) {
        this.Z0 = str;
    }

    public int t0() {
        return this.R0;
    }

    public String toString() {
        return " cfc=" + this.f42639u + " getpf=" + this.L + " rurl=" + this.D0;
    }

    public String u() {
        return this.D;
    }

    public int u0() {
        return this.S0;
    }

    public String v() {
        return this.E;
    }

    public String v0() {
        return this.T0;
    }

    public long w() {
        return this.F;
    }

    public String w0() {
        return this.U0;
    }

    public ArrayList<Integer> x() {
        return this.H;
    }

    public int x0() {
        return this.V0;
    }

    public d y() {
        return this.I;
    }

    public int y0() {
        return this.W0;
    }

    public C0319b z() {
        return this.J;
    }

    public int z0() {
        return this.X0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04df A[Catch: Exception -> 0x0544, TryCatch #9 {Exception -> 0x0544, blocks: (B:125:0x04bd, B:127:0x04df, B:128:0x04e1, B:130:0x04e6, B:131:0x04e8, B:133:0x04ed, B:134:0x04ef, B:136:0x04f4, B:137:0x04f6, B:140:0x0502), top: B:197:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e6 A[Catch: Exception -> 0x0544, TryCatch #9 {Exception -> 0x0544, blocks: (B:125:0x04bd, B:127:0x04df, B:128:0x04e1, B:130:0x04e6, B:131:0x04e8, B:133:0x04ed, B:134:0x04ef, B:136:0x04f4, B:137:0x04f6, B:140:0x0502), top: B:197:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ed A[Catch: Exception -> 0x0544, TryCatch #9 {Exception -> 0x0544, blocks: (B:125:0x04bd, B:127:0x04df, B:128:0x04e1, B:130:0x04e6, B:131:0x04e8, B:133:0x04ed, B:134:0x04ef, B:136:0x04f4, B:137:0x04f6, B:140:0x0502), top: B:197:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f4 A[Catch: Exception -> 0x0544, TryCatch #9 {Exception -> 0x0544, blocks: (B:125:0x04bd, B:127:0x04df, B:128:0x04e1, B:130:0x04e6, B:131:0x04e8, B:133:0x04ed, B:134:0x04ef, B:136:0x04f4, B:137:0x04f6, B:140:0x0502), top: B:197:0x04bd }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b4 A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05cb A[Catch: Exception -> 0x028d, TRY_LEAVE, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0287 A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0290 A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0313 A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0329 A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ad A[Catch: Exception -> 0x028d, TryCatch #3 {Exception -> 0x028d, blocks: (B:5:0x0016, B:9:0x006c, B:14:0x00c0, B:37:0x0176, B:38:0x0179, B:40:0x0287, B:52:0x02c6, B:56:0x02e4, B:58:0x0301, B:60:0x0307, B:61:0x030d, B:63:0x0313, B:65:0x0319, B:66:0x0320, B:67:0x0323, B:69:0x0329, B:70:0x0333, B:89:0x0398, B:91:0x03a0, B:94:0x03a7, B:96:0x03ad, B:97:0x03b5, B:99:0x03bb, B:101:0x03c7, B:103:0x03cd, B:111:0x045c, B:124:0x04a7, B:142:0x054d, B:150:0x0571, B:164:0x05a8, B:166:0x05b4, B:167:0x05bf, B:169:0x05cb, B:163:0x05a5, B:159:0x059d, B:153:0x058d, B:149:0x056e, B:123:0x049e, B:88:0x038f, B:43:0x0290, B:45:0x029b, B:47:0x02a1, B:48:0x02a7, B:50:0x02ad, B:51:0x02c3, B:13:0x00bb, B:8:0x0068, B:143:0x055f, B:147:0x056a, B:151:0x0583, B:154:0x0590, B:157:0x0599, B:112:0x0477, B:116:0x0488, B:120:0x0493, B:160:0x05a0, B:72:0x033f, B:73:0x0351, B:75:0x0357, B:77:0x0363, B:79:0x036d, B:81:0x037b, B:84:0x0385, B:86:0x038b), top: B:185:0x0016, inners: #0, #1, #4, #5, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mbridge.msdk.setting.g b(org.json.JSONObject r19) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.setting.b.b(org.json.JSONObject):com.mbridge.msdk.setting.g");
    }

    public void A(int i10) {
        if (i10 > 0) {
            this.f42616i0 = i10;
        }
    }

    public void B(int i10) {
        this.f42614h0 = i10;
    }

    public void C(int i10) {
        this.f42618j0 = i10;
    }

    public int D() {
        return this.R;
    }

    public void E(int i10) {
        this.f42628o0 = i10;
    }

    public void F(int i10) {
        this.f42630p0 = i10;
    }

    public void G(int i10) {
        this.f42632q0 = i10;
    }

    public void H(int i10) {
        this.f42634r0 = i10;
    }

    public void I(int i10) {
        this.f42646x0 = i10;
    }

    public void J(int i10) {
        this.f42648y0 = i10;
    }

    public void K(int i10) {
        this.f42650z0 = i10;
    }

    public void L(int i10) {
        this.A0 = i10;
    }

    public void M(int i10) {
        this.B0 = i10;
    }

    public void N(int i10) {
        this.C0 = i10;
    }

    public void O(int i10) {
        this.E0 = i10;
    }

    public void P(int i10) {
        this.J0 = i10;
    }

    public void Q(int i10) {
        this.K0 = i10;
    }

    public void R(int i10) {
        this.M0 = i10;
    }

    public void S(int i10) {
        this.P0 = i10;
    }

    public void T(int i10) {
        this.Q0 = i10;
    }

    public void U(int i10) {
        this.R0 = i10;
    }

    public void V(int i10) {
        this.S0 = i10;
    }

    public void W(int i10) {
        this.V0 = i10;
    }

    public void X(int i10) {
        this.W0 = i10;
    }

    public void Y(int i10) {
        this.X0 = i10;
    }

    public void c(String str) {
        this.f42615i = str;
    }

    public void d(int i10) {
        this.f42609f = i10;
    }

    public void e(String str) {
        this.f42619k = str;
    }

    public int f() {
        return this.f42623m;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f42625n;
    }

    public int h() {
        return this.f42627o;
    }

    public long i() {
        return this.f42629p;
    }

    public void j(int i10) {
        this.f42639u = i10;
    }

    public void k(int i10) {
        this.f42641v = i10;
    }

    public void l(int i10) {
        this.C = i10;
    }

    public void m(String str) {
        this.E = str;
    }

    public void n(int i10) {
        this.K = i10;
    }

    public void o(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public void p(int i10) {
        this.N = i10;
    }

    public void q(int i10) {
        this.R = i10;
    }

    public void r(int i10) {
        this.U = i10;
    }

    public void s(int i10) {
        this.V = i10;
    }

    public int t() {
        return this.C;
    }

    public void u(int i10) {
        this.f42598a0 = i10;
    }

    public void v(int i10) {
        this.f42601b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public void w(int i10) {
        this.f42604c0 = i10;
    }

    public void x(int i10) {
        this.f42606d0 = i10;
    }

    public void y(int i10) {
        this.f42608e0 = i10;
    }

    public void z(int i10) {
        this.f42610f0 = i10;
    }

    public void A(String str) {
        this.T0 = str;
    }

    public void B(String str) {
        this.U0 = str;
    }

    public String c() {
        return this.f42617j;
    }

    public void d(String str) {
        this.f42617j = str;
    }

    public int e() {
        return this.f42621l;
    }

    public void f(String str) {
        this.f42633r = str;
    }

    public void g(String str) {
        this.f42645x = str;
    }

    public void h(String str) {
        this.f42647y = str;
    }

    public void i(String str) {
        this.f42649z = str;
    }

    public void j(String str) {
        this.A = str;
    }

    public void k(String str) {
        this.B = str;
    }

    public void l(String str) {
        this.D = str;
    }

    public void m(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f39821d = i10;
    }

    public void n(String str) throws JSONException {
        this.f42602b1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(j0.a(str));
    }

    public void p(String str) {
        this.X = str;
    }

    public void q(String str) {
        this.Z = str;
    }

    public void r(String str) {
        this.f42620k0 = str;
    }

    public void s(String str) {
        this.f42622l0 = str;
    }

    public void t(int i10) {
        this.W = i10;
    }

    public void u(String str) {
        this.f42624m0 = str;
    }

    public void w(String str) {
        this.f42636s0 = str;
    }

    public void x(String str) {
        this.f42638t0 = str;
    }

    public void y(String str) {
        this.H0 = str;
    }

    public void z(String str) {
        if (TextUtils.isEmpty(this.f42612g0)) {
            return;
        }
        this.f42612g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.m().i())) {
            com.mbridge.msdk.foundation.controller.c.m().d(this.f42612g0);
        }
    }

    public void c(long j10) {
        this.L = j10;
    }

    public String d() {
        return this.f42619k;
    }

    public void e(long j10) {
        this.f42640u0 = j10;
    }

    public void f(long j10) {
        this.f42642v0 = j10;
    }

    public void g(long j10) {
        this.I0 = j10;
    }

    public void h(long j10) {
        this.L0 = j10;
    }

    public void i(long j10) {
        this.N0 = j10;
    }

    public void o(String str) {
        this.P = str;
    }

    public void c(JSONArray jSONArray) {
        this.F0 = jSONArray;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public void e(boolean z10) {
        this.f42597a = z10;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public void g(boolean z10) {
        this.D0 = z10;
    }

    public void h(boolean z10) {
        this.O0 = z10;
    }

    public void v(String str) {
        this.f42626n0 = str;
    }

    public void c(JSONObject jSONObject) {
        this.G0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f42643w = z10;
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    public static class C0319b {

        /* renamed from: a, reason: collision with root package name */
        private String f42655a;

        /* renamed from: b, reason: collision with root package name */
        private JSONArray f42656b;

        /* renamed from: c, reason: collision with root package name */
        private String f42657c;

        /* renamed from: d, reason: collision with root package name */
        private String f42658d;

        /* renamed from: e, reason: collision with root package name */
        private String f42659e;

        /* renamed from: f, reason: collision with root package name */
        private String f42660f;

        public static C0319b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0319b c0319b = new C0319b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            c0319b.f42660f = jSONObject.optString("title", contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_title", "string")));
            c0319b.f42655a = jSONObject.optString("cancel", contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_close_close", "string")));
            c0319b.f42658d = jSONObject.optString("submit", contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", "string")));
            c0319b.f42659e = jSONObject.optString("submit_notice", contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", "string")));
            c0319b.f42657c = jSONObject.optString(DtbDeviceRegistration.CONFIG_PRIVACY_KEY, contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", "string")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0319b.f42656b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0319b.f42656b = jSONArray;
                jSONArray.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", "string")));
                c0319b.f42656b.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", "string")));
                c0319b.f42656b.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", "string")));
                c0319b.f42656b.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", "string")));
                c0319b.f42656b.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", "string")));
                c0319b.f42656b.put(contextD.getString(h0.a(contextD, "mbridge_cm_feedback_dialog_content_other", "string")));
            }
            return c0319b;
        }

        public JSONArray b() {
            return this.f42656b;
        }

        public String c() {
            return this.f42657c;
        }

        public String d() {
            return this.f42658d;
        }

        public String e() {
            return this.f42659e;
        }

        public String f() {
            return this.f42660f;
        }

        public String a() {
            return this.f42655a;
        }
    }

    public void a(int i10) {
        this.f42644w0.add(Integer.valueOf(i10));
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), j0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                if (jSONObject == null || contextD == null) {
                    return;
                }
                String strOptString = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                    com.mbridge.msdk.foundation.same.a.V = strOptString;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                    try {
                        fastKVBuild.putString(j0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f40710g, strOptString2)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.a.f40710g = strOptString2;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
                try {
                    fastKVBuild.putString(j0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f40710g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Context contextD2 = com.mbridge.msdk.foundation.controller.c.m().d();
            if (jSONObject == null || contextD2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString3)) {
                com.mbridge.msdk.foundation.same.a.V = strOptString3;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                SharedPreferences sharedPreferences = contextD2.getSharedPreferences(j0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(j0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f40710g, strOptString4)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f40710g = strOptString4;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, com.mbridge.msdk.foundation.same.a.f40710g);
            SharedPreferences sharedPreferences2 = contextD2.getSharedPreferences(j0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(j0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f40710g);
                editorEdit2.apply();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String a() {
        return this.f42605d;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f42625n = list;
    }

    public void a(long j10) {
        this.f42629p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f42631q = aVar;
    }

    public void a(Map<String, a> map) {
        this.f42635s = map;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(C0319b c0319b) {
        this.J = c0319b;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f42600b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public void b(String str) {
        this.f42605d = str;
    }

    public String b() {
        return this.f42615i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f42603c = jSONArray;
    }

    public void b(boolean z10) {
        this.f42637t = z10;
    }

    public boolean b(int i10) {
        return this.f42644w0.contains(Integer.valueOf(i10));
    }
}
