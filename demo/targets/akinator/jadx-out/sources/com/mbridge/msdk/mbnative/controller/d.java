package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* renamed from: r, reason: collision with root package name */
    private static final String f41726r = "d";

    /* renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f41727s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f41728t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private static Map<String, k> f41729u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f41730v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f41731w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private static d f41732x = null;

    /* renamed from: y, reason: collision with root package name */
    private static int f41733y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f41734z = -2;

    /* renamed from: b, reason: collision with root package name */
    private j f41735b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f41736c;

    /* renamed from: d, reason: collision with root package name */
    private l f41737d;

    /* renamed from: e, reason: collision with root package name */
    private String f41738e;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f41742i;

    /* renamed from: j, reason: collision with root package name */
    private List<Integer> f41743j;

    /* renamed from: k, reason: collision with root package name */
    protected List<Integer> f41744k;

    /* renamed from: l, reason: collision with root package name */
    private List<Integer> f41745l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f41746m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f41747n;

    /* renamed from: o, reason: collision with root package name */
    private int f41748o;

    /* renamed from: p, reason: collision with root package name */
    private int f41749p;

    /* renamed from: f, reason: collision with root package name */
    Queue<Integer> f41739f = null;

    /* renamed from: g, reason: collision with root package name */
    Queue<Long> f41740g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f41741h = 0;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f41750q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.m().d());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* renamed from: c, reason: collision with root package name */
        private int f41752c;

        /* renamed from: d, reason: collision with root package name */
        private int f41753d;

        /* renamed from: e, reason: collision with root package name */
        private int f41754e;

        /* renamed from: f, reason: collision with root package name */
        private int f41755f;

        /* renamed from: g, reason: collision with root package name */
        private int f41756g;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f41759j;

        /* renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f41761l;

        /* renamed from: h, reason: collision with root package name */
        private List<String> f41757h = null;

        /* renamed from: i, reason: collision with root package name */
        private boolean f41758i = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f41760k = true;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f41763a;

            public a(CampaignUnit campaignUnit) {
                this.f41763a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f41759j != null) {
                    b bVar = b.this;
                    d.this.f41714a.removeCallbacks(bVar.f41759j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f41763a);
                }
                if (d.f41727s.containsKey("0_" + b.this.unitId)) {
                    d.f41727s.remove("0_" + b.this.unitId);
                }
                if (b.this.f41756g > 0) {
                    if (this.f41763a.ads.size() > b.this.f41756g) {
                        b bVar2 = b.this;
                        bVar2.f41753d = bVar2.f41756g;
                    } else {
                        b.this.f41753d = this.f41763a.ads.size();
                    }
                } else if (b.this.f41756g == -1) {
                    b.this.f41753d = 0;
                } else if (b.this.f41756g == -3) {
                    b.this.f41753d = this.f41763a.ads.size();
                } else if (b.this.f41756g == -2) {
                    if (this.f41763a.getTemplate() == 3) {
                        if (b.this.f41755f != 0) {
                            b bVar3 = b.this;
                            bVar3.f41753d = bVar3.f41755f;
                        }
                    } else if (b.this.f41754e != 0) {
                        b bVar4 = b.this;
                        bVar4.f41753d = bVar4.f41754e;
                    }
                    if (b.this.f41753d <= 0) {
                        b.this.f41753d = ((Integer) d.f41730v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f41763a.ads.size() < b.this.f41753d) {
                    b.this.f41753d = this.f41763a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f41763a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f41763a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f41763a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.o());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = u0.c(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx);
                    if (arrayList.size() < b.this.f41753d && campaignEx.getOfferType() != 99) {
                        if (u0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            u0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f41746m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f41763a.getAds().get(0) != null ? this.f41763a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) b.this.unitId, (String) arrayList);
                }
                d.a(b.this.f41752c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f41763a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f41763a.getAds().get(0).getMaitve(), this.f41763a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        public class C0292b extends c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f41765a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f41766b;

            public C0292b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f41765a = campaignEx;
                this.f41766b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f41765a, this.f41766b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41768a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f41769b;

            public c(String str, int i10) {
                this.f41768a = str;
                this.f41769b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f41758i) {
                    if (b.this.f41759j != null) {
                        b bVar = b.this;
                        d.this.f41714a.removeCallbacks(bVar.f41759j);
                    }
                    if (b.this.a() == 1 || b.this.f41760k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f41768a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f41761l);
                    }
                } else if (b.this.f41760k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f41768a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f41761l);
                }
                if (this.f41769b == -1) {
                    d.b(b.this.f41752c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        public class RunnableC0293d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f41771a;

            public RunnableC0293d(List list) {
                this.f41771a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f41758i && b.this.f41759j != null) {
                    b bVar = b.this;
                    d.this.f41714a.removeCallbacks(bVar.f41759j);
                }
                List list = this.f41771a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f41771a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f41746m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f41771a);
                    if (d.f41727s.containsKey("1_" + b.this.unitId)) {
                        d.f41727s.remove("1_" + b.this.unitId);
                    }
                    d.f41727s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f41752c = i10;
        }

        public void b(List<String> list) {
            this.f41757h = list;
        }

        public void c(int i10) {
            this.f41754e = i10;
        }

        public void d(int i10) {
            this.f41753d = i10;
        }

        public void e(int i10) {
            this.f41755f = i10;
        }

        public void b(int i10) {
            this.f41756g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f41761l = aVar;
        }

        public void b(boolean z10) {
            this.f41760k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f41758i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f41747n = true;
            d.this.a(true, this.f41761l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0292b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f41759j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0293d(list)));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f41773a;

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f41774b;

        /* renamed from: c, reason: collision with root package name */
        private int f41775c;

        /* renamed from: d, reason: collision with root package name */
        private String f41776d;

        /* renamed from: e, reason: collision with root package name */
        private String f41777e;

        /* renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f41778f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f41779g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f41773a = i10;
            this.f41774b = dVar;
            this.f41775c = i11;
            this.f41776d = str;
            this.f41777e = str2;
        }

        public void a(boolean z10) {
            this.f41779g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41774b.a(true);
            int i10 = this.f41773a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f41775c, this.f41776d, this.f41777e, this.f41778f);
            } else {
                d.this.f41747n = true;
                if (this.f41779g || this.f41775c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f41775c, this.f41776d, this.f41777e, this.f41778f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f41778f = aVar;
        }

        public void a(String str) {
            this.f41776d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f41714a = new a();
    }

    public static Map<String, Integer> c() {
        return f41730v;
    }

    public static Map<String, Integer> d() {
        return f41731w;
    }

    public static Map<String, k> e() {
        return f41729u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f41727s;
    }

    public static Map<String, Boolean> g() {
        return f41728t;
    }

    public static void b(int i10, String str) {
        if (f41729u.containsKey(str)) {
            k kVar = f41729u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f41729u.put(str, kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02d5 A[Catch: Exception -> 0x0072, TryCatch #5 {Exception -> 0x0072, blocks: (B:3:0x0021, B:6:0x002e, B:8:0x0056, B:13:0x0075, B:16:0x007d, B:18:0x0083, B:19:0x008f, B:21:0x0093, B:23:0x00a6, B:25:0x00ac, B:26:0x00b8, B:28:0x00be, B:29:0x00c6, B:31:0x00ce, B:33:0x00dc, B:35:0x010a, B:37:0x0110, B:39:0x0124, B:40:0x012c, B:42:0x013d, B:46:0x0146, B:57:0x0177, B:59:0x0189, B:61:0x018f, B:63:0x0198, B:65:0x01ae, B:67:0x01b4, B:69:0x01bc, B:70:0x01ca, B:72:0x01d9, B:73:0x01df, B:75:0x01e7, B:77:0x01ef, B:82:0x0203, B:84:0x021f, B:86:0x0225, B:87:0x0232, B:89:0x0238, B:90:0x0244, B:92:0x0248, B:94:0x024e, B:95:0x025b, B:97:0x0261, B:98:0x0278, B:120:0x02c7, B:122:0x02d5, B:124:0x02df, B:147:0x039f, B:150:0x03aa, B:56:0x0170, B:22:0x00a3, B:47:0x0150, B:49:0x0156, B:51:0x0165, B:52:0x0167, B:54:0x016d, B:125:0x02ea, B:127:0x0300, B:129:0x031b, B:131:0x0323, B:133:0x0329, B:134:0x032b, B:136:0x0331, B:137:0x0337, B:139:0x033d, B:141:0x034d, B:142:0x0350, B:143:0x0353, B:145:0x0359), top: B:168:0x0021, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0300 A[Catch: all -> 0x039f, TryCatch #6 {all -> 0x039f, blocks: (B:125:0x02ea, B:127:0x0300, B:129:0x031b, B:131:0x0323, B:133:0x0329, B:134:0x032b, B:136:0x0331, B:137:0x0337, B:139:0x033d, B:141:0x034d, B:142:0x0350, B:143:0x0353, B:145:0x0359), top: B:169:0x02ea, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map<java.lang.String, java.lang.Object> r21, int r22) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
            return 0;
        } catch (Exception e10) {
            p0.b(f41726r, com.mbridge.msdk.mbnative.common.a.a(e10));
            return 0;
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f41737d = lVarE;
        if (lVarE == null) {
            this.f41737d = l.i(str);
        }
        List<Integer> listB = this.f41737d.b();
        this.f41743j = listB;
        if (listB == null || listB.size() <= 0 || !this.f41743j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i10);
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f41739f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f41739f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f41740g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f41740g.poll().longValue();
            }
            p0.c(f41726r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f41742i, i10, lVar, aVar);
        } catch (Throwable unused) {
            p0.b(f41726r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) throws JSONException {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        List<Campaign> listA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null && (listA = bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, this.f41749p)) != null && listA.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0292 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c7 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030d A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035c A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0369 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039b A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f7 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0426 A[Catch: Exception -> 0x0096, TryCatch #2 {Exception -> 0x0096, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:19:0x0099, B:21:0x00a3, B:22:0x00ad, B:24:0x00b7, B:26:0x00c1, B:28:0x00c7, B:29:0x00d0, B:31:0x00e9, B:32:0x00f0, B:34:0x00f6, B:35:0x00fb, B:37:0x0122, B:38:0x0127, B:45:0x0143, B:48:0x014b, B:50:0x0153, B:52:0x0159, B:54:0x015e, B:56:0x0162, B:61:0x016f, B:63:0x0177, B:65:0x017d, B:70:0x0189, B:71:0x019b, B:73:0x019f, B:75:0x01ba, B:77:0x01c2, B:79:0x01d1, B:80:0x01e2, B:84:0x01f3, B:86:0x01f9, B:88:0x020d, B:90:0x0213, B:95:0x021c, B:97:0x0222, B:102:0x0232, B:109:0x0255, B:116:0x0269, B:118:0x0292, B:119:0x0299, B:121:0x02a1, B:123:0x02b3, B:124:0x02bc, B:126:0x02c7, B:132:0x02d7, B:137:0x02e8, B:142:0x02f5, B:146:0x0321, B:148:0x035c, B:149:0x0361, B:151:0x0369, B:153:0x0373, B:154:0x0393, B:156:0x039b, B:158:0x03a5, B:159:0x03c6, B:163:0x03fa, B:165:0x0426, B:169:0x045a, B:168:0x0443, B:162:0x03f7, B:145:0x030d, B:134:0x02dd, B:135:0x02e2, B:108:0x024a, B:110:0x0259, B:170:0x0460), top: B:178:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043a  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r26, long r27, int r29, com.mbridge.msdk.setting.l r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.preload.listenter.a r33, boolean r34) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.setting.l, java.lang.String, java.lang.String, com.mbridge.msdk.preload.listenter.a, boolean):void");
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f41729u.containsKey(str)) {
            kVar = f41729u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f41730v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = kVar.a() + iIntValue;
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = kVar.b() + iIntValue;
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f41729u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f41726r, str);
        try {
            Queue<Integer> queue = this.f41739f;
            if (queue == null || queue.size() > 0) {
                if (this.f41739f != null) {
                    a(i10, this.f41737d, str2, str3, aVar);
                    return;
                }
            }
            a(false, aVar, str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f41735b == null) {
            this.f41735b = new j();
        }
        this.f41735b.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f42039p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.m().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        p0.b(f41726r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                p0.b(f41726r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}
