package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.amazon.processor.a;
import com.iab.omid.library.amazon.utils.f;
import com.iab.omid.library.amazon.utils.h;
import com.iab.omid.library.amazon.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0165a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30168i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30169j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30170k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30171l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30172m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30174b;

    /* renamed from: h, reason: collision with root package name */
    private long f30180h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30173a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30175c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.amazon.weakreference.a> f30176d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.amazon.walking.a f30178f = new com.iab.omid.library.amazon.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.amazon.processor.b f30177e = new com.iab.omid.library.amazon.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.amazon.walking.b f30179g = new com.iab.omid.library.amazon.walking.b(new com.iab.omid.library.amazon.walking.async.c());

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
            TreeWalker.this.f30179g.b();
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
            if (TreeWalker.f30170k != null) {
                TreeWalker.f30170k.post(TreeWalker.f30171l);
                TreeWalker.f30170k.postDelayed(TreeWalker.f30172m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30180h);
    }

    private void e() {
        this.f30174b = 0;
        this.f30176d.clear();
        this.f30175c = false;
        Iterator<com.iab.omid.library.amazon.adsession.a> it = com.iab.omid.library.amazon.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f30175c = true;
                break;
            }
        }
        this.f30180h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30168i;
    }

    private void i() {
        if (f30170k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30170k = handler;
            handler.post(f30171l);
            f30170k.postDelayed(f30172m, 200L);
        }
    }

    private void k() {
        Handler handler = f30170k;
        if (handler != null) {
            handler.removeCallbacks(f30172m);
            f30170k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30173a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30173a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30178f.e();
        long jB = f.b();
        com.iab.omid.library.amazon.processor.a aVarA = this.f30177e.a();
        if (this.f30178f.b().size() > 0) {
            Iterator<String> it = this.f30178f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30178f.a(next), jSONObjectA);
                com.iab.omid.library.amazon.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30179g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30178f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.amazon.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.amazon.utils.c.b(jSONObjectA2);
            treeWalker.f30179g.b(jSONObjectA2, treeWalker.f30178f.c(), jB);
            if (treeWalker.f30175c) {
                Iterator<com.iab.omid.library.amazon.adsession.a> it2 = com.iab.omid.library.amazon.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30176d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30179g.b();
        }
        treeWalker.f30178f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30173a.clear();
        f30169j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30173a.contains(treeWalkerTimeLogger)) {
            this.f30173a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30173a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30173a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30174b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30174b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f30178f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.amazon.utils.c.a(jSONObject, strD);
        com.iab.omid.library.amazon.utils.c.a(jSONObject, Boolean.valueOf(this.f30178f.f(view)));
        this.f30178f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.amazon.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.amazon.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.amazon.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.amazon.processor.a.InterfaceC0165a
    public void a(View view, com.iab.omid.library.amazon.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.amazon.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f30178f.e(view)) != com.iab.omid.library.amazon.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.amazon.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30175c && cVarE == com.iab.omid.library.amazon.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30176d.add(new com.iab.omid.library.amazon.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f30174b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.amazon.processor.a aVarB = this.f30177e.b();
        String strB = this.f30178f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.amazon.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.amazon.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.amazon.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0167a c0167aC = this.f30178f.c(view);
        if (c0167aC == null) {
            return false;
        }
        com.iab.omid.library.amazon.utils.c.a(jSONObject, c0167aC);
        return true;
    }
}
