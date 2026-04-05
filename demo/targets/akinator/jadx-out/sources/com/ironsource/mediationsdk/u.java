package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import com.ironsource.A1;
import com.ironsource.Be;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.Ce;
import com.ironsource.D5;
import com.ironsource.Dc;
import com.ironsource.InterfaceC3357n7;
import com.ironsource.K1;
import com.ironsource.Mb;
import com.ironsource.Mc;
import com.ironsource.Me;
import com.ironsource.Qe;
import com.ironsource.V9;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class u implements Dc {

    /* renamed from: z, reason: collision with root package name */
    private static u f37753z;

    /* renamed from: a, reason: collision with root package name */
    private Qe f37754a;

    /* renamed from: p, reason: collision with root package name */
    private NetworkStateReceiver f37769p;

    /* renamed from: q, reason: collision with root package name */
    private CountDownTimer f37770q;

    /* renamed from: t, reason: collision with root package name */
    private String f37773t;

    /* renamed from: u, reason: collision with root package name */
    private Me f37774u;

    /* renamed from: w, reason: collision with root package name */
    private long f37776w;

    /* renamed from: b, reason: collision with root package name */
    private int f37755b = e.f37793f;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3357n7 f37756c = Mb.U().k();

    /* renamed from: d, reason: collision with root package name */
    private final String f37757d = "appKey";

    /* renamed from: e, reason: collision with root package name */
    private final String f37758e = getClass().getSimpleName();

    /* renamed from: l, reason: collision with root package name */
    private boolean f37765l = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37767n = false;

    /* renamed from: r, reason: collision with root package name */
    private List<Mc> f37771r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private String f37772s = "";

    /* renamed from: y, reason: collision with root package name */
    private f f37778y = new a();

    /* renamed from: m, reason: collision with root package name */
    private Handler f37766m = IronSourceThreadManager.INSTANCE.getInitHandler();

    /* renamed from: f, reason: collision with root package name */
    private int f37759f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f37760g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f37761h = 62;

    /* renamed from: i, reason: collision with root package name */
    private int f37762i = 12;

    /* renamed from: j, reason: collision with root package name */
    private int f37763j = 5;

    /* renamed from: o, reason: collision with root package name */
    private AtomicBoolean f37768o = new AtomicBoolean(true);

    /* renamed from: k, reason: collision with root package name */
    private boolean f37764k = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f37775v = false;

    /* renamed from: x, reason: collision with root package name */
    private V9 f37777x = new V9();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends f {
        public a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x02a8 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x0023, B:9:0x002f, B:10:0x003e, B:12:0x0081, B:14:0x0094, B:16:0x00d1, B:17:0x00fa, B:19:0x012a, B:21:0x0130, B:22:0x0158, B:24:0x0183, B:26:0x018d, B:27:0x019a, B:28:0x01ae, B:30:0x01b4, B:31:0x01ce, B:33:0x01ee, B:68:0x02f7, B:34:0x0213, B:36:0x021b, B:37:0x022d, B:39:0x0233, B:40:0x023f, B:42:0x0246, B:43:0x0251, B:45:0x0257, B:46:0x0261, B:48:0x0265, B:50:0x0271, B:52:0x028e, B:53:0x0297, B:55:0x029c, B:67:0x02ed, B:57:0x02a8, B:59:0x02b0, B:61:0x02bb, B:62:0x02bf, B:63:0x02c9, B:65:0x02cf, B:66:0x02db), top: B:72:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 782
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.u.a.run():void");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends CountDownTimer {
            public a(long j10, long j11) {
                super(j10, j11);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                u uVar = u.this;
                if (uVar.f37765l) {
                    return;
                }
                uVar.f37765l = true;
                Iterator it = uVar.f37771r.iterator();
                while (it.hasNext()) {
                    ((Mc) it.next()).h("noInternetConnection");
                }
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (j10 <= 45000) {
                    u uVar = u.this;
                    uVar.f37775v = true;
                    Iterator it = uVar.f37771r.iterator();
                    while (it.hasNext()) {
                        ((Mc) it.next()).a();
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f37770q = new a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, MBInterstitialActivity.WEB_LOAD_TIME).start();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37782a;

        static {
            int[] iArr = new int[d.values().length];
            f37782a = iArr;
            try {
                iArr[d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37782a[d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37782a[d.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static int f37788a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static int f37789b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static int f37790c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static int f37791d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static int f37792e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static int f37793f = 5;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        String f37795b;

        /* renamed from: a, reason: collision with root package name */
        boolean f37794a = true;

        /* renamed from: c, reason: collision with root package name */
        protected r.b f37796c = new a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements r.b {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.r.b
            public void a(String str) {
                f fVar = f.this;
                fVar.f37794a = false;
                fVar.f37795b = str;
            }
        }

        public f() {
        }
    }

    private u() {
    }

    public static synchronized u c() {
        try {
            if (f37753z == null) {
                f37753z = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37753z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (Mb.U().g().g()) {
            Mb.U().q().a(new C5(D5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f37764k;
    }

    public void a(Context context, Me me2) {
        this.f37777x.i(me2.f().h());
        this.f37777x.c(me2.f().d());
        A1 a1B = me2.c().b();
        this.f37777x.a(a1B.a());
        this.f37777x.d(a1B.c().b());
        this.f37777x.b(a1B.k().b());
        this.f37777x.a(Boolean.valueOf(IronSourceUtils.c(context)));
        K1 k1F = me2.c().b().f();
        this.f37777x.b(k1F.b());
        Mb.O().o().a(k1F.c());
    }

    public int b() {
        return this.f37755b;
    }

    public synchronized boolean d() {
        return this.f37775v;
    }

    public void f() {
        b(d.INIT_FAILED);
    }

    public synchronized void g() {
        int iA = a(a());
        this.f37755b = iA;
        this.f37777x.c(iA);
    }

    public synchronized void b(d dVar) {
        IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        Ce.f33927a.a(Be.values()[dVar.ordinal()]);
    }

    private static int a(d dVar) {
        int i10 = c.f37782a[dVar.ordinal()];
        if (i10 == 1) {
            return e.f37791d;
        }
        if (i10 == 2) {
            return e.f37792e;
        }
        if (i10 != 3) {
            return e.f37788a;
        }
        return e.f37789b;
    }

    public synchronized void a(Context context, String str, String str2, IronSource.a... aVarArr) {
        try {
            try {
                AtomicBoolean atomicBoolean = this.f37768o;
                if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                    b(d.INIT_IN_PROGRESS);
                    this.f37772s = str2;
                    this.f37773t = str;
                    if (IronSourceUtils.g(context)) {
                        this.f37766m.post(this.f37778y);
                    } else {
                        this.f37767n = true;
                        if (this.f37769p == null) {
                            this.f37769p = new NetworkStateReceiver(context, this);
                        }
                        context.registerReceiver(this.f37769p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b());
                    }
                } else {
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f37758e + ": Multiple calls to init are not allowed", 2);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.ironsource.Dc
    public void a(boolean z10) {
        if (this.f37767n && z10) {
            CountDownTimer countDownTimer = this.f37770q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f37767n = false;
            this.f37764k = true;
            Mb.U().q().a(new C5(D5.INIT_AFTER_REACHABILITY_CHANGE, IronSourceUtils.b(false)));
            this.f37766m.post(this.f37778y);
        }
    }

    public synchronized d a() {
        return d.values()[Ce.f33927a.a().ordinal()];
    }
}
