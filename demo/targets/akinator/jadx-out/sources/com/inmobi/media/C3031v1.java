package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3031v1 implements P2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3031v1 f33468a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f33469b;

    /* renamed from: c, reason: collision with root package name */
    public static AdConfig.AssetCacheConfig f33470c;

    /* renamed from: d, reason: collision with root package name */
    public static AdConfig.VastVideoConfig f33471d;

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f33472e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadPoolExecutor f33473f;

    /* renamed from: g, reason: collision with root package name */
    public static HandlerC2963r1 f33474g;

    /* renamed from: h, reason: collision with root package name */
    public static HandlerThread f33475h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicBoolean f33476i;

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f33477j;

    /* renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f33478k;

    /* renamed from: l, reason: collision with root package name */
    public static final ArrayList f33479l;

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicBoolean f33480m;

    /* renamed from: n, reason: collision with root package name */
    public static final C2997t1 f33481n;

    /* renamed from: o, reason: collision with root package name */
    public static final C3014u1 f33482o;

    static {
        C3031v1 c3031v1 = new C3031v1();
        f33468a = c3031v1;
        f33469b = new Object();
        f33476i = new AtomicBoolean(false);
        f33477j = new AtomicBoolean(false);
        f33479l = new ArrayList();
        f33480m = new AtomicBoolean(true);
        f33481n = C2997t1.f33376a;
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), c3031v1);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        AdConfig adConfig = (AdConfig) configA;
        f33470c = adConfig.getAssetCacheConfig();
        f33471d = adConfig.getVastVideo();
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(new Q5("v1".concat("-AP")));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
        f33472e = executorServiceNewCachedThreadPool;
        int i10 = F4.f31769a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Q5("v1".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f33473f = threadPoolExecutor;
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        f33475h = handlerThread;
        J4.a(handlerThread, "assetFetcher");
        HandlerThread handlerThread2 = f33475h;
        kotlin.jvm.internal.e0.checkNotNull(handlerThread2);
        Looper looper = handlerThread2.getLooper();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getLooper(...)");
        f33474g = new HandlerC2963r1(looper, c3031v1);
        f33478k = new ConcurrentHashMap(2, 0.9f, 2);
        f33482o = new C3014u1();
    }

    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (!(config instanceof AdConfig)) {
            f33470c = null;
            f33471d = null;
        } else {
            AdConfig adConfig = (AdConfig) config;
            f33470c = adConfig.getAssetCacheConfig();
            f33471d = adConfig.getVastVideo();
        }
    }

    public final void b(C2826j c2826j) {
        String locationOnDisk = c2826j.f32941c;
        AdConfig.AssetCacheConfig assetCacheConfig = f33470c;
        if (locationOnDisk == null || locationOnDisk.length() == 0 || assetCacheConfig == null) {
            return;
        }
        File file = new File(locationOnDisk);
        long jMin = Math.min((c2826j.f32945g - c2826j.f32943e) + System.currentTimeMillis(), (assetCacheConfig.getTimeToLive() * 1000) + System.currentTimeMillis());
        int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String url = c2826j.f32940b;
        int maxRetries = assetCacheConfig.getMaxRetries();
        long j10 = c2826j.f32946h;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(locationOnDisk, "locationOnDisk");
        if (url == null) {
            url = "";
        }
        C2826j c2826j2 = new C2826j(iNextInt, url, locationOnDisk, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, jMin, j10);
        c2826j2.f32943e = System.currentTimeMillis();
        AbstractC2807hd.a().a(c2826j2);
        long j11 = c2826j.f32943e;
        c2826j2.f32948j = AbstractC2860l.a(c2826j, file, j11, j11);
        c2826j2.f32947i = true;
        a(c2826j2, (byte) -1);
    }

    public final synchronized void c(String str) {
        int size = f33479l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2843k c2843k = (C2843k) f33479l.get(i10);
            Iterator it = c2843k.f32992h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.e0.areEqual(((Rb) it.next()).f32216b, str)) {
                        c2843k.f32986b++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public final synchronized void d(String str) {
        int size = f33479l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2843k c2843k = (C2843k) f33479l.get(i10);
            Set set = c2843k.f32992h;
            HashSet hashSet = c2843k.f32989e;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.e0.areEqual(((Rb) it.next()).f32216b, str)) {
                    if (!hashSet.contains(str)) {
                        c2843k.f32989e.add(str);
                        c2843k.f32985a++;
                    }
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f33479l.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2843k c2843k = (C2843k) f33479l.get(i10);
                if (c2843k.f32985a == c2843k.f32992h.size()) {
                    try {
                        InterfaceC3048w1 interfaceC3048w1 = (InterfaceC3048w1) c2843k.f32988d.get();
                        if (interfaceC3048w1 != null) {
                            interfaceC3048w1.a(c2843k);
                        }
                        arrayList.add(c2843k);
                    } catch (Exception e10) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                        Y5 y52 = Y5.f32563a;
                        Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(C2826j c2826j) {
        int size = f33479l.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2843k c2843k = (C2843k) f33479l.get(i10);
            Iterator it = c2843k.f32992h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.e0.areEqual(((Rb) it.next()).f32216b, c2826j.f32940b)) {
                    if (!c2843k.f32991g.contains(c2826j)) {
                        c2843k.f32991g.add(c2826j);
                    }
                }
            }
        }
    }

    public final void c() {
        if (f33480m.get()) {
            f33477j.set(false);
            if (C2736da.a(false) != null) {
                N7 n7F = C2925od.f();
                C2997t1 c2997t1 = f33481n;
                n7F.a(c2997t1);
                C2925od.f().a(new int[]{10, 2, 1}, c2997t1);
                return;
            }
            synchronized (f33469b) {
                try {
                    if (f33476i.compareAndSet(false, true)) {
                        if (f33475h == null) {
                            HandlerThread handlerThread = new HandlerThread("assetFetcher");
                            f33475h = handlerThread;
                            J4.a(handlerThread, "assetFetcher");
                        }
                        if (f33474g == null) {
                            HandlerThread handlerThread2 = f33475h;
                            kotlin.jvm.internal.e0.checkNotNull(handlerThread2);
                            Looper looper = handlerThread2.getLooper();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(looper, "getLooper(...)");
                            f33474g = new HandlerC2963r1(looper, this);
                        }
                        if (AbstractC2807hd.a().b().isEmpty()) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                            d();
                        } else {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                            N7 n7F2 = C2925od.f();
                            C2997t1 c2997t12 = f33481n;
                            n7F2.a(c2997t12);
                            C2925od.f().a(new int[]{10, 2, 1}, c2997t12);
                            HandlerC2963r1 handlerC2963r1 = f33474g;
                            kotlin.jvm.internal.e0.checkNotNull(handlerC2963r1);
                            handlerC2963r1.sendEmptyMessage(1);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void d() {
        if (f33480m.get()) {
            synchronized (f33469b) {
                f33476i.set(false);
                f33478k.clear();
                HandlerThread handlerThread = f33475h;
                if (handlerThread != null) {
                    handlerThread.getLooper().quit();
                    handlerThread.interrupt();
                    f33475h = null;
                    f33474g = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        r20.f32950l = 4;
        r20.f32942d = 0;
        com.inmobi.media.C2877m.a(r1, r14, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        r19.f33064a.a(r20);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x018d, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018f, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0191, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0193, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r2 = r12;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca A[Catch: all -> 0x00b1, Exception -> 0x019b, IOException -> 0x01ac, ProtocolException -> 0x01bb, MalformedURLException -> 0x01ca, FileNotFoundException -> 0x01d9, SocketTimeoutException -> 0x01e8, TryCatch #8 {FileNotFoundException -> 0x01d9, MalformedURLException -> 0x01ca, ProtocolException -> 0x01bb, SocketTimeoutException -> 0x01e8, IOException -> 0x01ac, Exception -> 0x019b, all -> 0x00b1, blocks: (B:15:0x0062, B:17:0x0091, B:19:0x00a1, B:21:0x00a8, B:23:0x00ae, B:26:0x00b6, B:27:0x00ba, B:29:0x00be, B:30:0x00ca, B:32:0x00d6, B:34:0x00dd, B:36:0x00eb, B:38:0x00fc, B:40:0x0102, B:41:0x0105), top: B:115:0x0062 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.inmobi.media.C2826j r20, com.inmobi.media.InterfaceC2930p1 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3031v1.a(com.inmobi.media.j, com.inmobi.media.p1):boolean");
    }

    public final synchronized void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f33479l.remove(arrayList.get(i10));
        }
    }

    public static void b() {
        ArrayList arrayListA = AbstractC2807hd.a().a();
        long length = 0;
        if (!arrayListA.isEmpty()) {
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((C2826j) it.next()).f32941c;
                if (str != null) {
                    length += new File(str).length();
                }
            }
        }
        AdConfig.AssetCacheConfig assetCacheConfig = f33470c;
        tu.x0 x0Var = null;
        if (assetCacheConfig != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            assetCacheConfig.getMaxCacheSize();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            if (length > assetCacheConfig.getMaxCacheSize()) {
                C2913o1 c2913o1A = AbstractC2807hd.a();
                c2913o1A.getClass();
                ArrayList arrayListA2 = V1.a(c2913o1A, null, null, null, null, "ts ASC ", 1, 15);
                C2826j asset = arrayListA2.isEmpty() ? null : (C2826j) arrayListA2.get(0);
                if (asset != null) {
                    if (f33480m.get()) {
                        C2913o1 c2913o1A2 = AbstractC2807hd.a();
                        c2913o1A2.getClass();
                        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                        c2913o1A2.a("id = ?", new String[]{String.valueOf(asset.f32939a)});
                        String str2 = asset.f32941c;
                        if (str2 != null) {
                            File file = new File(str2);
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                    b();
                }
            }
            x0Var = tu.x0.f87415a;
        }
        if (x0Var == null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
        }
    }

    public static final void b(C2843k assetBatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "$assetBatch");
        synchronized (f33468a) {
            ArrayList arrayList = f33479l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
        assetBatch.f32992h.size();
        Iterator it = assetBatch.f32992h.iterator();
        while (it.hasNext()) {
            String str = ((Rb) it.next()).f32216b;
            C3031v1 c3031v1 = f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            C2826j c2826jA = AbstractC2807hd.a().a(str);
            if (c2826jA != null && c2826jA.a()) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                c3031v1.b(c2826jA);
            } else {
                a(str);
            }
        }
    }

    public static final void b(C2843k assetBatch, String adType) {
        String str;
        long jElapsedRealtime;
        Context contextD;
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "$assetBatch");
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "$adType");
        synchronized (f33468a) {
            ArrayList arrayList = f33479l;
            if (!arrayList.contains(assetBatch)) {
                arrayList.add(assetBatch);
            }
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
        assetBatch.f32992h.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Rb rb2 : assetBatch.f32992h) {
            String str2 = rb2.f32216b;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.e0.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() > 0 && rb2.f32215a == 2) {
                arrayList2.add(rb2.f32216b);
            } else {
                arrayList3.add(rb2.f32216b);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            try {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                jElapsedRealtime = SystemClock.elapsedRealtime();
                contextD = C2925od.d();
            } catch (Exception unused) {
                str = adType;
            }
            if (contextD != null) {
                Ia ia2 = Ia.f31873a;
                RequestCreator requestCreatorLoad = ia2.a(contextD).load(str3);
                str = adType;
                try {
                    Object objA = ia2.a(new C2980s1(countDownLatch, str3, jElapsedRealtime, str));
                    requestCreatorLoad.fetch(objA instanceof Callback ? (Callback) objA : null);
                } catch (Exception unused2) {
                    countDownLatch.countDown();
                    adType = str;
                }
                adType = str;
            }
        }
        try {
            countDownLatch.await();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
        } catch (InterruptedException unused3) {
        }
        C3031v1 c3031v1 = f33468a;
        c3031v1.e();
        c3031v1.a((byte) 0);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C3031v1 c3031v12 = f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            C2826j c2826jA = AbstractC2807hd.a().a(str4);
            if (c2826jA != null && c2826jA.a()) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                c3031v12.b(c2826jA);
            } else {
                a(str4);
            }
        }
    }

    public final synchronized void a(C2826j c2826j, byte b10) {
        a(c2826j);
        f33478k.remove(c2826j.f32940b);
        if (b10 == -1) {
            d(c2826j.f32940b);
            e();
        } else {
            c(c2826j.f32940b);
            a(b10);
        }
    }

    public static final void b(String remoteUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(remoteUrl, "$remoteUrl");
        C2826j c2826jA = AbstractC2807hd.a().a(remoteUrl);
        if (c2826jA != null) {
            if (c2826jA.a()) {
                f33468a.b(c2826jA);
            } else if (a(c2826jA, f33482o)) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            } else {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
            }
        }
    }

    public final synchronized void a(byte b10) {
        try {
            ArrayList arrayList = new ArrayList();
            int size = f33479l.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2843k c2843k = (C2843k) f33479l.get(i10);
                if (c2843k.f32986b > 0) {
                    try {
                        InterfaceC3048w1 interfaceC3048w1 = (InterfaceC3048w1) c2843k.f32988d.get();
                        if (interfaceC3048w1 != null) {
                            interfaceC3048w1.a(c2843k, b10);
                        }
                        arrayList.add(c2843k);
                    } catch (Exception e10) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                        Y5 y52 = Y5.f32563a;
                        Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    }
                }
            }
            b(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a() {
        if (f33480m.get()) {
            synchronized (f33469b) {
                try {
                    ArrayList arrayListA = AbstractC2807hd.a().a();
                    if (arrayListA.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayListA.iterator();
                    while (it.hasNext()) {
                        C2826j asset = (C2826j) it.next();
                        asset.getClass();
                        if (System.currentTimeMillis() > asset.f32945g && f33480m.get()) {
                            C2913o1 c2913o1A = AbstractC2807hd.a();
                            c2913o1A.getClass();
                            kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                            c2913o1A.a("id = ?", new String[]{String.valueOf(asset.f32939a)});
                            String str = asset.f32941c;
                            if (str != null) {
                                File file = new File(str);
                                if (file.exists()) {
                                    file.delete();
                                }
                            }
                        }
                    }
                    b();
                    a(arrayListA);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void a(ArrayList arrayList) {
        File[] fileArrListFiles;
        File fileB = C2925od.f33208a.b(C2925od.d());
        if (!fileB.exists() || (fileArrListFiles = fileB.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.e0.areEqual(file.getAbsolutePath(), ((C2826j) it.next()).f32941c)) {
                        break;
                    }
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "TAG");
                    file.getAbsolutePath();
                    file.delete();
                    break;
                }
            }
        }
    }

    public static void a(C2843k assetBatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        if (f33480m.get()) {
            f33472e.execute(new zg.h(assetBatch, 20));
        }
    }

    public static void a(C2843k assetBatch, String adType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "adType");
        if (f33480m.get()) {
            f33472e.execute(new zk.n(29, assetBatch, adType));
        }
    }

    public static void a(String url) {
        C2826j asset;
        AdConfig.AssetCacheConfig assetCacheConfig = f33470c;
        if (assetCacheConfig != null) {
            int iNextInt = new Random().nextInt() & Integer.MAX_VALUE;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int maxRetries = assetCacheConfig.getMaxRetries();
            long timeToLive = assetCacheConfig.getTimeToLive();
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            asset = new C2826j(iNextInt, url == null ? "" : url, null, maxRetries, jCurrentTimeMillis, jCurrentTimeMillis2, System.currentTimeMillis() + timeToLive, 0L);
        } else {
            asset = null;
        }
        if (AbstractC2807hd.a().a(url) == null && asset != null) {
            C2913o1 c2913o1A = AbstractC2807hd.a();
            synchronized (c2913o1A) {
                kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                c2913o1A.a(asset, "url = ?", new String[]{asset.f32940b});
            }
        }
        f33473f.execute(new nm.i(url, 4));
    }
}
