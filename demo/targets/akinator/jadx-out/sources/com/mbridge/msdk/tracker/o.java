package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private r f44081a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44082b;

    /* renamed from: c, reason: collision with root package name */
    private final p f44083c;

    /* renamed from: d, reason: collision with root package name */
    private final w f44084d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44085e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f44086f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f44087g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private final r f44089a;

        /* renamed from: b, reason: collision with root package name */
        private final t f44090b;

        public b(r rVar, t tVar) {
            this.f44089a = rVar;
            this.f44090b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iA;
            int iB;
            String message;
            if (y.a(this.f44089a)) {
                if (b0Var != null) {
                    try {
                        iA = b0Var.a();
                        iB = b0Var.b();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f43882a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iA = 0;
                    iB = 0;
                }
                this.f44089a.a(this.f44090b, 0, "volleyError:" + iA + ",responseCode:" + iB + ",errorMessage:" + message);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements v.b {

        /* renamed from: a, reason: collision with root package name */
        private final r f44091a;

        /* renamed from: b, reason: collision with root package name */
        private final t f44092b;

        public c(r rVar, t tVar) {
            this.f44091a = rVar;
            this.f44092b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f44091a)) {
                try {
                    this.f44091a.a(this.f44092b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f43882a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f44082b = i10;
        this.f44083c = pVar;
        this.f44084d = wVar;
        this.f44085e = i11;
        this.f44087g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f44081a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f44081a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f43882a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f44086f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f44081a)) {
                this.f44081a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f44085e == 1 ? new v<>(this.f44083c.c(), 1, this.f44083c.a()) : new v<>(this.f44083c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f44084d);
        vVar.a(z10 ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.f44081a, tVar));
        vVar.a((v.a) new b(this.f44081a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f44086f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f44083c.b()), new com.mbridge.msdk.tracker.network.f(this.f44087g), this.f44082b, null);
        this.f44086f = uVarA;
        uVarA.b();
    }
}
