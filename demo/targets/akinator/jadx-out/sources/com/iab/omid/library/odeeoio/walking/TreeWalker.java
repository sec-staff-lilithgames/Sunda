package com.iab.omid.library.odeeoio.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.odeeoio.c.a;
import com.iab.omid.library.odeeoio.d.d;
import com.iab.omid.library.odeeoio.d.f;
import com.iab.omid.library.odeeoio.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0197a {

    /* renamed from: a, reason: collision with root package name */
    private static TreeWalker f31227a = new TreeWalker();

    /* renamed from: b, reason: collision with root package name */
    private static Handler f31228b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static Handler f31229c = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f31230l = new Runnable() { // from class: com.iab.omid.library.odeeoio.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            TreeWalker.getInstance().h();
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f31231m = new Runnable() { // from class: com.iab.omid.library.odeeoio.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f31229c != null) {
                TreeWalker.f31229c.post(TreeWalker.f31230l);
                TreeWalker.f31229c.postDelayed(TreeWalker.f31231m, 200L);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private int f31233e;

    /* renamed from: k, reason: collision with root package name */
    private long f31239k;

    /* renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f31232d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f31234f = false;

    /* renamed from: g, reason: collision with root package name */
    private final List<com.iab.omid.library.odeeoio.e.a> f31235g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private a f31237i = new a();

    /* renamed from: h, reason: collision with root package name */
    private com.iab.omid.library.odeeoio.c.b f31236h = new com.iab.omid.library.odeeoio.c.b();

    /* renamed from: j, reason: collision with root package name */
    private b f31238j = new b(new com.iab.omid.library.odeeoio.walking.a.c());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public static TreeWalker getInstance() {
        return f31227a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws JSONException {
        i();
        d();
        j();
    }

    private void i() {
        this.f31233e = 0;
        this.f31235g.clear();
        this.f31234f = false;
        Iterator<com.iab.omid.library.odeeoio.adsession.a> it = com.iab.omid.library.odeeoio.b.a.a().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().b()) {
                this.f31234f = true;
                break;
            }
        }
        this.f31239k = d.a();
    }

    private void j() {
        a(d.a() - this.f31239k);
    }

    private void k() {
        if (f31229c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f31229c = handler;
            handler.post(f31230l);
            f31229c.postDelayed(f31231m, 200L);
        }
    }

    private void l() {
        Handler handler = f31229c;
        if (handler != null) {
            handler.removeCallbacks(f31231m);
            f31229c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31232d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f31232d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f31232d.clear();
        f31228b.post(new Runnable() { // from class: com.iab.omid.library.odeeoio.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f31238j.a();
            }
        });
    }

    public void c() {
        l();
    }

    public void d() throws JSONException {
        TreeWalker treeWalker;
        this.f31237i.c();
        long jA = d.a();
        com.iab.omid.library.odeeoio.c.a aVarA = this.f31236h.a();
        if (this.f31237i.b().size() > 0) {
            Iterator<String> it = this.f31237i.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f31237i.b(next), jSONObjectA);
                com.iab.omid.library.odeeoio.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f31238j.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f31237i.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, c.PARENT_VIEW, false);
            com.iab.omid.library.odeeoio.d.b.a(jSONObjectA2);
            treeWalker.f31238j.a(jSONObjectA2, treeWalker.f31237i.a(), jA);
            if (treeWalker.f31234f) {
                Iterator<com.iab.omid.library.odeeoio.adsession.a> it2 = com.iab.omid.library.odeeoio.b.a.a().c().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f31235g);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f31238j.a();
        }
        treeWalker.f31237i.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31232d.contains(treeWalkerTimeLogger)) {
            this.f31232d.remove(treeWalkerTimeLogger);
        }
    }

    public void a() {
        k();
    }

    private void a(long j10) {
        if (this.f31232d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f31232d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f31233e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f31233e, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        a.C0198a c0198aB = this.f31237i.b(view);
        if (c0198aB == null) {
            return false;
        }
        com.iab.omid.library.odeeoio.d.b.a(jSONObject, c0198aB);
        return true;
    }

    private void a(View view, com.iab.omid.library.odeeoio.c.a aVar, JSONObject jSONObject, c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.odeeoio.c.a.InterfaceC0197a
    public void a(View view, com.iab.omid.library.odeeoio.c.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        c cVarC;
        TreeWalker treeWalker;
        if (f.d(view) && (cVarC = this.f31237i.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.odeeoio.d.b.a(jSONObject, jSONObjectA);
            if (a(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || b(view, jSONObjectA);
                if (this.f31234f && cVarC == c.OBSTRUCTION_VIEW && !z11) {
                    this.f31235g.add(new com.iab.omid.library.odeeoio.e.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarC, z11);
            }
            treeWalker.f31233e++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.odeeoio.c.a aVarB = this.f31236h.b();
        String strA = this.f31237i.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.odeeoio.d.b.a(jSONObjectA, str);
            com.iab.omid.library.odeeoio.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.odeeoio.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        String strA = this.f31237i.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.odeeoio.d.b.a(jSONObject, strA);
        com.iab.omid.library.odeeoio.d.b.a(jSONObject, Boolean.valueOf(this.f31237i.d(view)));
        this.f31237i.e();
        return true;
    }
}
