package com.apm.insight.k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.apm.insight.Npth;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.p;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> f13136a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> f13137b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f13138c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f13140e = false;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f13141f = new Runnable() { // from class: com.apm.insight.k.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (Npth.isStopUpload()) {
                return;
            }
            if (!g.f13137b.isEmpty() && l.e()) {
                g.f();
            }
            g.this.c();
            g.this.f13139d.a(g.this.f13141f, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final p f13139d = m.a();

    private g() {
    }

    private static void c(Object obj, com.apm.insight.entity.c cVar) throws JSONException {
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        try {
            String string = cVar.c().getString("log_type");
            HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> map = f13137b;
            synchronized (map) {
                try {
                    HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>> map2 = map.get(string);
                    if (map2 == null) {
                        map2 = new HashMap<>();
                        map.put(obj, map2);
                    }
                    concurrentLinkedQueue = map2.get(string);
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        map2.put(string, concurrentLinkedQueue);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        HashMap map;
        HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> map2 = f13137b;
        synchronized (map2) {
            map = new HashMap(map2);
            map2.clear();
        }
        if (!com.apm.insight.runtime.a.a()) {
            com.apm.insight.a.a("EventUploadQueue", "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (com.apm.insight.runtime.a.a() && !com.apm.insight.runtime.a.b(entry.getKey()))) {
                    com.apm.insight.a.a("EventUploadQueue", "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            com.apm.insight.entity.c cVar = (com.apm.insight.entity.c) concurrentLinkedQueue.poll();
                            if (cVar != null) {
                                b(entry.getKey(), cVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private static void g() {
        if (!l.e() || Npth.isStopUpload()) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.k.g.3
                @Override // java.lang.Runnable
                public final void run() {
                    g.a().c();
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static g a() {
        if (f13138c == null) {
            synchronized (g.class) {
                try {
                    if (f13138c == null) {
                        f13138c = new g();
                    }
                } finally {
                }
            }
        }
        return f13138c;
    }

    private static void b(Object obj, com.apm.insight.entity.c cVar) {
        ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> concurrentHashMap;
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        synchronized (obj) {
            try {
                concurrentHashMap = f13136a;
                concurrentLinkedQueue = concurrentHashMap.get(obj);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                    concurrentHashMap.put(obj, concurrentLinkedQueue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = concurrentHashMap.size();
        boolean z10 = size >= 30;
        com.apm.insight.a.b((Object) "[enqueue] size=".concat(String.valueOf(size)));
        if (z10) {
            g();
        }
    }

    public static void a(com.apm.insight.entity.c cVar) throws JSONException {
        a(com.apm.insight.d.a(), cVar);
    }

    public static void a(final Object obj, final com.apm.insight.entity.c cVar) throws JSONException {
        String string;
        Handler handlerA = m.a().a();
        if (handlerA != null && handlerA.getLooper() == Looper.myLooper()) {
            if (obj == null) {
                obj = com.apm.insight.d.a();
            }
            if (!l.e()) {
                com.apm.insight.a.a("EventUploadQueue", "enqueue before init.");
                c(obj, cVar);
                return;
            }
            if (!com.apm.insight.runtime.a.a(obj)) {
                a.b();
            }
            f();
            try {
                string = cVar.c().getString("log_type");
            } catch (JSONException e10) {
                e10.printStackTrace();
                string = null;
            }
            if (!TextUtils.isEmpty(string) && com.apm.insight.runtime.a.b(obj)) {
                com.apm.insight.a.a("EventUploadQueue", "logType " + string + " enqueued");
                b(obj, cVar);
                return;
            }
            com.apm.insight.a.a("EventUploadQueue", "logType " + string + " not sampled");
            return;
        }
        m.a().a(new Runnable() { // from class: com.apm.insight.k.g.2
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                g.a(obj, cVar);
            }
        });
    }

    public final void b() {
        if (f13136a.isEmpty()) {
            this.f13139d.a(this.f13141f, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        } else {
            this.f13139d.a(this.f13141f);
        }
    }

    public final void c() {
        synchronized (this.f13139d) {
            try {
                if (this.f13140e) {
                    return;
                }
                this.f13140e = true;
                LinkedList linkedList = new LinkedList();
                for (Map.Entry<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> entry : f13136a.entrySet()) {
                    ConcurrentLinkedQueue<com.apm.insight.entity.c> value = entry.getValue();
                    Object key = entry.getKey();
                    while (!value.isEmpty()) {
                        for (int i10 = 0; i10 < 30; i10++) {
                            try {
                                if (value.isEmpty()) {
                                    break;
                                }
                                linkedList.add(value.poll());
                            } catch (Throwable th2) {
                                com.apm.insight.a.b(th2);
                            }
                        }
                        if (linkedList.isEmpty()) {
                            break;
                        }
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(linkedList, com.apm.insight.entity.b.a(key));
                        if (aVarA != null) {
                            com.apm.insight.a.a((Object) "upload events");
                            d.a().b(aVarA.c());
                        }
                        linkedList.clear();
                    }
                }
                this.f13140e = false;
            } finally {
            }
        }
    }
}
