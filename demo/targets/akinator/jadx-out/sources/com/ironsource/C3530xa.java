package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3530xa {

    /* renamed from: i, reason: collision with root package name */
    private static final String f39194i = "WaterfallLifeCycleHolder";

    /* renamed from: d, reason: collision with root package name */
    private com.ironsource.mediationsdk.t f39198d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f39199e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39200f;

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<com.ironsource.mediationsdk.t>> f39195a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private String f39196b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f39197c = "";

    /* renamed from: g, reason: collision with root package name */
    private final Timer f39201g = new Timer();

    /* renamed from: h, reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f39202h = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.xa$a */
    public class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39203a;

        public a(String str) {
            this.f39203a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f39203a + " from memory");
                C3530xa.this.f39195a.remove(this.f39203a);
                ironLog.verbose("waterfall size is currently " + C3530xa.this.f39195a.size());
                ironLog.verbose("removing adInfo with id " + this.f39203a + " from memory");
                C3530xa.this.f39202h.remove(this.f39203a);
                ironLog.verbose("adInfo size is currently " + C3530xa.this.f39202h.size());
            } finally {
                cancel();
            }
        }
    }

    public C3530xa(List<String> list, int i10) {
        this.f39199e = list;
        this.f39200f = i10;
    }

    public synchronized void a(com.ironsource.mediationsdk.t tVar) {
        try {
            IronLog.INTERNAL.verbose();
            com.ironsource.mediationsdk.t tVar2 = this.f39198d;
            if (tVar2 != null && !tVar2.equals(tVar)) {
                this.f39198d.q();
            }
            this.f39198d = tVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(com.ironsource.mediationsdk.t r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L2f
            r0.verbose()     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            if (r6 == 0) goto L55
            boolean r2 = r6.o()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L10
            goto L55
        L10:
            com.ironsource.mediationsdk.t r2 = r5.f39198d     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            if (r2 != 0) goto L16
            goto L56
        L16:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L2f
            if (r2 != r4) goto L31
            com.ironsource.mediationsdk.t r2 = r5.f39198d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            goto L55
        L2f:
            r6 = move-exception
            goto L77
        L31:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r2 = r6.w()     // Catch: java.lang.Throwable -> L2f
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L2f
            if (r2 == r4) goto L45
            java.util.List<java.lang.String> r2 = r5.f39199e     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L45:
            com.ironsource.mediationsdk.t r2 = r5.f39198d     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.j()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.j()     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L56
        L55:
            r3 = r1
        L56:
            if (r3 == 0) goto L73
            if (r6 == 0) goto L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r2.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L2f
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            java.lang.String r6 = i2.hQ.aTNDubNmpwAqdU.lLQZpJEAn     // Catch: java.lang.Throwable -> L2f
            r2.append(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            r0.verbose(r6)     // Catch: java.lang.Throwable -> L2f
        L73:
            r6 = r3 ^ 1
            monitor-exit(r5)
            return r6
        L77:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3530xa.b(com.ironsource.mediationsdk.t):boolean");
    }

    public CopyOnWriteArrayList<com.ironsource.mediationsdk.t> c() {
        CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList = this.f39195a.get(this.f39196b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f39196b;
    }

    public int e() {
        return this.f39195a.size();
    }

    public com.ironsource.mediationsdk.t f() {
        return this.f39198d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean g() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.t r0 = r2.f39198d     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.u()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r2.f39197c     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r2)
            return r0
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3530xa.g():boolean");
    }

    public void a(CopyOnWriteArrayList<com.ironsource.mediationsdk.t> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        com.google.android.gms.internal.play_billing.a.u("updating new waterfall with id ", str, ironLog);
        b();
        this.f39195a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f39197c)) {
            if (g()) {
                StringBuilder sb2 = new StringBuilder("ad from previous waterfall ");
                sb2.append(this.f39197c);
                sb2.append(" is still showing - the current waterfall ");
                com.google.android.gms.internal.play_billing.a.A(sb2, this.f39196b, " will be deleted instead", ironLog);
                String str2 = this.f39196b;
                this.f39196b = this.f39197c;
                this.f39197c = str2;
            }
            this.f39201g.schedule(new a(this.f39197c), this.f39200f);
        }
        this.f39197c = this.f39196b;
        this.f39196b = str;
    }

    private void b() {
        Iterator<com.ironsource.mediationsdk.t> it = c().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.t next = it.next();
            if (!next.equals(this.f39198d)) {
                next.q();
            }
        }
    }

    public boolean a() {
        return this.f39195a.size() > 5;
    }

    public void a(String str, Y8 y82, Bb bb2) {
        if (TextUtils.isEmpty(str) || y82 == null) {
            return;
        }
        this.f39202h.put(str, new AdInfo(y82, bb2));
    }

    public AdInfo a(String str) {
        if (this.f39202h.containsKey(str)) {
            return this.f39202h.get(str);
        }
        return null;
    }
}
