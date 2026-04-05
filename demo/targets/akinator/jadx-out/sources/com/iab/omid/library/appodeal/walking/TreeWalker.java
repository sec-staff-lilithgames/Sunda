package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.processor.a;
import com.iab.omid.library.appodeal.utils.f;
import com.iab.omid.library.appodeal.utils.h;
import com.iab.omid.library.appodeal.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0173a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30438i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30439j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30440k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30441l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30442m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30444b;

    /* renamed from: h, reason: collision with root package name */
    private long f30450h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30443a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30445c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.appodeal.weakreference.a> f30446d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.a f30448f = new com.iab.omid.library.appodeal.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.appodeal.processor.b f30447e = new com.iab.omid.library.appodeal.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.b f30449g = new com.iab.omid.library.appodeal.walking.b(new com.iab.omid.library.appodeal.walking.async.c());

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
            TreeWalker.this.f30449g.b();
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
            if (TreeWalker.f30440k != null) {
                TreeWalker.f30440k.post(TreeWalker.f30441l);
                TreeWalker.f30440k.postDelayed(TreeWalker.f30442m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30450h);
    }

    private void e() {
        this.f30444b = 0;
        this.f30446d.clear();
        this.f30445c = false;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f30445c = true;
                break;
            }
        }
        this.f30450h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30438i;
    }

    private void i() {
        if (f30440k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30440k = handler;
            handler.post(f30441l);
            f30440k.postDelayed(f30442m, 200L);
        }
    }

    private void k() {
        Handler handler = f30440k;
        if (handler != null) {
            handler.removeCallbacks(f30442m);
            f30440k = null;
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
        if (this.f30443a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30443a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30448f.e();
        long jB = f.b();
        com.iab.omid.library.appodeal.processor.a aVarA = this.f30447e.a();
        if (this.f30448f.b().size() > 0) {
            Iterator<String> it = this.f30448f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30448f.a(next), jSONObjectA);
                com.iab.omid.library.appodeal.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30449g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30448f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA2);
            treeWalker.f30449g.b(jSONObjectA2, treeWalker.f30448f.c(), jB);
            if (treeWalker.f30445c) {
                Iterator<com.iab.omid.library.appodeal.adsession.a> it2 = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30446d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30449g.b();
        }
        treeWalker.f30448f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30443a.clear();
        f30439j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30443a.contains(treeWalkerTimeLogger)) {
            this.f30443a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30443a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30443a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30444b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30444b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f30448f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, strC);
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, Boolean.valueOf(this.f30448f.e(view)));
        com.iab.omid.library.appodeal.utils.c.b(jSONObject, Boolean.valueOf(this.f30448f.c(strC)));
        this.f30448f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.appodeal.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.appodeal.processor.a.InterfaceC0173a
    public void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.appodeal.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f30448f.d(view)) != com.iab.omid.library.appodeal.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30445c && cVarD == com.iab.omid.library.appodeal.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30446d.add(new com.iab.omid.library.appodeal.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f30444b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.appodeal.processor.a aVarB = this.f30447e.b();
        String strB = this.f30448f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0175a c0175aB = this.f30448f.b(view);
        if (c0175aB == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, c0175aB);
        return true;
    }
}
