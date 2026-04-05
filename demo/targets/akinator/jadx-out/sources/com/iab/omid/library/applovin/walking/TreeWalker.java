package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0169a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30302i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30303j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30304k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30305l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30306m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30308b;

    /* renamed from: h, reason: collision with root package name */
    private long f30314h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30307a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30309c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f30310d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f30312f = new com.iab.omid.library.applovin.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f30311e = new com.iab.omid.library.applovin.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f30313g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

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
            TreeWalker.this.f30313g.b();
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
            if (TreeWalker.f30304k != null) {
                TreeWalker.f30304k.post(TreeWalker.f30305l);
                TreeWalker.f30304k.postDelayed(TreeWalker.f30306m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30314h);
    }

    private void e() {
        this.f30308b = 0;
        this.f30310d.clear();
        this.f30309c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f30309c = true;
                break;
            }
        }
        this.f30314h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30302i;
    }

    private void i() {
        if (f30304k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30304k = handler;
            handler.post(f30305l);
            f30304k.postDelayed(f30306m, 200L);
        }
    }

    private void k() {
        Handler handler = f30304k;
        if (handler != null) {
            handler.removeCallbacks(f30306m);
            f30304k = null;
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
        if (this.f30307a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30307a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30312f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f30311e.a();
        if (this.f30312f.b().size() > 0) {
            Iterator<String> it = this.f30312f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30312f.a(next), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30313g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30312f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            treeWalker.f30313g.b(jSONObjectA2, treeWalker.f30312f.c(), jB);
            if (treeWalker.f30309c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30310d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30313g.b();
        }
        treeWalker.f30312f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30307a.clear();
        f30303j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30307a.contains(treeWalkerTimeLogger)) {
            this.f30307a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30307a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30307a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30308b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30308b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f30312f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f30312f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f30312f.c(strC)));
        this.f30312f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0169a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.applovin.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f30312f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30309c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30310d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f30308b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.applovin.processor.a aVarB = this.f30311e.b();
        String strB = this.f30312f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0171a c0171aB = this.f30312f.b(view);
        if (c0171aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0171aB);
        return true;
    }
}
