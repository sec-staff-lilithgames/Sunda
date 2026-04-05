package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3100z2 implements P2 {

    /* renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f33673b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerC2964r2 f33674c;

    /* renamed from: d, reason: collision with root package name */
    public static HandlerThread f33675d;

    /* renamed from: g, reason: collision with root package name */
    public static AdConfig.ImaiConfig f33678g;

    /* renamed from: m, reason: collision with root package name */
    public static final C3083y2 f33684m;

    /* renamed from: a, reason: collision with root package name */
    public static final C3100z2 f33672a = new C3100z2();

    /* renamed from: e, reason: collision with root package name */
    public static List f33676e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f33677f = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f33679h = new AtomicBoolean(true);

    /* renamed from: i, reason: collision with root package name */
    public static final Object f33680i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f33681j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final C3049w2 f33682k = C3049w2.f33519a;

    /* renamed from: l, reason: collision with root package name */
    public static final tu.o f33683l = tu.q.lazy(C3066x2.f33556a);

    static {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
        C2925od.a(new al.b(26));
        f33684m = new C3083y2();
    }

    public static final HashMap a(C3100z2 c3100z2, C2897n2 c2897n2) {
        c3100z2.getClass();
        HashMap map = new HashMap();
        try {
            AdConfig.ImaiConfig imaiConfig = f33678g;
            int maxRetries = ((imaiConfig != null ? imaiConfig.getMaxRetries() : 0) - c2897n2.f33115f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
            }
            return map;
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
            return map;
        }
    }

    public static final /* synthetic */ String f() {
        return "z2";
    }

    public static void i() {
        try {
            AtomicBoolean atomicBoolean = f33677f;
            atomicBoolean.set(false);
            synchronized (f33680i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = f33675d;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        f33675d = null;
                        f33674c = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
        }
    }

    public final boolean g() {
        return ((Boolean) f33683l.getValue()).booleanValue();
    }

    public final void h() {
        HandlerThread handlerThread;
        try {
            if (C2736da.a(false) != null) {
                return;
            }
            synchronized (f33680i) {
                try {
                    AtomicBoolean atomicBoolean = f33677f;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                        if (f33675d == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            f33675d = handlerThread2;
                            J4.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f33674c == null && (handlerThread = f33675d) != null) {
                            Looper looper = handlerThread.getLooper();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getLooper(...)");
                            f33674c = new HandlerC2964r2(looper);
                        }
                        C2914o2 c2914o2B = AbstractC2807hd.b();
                        if (c2914o2B == null || V1.a(c2914o2B, null, null, 63) == 0) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                            atomicBoolean.set(false);
                            i();
                        } else {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            HandlerC2964r2 handlerC2964r2 = f33674c;
                            if (handlerC2964r2 != null) {
                                handlerC2964r2.sendMessage(messageObtain);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
        }
    }

    public static final void b(C3100z2 c3100z2, C2897n2 c2897n2) {
        c3100z2.getClass();
        LinkedHashMap linkedHashMap = f33681j;
        AbstractC2694b2 abstractC2694b2 = (AbstractC2694b2) linkedHashMap.get(Integer.valueOf(c2897n2.f33110a));
        if (abstractC2694b2 != null) {
            abstractC2694b2.a(c2897n2);
        }
        linkedHashMap.remove(Integer.valueOf(c2897n2.f33110a));
    }

    public static final void c(C3100z2 c3100z2, C2897n2 click) {
        c3100z2.getClass();
        int i10 = click.f33115f;
        if (i10 > 0) {
            click.f33115f = i10 - 1;
            click.f33116g = System.currentTimeMillis();
            C2914o2 c2914o2B = AbstractC2807hd.b();
            c2914o2B.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
            c2914o2B.b(click, "id = ?", new String[]{String.valueOf(click.f33110a)});
        }
    }

    public static final /* synthetic */ void a(C3100z2 c3100z2) {
        c3100z2.getClass();
        i();
    }

    public static /* synthetic */ void b(C3100z2 c3100z2, String str, boolean z10, AbstractC2694b2 abstractC2694b2, F5 f52, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            abstractC2694b2 = null;
        }
        c3100z2.b(str, z10, abstractC2694b2, f52);
    }

    public static final void a() {
        C3100z2 c3100z2 = f33672a;
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new Q5("z2"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f33673b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f33675d = handlerThread;
            J4.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f33675d;
            kotlin.jvm.internal.e0.checkNotNull(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getLooper(...)");
            f33674c = new HandlerC2964r2(looper);
            LinkedHashMap linkedHashMap = Q2.f32149a;
            Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), c3100z2);
            kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            f33678g = ((AdConfig) configA).getImaiConfig();
            C2925od.f().a(new int[]{10, 11, 2, 1}, f33682k);
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
        }
    }

    public final void b(String url, boolean z10, AbstractC2694b2 abstractC2694b2, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        C2754eb c2754eb = A2.f31615a;
        A2.a(new zk.i1(url, z10, f52, abstractC2694b2, 1), EnumC2737db.f32782b);
    }

    public static final void b(String url, boolean z10, F5 f52, AbstractC2694b2 abstractC2694b2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        try {
            if (f33672a.g()) {
                AdConfig.ImaiConfig imaiConfig = f33678g;
                C2897n2 c2897n2 = new C2897n2(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                    ((G5) f52).a("z2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c2897n2, abstractC2694b2, f52);
            }
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).b("z2", Qf.a(e10, N6.a("z2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public static final void c(String url, boolean z10, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        try {
            if (f33672a.g()) {
                AdConfig.ImaiConfig imaiConfig = f33678g;
                C2897n2 c2897n2 = new C2897n2(url, null, z10, true, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                    ((G5) f52).c("z2", "Received click (" + url + ") for pinging in WebView");
                }
                a(c2897n2, (AbstractC2694b2) null, f52);
            }
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).b("z2", Qf.a(e10, N6.a("z2", "TAG", "SDK encountered unexpected error in pinging click over WebView; ")));
            }
        }
    }

    public final void b(String url, boolean z10, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        C2754eb c2754eb = A2.f31615a;
        A2.a(new com.applovin.impl.d9(url, z10, f52, 8), EnumC2737db.f32783c);
    }

    @Override // com.inmobi.media.P2
    public void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        AdConfig adConfig = config instanceof AdConfig ? (AdConfig) config : null;
        f33678g = adConfig != null ? adConfig.getImaiConfig() : null;
    }

    public final void a(String url, boolean z10, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        a(url, z10, (AbstractC2694b2) null, f52);
    }

    public static /* synthetic */ void a(C3100z2 c3100z2, String str, boolean z10, AbstractC2694b2 abstractC2694b2, F5 f52, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            abstractC2694b2 = null;
        }
        c3100z2.a(str, z10, abstractC2694b2, f52);
    }

    public final void a(String url, boolean z10, AbstractC2694b2 abstractC2694b2, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        C2754eb c2754eb = A2.f31615a;
        A2.a(new zk.i1(url, z10, f52, abstractC2694b2, 0), EnumC2737db.f32783c);
    }

    public static final void a(String url, boolean z10, F5 f52, AbstractC2694b2 abstractC2694b2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        try {
            if (f33672a.g()) {
                AdConfig.ImaiConfig imaiConfig = f33678g;
                C2897n2 c2897n2 = new C2897n2(url, null, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                    ((G5) f52).a("z2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c2897n2, abstractC2694b2, f52);
            }
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).b("z2", Qf.a(e10, N6.a("z2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public static /* synthetic */ void a(C3100z2 c3100z2, String str, Map map, boolean z10, AbstractC2694b2 abstractC2694b2, EnumC2737db enumC2737db, F5 f52, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            abstractC2694b2 = null;
        }
        c3100z2.a(str, map, z10, abstractC2694b2, enumC2737db, f52);
    }

    public final void a(String url, Map<String, String> map, boolean z10, AbstractC2694b2 abstractC2694b2, EnumC2737db priority, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
        A2.a(new com.applovin.impl.mediation.ads.f(url, map, z10, f52, abstractC2694b2, 2), priority);
    }

    public static final void a(String url, Map map, boolean z10, F5 f52, AbstractC2694b2 abstractC2694b2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        try {
            if (f33672a.g()) {
                AdConfig.ImaiConfig imaiConfig = f33678g;
                C2897n2 c2897n2 = new C2897n2(url, map, z10, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 193);
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                    ((G5) f52).a("z2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c2897n2, abstractC2694b2, f52);
            }
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).b("z2", Qf.a(e10, N6.a("z2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static void a(C2897n2 click, AbstractC2694b2 abstractC2694b2, F5 f52) {
        HandlerC2964r2 handlerC2964r2 = f33674c;
        if (handlerC2964r2 != null) {
            handlerC2964r2.f33300a = f52;
        }
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
            ((G5) f52).c("z2", "record Click");
        }
        AdConfig.ImaiConfig imaiConfig = f33678g;
        if (imaiConfig != null) {
            C2914o2 c2914o2B = AbstractC2807hd.b();
            int maxDbEvents = imaiConfig.getMaxDbEvents();
            synchronized (c2914o2B) {
                try {
                    kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
                    if (V1.a(c2914o2B, null, null, 63) >= maxDbEvents) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("o2", "TAG");
                        C2897n2 c2897n2 = (C2897n2) c2914o2B.b("ts= (SELECT MIN(ts) FROM click LIMIT 1)", null);
                        if (c2897n2 != null) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("o2", "TAG");
                            f33672a.a(click, "DB_OVERLOAD");
                            kotlin.jvm.internal.e0.checkNotNullParameter(c2897n2, VPCjETNfjxu.AUzy);
                            c2914o2B.a("id = ?", new String[]{String.valueOf(c2897n2.f33110a)});
                        }
                    }
                    c2914o2B.a(click);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (abstractC2694b2 != null) {
                f33681j.put(Integer.valueOf(click.f33110a), abstractC2694b2);
            }
        }
        if (C2736da.a(false) != null) {
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                ((G5) f52).b("z2", "No network available. Saving click for later processing ...");
            }
            f33677f.set(false);
            i();
            return;
        }
        if (f52 != null) {
            StringBuilder sbA = N6.a("z2", "TAG", "submit click - ");
            sbA.append(click.f33110a);
            ((G5) f52).a("z2", sbA.toString());
        }
        ThreadPoolExecutor threadPoolExecutor = f33673b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new zk.g1(2, click, f52));
        }
    }

    public static final void a(C2897n2 click, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "$click");
        SystemClock.elapsedRealtime();
        if (click.f33114e) {
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
                ((G5) f52).c("z2", "ping in web view");
            }
            new C2998t2(f33684m, f52).a(click);
            return;
        }
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z2", "TAG");
            ((G5) f52).c("z2", "ping in http executor");
        }
        new C3015u2(f33684m, f52).a(click);
    }

    public final void a(C2897n2 click, String error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        LinkedHashMap linkedHashMap = f33681j;
        AbstractC2694b2 abstractC2694b2 = (AbstractC2694b2) linkedHashMap.get(Integer.valueOf(click.f33110a));
        if (abstractC2694b2 != null) {
            abstractC2694b2.a(click, error);
        }
        linkedHashMap.remove(Integer.valueOf(click.f33110a));
    }
}
