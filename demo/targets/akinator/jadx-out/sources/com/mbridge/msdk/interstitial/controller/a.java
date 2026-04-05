package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: o, reason: collision with root package name */
    public static String f41300o;

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f41301p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f41302q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static Map<String, d> f41303r = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Context f41305b;

    /* renamed from: c, reason: collision with root package name */
    private String f41306c;

    /* renamed from: d, reason: collision with root package name */
    private String f41307d;

    /* renamed from: e, reason: collision with root package name */
    private String f41308e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f41309f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f41310g;

    /* renamed from: h, reason: collision with root package name */
    private l f41311h;

    /* renamed from: i, reason: collision with root package name */
    private InterstitialListener f41312i;

    /* renamed from: a, reason: collision with root package name */
    private String f41304a = "InterstitialController";

    /* renamed from: j, reason: collision with root package name */
    public boolean f41313j = false;

    /* renamed from: k, reason: collision with root package name */
    private String f41314k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f41315l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f41316m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f41317n = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    public class HandlerC0281a extends Handler {
        public HandlerC0281a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f41312i != null) {
                    a.this.f41312i.onInterstitialLoadSuccess(a.this.f41309f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f41312i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f41312i.onInterstitialLoadFail(a.this.f41309f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f41313j = true;
                if (aVar.f41312i != null) {
                    a.this.f41312i.onInterstitialShowSuccess(a.this.f41309f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f41312i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f41312i.onInterstitialShowFail(a.this.f41309f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f41312i != null) {
                    a.this.f41312i.onInterstitialAdClick(a.this.f41309f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f41313j = false;
                if (aVar2.f41312i != null) {
                    a.this.f41312i.onInterstitialClosed(a.this.f41309f);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f41319a;

        /* renamed from: b, reason: collision with root package name */
        private c f41320b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f41319a = aVar;
            this.f41320b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f41319a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f41319a = null;
                }
                if (this.f41320b != null) {
                    if (a.this.f41310g != null) {
                        a.this.f41310g.removeCallbacks(this.f41320b);
                    }
                    if (z10) {
                        if (a.this.f41312i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f41312i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f41314k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f41319a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f41319a.d());
                    }
                    a.this.f41315l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    p0.b(a.this.f41304a, e10.getMessage());
                }
                if (this.f41320b != null) {
                    if (a.this.f41310g != null) {
                        a.this.f41310g.removeCallbacks(this.f41320b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f41312i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f41322a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f41322a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f41322a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f41312i != null) {
                        a.this.b("load timeout");
                    }
                    this.f41322a.a((b) null);
                    this.f41322a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f41310g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f41310g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new j().a(this.f41305b, (String) null, (String) null, this.f41306c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f41305b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f41306c)) {
                c("unitid is null");
            } else if (!this.f41317n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f41310g != null) {
                    a.this.f41310g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f41310g != null) {
                    a.this.f41310g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f41306c);
            this.f41311h = lVarE;
            if (lVarE == null) {
                this.f41311h = l.h(this.f41306c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f41305b == null) {
                b(gjnZrsdA.AjKSCwWnkxFfu);
                return;
            }
            if (TextUtils.isEmpty(this.f41306c)) {
                b("unitid is null");
            } else {
                if (!this.f41317n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f41310g = new HandlerC0281a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f41311h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f41311h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f41302q == null || TextUtils.isEmpty(this.f41306c)) {
                    return;
                }
                f41302q.put(this.f41306c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f41313j) {
            return this.f41316m;
        }
        return this.f41314k;
    }

    public static void a(String str, int i10) {
        try {
            if (f41301p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f41301p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f41310g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f41310g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f41305b, this.f41306c, this.f41307d, this.f41308e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f41312i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f41301p) == null || !map.containsKey(str) || (num = f41301p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f41312i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f41317n = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f41317n = false;
        }
        if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                this.f41308e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            this.f41306c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.f41305b = context;
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                this.f41307d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            this.f41309f = new MBridgeIds(this.f41307d, this.f41306c);
            this.f41317n = true;
            return this.f41317n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f41310g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f41310g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f41315l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
        } catch (Exception e10) {
            e = e10;
            z11 = z10;
        }
        try {
            com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f41305b, this.f41306c, this.f41307d, this.f41308e, z11);
            c cVar = new c(aVar);
            aVar.a(new b(aVar, cVar));
            Handler handler = this.f41310g;
            if (handler != null) {
                handler.postDelayed(cVar, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
            aVar.j();
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
            if (z11) {
                return;
            }
            b("can't show because unknow error");
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f41303r != null && !TextUtils.isEmpty(this.f41306c)) {
            f41303r.put(this.f41306c, dVar);
        }
        Intent intent = new Intent(this.f41305b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f41306c)) {
            intent.putExtra("unitId", this.f41306c);
        }
        if (campaignEx != null) {
            this.f41316m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f41305b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
