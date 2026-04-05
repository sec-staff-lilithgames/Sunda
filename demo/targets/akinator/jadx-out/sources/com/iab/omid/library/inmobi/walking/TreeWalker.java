package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import com.iab.omid.library.inmobi.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0185a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30839i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30840j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30841k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30842l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30843m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30845b;

    /* renamed from: h, reason: collision with root package name */
    private long f30851h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30844a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30846c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f30847d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f30849f = new com.iab.omid.library.inmobi.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f30848e = new com.iab.omid.library.inmobi.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f30850g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

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
            TreeWalker.this.f30850g.b();
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
            if (TreeWalker.f30841k != null) {
                TreeWalker.f30841k.post(TreeWalker.f30842l);
                TreeWalker.f30841k.postDelayed(TreeWalker.f30843m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30851h);
    }

    private void e() {
        this.f30845b = 0;
        this.f30847d.clear();
        this.f30846c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f30846c = true;
                break;
            }
        }
        this.f30851h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30839i;
    }

    private void i() {
        if (f30841k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30841k = handler;
            handler.post(f30842l);
            f30841k.postDelayed(f30843m, 200L);
        }
    }

    private void k() {
        Handler handler = f30841k;
        if (handler != null) {
            handler.removeCallbacks(f30843m);
            f30841k = null;
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
        if (this.f30844a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30844a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30849f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f30848e.a();
        if (this.f30849f.b().size() > 0) {
            Iterator<String> it = this.f30849f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30849f.a(next), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30850g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30849f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            treeWalker.f30850g.b(jSONObjectA2, treeWalker.f30849f.c(), jB);
            if (treeWalker.f30846c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it2 = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30847d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30850g.b();
        }
        treeWalker.f30849f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30844a.clear();
        f30840j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30844a.contains(treeWalkerTimeLogger)) {
            this.f30844a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30844a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30844a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30845b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30845b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f30849f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strC);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f30849f.e(view)));
        com.iab.omid.library.inmobi.utils.c.b(jSONObject, Boolean.valueOf(this.f30849f.c(strC)));
        this.f30849f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0185a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.inmobi.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f30849f.d(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30846c && cVarD == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30847d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f30845b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f30848e.b();
        String strB = this.f30849f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0187a c0187aB = this.f30849f.b(view);
        if (c0187aB == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0187aB);
        return true;
    }
}
