package com.applovin.impl;

import android.os.Process;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f16262a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f16263b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f16264a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f16265b;

        private void a() {
            b((c) this.f16264a.take());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f16264a = blockingQueue;
            this.f16265b = kVar;
            setPriority(((Integer) kVar.a(v4.Q)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00d1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #12 {all -> 0x00dd, blocks: (B:57:0x00b9, B:59:0x00d1, B:80:0x0108, B:64:0x00e2, B:67:0x00ee, B:79:0x0107, B:78:0x0104, B:75:0x00ff, B:65:0x00e6), top: B:108:0x00b9, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(com.applovin.impl.y3.c r17) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.y3.b.b(com.applovin.impl.y3$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f16272f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f16267a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f16268b);
            httpURLConnection.setConnectTimeout(cVar.f16271e);
            httpURLConnection.setReadTimeout(cVar.f16271e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f16269c.isEmpty()) {
                for (Map.Entry entry : cVar.f16269c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements Comparable {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f16266i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f16267a;

        /* renamed from: b, reason: collision with root package name */
        private final String f16268b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f16269c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f16270d;

        /* renamed from: e, reason: collision with root package name */
        private final int f16271e;

        /* renamed from: f, reason: collision with root package name */
        private final w3.b f16272f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f16273g;

        /* renamed from: h, reason: collision with root package name */
        private final int f16274h;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f16275a;

            /* renamed from: b, reason: collision with root package name */
            private String f16276b;

            /* renamed from: c, reason: collision with root package name */
            private Map f16277c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f16278d;

            /* renamed from: e, reason: collision with root package name */
            private int f16279e;

            /* renamed from: f, reason: collision with root package name */
            private w3.b f16280f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f16281g;

            public a a(String str) {
                this.f16275a = str;
                return this;
            }

            public a b(String str) {
                this.f16276b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f16277c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f16277c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f16278d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f16279e = i10;
                return this;
            }

            public a a(w3.b bVar) {
                this.f16280f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.f16281g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f16274h - cVar.f16274h;
        }

        private c(a aVar) {
            this.f16267a = aVar.f16275a;
            this.f16268b = aVar.f16276b;
            this.f16269c = aVar.f16277c != null ? aVar.f16277c : Collections.EMPTY_MAP;
            this.f16270d = aVar.f16278d;
            this.f16271e = aVar.f16279e;
            this.f16272f = aVar.f16280f;
            this.f16273g = aVar.f16281g;
            this.f16274h = f16266i.incrementAndGet();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f16282a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f16283b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f16284c;

        /* renamed from: d, reason: collision with root package name */
        private final long f16285d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f16286e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f16287a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f16288b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f16289c;

            /* renamed from: d, reason: collision with root package name */
            private long f16290d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f16291e;

            public a a(int i10) {
                this.f16287a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f16289c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f16288b = bArr;
                return this;
            }

            public a a(Throwable th2) {
                this.f16291e = th2;
                return this;
            }

            public a a(long j10) {
                this.f16290d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f16282a;
        }

        public int c() throws Throwable {
            Throwable th2 = this.f16286e;
            if (th2 == null) {
                return this.f16282a;
            }
            throw th2;
        }

        public byte[] d() throws Throwable {
            Throwable th2 = this.f16286e;
            if (th2 == null) {
                return this.f16283b;
            }
            throw th2;
        }

        public long e() {
            return this.f16285d;
        }

        public byte[] f() {
            return this.f16284c;
        }

        private d(a aVar) {
            this.f16282a = aVar.f16287a;
            this.f16283b = aVar.f16288b;
            this.f16284c = aVar.f16289c;
            this.f16285d = aVar.f16290d;
            this.f16286e = aVar.f16291e;
        }
    }

    public y3(com.applovin.impl.sdk.k kVar) {
        this.f16263b = kVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f16263b.a(v4.P)).intValue(); i10++) {
            new b(this.f16262a, i10, this.f16263b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f16262a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
