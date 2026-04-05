package com.pgl.ssdk.ces;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.ironsource.Q6;
import com.pgl.ssdk.a5;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.ai;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.am;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f50429a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f50430b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f50431c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f50432d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static aw.a f50433e;

    /* renamed from: g, reason: collision with root package name */
    public Context f50435g;

    /* renamed from: h, reason: collision with root package name */
    private String f50436h;

    /* renamed from: i, reason: collision with root package name */
    private int f50437i;

    /* renamed from: j, reason: collision with root package name */
    private String f50438j;

    /* renamed from: n, reason: collision with root package name */
    private String f50442n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f50434f = false;

    /* renamed from: k, reason: collision with root package name */
    private String f50439k = null;

    /* renamed from: l, reason: collision with root package name */
    private String f50440l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f50441m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f50443o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f50444p = 2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f50445q = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            z.b(z.b());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0491b implements Runnable {
        public RunnableC0491b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            al.a(b.this.f50435g).a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ab.b(b.this.f50435g);
        }
    }

    private b(Context context, String str) {
        this.f50435g = context;
        this.f50436h = str;
    }

    public static b a(Context context, String str, int i10, int i11, String str2) {
        if (f50429a == null) {
            synchronized (b.class) {
                try {
                    if (f50429a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f50432d = 4;
                            return null;
                        }
                        a(i10);
                        aw.a aVarB = aw.b(context, "nms");
                        if (aVarB != null) {
                            f50432d = aVarB.f50426a;
                            f50433e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f50429a = bVar;
                        bVar.f50437i = i11;
                        f50429a.f50438j = str2;
                        f50429a.b(context);
                        f50429a.d(a(context));
                        z.c(context);
                        f50432d = 0;
                        ar.b(new a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50429a;
    }

    private void b(Context context) {
        if (context == null || f50430b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f50436h);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f50437i));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f50438j);
            f50430b = true;
        } catch (Throwable unused) {
        }
    }

    public static String c() {
        if (h() != null) {
            return h().f50436h;
        }
        return null;
    }

    public static String d() {
        if (h() != null) {
            return h().f50439k;
        }
        return null;
    }

    public static String f() {
        b bVarH = h();
        if (bVarH == null || !bVarH.f50441m || TextUtils.isEmpty(bVarH.f50440l)) {
            return null;
        }
        return bVarH.f50440l;
    }

    public static int g() {
        return f50432d;
    }

    public static b h() {
        return f50429a;
    }

    public static aw.a i() {
        return f50433e;
    }

    public long e() {
        return z.a(this.f50435g);
    }

    public String j() {
        return z.c();
    }

    public String k() {
        return a5.a();
    }

    public void l() {
        this.f50443o = true;
        a5.a(this.f50435g, this.f50436h);
        a("Start", (Map<String, Object>) null);
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f50442n = str;
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f50440l)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f50440l = str;
            a5.b();
        }
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f50439k)) {
            this.f50439k = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
            a5.b();
        }
    }

    public void b() {
        ar.b(new d());
    }

    private static String a(Context context) {
        String strA = ax.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        ax.b(context, "iid", string);
        return string;
    }

    public static void a(int i10) {
        an.a(i10);
    }

    public void a(String str, String str2, String str3, String str4) {
        b(str2);
        c(str4);
        try {
            l();
        } catch (Throwable unused) {
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(224, this.f50435g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public void a(String str, Map<String, Object> map) {
        try {
            long j10 = "Start".equals(str) ? 10000L : 0L;
            Handler handlerB = ar.b();
            if (handlerB != null) {
                handlerB.postDelayed(new ao(this.f50435g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), j10);
                if (this.f50445q && "Start".equals(str)) {
                    handlerB.postDelayed(new RunnableC0491b(), j10 * 2);
                }
            }
            a();
            z.a();
        } catch (Throwable unused) {
        }
    }

    public Object a(int i10, Object obj) {
        if (i10 == 123) {
            return af.a(this.f50435g);
        }
        if (i10 == 121) {
            return ad.a();
        }
        if (i10 == 122) {
            return ad.b();
        }
        if (i10 == 126) {
            return ad.b(this.f50435g);
        }
        if (i10 == 128) {
            return ad.c(this.f50435g);
        }
        if (i10 == 120) {
            return ac.c();
        }
        if (i10 == 124) {
            return ag.c(this.f50435g);
        }
        if (i10 == 130) {
            return ag.a(this.f50435g);
        }
        if (i10 == 145) {
            return ah.c(this.f50435g);
        }
        if (i10 == 125) {
            return ag.b(this.f50435g);
        }
        if (i10 == 129) {
            return ae.f(this.f50435g);
        }
        if (i10 == 141) {
            return ae.e(this.f50435g);
        }
        if (i10 == 134) {
            return ak.a(this.f50435g).b();
        }
        if (i10 == 140) {
            return al.a(this.f50435g).e();
        }
        if (i10 == 144) {
            return al.a(this.f50435g).d();
        }
        if (i10 == 133) {
            return a(obj);
        }
        if (i10 == 135) {
            return v.f();
        }
        if (i10 == 201) {
            return ad.a(this.f50435g);
        }
        if (i10 == 202) {
            return ad.c();
        }
        if (i10 == 236) {
            return ay.a((String) obj);
        }
        if (i10 == 142) {
            return ab.g(this.f50435g);
        }
        if (i10 == 143) {
            return ah.a(this.f50435g);
        }
        if (i10 == 146) {
            try {
                return v.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i10 == 147) {
            return Boolean.valueOf(ab.j(this.f50435g));
        }
        if (i10 == 148) {
            return u.b(this.f50435g);
        }
        if (i10 == 149) {
            return w.a(this.f50435g);
        }
        if (i10 == 150) {
            return Integer.valueOf(x.a());
        }
        if (i10 == 151) {
            return w.c();
        }
        if (i10 == 161) {
            return Boolean.valueOf(v.g());
        }
        if (i10 == 163) {
            return aj.a();
        }
        if (i10 == 169) {
            return Boolean.valueOf(aa.a(this.f50435g));
        }
        if (i10 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i10 == 203) {
            return ab.b();
        }
        if (i10 == 205) {
            return Integer.valueOf(ab.k(this.f50435g));
        }
        if (i10 == 204) {
            return Integer.valueOf(ae.a(this.f50435g));
        }
        if (i10 == 206) {
            return ah.b(this.f50435g);
        }
        return null;
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f50435g);
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            try {
            } finally {
            }
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        if (obj instanceof String) {
                                            an.a((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        if (obj instanceof String) {
                                            a((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        if (obj instanceof Set) {
                                            try {
                                                Set set = (Set) obj;
                                                com.pgl.ssdk.ces.a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                                com.pgl.ssdk.ces.a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                                com.pgl.ssdk.ces.a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                                com.pgl.ssdk.ces.a.meta(168, null, Boolean.valueOf(set.contains(Q6.U0)));
                                                this.f50441m = set.contains(Q6.U0);
                                                break;
                                            } catch (Throwable unused) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        if (obj instanceof String) {
                                            String strA = ai.a((String) obj);
                                            if (TextUtils.isEmpty(strA)) {
                                                break;
                                            } else {
                                                com.pgl.ssdk.ces.a.meta(159, null, strA);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        if (obj instanceof String) {
                                            an.b((String) obj);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        if (obj instanceof String) {
                                            String str2 = (String) obj;
                                            if (TextUtils.isEmpty(str2)) {
                                                break;
                                            } else {
                                                am.a(str2);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    }
                    if (f50431c == null) {
                        f50431c = new HashMap();
                    }
                    f50431c.putAll(map);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (!next.equals("touch_trace_enabled") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            y.f50507g = ((Boolean) obj).booleanValue();
                            break;
                        }
                        break;
                    case -93508180:
                        if (!next.equals("autoctl_detect_enable") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            ak.f50377b = ((Boolean) obj).booleanValue();
                            break;
                        }
                    case 449342513:
                        if (!next.equals("craw_ratio") || !(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
                            break;
                        } else {
                            f.f50468b = ((Integer) obj).intValue();
                            break;
                        }
                        break;
                    case 944591168:
                        if (!next.equals("report_ratio") || !(obj instanceof Integer) || ((Integer) obj).intValue() <= 0) {
                            break;
                        } else {
                            this.f50444p = ((Integer) obj).intValue();
                            break;
                        }
                    case 1286849298:
                        if (!next.equals("app_switch") || !(obj instanceof Boolean)) {
                            break;
                        } else {
                            this.f50445q = ((Boolean) obj).booleanValue();
                            break;
                        }
                        break;
                }
            }
        } catch (JSONException unused) {
        }
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f50431c) == null || map.isEmpty()) {
            return "{}";
        }
        try {
            return new JSONObject(f50431c).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public void a() {
        ar.b(new c());
    }
}
