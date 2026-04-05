package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: b0, reason: collision with root package name */
    public static String f42446b0 = "";

    /* renamed from: c0, reason: collision with root package name */
    public static String f42447c0;

    /* renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f42448d0 = new ConcurrentHashMap<>();

    /* renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f42449e0 = new ConcurrentHashMap<>();

    /* renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f42450f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* renamed from: a, reason: collision with root package name */
    private Context f42451a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f42453b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f42454c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f42455d;

    /* renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f42456e;

    /* renamed from: f, reason: collision with root package name */
    private volatile h f42457f;

    /* renamed from: g, reason: collision with root package name */
    private String f42458g;

    /* renamed from: h, reason: collision with root package name */
    private String f42459h;

    /* renamed from: i, reason: collision with root package name */
    private MBridgeIds f42460i;

    /* renamed from: j, reason: collision with root package name */
    g f42461j;

    /* renamed from: k, reason: collision with root package name */
    private String f42462k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f42463l;

    /* renamed from: m, reason: collision with root package name */
    private String f42464m;

    /* renamed from: q, reason: collision with root package name */
    private int f42468q;

    /* renamed from: r, reason: collision with root package name */
    private int f42469r;

    /* renamed from: s, reason: collision with root package name */
    private int f42470s;

    /* renamed from: x, reason: collision with root package name */
    private boolean f42475x;

    /* renamed from: n, reason: collision with root package name */
    private int f42465n = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f42467p = 2;

    /* renamed from: t, reason: collision with root package name */
    private boolean f42471t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f42472u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f42473v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f42474w = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f42476y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f42477z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    int F = 25;
    int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    volatile boolean U = false;
    volatile boolean V = false;
    volatile boolean W = false;
    volatile boolean X = false;
    volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* renamed from: a0, reason: collision with root package name */
    private int f42452a0 = 1;

    /* renamed from: o, reason: collision with root package name */
    private Handler f42466o = new com.mbridge.msdk.reward.controller.b(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements b.n {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f42498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f42500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f42501d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42502e;

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f42499b = campaignEx;
            this.f42500c = copyOnWriteArrayList;
            this.f42501d = z10;
            this.f42502e = i10;
            this.f42498a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.e().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f42498a == null) {
                this.f42498a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f42498a.b(this.f42500c);
            this.f42498a.a(bVar);
            if (!this.f42501d && a.this.f42457f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f42457f.b(bVar, this.f42498a);
                return;
            }
            if (this.f42502e != 1 || a.this.X || a.this.f42457f == null) {
                return;
            }
            a.this.X = true;
            a.this.f42457f.b(bVar, this.f42498a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f42459h);
                }
            } catch (Throwable unused) {
                p0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f42517a;

        /* renamed from: b, reason: collision with root package name */
        private final int f42518b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42519c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f42520d = false;

        /* renamed from: e, reason: collision with root package name */
        private int f42521e;

        /* renamed from: f, reason: collision with root package name */
        private String f42522f;

        /* renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f42523g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f42517a = cVar;
            this.f42518b = i10;
            this.f42519c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f42522f = str;
            this.f42523g = cVar2;
        }

        public void a() {
            this.f42520d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f42520d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f42517a;
            if (cVar != null) {
                cVar.c(true);
            }
            p0.b("RewardVideoController", "adSource=" + this.f42518b + " CommonCancelTimeTask mIsDevCall：" + this.f42519c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f42523g);
        }

        public void a(int i10) {
            this.f42521e = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f42525a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f42526b;

        /* renamed from: c, reason: collision with root package name */
        private f f42527c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f42525a = cVar;
            this.f42526b = z10;
        }

        public void a(f fVar) {
            this.f42527c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f42527c;
            if (fVar != null) {
                fVar.a();
                a.this.f42466o.removeCallbacks(this.f42527c);
            }
            if (a.this.f42457f != null) {
                a.this.f42457f.a(a.this.f42463l, a.this.f42459h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f42527c;
            if (fVar != null) {
                fVar.a();
                a.this.f42466o.removeCallbacks(this.f42527c);
            }
            a.this.a(list);
            if (a.this.f42457f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f42451a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f42452a0 <= 1) {
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                            if (cVar != null) {
                                cVar.a(bVarA);
                                cVar.b(true);
                            }
                            a.this.f42457f.a(bVarA, cVar);
                            return;
                        }
                        a.m(a.this);
                        return;
                    }
                }
                a.this.f42457f.c(a.this.f42463l, a.this.f42459h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f42527c;
            if (fVar != null) {
                fVar.a();
                a.this.f42466o.removeCallbacks(this.f42527c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f42525a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f42525a = null;
            }
            a.this.a(list);
            if (a.this.f42457f != null) {
                a.this.f42457f.a(bVar, cVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class h {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f42529a;

        /* renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f42530b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f42531c;

        /* renamed from: d, reason: collision with root package name */
        private String f42532d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42533e;

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0310a c0310a) {
            this(interVideoOutListener, handler, str);
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f42531c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f42530b.get() == 2 || this.f42531c == null) {
                return;
            }
            a.m(a.this);
            this.f42530b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f42531c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f42531c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f42530b.get() == 2 || this.f42531c == null) {
                return;
            }
            if (this.f42530b.get() == 1) {
                this.f42530b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f42531c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f42530b.set(2);
            }
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f42529a = new WeakReference<>(interVideoOutListener);
            this.f42530b = new AtomicInteger(0);
            this.f42531c = handler;
            this.f42532d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f42531c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.o());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f42531c.sendMessage(messageObtain);
                if (r0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f42530b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f42530b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f42530b.get() != 1 && this.f42530b.get() != 3) || this.f42531c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.o());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f42531c.sendMessage(messageObtain);
                if (r0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f42531c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.o());
                    messageObtain.setData(bundle);
                }
                this.f42531c.sendMessage(messageObtain);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.mbridge.msdk.foundation.error.b r12, com.mbridge.msdk.foundation.same.report.metrics.c r13) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.h.a(com.mbridge.msdk.foundation.error.b, com.mbridge.msdk.foundation.same.report.metrics.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strG;
            WeakReference<InterVideoOutListener> weakReference = this.f42529a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f42530b.get() == 2 || this.f42531c == null) {
                return;
            }
            a.this.Q = true;
            if (bVar != null) {
                strG = bVar.g();
            } else {
                strG = "";
            }
            if (strG.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f42530b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strG;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.o());
                        messageObtain.setData(bundle);
                    }
                    this.f42531c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f42530b.set(2);
            b(str, cVar);
        }

        public void a(boolean z10) {
            this.f42533e = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* renamed from: c, reason: collision with root package name */
        private a f42535c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f42536d;

        /* renamed from: e, reason: collision with root package name */
        private int f42537e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        public class RunnableC0317a implements Runnable {
            public RunnableC0317a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f42535c != null) {
                    i.this.f42535c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f42471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f42459h, true, 1));
                }
            }
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0310a c0310a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f42535c;
                if (aVar == null || aVar.f42456e == null) {
                    return;
                }
                try {
                    this.f42535c.f42456e.onVideoComplete(a.this.f42460i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f42537e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f42535c = null;
        }

        private i(a aVar, Handler handler) {
            this.f42537e = 0;
            this.f42535c = aVar;
            this.f42536d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a aVar = a.this;
            aVar.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar2 = new com.mbridge.msdk.reward.candidate.a(aVar.f42459h, a.this.f42471t);
                a aVar3 = this.f42535c;
                aVar2.a(cVar.o(), (aVar3 == null || aVar3.f42453b == null) ? "" : this.f42535c.f42453b.H, 3, a.f42446b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar4 = this.f42535c;
                if (aVar4 != null) {
                    aVar4.C = true;
                    if (this.f42535c.f42453b != null) {
                        this.f42535c.f42453b.H = "";
                    }
                    this.f42535c.q();
                    if (a.this.f42472u) {
                        a.this.a();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", cVar, aVar5.f42456e, "");
                    b();
                    if (this.f42535c.f42456e != null) {
                        this.f42535c.f42456e.onAdShow(a.this.f42460i);
                        this.f42537e = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f42535c;
                if (aVar != null && aVar.f42456e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f42535c.f42464m);
                    }
                    if (a.this.f42472u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f42459h, a.this.m());
                    }
                    this.f42535c.f42456e.onAdClose(a.this.f42460i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f42537e = 7;
                    this.f42535c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f42535c != null) {
                    if (aVar.f42472u) {
                        a.this.a();
                    }
                    this.f42535c.C = false;
                    a.this.a("2000131", cVar, this.f42535c.f42456e, str);
                    a();
                    if (this.f42535c.f42456e != null) {
                        try {
                            this.f42535c.f42456e.onShowFail(cVar, a.this.f42460i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                p0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f42537e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f42537e = 0;
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f42535c;
                if (aVar == null || aVar.f42456e == null) {
                    return;
                }
                if (a.this.f42472u) {
                    a.this.a();
                }
                this.f42535c.C = false;
                try {
                    this.f42535c.f42456e.onVideoAdClicked(z10, a.this.f42460i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f42535c;
                if (aVar == null || aVar.f42456e == null) {
                    return;
                }
                try {
                    this.f42535c.f42456e.onAdCloseWithIVReward(a.this.f42460i, new RewardInfo(z10, i10));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f42535c;
                if (aVar == null || aVar.f42456e == null) {
                    return;
                }
                try {
                    this.f42535c.f42456e.onEndcardShow(a.this.f42460i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f42537e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f42537e = i10;
            a aVar = this.f42535c;
            if (aVar == null || aVar.f42472u || this.f42535c.f42471t || this.f42535c.f42454c == null || !this.f42535c.f42454c.a(this.f42537e) || this.f42535c.f42457f == null || this.f42535c.f42457f.a() == 1 || this.f42535c.f42457f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f42537e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f42537e));
            int iF = this.f42535c.f42454c.f() * 1000;
            if (this.f42537e == 4) {
                iF = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
            }
            Handler handler = this.f42536d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f42536d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0317a(), iF);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f42452a0++;
            a aVar = a.this;
            aVar.b(aVar.f42475x, str, cVar);
        }
    }

    public static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f42452a0;
        aVar.f42452a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f42451a)).b(this.f42459h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f42451a)).c(this.f42459h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f42459h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.e(this.f42459h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void f(boolean z10) {
        this.f42476y = z10;
    }

    public MBridgeIds g() {
        return this.f42460i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f42453b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f42457f;
    }

    public String l() {
        return this.f42463l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f42453b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f42453b;
    }

    public InterVideoOutListener o() {
        return this.f42456e;
    }

    public String p() {
        return this.f42459h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f42472u;
    }

    public boolean s() {
        return this.f42475x;
    }

    public boolean t() {
        return this.f42471t;
    }

    public boolean u() {
        return (this.f42456e == null || this.f42457f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f42449e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f42449e0.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(u0.d());
            } else {
                strA = a(str);
            }
            this.A = strA;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(strA);
            cVar2.n(this.f42459h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (z10) {
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            }
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d())).b(list, str);
            } catch (Throwable th2) {
                p0.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f42451a, this.f42463l, this.f42459h);
        this.f42453b = cVar;
        cVar.d(this.f42471t);
        this.f42453b.e(this.f42472u);
        if (this.f42471t) {
            this.f42453b.a(this.f42468q, this.f42469r, this.f42470s);
        }
        this.f42453b.a(this.f42454c);
    }

    public void d(boolean z10) {
        this.f42471t = z10;
        if (z10) {
            this.f42467p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.f42467p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e(boolean z10) {
        this.f42472u = z10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements b.n {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f42504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f42506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f42507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f42508e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f42509f;

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f42505b = campaignEx;
            this.f42506c = copyOnWriteArrayList;
            this.f42507d = cVar;
            this.f42508e = z10;
            this.f42509f = i10;
            this.f42504a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f42466o == null) {
                return;
            }
            a.this.W = true;
            a.this.f42466o.post(new RunnableC0315a(str3, str, str2));
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.e().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f42504a == null) {
                this.f42504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f42504a.a(bVar);
            this.f42504a.b(this.f42506c);
            a.this.V = false;
            if (a.this.f42457f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f42457f.b(bVar, this.f42504a);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        public class RunnableC0315a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42511a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42512b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42513c;

            public RunnableC0315a(String str, String str2, String str3) {
                this.f42511a = str;
                this.f42512b = str2;
                this.f42513c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f42476y;
                Handler handler = a.this.f42466o;
                boolean z11 = a.this.f42471t;
                boolean z12 = a.this.f42472u;
                String str = this.f42511a;
                String requestIdNotice = d.this.f42505b.getRequestIdNotice();
                String str2 = this.f42512b;
                String str3 = this.f42513c;
                String cMPTEntryUrl = d.this.f42505b.getCMPTEntryUrl();
                int i10 = a.this.f42467p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f42505b, dVar.f42506c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f42505b.getCMPTEntryUrl()), this.f42513c, a.this.f42454c, new C0316a(), true);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            public class C0316a implements b.o {
                public C0316a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0355a c0355a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f42507d;
                    if (cVar != null && cVar.a(dVar.f42506c, dVar.f42508e, dVar.f42509f)) {
                        if (a.this.f42457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        p0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f42506c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f42504a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f42506c);
                        }
                        a.this.f42457f.d(str2, str3, d.this.f42504a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f42504a == null) {
                        dVar4.f42504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f42504a.b(dVar5.f42506c);
                    d.this.f42504a.a(bVarA);
                    a.this.f42457f.b(bVarA, d.this.f42504a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0355a c0355a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0315a runnableC0315a = RunnableC0315a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0315a.f42513c, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f42504a == null) {
                        dVar.f42504a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f42504a.b(dVar2.f42506c);
                    d.this.f42504a.a(bVar);
                    a.this.f42457f.b(bVar, d.this.f42504a);
                }
            }
        }
    }

    public void e() {
        n0.b();
    }

    private boolean d() {
        if (this.f42453b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f42453b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f42451a = com.mbridge.msdk.foundation.controller.c.m().d();
            this.f42459h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f42463l = str;
            this.f42460i = new MBridgeIds(this.f42463l, this.f42459h);
            this.f42455d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f42451a, this.f42459h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d());
            }
        } catch (Throwable th2) {
            p0.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public void a(int i10) {
        this.f42467p = i10;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f42459h);
            cVar.a(this.f42471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            x0.b(this.f42451a, "MBridge_ConfirmTitle" + this.f42459h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            x0.b(this.f42451a, "MBridge_ConfirmContent" + this.f42459h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            x0.b(this.f42451a, "MBridge_CancelText" + this.f42459h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        x0.b(this.f42451a, "MBridge_ConfirmText" + this.f42459h, str3.trim());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements b.h {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f42479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f42481c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f42482d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f42483e;

        public b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f42480b = campaignEx;
            this.f42481c = z10;
            this.f42482d = cVar;
            this.f42483e = i10;
            this.f42479a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f42481c) {
                if (!a.this.V || a.this.W || a.this.f42466o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f42466o.post(new RunnableC0313b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().e()) || next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f42466o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f42482d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f42481c, this.f42483e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f42457f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f42479a == null) {
                                this.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f42479a.b(a.this.S);
                            this.f42479a.a(bVarA);
                            a.this.f42457f.b(bVarA, this.f42479a);
                        }
                    } else if (a.this.f42457f != null && !a.this.Y) {
                        a.this.Y = true;
                        p0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f42479a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f42457f.d(str, str2, this.f42479a);
                    }
                } else {
                    a.this.f42466o.post(new RunnableC0311a(next, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        public class RunnableC0311a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f42485a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f42486b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42487c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42488d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f42489e;

            public RunnableC0311a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f42485a = campaignEx;
                this.f42486b = copyOnWriteArrayList;
                this.f42487c = str;
                this.f42488d = str2;
                this.f42489e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f42476y, a.this.f42466o, a.this.f42471t, a.this.f42472u, null, this.f42485a.getRewardTemplateMode().e(), a.this.f42467p, b.this.f42480b, this.f42486b, H5DownLoadManager.getInstance().getH5ResAddress(this.f42485a.getRewardTemplateMode().e()), this.f42487c, this.f42488d, this.f42489e, this.f42485a.getRequestIdNotice(), a.this.f42454c, new C0312a());
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            public class C0312a implements b.o {
                public C0312a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0355a c0355a) {
                    RunnableC0311a runnableC0311a = RunnableC0311a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f42482d;
                    if (cVar != null && cVar.a(runnableC0311a.f42486b, bVar.f42481c, bVar.f42483e)) {
                        if (a.this.f42457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0311a runnableC0311a2 = RunnableC0311a.this;
                        a.this.a(runnableC0311a2.f42486b);
                        a.this.f42457f.d(str2, str3, b.this.f42479a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f42479a == null) {
                        bVar2.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0311a runnableC0311a3 = RunnableC0311a.this;
                    b.this.f42479a.b(runnableC0311a3.f42486b);
                    b.this.f42479a.a(bVarA);
                    a.this.f42457f.b(bVarA, b.this.f42479a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0355a c0355a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0311a runnableC0311a = RunnableC0311a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0311a.f42488d, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f42479a == null) {
                        bVar2.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f42479a.b(a.this.S);
                    b.this.f42479a.a(bVar);
                    a.this.f42457f.b(bVar, b.this.f42479a);
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        public class RunnableC0313b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42492a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42493b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42494c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f42495d;

            public RunnableC0313b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f42492a = str;
                this.f42493b = str2;
                this.f42494c = str3;
                this.f42495d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f42476y, a.this.f42466o, a.this.f42471t, a.this.f42472u, this.f42492a, b.this.f42480b.getRequestIdNotice(), this.f42493b, this.f42494c, b.this.f42480b.getCMPTEntryUrl(), a.this.f42467p, b.this.f42480b, this.f42495d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f42480b.getCMPTEntryUrl()), this.f42494c, a.this.f42454c, new C0314a(), true);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            public class C0314a implements b.o {
                public C0314a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0355a c0355a) {
                    RunnableC0313b runnableC0313b = RunnableC0313b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f42482d;
                    if (cVar != null && cVar.a(runnableC0313b.f42495d, bVar.f42481c, bVar.f42483e)) {
                        if (a.this.f42457f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        p0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0313b runnableC0313b2 = RunnableC0313b.this;
                        a.this.a(runnableC0313b2.f42495d);
                        RunnableC0313b runnableC0313b3 = RunnableC0313b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f42479a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0313b3.f42495d);
                        }
                        a.this.f42457f.d(str2, str3, b.this.f42479a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f42479a == null) {
                        bVar2.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f42479a.a(bVarA);
                    RunnableC0313b runnableC0313b4 = RunnableC0313b.this;
                    b.this.f42479a.b(runnableC0313b4.f42495d);
                    a.this.f42457f.b(bVarA, b.this.f42479a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0355a c0355a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0313b runnableC0313b = RunnableC0313b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0313b.f42494c, (List<CampaignEx>) aVar.T);
                    if (a.this.f42457f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f42479a == null) {
                        bVar2.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0313b runnableC0313b2 = RunnableC0313b.this;
                    b.this.f42479a.b(runnableC0313b2.f42495d);
                    b.this.f42479a.a(bVar);
                    a.this.f42457f.b(bVar, b.this.f42479a);
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f42459h, (List<CampaignEx>) a.this.T);
            if (a.this.f42457f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f42479a == null) {
                this.f42479a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f42479a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f42479a.a(bVar);
            a.this.f42457f.b(bVar, this.f42479a);
        }
    }

    public boolean c(boolean z10) {
        try {
            if (c()) {
                if (z10) {
                    d("is_ready_start", "over cap check error");
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 10);
                    cVar.a("m_offer_ready", eVar);
                    a(false, cVar, (List<CampaignEx>) this.f42453b.h());
                }
            } else if (this.f42472u) {
                try {
                    return a(z10);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } else {
                return d();
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", th2.getMessage());
            }
        }
        return false;
    }

    public void a(int i10, int i11, int i12) {
        this.f42468q = i10;
        this.f42469r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f42470s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f42470s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.h.b().i(this.f42459h, jSONObject.toString());
        } catch (Exception unused) {
            p0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    public class C0310a implements com.mbridge.msdk.videocommon.net.c {
        public C0310a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f42457f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f42457f.a(strB, cVar);
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f42454c == null) {
                this.f42454c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42459h, this.f42471t);
            }
            int iK = this.f42454c.k();
            if (hVarA != null) {
                return hVarA.a(this.f42459h, iK);
            }
            return false;
        } catch (Throwable unused) {
            p0.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f42448d0 == null || !z0.b(str)) {
                return;
            }
            f42448d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f42459h, str, vcn);
                        return copyOnWriteArrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f42449e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f42449e0.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f42460i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f42449e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f42449e0.get(strM))) {
                    str = f42449e0.get(strM);
                }
                this.f42460i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f42456e = interVideoOutListener;
        this.f42457f = new h(this, interVideoOutListener, this.f42466o, this.f42459h, null);
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a aVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f42477z = str;
        if (this.f42457f == null) {
            aVar = this;
            aVar.f42457f = new h(aVar, null, this.f42466o, this.f42459h, null);
        } else {
            aVar = this;
        }
        if (aVar.f42457f != null && aVar.f42457f.a() == 1) {
            a(z10, cVarB);
            return;
        }
        aVar.f42452a0 = 1;
        if (aVar.f42457f != null && aVar.f42457f.a() == 3) {
            aVar.L = false;
        } else {
            aVar.L = true;
            if (aVar.f42457f != null) {
                aVar.f42457f.a(1);
            }
        }
        aVar.f42475x = z10;
        aVar.f42466o.removeMessages(1001001);
        aVar.O = false;
        aVar.N = false;
        aVar.P = false;
        aVar.Q = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (aVar.f42471t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(aVar.f42463l, aVar.f42459h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(aVar.f42463l, aVar.f42459h);
                }
            }
            if (aVar.f42472u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), aVar.f42459h);
            aVar.f42454c = cVarC;
            if (cVarC == null) {
                aVar.J = com.mbridge.msdk.foundation.controller.c.m().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(aVar.J, com.mbridge.msdk.foundation.controller.c.m().c(), aVar.f42459h, new C0310a());
                aVar.f42454c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), aVar.f42459h, aVar.f42471t);
            }
            if (!TextUtils.isEmpty(aVar.f42463l)) {
                aVar.f42454c.f(aVar.f42463l);
            }
            int iN = aVar.f42454c.n() * 1000;
            if (aVar.f42466o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.o());
                    messageObtain.setData(bundle);
                }
                aVar.f42466o.sendMessageDelayed(messageObtain, iN);
            }
            aVar.I = aVar.f42454c.z();
            try {
                a(z10, str, cVarB);
            } catch (Exception e10) {
                if (aVar.f42457f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    aVar.f42457f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (aVar.f42457f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                aVar.f42457f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f42453b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f42451a, this.f42463l, str);
                this.f42453b = cVar2;
                cVar2.d(this.f42471t);
                this.f42453b.e(this.f42472u);
            }
            this.f42453b.a(this.f42467p);
            this.f42453b.a(this.f42454c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f42472u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f42472u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                this.S = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.S.add(campaignEx);
            }
            a(this.S);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[Catch: Exception -> 0x00e5, TRY_ENTER, TryCatch #2 {Exception -> 0x00e5, blocks: (B:3:0x002c, B:11:0x005c, B:14:0x006b, B:19:0x008f, B:10:0x0043), top: B:39:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r9, java.lang.String r10, com.mbridge.msdk.foundation.same.report.metrics.c r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.b(boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f42457f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f42457f.a("bidToken is empty", cVar);
        }
    }

    private boolean b() {
        if (this.f42453b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f42459h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f42453b.c(cVar.a());
                this.f42453b.b(cVar.d());
                if (this.f42453b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f42459h, cVar.a());
            }
        }
        return false;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f42475x) {
            if (z10) {
                this.f42475x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f42457f.b(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f42451a));
                if (eVarA != null && (listE = eVarA.e(this.f42459h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().z()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = cVar;
        if (this.f42457f != null) {
            if (!this.f42472u) {
                this.R = b(this.f42459h, cVar2.o());
                if (this.R) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("cache", 1);
                            cVar2.a("2000127", eVar);
                            cVar2.a("2000048", eVar);
                            cVar2.a(copyOnWriteArrayList);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                p0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f42457f.b(this.f42463l, this.f42459h, cVar2);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f42457f.a(this.f42472u);
                        com.mbridge.msdk.reward.adapter.c cVar3 = this.f42453b;
                        if (cVar3 != null && cVar3.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f42457f.d(this.f42463l, this.f42459h, cVar2);
                        } else {
                            a(copyOnWriteArrayList, this.f42453b);
                        }
                        if (this.L) {
                            com.mbridge.msdk.reward.adapter.c cVar4 = this.f42453b;
                            if (cVar4 != null) {
                                cVar4.c(this.S);
                            }
                            a(this.I, z10, str2, cVar2);
                            return;
                        }
                        return;
                    }
                    p0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f42459h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar5 = this.f42453b;
                    if (cVar5 != null) {
                        cVar5.c(this.S);
                    }
                    if (z10) {
                        if (this.f42457f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar2.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar2.b(true);
                            this.f42457f.a(strB, cVar2);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.f42457f.a(this.f42472u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                if (!c()) {
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar6 = this.f42453b;
                    if (cVar6 != null) {
                        cVar6.c(this.S);
                    }
                    this.f42457f.a(this.f42472u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                if (z10) {
                    if (this.f42457f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar2.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar2.b(true);
                        this.f42457f.a(strB2, cVar2);
                        return;
                    }
                    return;
                }
                this.R = false;
                com.mbridge.msdk.reward.adapter.c cVar7 = this.f42453b;
                if (cVar7 != null) {
                    cVar7.c(this.S);
                }
                this.f42457f.a(this.f42472u);
                a(this.I, z10, str2, cVar2);
                return;
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f42459h, 1, this.f42472u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = null;
            if (listB != null && listB.size() > 0) {
                if (!c()) {
                    if (this.f42453b == null) {
                        f();
                    }
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str2, listB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str2, cVar2);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.f42459h, this.f42471t);
                        com.mbridge.msdk.foundation.cache.c cVar8 = new com.mbridge.msdk.foundation.cache.c();
                        try {
                            if (aVar.a(str2)) {
                                cVar8 = aVar.a(str2, cVar2, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f42453b);
                                if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.cache.c.f40359l && cVar8.c() != null && cVar8.c().size() > 0 && this.f42453b != null) {
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar8.c();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<CampaignEx> it2 = listB.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next = it2.next();
                                        if (next != null) {
                                            String requestId = next.getRequestId();
                                            if (!TextUtils.isEmpty(requestId)) {
                                                for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                                    CampaignEx campaignEx2 = copyOnWriteArrayListC.get(i10);
                                                    if (campaignEx2 != null) {
                                                        if (requestId.equals(campaignEx2.getRequestId())) {
                                                            break;
                                                        } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                            arrayList.add(next);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC.size() == 0) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        }
                                    }
                                    this.f42453b.c(arrayList);
                                    this.f42453b.a(cVar8.c(), false, true, true);
                                    copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar8.c());
                                }
                            } else {
                                copyOnWriteArrayListB = b(str2, listB);
                                if (copyOnWriteArrayListB.size() > 0) {
                                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str2, copyOnWriteArrayListB);
                                }
                                cVar8.d("cb is closed");
                                cVar8.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                            }
                            try {
                                aVar.a(cVar, str2, cVar8, (List<a.b>) null, (JSONObject) null, 1);
                                cVar2 = cVar;
                                str2 = str2;
                                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                                    a(copyOnWriteArrayListB, str2, cVar2);
                                    if (this.f42453b != null && !aVar.a(str2)) {
                                        this.f42453b.c(copyOnWriteArrayListB);
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                cVar2 = cVar;
                                str2 = str2;
                                if (MBridgeConstans.DEBUG) {
                                    p0.b("RewardVideoController", e.getMessage());
                                }
                                this.R = false;
                                this.f42457f.a(this.f42472u);
                                a(this.I, z10, str2, cVar2);
                                return;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            cVar2 = cVar;
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                    this.R = false;
                    this.f42457f.a(this.f42472u);
                    a(this.I, z10, str2, cVar2);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f42459h, str2);
                if (!z10 || this.f42457f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar2 != null) {
                    cVar2.a(bVarA);
                    cVar2.b(true);
                }
                this.f42457f.a(strB3, cVar2);
                return;
            }
            if (!c()) {
                try {
                    com.mbridge.msdk.reward.candidate.a aVar2 = new com.mbridge.msdk.reward.candidate.a(this.f42459h, this.f42471t);
                    com.mbridge.msdk.foundation.cache.c cVar9 = new com.mbridge.msdk.foundation.cache.c();
                    try {
                        if (aVar2.a(str2)) {
                            if (this.f42453b == null) {
                                com.mbridge.msdk.reward.adapter.c cVar10 = new com.mbridge.msdk.reward.adapter.c(this.f42451a, this.f42463l, this.f42459h);
                                this.f42453b = cVar10;
                                cVar10.d(this.f42471t);
                                this.f42453b.e(this.f42472u);
                                if (this.f42471t) {
                                    this.f42453b.a(this.f42468q, this.f42469r, this.f42470s);
                                }
                                this.f42453b.a(this.f42467p);
                                this.f42453b.a(this.f42454c);
                            }
                            cVar9 = aVar2.a(str2, cVar2, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f42453b);
                            if (cVar9 != null && cVar9.g() == com.mbridge.msdk.foundation.cache.c.f40359l && cVar9.c() != null && cVar9.c().size() > 0 && this.f42453b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar9.c();
                                if (listB != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<CampaignEx> it3 = listB.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next2 = it3.next();
                                        if (next2 != null) {
                                            String requestId2 = next2.getRequestId();
                                            if (!TextUtils.isEmpty(requestId2)) {
                                                for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                                    CampaignEx campaignEx3 = copyOnWriteArrayListC2.get(i11);
                                                    if (campaignEx3 != null) {
                                                        if (requestId2.equals(campaignEx3.getRequestId())) {
                                                            break;
                                                        } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                            arrayList2.add(next2);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC2.size() == 0) {
                                                    arrayList2.add(next2);
                                                }
                                            }
                                        }
                                    }
                                    this.f42453b.c(arrayList2);
                                }
                                this.f42453b.a(cVar9.c(), false, true, true);
                                copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar9.c());
                            }
                        } else {
                            copyOnWriteArrayListB = b(str2, listB);
                            if (copyOnWriteArrayListB.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str2, copyOnWriteArrayListB);
                            }
                            cVar9.d("cb is closed 2");
                            cVar9.a(com.mbridge.msdk.foundation.cache.c.f40358k);
                        }
                        try {
                            aVar2.a(cVar, str2, cVar9, (List<a.b>) null, (JSONObject) null, 1);
                            cVar2 = cVar;
                            str2 = str2;
                            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                                a(copyOnWriteArrayListB, str2, cVar2);
                                if (this.f42453b != null && !aVar2.a(str2)) {
                                    this.f42453b.c(copyOnWriteArrayListB);
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            cVar2 = cVar;
                            str2 = str2;
                            if (MBridgeConstans.DEBUG) {
                                p0.b("RewardVideoController", e.getMessage());
                            }
                            this.R = false;
                            this.f42457f.a(this.f42472u);
                            a(this.I, z10, str2, cVar2);
                            return;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        cVar2 = cVar;
                    }
                } catch (Exception e16) {
                    e = e16;
                }
                this.R = false;
                this.f42457f.a(this.f42472u);
                a(this.I, z10, str2, cVar2);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().b(this.f42459h, str2);
            if (!z10 || this.f42457f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar2 != null) {
                cVar2.a(bVarA2);
                cVar2.b(true);
            }
            this.f42457f.a(strB4, cVar2);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            p0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f42457f.a(this.f42472u);
        this.f42457f.b(this.f42463l, this.f42459h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f42453b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f42457f.d(this.f42463l, this.f42459h, cVar);
        } else {
            a(copyOnWriteArrayList, this.f42453b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f42451a, z10, nscpt, this.f42472u, this.f42471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f42463l, this.f42459h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f42451a, campaignEx, this.f42463l, this.f42459h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.Queue<java.lang.Integer> r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.c r15) {
        /*
            r11 = this;
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r2 = "load mv api error:"
            r0 = 25
            r3 = 880020(0xd6d94, float:1.23317E-39)
            r4 = 1
            r11.F = r0     // Catch: java.lang.Exception -> L6c
            r11.G = r4     // Catch: java.lang.Exception -> L6c
            if (r12 == 0) goto L2a
            int r0 = r12.size()     // Catch: java.lang.Exception -> L25
            if (r0 <= 0) goto L2a
            java.lang.Object r12 = r12.poll()     // Catch: java.lang.Exception -> L25
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Exception -> L25
            if (r12 == 0) goto L2a
            int r12 = r12.intValue()     // Catch: java.lang.Exception -> L25
            r11.F = r12     // Catch: java.lang.Exception -> L25
            goto L2a
        L25:
            r0 = move-exception
            r12 = r0
            r5 = r11
            r10 = r15
            goto L70
        L2a:
            int r6 = r11.G     // Catch: java.lang.Exception -> L39
            int r7 = r11.F     // Catch: java.lang.Exception -> L39
            r5 = r11
            r8 = r13
            r9 = r14
            r10 = r15
            r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L36
            return
        L36:
            r0 = move-exception
        L37:
            r12 = r0
            goto L3d
        L39:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L37
        L3d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5a
            r13.<init>(r2)     // Catch: java.lang.Exception -> L5a
            java.lang.String r14 = r12.getMessage()     // Catch: java.lang.Exception -> L5a
            r13.append(r14)     // Catch: java.lang.Exception -> L5a
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L5a
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)     // Catch: java.lang.Exception -> L5a
            if (r10 == 0) goto L5d
            r10.a(r13)     // Catch: java.lang.Exception -> L5a
            r10.b(r4)     // Catch: java.lang.Exception -> L5a
            goto L5d
        L5a:
            r0 = move-exception
        L5b:
            r12 = r0
            goto L70
        L5d:
            r11.a(r13, r10)     // Catch: java.lang.Exception -> L5a
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L5a
            if (r13 == 0) goto L9a
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Exception -> L5a
            com.mbridge.msdk.foundation.tools.p0.b(r1, r12)     // Catch: java.lang.Exception -> L5a
            goto L9a
        L6c:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L5b
        L70:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r2)
            java.lang.String r14 = r12.getMessage()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)
            if (r10 == 0) goto L8c
            r10.a(r13)
            r10.b(r4)
        L8c:
            r11.a(r13, r10)
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r13 == 0) goto L9a
            java.lang.String r12 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r1, r12)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.Queue, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f42457f != null) {
            this.Q = true;
            this.f42457f.a(bVar, cVar);
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f42453b;
            if (cVar2 == null || !this.f42459h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f42451a, this.f42463l, this.f42459h);
                this.f42453b = cVar3;
                cVar3.d(this.f42471t);
                this.f42453b.e(this.f42472u);
            }
            if (this.f42471t) {
                this.f42453b.a(this.f42468q, this.f42469r, this.f42470s);
            }
            this.H = new ArrayList();
            this.f42453b.a(this.f42467p);
            this.f42453b.a(this.f42454c);
            f fVar = new f(this.f42453b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f42453b, z10);
            this.f42461j = gVar;
            gVar.a(fVar);
            this.f42453b.a(this.f42461j);
            this.f42453b.a(0, "");
            this.f42453b.a(new j());
            this.f42453b.a(i10, i11, z10, str, this.f42476y, cVar);
            this.f42466o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.f42453b == null) {
                f();
            }
            if (this.f42453b != null) {
                p0.b("RewardVideoController", "controller 819");
                if (this.f42472u) {
                    zL = a(false);
                } else {
                    zL = this.f42453b.l();
                }
                C0310a c0310a = null;
                if (zL) {
                    p0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f42466o, c0310a);
                    f42450f0.put(this.f42459h, iVar);
                    this.f42453b.a(iVar, str, this.f42458g, this.f42467p, this.f42462k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f42472u) {
                    zM = b();
                } else {
                    zM = this.f42453b.m();
                }
                if (zM) {
                    p0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f42466o, c0310a);
                    f42450f0.put(this.f42459h, iVar2);
                    this.f42453b.a(iVar2, str, this.f42458g, this.f42467p, this.f42462k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f42456e, "can't show because load is failed");
            if (this.f42456e != null) {
                try {
                    this.f42456e.onShowFail(cVar, this.f42460i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f42471t || this.f42472u || (cVar3 = this.f42454c) == null || !cVar3.a(4) || this.f42457f == null || this.f42457f.a() == 1 || this.f42457f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f42459h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f42456e, "show exception");
            if (this.f42456e != null) {
                try {
                    this.f42456e.onShowFail(cVar, this.f42460i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f42471t || this.f42472u || (cVar2 = this.f42454c) == null || !cVar2.a(4) || this.f42457f == null || this.f42457f.a() == 1 || this.f42457f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f42459h, true, 1));
        }
    }

    private boolean a(boolean z10) {
        if (this.f42453b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f42459h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (z10) {
                d("is_ready_ctir_false", "no effective campaign list");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.i(str);
                cVar.g(this.f42477z);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 8);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f42453b.h());
            }
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f42459h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d(o2.n("is_ready_ctir_", zA), "");
        }
        if (!zA) {
            for (com.mbridge.msdk.foundation.entity.c cVar2 : listA) {
                if (cVar2 != null) {
                    this.f42453b.c(cVar2.a());
                    this.f42453b.b(cVar2.d());
                    if (this.f42453b.b(z10)) {
                        cVar2.d();
                        return true;
                    }
                }
            }
        } else if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar3.i(str);
            a(zA, cVar3, this.f42453b.h());
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f42453b.c(cVar.a());
                this.f42453b.b(cVar.d());
                if (this.f42453b.l()) {
                    if (!z10) {
                        return true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    cVar2.i(cVar.d());
                    a(false, cVar2, (List<CampaignEx>) this.f42453b.h());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.e r15) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.e):void");
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f42459h);
            String currentLocalRid = "";
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
            if (cVar2 != null) {
                cVar2.b(copyOnWriteArrayListB);
                cVar2.a("2000128", eVar);
                cVar2.i(currentLocalRid);
                cVar2.n(this.f42459h);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
                return cVar2;
            }
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            try {
                cVar.n(this.f42459h);
                eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                cVar.a("2000128", eVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    cVar.i(SameMD5.getMD5(u0.d()));
                } else {
                    cVar.i(currentLocalRid);
                    cVar.b(copyOnWriteArrayListB);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
                }
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
                return cVar;
            } catch (Exception e10) {
                e = e10;
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardVideoController", e.getMessage());
                }
                return cVar;
            }
        } catch (Exception e11) {
            e = e11;
            cVar = null;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            this.H = list;
        } else {
            this.H = new ArrayList();
        }
    }

    private String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(u0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(u0.d()) : md5;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return md5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(android.os.Message r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1f
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1f
            com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "metrics_data_lrid"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Exception -> L17
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = r0.b(r3)     // Catch: java.lang.Exception -> L17
            goto L20
        L17:
            r3 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L1f
            r3.printStackTrace()
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r3.<init>()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(android.os.Message):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f42475x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6, com.mbridge.msdk.foundation.same.report.metrics.c r7) {
        /*
            r5 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.mbridge.msdk.foundation.same.report.metrics.c r1 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r1.<init>()
            java.lang.String r2 = ""
            if (r6 == 0) goto L3c
            int r3 = r6.size()     // Catch: java.lang.Exception -> L30
            if (r3 <= 0) goto L3c
            r3 = 0
            java.lang.Object r4 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            if (r4 == 0) goto L32
            java.lang.Object r2 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.getLocalRequestId()     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = r3.getNLRid()     // Catch: java.lang.Exception -> L30
            goto L33
        L30:
            r6 = move-exception
            goto L9d
        L32:
            r3 = r2
        L33:
            r1.i(r2)     // Catch: java.lang.Exception -> L30
            r1.b(r6)     // Catch: java.lang.Exception -> L30
            r6 = r2
            r2 = r3
            goto L3d
        L3c:
            r6 = r2
        L3d:
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L44
            return r7
        L44:
            com.mbridge.msdk.foundation.same.report.metrics.e r7 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "cache"
            r7.a(r2, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "hb"
            r7.a(r2, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L30
            r7.a(r0, r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "2000127"
            r1.a(r0, r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "2000048"
            r1.a(r0, r7)     // Catch: java.lang.Exception -> L30
            boolean r7 = r5.f42471t     // Catch: java.lang.Exception -> L30
            if (r7 == 0) goto L6e
            r7 = 287(0x11f, float:4.02E-43)
            goto L70
        L6e:
            r7 = 94
        L70:
            r1.a(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "1"
            r1.h(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "2"
            r1.f(r7)     // Catch: java.lang.Exception -> L30
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L30
            if (r7 != 0) goto La4
            com.mbridge.msdk.foundation.same.report.metrics.d r7 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L30
            java.util.LinkedHashMap r7 = r7.c()     // Catch: java.lang.Exception -> L30
            boolean r7 = r7.containsKey(r6)     // Catch: java.lang.Exception -> L30
            if (r7 != 0) goto La4
            com.mbridge.msdk.foundation.same.report.metrics.d r7 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L30
            java.util.LinkedHashMap r7 = r7.c()     // Catch: java.lang.Exception -> L30
            r7.put(r6, r1)     // Catch: java.lang.Exception -> L30
            return r1
        L9d:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto La4
            r6.printStackTrace()
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.metrics.c):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f42459h);
        cVar.a(this.f42471t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f42472u ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
