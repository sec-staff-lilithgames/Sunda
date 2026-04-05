package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f17060r;

    /* renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f17061s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f17062a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f17063b;

    /* renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f17064c;

    /* renamed from: d, reason: collision with root package name */
    private final INetWork f17065d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f17066e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f17067f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f17068g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f17069h;

    /* renamed from: i, reason: collision with root package name */
    private final String f17070i;

    /* renamed from: j, reason: collision with root package name */
    private final String f17071j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17072k;

    /* renamed from: l, reason: collision with root package name */
    private final String f17073l;

    /* renamed from: m, reason: collision with root package name */
    private final String f17074m;

    /* renamed from: n, reason: collision with root package name */
    private final File f17075n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f17076o;

    /* renamed from: p, reason: collision with root package name */
    private final long f17077p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f17078q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private INetWork f17079a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f17080b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f17081c;

        /* renamed from: d, reason: collision with root package name */
        private Context f17082d;

        /* renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f17083e;

        /* renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f17084f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17085g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f17086h;

        /* renamed from: i, reason: collision with root package name */
        private Long f17087i;

        /* renamed from: j, reason: collision with root package name */
        private String f17088j;

        /* renamed from: k, reason: collision with root package name */
        private String f17089k;

        /* renamed from: l, reason: collision with root package name */
        private String f17090l;

        /* renamed from: m, reason: collision with root package name */
        private File f17091m;

        /* renamed from: n, reason: collision with root package name */
        private String f17092n;

        /* renamed from: o, reason: collision with root package name */
        private String f17093o;

        /* renamed from: p, reason: collision with root package name */
        private long f17094p;

        public a(Context context) {
            this.f17082d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f17081c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f17080b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f17090l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f17079a = iNetWork;
            return this;
        }

        public final a b() {
            this.f17087i = 38L;
            return this;
        }

        public final a a(long j10) {
            this.f17094p = j10;
            return this;
        }

        public final a b(String str) {
            this.f17089k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f17084f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f17085g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f17086h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f17088j = str;
            return this;
        }

        public final a a(File file) {
            this.f17091m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f17060r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f17061s == null) {
            synchronized (b.class) {
                try {
                    if (f17061s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f17061s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f17061s;
    }

    public final Context a() {
        return this.f17062a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f17068g;
    }

    public final boolean c() {
        return this.f17076o;
    }

    public final List<String> d() {
        return this.f17067f;
    }

    public final List<String> e() {
        return this.f17066e;
    }

    public final JSONObject f() {
        return this.f17078q;
    }

    public final INetWork i() {
        return this.f17065d;
    }

    public final String j() {
        return this.f17072k;
    }

    public final long k() {
        return this.f17069h.longValue();
    }

    public final String l() {
        return this.f17074m;
    }

    public final String m() {
        return this.f17073l;
    }

    public final File n() {
        return this.f17075n;
    }

    public final String o() {
        return this.f17070i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f17063b;
    }

    public final IStatisticMonitor q() {
        return this.f17064c;
    }

    public final String r() {
        return this.f17071j;
    }

    public final long s() {
        return this.f17077p;
    }

    private b(a aVar) {
        Context context = aVar.f17082d;
        this.f17062a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f17080b;
        this.f17066e = list;
        this.f17067f = aVar.f17081c;
        this.f17063b = aVar.f17083e;
        this.f17068g = aVar.f17086h;
        Long l9 = aVar.f17087i;
        this.f17069h = l9;
        if (TextUtils.isEmpty(aVar.f17088j)) {
            this.f17070i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f17070i = aVar.f17088j;
        }
        String str = aVar.f17089k;
        this.f17071j = str;
        this.f17073l = aVar.f17092n;
        this.f17074m = aVar.f17093o;
        this.f17077p = aVar.f17094p;
        if (aVar.f17091m == null) {
            this.f17075n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f17075n = aVar.f17091m;
        }
        String str2 = aVar.f17090l;
        this.f17072k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l9 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f17065d = aVar.f17079a;
        this.f17064c = aVar.f17084f;
        this.f17076o = aVar.f17085g;
    }

    public final void a(JSONObject jSONObject) {
        this.f17078q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f17060r = iThreadPoolCallback;
    }
}
