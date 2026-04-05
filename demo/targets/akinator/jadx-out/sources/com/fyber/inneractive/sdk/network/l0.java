package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f24243g = new h0();

    /* renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f24244a = new PriorityBlockingQueue(100, new k0());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f24245b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f24246c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f24247d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f24243g);

    /* renamed from: e, reason: collision with root package name */
    public final i0 f24248e = new i0(this);

    /* renamed from: f, reason: collision with root package name */
    public final j1 f24249f = new j1();

    public final void a(t0 t0Var) {
        p0 p0Var;
        if (!this.f24244a.offer(t0Var)) {
            IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        i1 i1Var = i1.QUEUED;
        t0Var.f24287f = i1Var;
        if (i1Var != i1.QUEUED_FOR_RETRY || (p0Var = t0Var.f24285d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(t0 t0Var) {
        j1 j1Var = this.f24249f;
        j1Var.getClass();
        String str = t0Var.f24288g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.a(j1Var), str);
        n1 n1Var = (n1) j1Var.f24235a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(n1Var.f24260d);
        }
        j1Var.f24235a.remove(str);
    }

    public final boolean c(t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f24287f = i1.QUEUED_FOR_RETRY;
        p0 p0Var = t0Var.f24285d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long jG = t0Var.g();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), Long.valueOf(jG));
        this.f24246c.postDelayed(new j0(this, t0Var), jG);
        return true;
    }

    public static void a(t0 t0Var, l lVar, o0 o0Var) {
        try {
            if (t0Var.f24282a || t0Var.h() == null || o0Var == null || lVar == null || lVar.f24237a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.f24241e);
        } catch (Exception e10) {
            IAlog.a("Failed cache network response data", e10, new Object[0]);
        }
    }

    public static void a(t0 t0Var, o0 o0Var) {
        try {
            if (t0Var.f24282a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.f24261a, (Exception) null, false);
        } catch (Exception e10) {
            IAlog.a("failed notifying the listener request complete", e10, new Object[0]);
            if (t0Var.f24282a) {
                return;
            }
            t0Var.a((Object) null, e10, false);
        }
    }

    public final o0 a(t0 t0Var, l lVar) throws Exception {
        if (lVar != null) {
            try {
                if (!t0Var.f24282a) {
                    int i10 = lVar.f24237a;
                    if (i10 != 200 && (i10 < 300 || i10 >= 304)) {
                        if (i10 == 304) {
                            t0Var.a((Object) null, (Exception) new g(), false);
                            return null;
                        }
                        t0Var.a((Object) null, (Exception) new k1(lVar.f24238b, lVar.f24237a), false);
                        return null;
                    }
                    return t0Var.a(lVar, lVar.f24240d, i10);
                }
            } catch (t1 e10) {
                IAlog.a("failed parsing network request but will retry", e10, new Object[0]);
                if (c(t0Var)) {
                    throw e10;
                }
                throw new s1(e10);
            } catch (Exception e11) {
                IAlog.a("failed parsing network request", e11, new Object[0]);
                throw e11;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 r4, com.fyber.inneractive.sdk.network.a r5) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.String r0 = "failed sending network request"
            r1 = 0
            boolean r2 = r4.f24282a     // Catch: java.lang.Exception -> Lc java.net.SocketTimeoutException -> Le com.fyber.inneractive.sdk.network.b -> L10 java.net.UnknownHostException -> L12 com.fyber.inneractive.sdk.network.t1 -> L14
            if (r2 != 0) goto L20
            if (r5 == 0) goto L16
            java.lang.String r5 = r5.f24190a     // Catch: java.lang.Exception -> Lc java.net.SocketTimeoutException -> Le com.fyber.inneractive.sdk.network.b -> L10 java.net.UnknownHostException -> L12 com.fyber.inneractive.sdk.network.t1 -> L14
            goto L18
        Lc:
            r4 = move-exception
            goto L22
        Le:
            r5 = move-exception
            goto L28
        L10:
            r5 = move-exception
            goto L28
        L12:
            r5 = move-exception
            goto L28
        L14:
            r5 = move-exception
            goto L3f
        L16:
            java.lang.String r5 = ""
        L18:
            a()     // Catch: java.lang.Exception -> Lc java.net.SocketTimeoutException -> Le com.fyber.inneractive.sdk.network.b -> L10 java.net.UnknownHostException -> L12 com.fyber.inneractive.sdk.network.t1 -> L14
            com.fyber.inneractive.sdk.network.l r4 = r4.a(r5)     // Catch: java.lang.Exception -> Lc java.net.SocketTimeoutException -> Le com.fyber.inneractive.sdk.network.b -> L10 java.net.UnknownHostException -> L12 com.fyber.inneractive.sdk.network.t1 -> L14
            return r4
        L20:
            r4 = 0
            return r4
        L22:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r4, r5)
            throw r4
        L28:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r5, r1)
            boolean r4 = r3.c(r4)
            if (r4 == 0) goto L39
            com.fyber.inneractive.sdk.network.t1 r4 = new com.fyber.inneractive.sdk.network.t1
            r4.<init>(r5)
            throw r4
        L39:
            com.fyber.inneractive.sdk.network.s1 r4 = new com.fyber.inneractive.sdk.network.s1
            r4.<init>(r5)
            throw r4
        L3f:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "failed sending network request but will retry"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r5, r0)
            boolean r4 = r3.c(r4)
            if (r4 == 0) goto L4d
            throw r5
        L4d:
            com.fyber.inneractive.sdk.network.s1 r4 = new com.fyber.inneractive.sdk.network.s1
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.l0.a(com.fyber.inneractive.sdk.network.t0, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.l");
    }

    public static void a() throws b {
        NetworkInfo activeNetworkInfo;
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class)).c("should_use_is_network_connected");
        boolean z10 = false;
        if (boolC != null ? boolC.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.fyber.inneractive.sdk.util.o.f26796a.getSystemService("connectivity");
                activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    z10 = true;
                }
            }
            if (!z10) {
                throw new b("No network connection");
            }
        }
    }
}
