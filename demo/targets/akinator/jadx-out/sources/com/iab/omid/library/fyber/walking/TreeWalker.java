package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.fyber.internal.j;
import com.iab.omid.library.fyber.processor.a;
import com.iab.omid.library.fyber.utils.f;
import com.iab.omid.library.fyber.utils.h;
import com.iab.omid.library.fyber.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0181a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30703i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30704j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30705k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30706l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30707m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30709b;

    /* renamed from: h, reason: collision with root package name */
    private long f30715h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30708a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30710c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.fyber.weakreference.a> f30711d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.a f30713f = new com.iab.omid.library.fyber.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.fyber.processor.b f30712e = new com.iab.omid.library.fyber.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.b f30714g = new com.iab.omid.library.fyber.walking.b(new com.iab.omid.library.fyber.walking.async.c());

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
            TreeWalker.this.f30714g.b();
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
            if (TreeWalker.f30705k != null) {
                TreeWalker.f30705k.post(TreeWalker.f30706l);
                TreeWalker.f30705k.postDelayed(TreeWalker.f30707m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30715h);
    }

    private void e() {
        this.f30709b = 0;
        this.f30711d.clear();
        this.f30710c = false;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f30710c = true;
                break;
            }
        }
        this.f30715h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30703i;
    }

    private void i() {
        if (f30705k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30705k = handler;
            handler.post(f30706l);
            f30705k.postDelayed(f30707m, 200L);
        }
    }

    private void k() {
        Handler handler = f30705k;
        if (handler != null) {
            handler.removeCallbacks(f30707m);
            f30705k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30708a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30708a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30713f.e();
        long jB = f.b();
        com.iab.omid.library.fyber.processor.a aVarA = this.f30712e.a();
        if (this.f30713f.b().size() > 0) {
            Iterator<String> it = this.f30713f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30713f.a(next), jSONObjectA);
                com.iab.omid.library.fyber.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30714g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30713f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.fyber.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA2);
            treeWalker.f30714g.b(jSONObjectA2, treeWalker.f30713f.c(), jB);
            if (treeWalker.f30710c) {
                Iterator<com.iab.omid.library.fyber.adsession.a> it2 = com.iab.omid.library.fyber.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30711d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30714g.b();
        }
        treeWalker.f30713f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30708a.clear();
        f30704j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30708a.contains(treeWalkerTimeLogger)) {
            this.f30708a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30708a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30708a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30709b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30709b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f30713f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, strC);
        com.iab.omid.library.fyber.utils.c.a(jSONObject, Boolean.valueOf(this.f30713f.e(view)));
        com.iab.omid.library.fyber.utils.c.b(jSONObject, Boolean.valueOf(this.f30713f.c(strC)));
        this.f30713f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.fyber.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.fyber.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.fyber.processor.a.InterfaceC0181a
    public void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.fyber.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f30713f.d(view)) != com.iab.omid.library.fyber.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30710c && cVarD == com.iab.omid.library.fyber.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30711d.add(new com.iab.omid.library.fyber.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f30709b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.fyber.processor.a aVarB = this.f30712e.b();
        String strB = this.f30713f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0183a c0183aB = this.f30713f.b(view);
        if (c0183aB == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, c0183aB);
        return true;
    }
}
