package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import com.unity3d.services.core.fid.Constants;
import hr.kNq.ikJMrW;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* renamed from: c0, reason: collision with root package name */
    private static final String f41620c0 = "NativeController";

    /* renamed from: d0, reason: collision with root package name */
    public static Map<String, Long> f41621d0 = new HashMap();

    /* renamed from: e0, reason: collision with root package name */
    private static boolean f41622e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, AdSession> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.l Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;

    /* renamed from: a0, reason: collision with root package name */
    private AdSession f41623a0;

    /* renamed from: b, reason: collision with root package name */
    protected List<Integer> f41624b;

    /* renamed from: b0, reason: collision with root package name */
    private AdEvents f41625b0;

    /* renamed from: c, reason: collision with root package name */
    protected List<Integer> f41626c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f41627d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f41628e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f41629f;

    /* renamed from: g, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f41630g;

    /* renamed from: h, reason: collision with root package name */
    private Context f41631h;

    /* renamed from: i, reason: collision with root package name */
    private String f41632i;

    /* renamed from: j, reason: collision with root package name */
    private String f41633j;

    /* renamed from: k, reason: collision with root package name */
    private Queue<Integer> f41634k;

    /* renamed from: l, reason: collision with root package name */
    private Queue<Long> f41635l;

    /* renamed from: m, reason: collision with root package name */
    private String f41636m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f41637n;

    /* renamed from: o, reason: collision with root package name */
    private String f41638o;

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.click.a f41639p;

    /* renamed from: q, reason: collision with root package name */
    private int f41640q;

    /* renamed from: r, reason: collision with root package name */
    private int f41641r;

    /* renamed from: s, reason: collision with root package name */
    private int f41642s;

    /* renamed from: t, reason: collision with root package name */
    private int f41643t;

    /* renamed from: u, reason: collision with root package name */
    private String f41644u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f41645v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f41646w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f41647x;

    /* renamed from: y, reason: collision with root package name */
    private int f41648y;

    /* renamed from: z, reason: collision with root package name */
    private int f41649z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41650a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativeListener.NativeAdListener f41651b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41652c;

        public a(List list, NativeListener.NativeAdListener nativeAdListener, int i10) {
            this.f41650a = list;
            this.f41651b = nativeAdListener;
            this.f41652c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f41650a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f41650a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.f41650a;
            }
            NativeController.this.f41645v = true;
            this.f41651b.onAdLoaded(this.f41650a, this.f41652c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.f41631h, (List<Campaign>) this.f41650a, NativeController.this.f41632i);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f41654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41656c;

        public b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.f41654a = aVar;
            this.f41655b = campaignEx;
            this.f41656c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41654a.a(this.f41655b, this.f41656c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f41659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f41660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f41661c;

        public d(long j10, o oVar, List list) {
            this.f41659a = j10;
            this.f41660b = oVar;
            this.f41661c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z10;
            if (System.currentTimeMillis() - this.f41659a >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                this.f41660b.a();
                NativeController.this.c();
                return;
            }
            int iS = l0.s(NativeController.this.f41631h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.f41660b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.f41660b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z10 = false;
                for (Campaign campaign : this.f41661c) {
                    String id2 = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sbU = o2.u(id2);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sbU.append(campaignEx.getVideoUrlEncode());
                        sbU.append(campaignEx.getBidToken());
                        id2 = sbU.toString();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f41632i, id2);
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        break;
                    } else {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f41660b.a();
                NativeController.this.c();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f41663a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f41664b;

        public e(ImageView imageView, View view) {
            this.f41663a = imageView;
            this.f41664b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f41663a != null) {
                this.f41663a.setLayoutParams(new FrameLayout.LayoutParams(this.f41664b.getWidth(), this.f41664b.getHeight()));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41666b;

        public f(CampaignEx campaignEx) {
            this.f41666b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f41666b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41668b;

        public g(CampaignEx campaignEx) {
            this.f41668b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f41668b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41672b;

        public i(CampaignEx campaignEx) {
            this.f41672b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f41672b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements a.InterfaceC0275a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f41674a;

        public j(s sVar) {
            this.f41674a = sVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0275a
        public void a(a.b bVar) {
            if (bVar != a.b.FINISH || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.f41674a)) {
                return;
            }
            NativeController.this.F.remove(this.f41674a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k implements c.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41676a;

        public k(CampaignEx campaignEx) {
            this.f41676a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.c.d
        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.f41676a, NativeController.this.f41631h, NativeController.this.f41632i, NativeController.this.f41629f);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f41680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f41681d;

        public l(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.f41678a = list;
            this.f41679b = i10;
            this.f41680c = aVar;
            this.f41681d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f41678a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f41680c, "has no ads", (CampaignEx) this.f41681d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f41679b, this.f41680c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f41685c;

        public m(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.f41683a = list;
            this.f41684b = i10;
            this.f41685c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f41683a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f41685c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f41684b, this.f41685c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* renamed from: d, reason: collision with root package name */
        private Runnable f41688d;

        /* renamed from: c, reason: collision with root package name */
        private boolean f41687c = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f41689e = true;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f41690f = null;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f41692a;

            public a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f41692a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f41692a, NativeController.this.f41631h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public n() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f41687c = z10;
        }

        public void b(boolean z10) {
            this.f41689e = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z10 = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f41631h));
            jVarA.a();
            Runnable runnable = this.f41688d;
            if (runnable != null) {
                NativeController.this.f41713a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f41642s, this.unitId);
                NativeController.this.f41643t = 0;
                return;
            }
            NativeController.this.f41638o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 2;
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.f41641r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(b())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b(), eVar, campaignUnit.getAds().get(0), this.unitId);
            int i11 = 0;
            while (i11 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                campaignEx.setLocalRequestId(cVarA.o());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z10);
                }
                if (NativeController.f41622e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zC = u0.c(NativeController.this.f41631h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.f41631h, campaignEx);
                if (i11 < NativeController.this.f41641r && campaignEx.getOfferType() != 99) {
                    if (u0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : i10);
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.f41631h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        u0.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i11 < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (u0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || u0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.f41631h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i11++;
                z10 = true;
                i10 = 2;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.unitId, (String) arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f41642s, this.unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.unitId) || (num = com.mbridge.msdk.mbnative.controller.d.d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i12 = NativeController.this.f41643t + NativeController.this.f41641r;
            NativeController.this.f41643t = i12 <= iIntValue ? i12 : 0;
        }

        public void b(List<String> list) {
            this.f41690f = list;
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f41631h, cVar, new a(campaignEx, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            NativeController.this.U = true;
            if (this.f41687c) {
                if (NativeController.this.f41645v || !this.f41689e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i10 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f41642s, this.unitId);
                NativeController.this.f41643t = 0;
            }
            Runnable runnable = this.f41688d;
            if (runnable != null) {
                NativeController.this.f41713a.removeCallbacks(runnable);
            }
            if (NativeController.this.f41645v) {
                return;
            }
            if (a() == 1 || this.f41689e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.f41688d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.f41687c) {
                return;
            }
            Runnable runnable = this.f41688d;
            if (runnable != null) {
                NativeController.this.f41713a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f41629f != null) {
                    NativeController.this.f41645v = true;
                    NativeController.this.f41629f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f41629f != null) {
                        NativeController.this.f41645v = true;
                        NativeController.this.f41629f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f41622e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f41629f != null) {
                NativeController.this.f41629f.onAdFramesLoaded(list);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface o {
        void a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f41694a;

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f41695b;

        /* renamed from: c, reason: collision with root package name */
        private int f41696c;

        /* renamed from: d, reason: collision with root package name */
        private String f41697d;

        public p(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str) {
            this.f41694a = i10;
            this.f41695b = dVar;
            this.f41696c = i11;
            this.f41697d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41695b.a(true);
            int i10 = this.f41694a;
            if (i10 == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.f41696c, this.f41697d, (CampaignEx) null);
            } else {
                if (i10 != 2) {
                    return;
                }
                if (!NativeController.this.f41645v || this.f41696c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.f41696c, this.f41697d, (CampaignEx) null);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        private String f41699a;

        /* renamed from: b, reason: collision with root package name */
        private CampaignEx f41700b;

        /* renamed from: c, reason: collision with root package name */
        private long f41701c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f41702d;

        public q(String str, CampaignEx campaignEx, boolean z10) {
            this.f41702d = true;
            this.f41699a = str;
            this.f41700b = campaignEx;
            this.f41702d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f41702d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f41701c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str, this.f41700b.getId(), this.f41699a, str2, "2");
                    nVar.n(this.f41700b.getRequestId());
                    nVar.k(this.f41700b.getCurrentLocalRid());
                    nVar.o(this.f41700b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f41700b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f41700b.getId());
                    }
                    CampaignEx campaignEx2 = this.f41700b;
                    if (campaignEx2 != null) {
                        nVar.a(campaignEx2.getAdSpaceT());
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f41699a, this.f41700b);
                }
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f41702d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f41701c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f41700b.getId(), this.f41699a, "", "2");
                    CampaignEx campaignEx = this.f41700b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f41700b.getId());
                    }
                    CampaignEx campaignEx2 = this.f41700b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.o(this.f41700b.getRequestIdNotice());
                        nVar.k(this.f41700b.getCurrentLocalRid());
                        nVar.a(this.f41700b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f41699a, this.f41700b);
                }
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class r extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f41703a;

        public r(NativeController nativeController) {
            this.f41703a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f41703a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f41637n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.f41703a;
                    NativeController nativeController2 = (weakReference2 == null || weakReference2.get() == null) ? null : this.f41703a.get();
                    if (nativeController2 != null) {
                        nativeController2.f41646w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.f41632i, nativeController2.f41641r, nativeController2.N);
                        if (nativeController2.f41645v) {
                            return;
                        }
                        nativeController2.c(listA);
                    }
                }
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        String f41709a;

        /* renamed from: b, reason: collision with root package name */
        CampaignEx f41710b;

        /* renamed from: c, reason: collision with root package name */
        private long f41711c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f41712d;

        public t(String str, CampaignEx campaignEx, boolean z10) {
            this.f41712d = true;
            this.f41709a = str;
            this.f41710b = campaignEx;
            this.f41712d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f41712d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f41711c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str2, this.f41710b.getId(), this.f41709a, str, "1");
                    CampaignEx campaignEx = this.f41710b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f41710b.getId());
                    }
                    CampaignEx campaignEx2 = this.f41710b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f41710b.getCurrentLocalRid());
                        nVar.o(this.f41710b.getRequestIdNotice());
                        nVar.a(this.f41710b.getAdSpaceT());
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f41709a, this.f41710b);
                }
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f41712d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f41711c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f41710b.getId(), this.f41709a, "", "1");
                    CampaignEx campaignEx = this.f41710b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f41710b.getId());
                    }
                    CampaignEx campaignEx2 = this.f41710b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f41710b.getCurrentLocalRid());
                        nVar.o(this.f41710b.getRequestIdNotice());
                        nVar.a(this.f41710b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f41709a, this.f41710b);
                }
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f41640q = 1;
        this.f41641r = 1;
        this.f41642s = -1;
        this.f41643t = 0;
        this.f41645v = false;
        this.f41646w = false;
        this.f41647x = false;
        this.f41648y = 0;
        this.f41649z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
        this.f41631h = context;
        this.f41627d = map;
        this.f41628e = new com.mbridge.msdk.setting.j();
        this.f41629f = aVar;
        this.f41630g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get(ikJMrW.ORFsOUmnJHgvb);
        this.f41632i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f41633j = "";
        } else {
            this.f41633j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f41622e0 = ((Boolean) obj).booleanValue();
        }
        this.f41634k = new LinkedList();
        this.f41635l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.f41631h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f41713a = new r(this);
        String str2 = KGUkpTlXZlJLy.NgrFR;
        if (map.containsKey(str2)) {
            this.f41644u = (String) map.get(str2);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f41632i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f41632i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!zEquals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        iIntValue = ((Integer) obj2).intValue();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            p0.b(f41620c0, e10.getMessage());
                        }
                        iIntValue = 1;
                    }
                    iIntValue = iIntValue < 1 ? 1 : iIntValue;
                    iIntValue = iIntValue > 10 ? 10 : iIntValue;
                    this.f41641r = iIntValue;
                    this.f41640q = iIntValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.A = ((Integer) obj3).intValue();
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            p0.b(f41620c0, e11.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.f41632i)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f41632i);
                if (num != null) {
                    this.f41641r = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    this.f41648y = iIntValue2;
                    this.f41640q = iIntValue2;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    this.f41649z = iIntValue3;
                    this.A = iIntValue3;
                }
            }
        } catch (Exception e12) {
            p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(e12));
        }
        this.f41637n = new com.mbridge.msdk.foundation.same.report.h(this.f41631h);
        this.f41639p = new com.mbridge.msdk.click.a(this.f41631h, this.f41632i);
        try {
            int i10 = MBMediaView.f42039p0;
            this.L = true;
            Map<String, Object> map2 = this.f41627d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f41627d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f41631h, this.f41632i);
            n0.a();
            if (TextUtils.isEmpty(this.f41632i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f41631h)).a();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listA = a(this.f41632i, iA <= 0 ? this.f41640q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) listA.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.f41632i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f41632i);
                }
            }
        } catch (Throwable unused) {
            p0.b(f41620c0, "please import the nativex aar");
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.f41632i, campaignRemove, this.N);
                    p0.a(f41620c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() throws JSONException {
        try {
            if (this.f41636m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f41636m);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.f41636m = jSONArray.toString();
        } catch (JSONException e10) {
            p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.l h() {
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", this.f41632i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f41632i);
        }
        return this.Q;
    }

    public String g() {
        return this.O;
    }

    public void i() {
        com.mbridge.msdk.foundation.same.task.a next;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, AdSession> hashtable = this.G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.G.clear();
        }
        Handler handler = this.f41713a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f41630g = null;
        this.f41639p.c();
        try {
            Context context = this.f41631h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f41713a.removeCallbacks(next);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.f41624b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f41634k;
            if (queue != null && queue.size() > 0) {
                this.f41634k.clear();
            }
            for (Integer num : this.f41624b) {
                Queue<Integer> queue2 = this.f41634k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f41626c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.f41635l;
        if (queue3 != null && queue3.size() > 0) {
            this.f41635l.clear();
        }
        for (Integer num2 : this.f41626c) {
            Queue<Long> queue4 = this.f41635l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f42039p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.f41631h, this.f41632i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f41632i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(next.getImageUrl(), new c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.f41632i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.f41632i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        p0.b(f41620c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if (!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) {
            return false;
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f41629f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionA = a(campaignEx);
            this.f41623a0 = adSessionA;
            if (adSessionA != null) {
                adSessionA.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f41623a0);
                this.f41625b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f41631h));
        jVarA.a();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (this.L && this.K) {
            if (h().m() == 3) {
                List<Campaign> listE = e(list);
                if (list.size() > 0) {
                    a(list, new l(listE, template, aVar, list));
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listB = b(list);
            if (listB != null && listB.size() > 0) {
                a(listB, new m(list, template, aVar));
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey("app_id") && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                return map.get(MBridgeConstans.KEY_WORD) != null;
            }
            return false;
        } catch (Exception e10) {
            p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            return false;
        }
    }

    public void b(int i10, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.f41634k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.f41634k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f41635l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.f41635l.poll()) != null) {
                this.R = lPoll.longValue();
            }
            b(iIntValue, this.R, i10, str);
            return;
        }
        if (this.f41645v || (aVar = this.f41629f) == null) {
            return;
        }
        this.f41645v = true;
        aVar.onAdLoadError("no ad source");
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e10;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    arrayList = arrayList2;
                    p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e10 = e12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements com.mbridge.msdk.widget.dialog.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41670a;

        public h(CampaignEx campaignEx) {
            this.f41670a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            NativeController.this.f41639p.a(this.f41670a, NativeController.this.f41629f);
            NativeController.this.b(this.f41670a);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class s extends com.mbridge.msdk.foundation.same.task.a {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f41704a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<View> f41705b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f41706c;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f41707d;

        /* renamed from: e, reason: collision with root package name */
        private WeakReference<AdSession> f41708e;

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f41704a = campaignEx;
            this.f41705b = new WeakReference<>(view);
            this.f41706c = new WeakReference<>(list);
            this.f41707d = new WeakReference<>(nativeController);
            this.f41708e = new WeakReference<>(adSession);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f41707d == null || (weakReference = this.f41705b) == null || this.f41706c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f41706c.get();
                NativeController nativeController = this.f41707d.get();
                WeakReference<AdSession> weakReference2 = this.f41708e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.f41704a, view, list, adSession);
            } catch (Exception e10) {
                p0.b(NativeController.f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }
    }

    public void b(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i11 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f41641r = this.H;
            } else {
                this.f41641r = this.f41640q;
            }
            if (c(a(i10, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f41632i, this.f41641r))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j10, i11, true, this.f41632i, str);
        } else if (i10 != 2) {
            a(i10, j10, i11, str);
        } else {
            a(2, j10, i11, str);
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", str);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.f41624b = listB;
        if (listB == null || listB.size() <= 0 || !this.f41624b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        NativeController nativeController;
        CampaignEx campaignEx2;
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        nativeController = this;
                        campaignEx2 = campaignEx;
                        try {
                            if (nativeController.a(this.f41639p, context, campaignEx2, this.f41632i, hVar)) {
                                return;
                            }
                            b(campaignEx2);
                            nativeController.f41629f.onAdClick(campaignEx2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            p0.a(f41620c0, th.getMessage());
                            nativeController.f41639p.a(campaignEx2, nativeController.f41629f);
                            b(campaignEx2);
                        }
                    }
                }
                nativeController = this;
                campaignEx2 = campaignEx;
            } catch (Throwable th3) {
                th = th3;
                nativeController = this;
                campaignEx2 = campaignEx;
            }
        } else {
            nativeController = this;
            campaignEx2 = campaignEx;
        }
        nativeController.f41639p.a(campaignEx2, nativeController.f41629f);
        b(campaignEx2);
    }

    private int a(String str) {
        if (str != null) {
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
            } catch (Exception e10) {
                p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(e10));
                return 0;
            }
        }
        return 0;
    }

    public void d() {
        n0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().d() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f41631h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().d(), false, false);
    }

    public void a(String str, String str2) {
        this.f41628e.a(this.f41631h, str, str2, this.f41632i);
    }

    public void a(int i10, String str) throws JSONException {
        boolean zEquals = false;
        this.f41645v = false;
        this.f41646w = false;
        this.f41647x = false;
        this.U = false;
        this.N = str;
        this.f41629f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = f41621d0;
        if (map != null && map.size() > 0) {
            f41621d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f41632i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f41632i));
        }
        a(zEquals, i10);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    public void b(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i10 = MBMediaView.f42039p0;
                } catch (Throwable unused) {
                    cls = null;
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(boolean z10, int i10) throws JSONException {
        boolean zB;
        NativeController nativeController;
        int i11;
        if (!z10 || i10 != 1 || !a(i10)) {
            String strB = com.mbridge.msdk.foundation.controller.c.m().b();
            String strC = com.mbridge.msdk.foundation.controller.c.m().c();
            if (this.f41627d.containsKey("app_id") && this.f41627d.containsKey(MBridgeConstans.APP_KEY) && this.f41627d.containsKey(MBridgeConstans.KEY_WORD)) {
                strB = (String) this.f41627d.get("app_id");
                strC = (String) this.f41627d.get(MBridgeConstans.APP_KEY);
            }
            a(strB, strC);
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, this.f41632i);
            this.Q = lVarE;
            if (lVarE == null) {
                this.Q = com.mbridge.msdk.setting.l.i(this.f41632i);
            }
            com.mbridge.msdk.mbnative.controller.d.d().put(this.f41632i, Integer.valueOf(this.Q.y() * this.f41641r));
            this.f41624b = this.Q.b();
            this.f41626c = this.Q.c();
            this.T = this.Q.f();
            this.S = this.Q.e();
            this.f41641r = this.f41640q;
            List<Integer> list = this.f41624b;
            if (list != null && list.size() != 0) {
                try {
                    zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.m().d());
                } catch (Exception unused) {
                    zB = false;
                }
                if (!zB) {
                    com.mbridge.msdk.mbnative.listener.a aVar = this.f41629f;
                    if (aVar != null) {
                        aVar.onAdLoadError("webview is not available");
                    }
                } else {
                    if (this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f41636m == null) {
                        this.f41636m = (String) this.f41627d.get(MBridgeConstans.NATIVE_INFO);
                        f();
                    }
                    if ((this.f41624b.contains(1) && this.f41624b.get(0).intValue() != 1) || i10 != 0 || !c(a(this.f41632i, this.f41641r, this.N))) {
                        this.X = true;
                        if (this.f41624b.contains(1) && i10 == 0 && this.f41624b.get(0).intValue() != 1) {
                            int iIntValue = this.f41624b.get(0).intValue();
                            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
                            if (iIntValue == 2 && this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                this.f41641r = this.H;
                            } else {
                                this.f41641r = this.f41640q;
                            }
                            if (bVarA == null || !c(a(iIntValue, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f41632i, this.f41641r))))) {
                                this.X = false;
                                try {
                                    nativeController = this;
                                    i11 = i10;
                                    try {
                                        nativeController.a(this.f41626c.get(this.f41624b.indexOf(1)).intValue() * 1000, i11, false, this.f41632i, this.N);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        } else {
                            nativeController = this;
                            i11 = i10;
                        }
                        nativeController.f41713a.sendEmptyMessageDelayed(1, nativeController.Q.K() * 1000);
                        j();
                        b(i11, nativeController.N);
                    }
                }
            } else {
                com.mbridge.msdk.mbnative.listener.a aVar2 = this.f41629f;
                if (aVar2 != null) {
                    this.f41645v = true;
                    aVar2.onAdLoadError("do not have sorceList");
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    public NativeController() {
        this.f41640q = 1;
        this.f41641r = 1;
        this.f41642s = -1;
        this.f41643t = 0;
        this.f41645v = false;
        this.f41646w = false;
        this.f41647x = false;
        this.f41648y = 0;
        this.f41649z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
    }

    public boolean a(int i10) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i11 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f41632i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f41632i))) {
            Map<String, Map<Long, Object>> mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map<Long, Object> map = mapF.get(i10 + "_" + this.f41632i);
            Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f41632i);
            com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
            if (num != null) {
                this.f41641r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarF == null) {
                    gVarF = com.mbridge.msdk.setting.h.b().a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarF.Z() * 1000) {
                    mapF.remove(i10 + "_" + this.f41632i);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f41629f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i10 + "_" + this.f41632i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f41649z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i11 >= this.A) {
                                arrayList.add(frame);
                            }
                            i11++;
                        }
                        map.put(next, arrayList);
                        mapF.put(i10 + "_" + this.f41632i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f41636m)) {
                                iMin = Math.min(this.f41648y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f41636m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i12);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    p0.b(f41620c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i11 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i11++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f41648y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i11 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i11++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f41634k;
        if ((queue != null && queue.size() <= 0) || this.f41634k == null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f41629f;
            if (aVar == null || this.f41645v) {
                return;
            }
            this.f41645v = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i10, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public synchronized void a(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.foundation.same.net.wrapper.c cVar;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            try {
                if (this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f41641r = Math.max(this.V, this.W);
                }
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (bVarA != null && c(a(1, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f41632i, this.f41641r))))) {
                        return;
                    }
                    n nVar = this.J;
                    if (nVar != null && !this.U) {
                        nVar.b(true);
                    }
                    if (this.U && !this.f41645v) {
                        a("mb load failed", i11, str, (CampaignEx) null);
                    }
                    if (!this.X) {
                        return;
                    }
                }
                int i12 = this.f41642s;
                if (i12 == -1) {
                    this.f41642s = i10;
                } else if (i12 != i10) {
                    this.f41643t = 0;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f41631h)).a();
                com.mbridge.msdk.foundation.same.net.wrapper.c aVar = new com.mbridge.msdk.mbnative.service.net.a(this.f41631h);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
                String strB = com.mbridge.msdk.foundation.controller.c.m().b();
                String strC = com.mbridge.msdk.foundation.controller.c.m().c();
                Map<String, Object> map = this.f41627d;
                if (map != null && map.containsKey("app_id") && this.f41627d.containsKey(MBridgeConstans.APP_KEY) && this.f41627d.containsKey(MBridgeConstans.KEY_WORD) && this.f41627d.get(MBridgeConstans.KEY_WORD) != null) {
                    if (this.f41627d.get("app_id") instanceof String) {
                        strB = (String) this.f41627d.get("app_id");
                    }
                    if (this.f41627d.get(MBridgeConstans.APP_KEY) instanceof String) {
                        strC = (String) this.f41627d.get(MBridgeConstans.APP_KEY);
                    }
                    String str2 = this.f41627d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f41627d.get(MBridgeConstans.KEY_WORD) : null;
                    if (!TextUtils.isEmpty(str2)) {
                        eVar.a("smart", j0.b(str2));
                    }
                }
                eVar.a("app_id", strB);
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f41632i);
                if (!TextUtils.isEmpty(this.f41633j)) {
                    eVar.a(MBridgeConstans.PLACEMENT_ID, this.f41633j);
                }
                eVar.a("req_type", "2");
                if (!TextUtils.isEmpty(this.f41644u)) {
                    eVar.a("category", this.f41644u);
                }
                eVar.a("sign", SameMD5.getMD5(strB + strC));
                if (this.T > 0 && i11 == 0) {
                    eVar.a("ad_num", this.T + "");
                } else {
                    eVar.a("ad_num", this.f41640q + "");
                }
                String strD = u0.d(this.f41632i);
                if (!TextUtils.isEmpty(strD)) {
                    eVar.a("j", strD);
                }
                eVar.a("only_impression", "1");
                eVar.a("ping_mode", "1");
                if (this.A != 0) {
                    eVar.a("frame_num", this.A + "");
                }
                if (!TextUtils.isEmpty(this.f41636m)) {
                    eVar.a(MBridgeConstans.NATIVE_INFO, this.f41636m);
                    if (i10 == 1) {
                        eVar.a("tnum", this.H + "");
                    }
                } else if (i10 == 1) {
                    eVar.a("tnum", this.f41640q + "");
                }
                a(eVar, i10);
                String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f41632i, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f40875g, strA);
                }
                if (this.f41627d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                    eVar.a("video_width", ((Integer) this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f41627d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                    eVar.a("video_height", ((Integer) this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                if (this.f41627d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                    ((Boolean) this.f41627d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).getClass();
                }
                eVar.a("video_version", "2.0");
                if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b()) == null) {
                    com.mbridge.msdk.setting.h.b().a();
                }
                if (!b(this.f41627d)) {
                    JSONArray jSONArrayB = u0.b(this.f41631h, this.f41632i);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f40876h, u0.a(jSONArrayB));
                    }
                }
                if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f41632i) && com.mbridge.msdk.mbnative.controller.d.g().get(this.f41632i).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.f41632i) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.e().get(this.f41632i)) != null) {
                    if (i10 == 1) {
                        this.f41643t = kVar.a();
                    } else if (i10 == 2) {
                        this.f41643t = kVar.b();
                    }
                }
                eVar.a("offset", this.f41643t + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                if (!TextUtils.isEmpty(this.f41638o)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f40877i, this.f41638o);
                }
                n nVar2 = new n();
                nVar2.b(a(this.f41627d));
                nVar2.setUnitId(this.f41632i);
                nVar2.setPlacementId(this.f41633j);
                nVar2.setAdType(42);
                nVar2.b(true);
                p pVar = new p(1, nVar2, i11, str);
                nVar2.a(pVar);
                nVar2.a(i11);
                nVar2.a(str);
                if (i11 == 0) {
                    if (!TextUtils.isEmpty(str)) {
                        eVar.a("token", str);
                    }
                    aVar.choiceV3OrV5BySetting(1, eVar, nVar2, str, com.mbridge.msdk.foundation.same.c.a(j10, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                    cVar = aVar;
                } else {
                    cVar = aVar;
                }
                if (i11 == 1) {
                    cVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f40840b0, eVar, nVar2, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j10, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL));
                }
                this.f41713a.postDelayed(pVar, j10);
            } catch (Exception e10) {
                String str3 = f41620c0;
                p0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e10));
                p0.b(str3, e10.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(this.f41632i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
                imageView.setTag("mb_wm");
                u0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.f41623a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f41630g;
            if (nativeTrackingListener != null) {
                this.f41639p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f41632i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i10 = MBMediaView.f42039p0;
            } catch (Throwable unused) {
                cls = null;
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f41632i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                a1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    a1.a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f41620c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            p0.b(f41620c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f41630g;
            if (nativeTrackingListener != null) {
                this.f41639p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f41632i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f41632i, campaignEx, "native");
            a1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            View.OnClickListener iVar = new i(campaignEx);
            try {
                int i10 = MBMediaView.f42039p0;
                a(campaignEx, view, iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(campaignEx, view, iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            p0.c(f41620c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            p0.b(f41620c0, "registerview exception!");
        }
    }

    private AdSession a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionA = this.G.get(requestIdNotice);
        if (adSessionA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionA = com.mbridge.msdk.omsdk.b.a(this.f41631h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f41632i, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionA != null) {
            this.G.put(requestIdNotice, adSessionA);
        }
        return adSessionA;
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        Exception exc;
        AdSession adSessionA;
        AdSession adSession;
        int iS;
        try {
            if (this.f41631h == null || campaignEx == null) {
                adSessionA = null;
            } else {
                try {
                    adSessionA = a(campaignEx);
                    if (adSessionA != null) {
                        adSessionA.registerAdView(view);
                        adSessionA.start();
                    }
                } catch (Exception e10) {
                    exc = e10;
                    p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(exc));
                }
            }
            adSession = adSessionA;
            com.mbridge.msdk.setting.l lVar = this.Q;
            iS = lVar != null ? lVar.s() : 0;
            if (campaignEx != null) {
                if (campaignEx.getImpReportType() == 1) {
                    iS = 0;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            s sVar = new s(campaignEx, view, list, this, adSession);
            if (this.F == null) {
                this.F = new CopyOnWriteArrayList<>();
            }
            this.F.add(sVar);
            sVar.setOnStateChangeListener(new j(sVar));
            Handler handler = this.f41713a;
            if (handler != null) {
                handler.postDelayed(sVar, iS * 1000);
            }
        } catch (Exception e12) {
            e = e12;
            exc = e;
            p0.b(f41620c0, com.mbridge.msdk.mbnative.common.a.a(exc));
        }
    }

    private void a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        a1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(campaignEx, viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            AdEvents adEvents = this.f41625b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    public List<Campaign> a(String str, int i10, String str2) {
        int i11;
        int i12;
        List<Campaign> listA = null;
        if (this.f41624b != null) {
            ArrayList arrayList = new ArrayList(this.f41624b);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i13)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i12 = this.H;
                    } else {
                        i12 = this.f41640q;
                    }
                    listA = a(((Integer) arrayList.get(i13)).intValue(), bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i12));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA2 = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i14)).intValue());
                    if ((((Integer) arrayList.get(i14)).intValue() == 1 || ((Integer) arrayList.get(i14)).intValue() == 2) && this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.H;
                    } else {
                        i11 = this.f41640q;
                    }
                    listA = a(((Integer) arrayList.get(i14)).intValue(), bVarA2.b(str, i11));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i10, NativeListener.NativeAdListener nativeAdListener) {
        this.f41713a.post(new a(list, nativeAdListener, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        this.f41713a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 == 1 && this.f41627d.containsKey(MBridgeConstans.NATIVE_INFO) && list != null && list.size() > 0) {
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            int template = campaignEx != null ? campaignEx.getTemplate() : 1;
            if (template == 2) {
                int size = list.size();
                int i11 = this.V;
                if (size >= i11) {
                    return list.subList(0, i11);
                }
            } else if (template == 3) {
                int size2 = list.size();
                int i12 = this.W;
                if (size2 >= i12) {
                    return list.subList(0, i12);
                }
            }
        }
        return list;
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z10) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id2 = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder sbU = o2.u(id2);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sbU.append(campaignEx.getVideoUrlEncode());
                    sbU.append(campaignEx.getBidToken());
                    id2 = sbU.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f41632i, id2);
                if (z10) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f41632i, list.remove(size), this.N);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f41632i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx.getBidToken(), this.N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }
}
