package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.unity3d.processor.a;
import com.iab.omid.library.unity3d.utils.f;
import com.iab.omid.library.unity3d.utils.h;
import com.iab.omid.library.unity3d.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0200a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f31355i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f31356j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f31357k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f31358l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f31359m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f31361b;

    /* renamed from: h, reason: collision with root package name */
    private long f31367h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f31360a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f31362c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.unity3d.weakreference.a> f31363d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.a f31365f = new com.iab.omid.library.unity3d.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.unity3d.processor.b f31364e = new com.iab.omid.library.unity3d.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.b f31366g = new com.iab.omid.library.unity3d.walking.b(new com.iab.omid.library.unity3d.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f31366g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f31357k != null) {
                TreeWalker.f31357k.post(TreeWalker.f31358l);
                TreeWalker.f31357k.postDelayed(TreeWalker.f31359m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f31367h);
    }

    private void e() {
        this.f31361b = 0;
        this.f31363d.clear();
        this.f31362c = false;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f31362c = true;
                break;
            }
        }
        this.f31367h = f.b();
    }

    public static TreeWalker getInstance() {
        return f31355i;
    }

    private void i() {
        if (f31357k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f31357k = handler;
            handler.post(f31358l);
            f31357k.postDelayed(f31359m, 200L);
        }
    }

    private void k() {
        Handler handler = f31357k;
        if (handler != null) {
            handler.removeCallbacks(f31359m);
            f31357k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31360a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f31360a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f31365f.e();
        long jB = f.b();
        com.iab.omid.library.unity3d.processor.a aVarA = this.f31364e.a();
        if (this.f31365f.b().size() > 0) {
            Iterator<String> it = this.f31365f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f31365f.a(next), jSONObjectA);
                com.iab.omid.library.unity3d.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f31366g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f31365f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA2);
            treeWalker.f31366g.b(jSONObjectA2, treeWalker.f31365f.c(), jB);
            if (treeWalker.f31362c) {
                Iterator<com.iab.omid.library.unity3d.adsession.a> it2 = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f31363d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f31366g.b();
        }
        treeWalker.f31365f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f31360a.clear();
        f31356j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31360a.contains(treeWalkerTimeLogger)) {
            this.f31360a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f31360a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f31360a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f31361b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f31361b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f31365f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, strD);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, Boolean.valueOf(this.f31365f.f(view)));
        this.f31365f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.unity3d.processor.a.InterfaceC0200a
    public void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.unity3d.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f31365f.e(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f31362c && cVarE == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f31363d.add(new com.iab.omid.library.unity3d.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f31361b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.unity3d.processor.a aVarB = this.f31364e.b();
        String strB = this.f31365f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0202a c0202aC = this.f31365f.c(view);
        if (c0202aC == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, c0202aC);
        return true;
    }
}
