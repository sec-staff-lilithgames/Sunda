package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.processor.a;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import com.iab.omid.library.mmadbridge.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0193a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f31109i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f31110j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f31111k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f31112l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f31113m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f31115b;

    /* renamed from: h, reason: collision with root package name */
    private long f31121h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f31114a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f31116c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f31117d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f31119f = new com.iab.omid.library.mmadbridge.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f31118e = new com.iab.omid.library.mmadbridge.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f31120g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f31120g.b();
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
            if (TreeWalker.f31111k != null) {
                TreeWalker.f31111k.post(TreeWalker.f31112l);
                TreeWalker.f31111k.postDelayed(TreeWalker.f31113m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f31121h);
    }

    private void e() {
        this.f31115b = 0;
        this.f31117d.clear();
        this.f31116c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f31116c = true;
                break;
            }
        }
        this.f31121h = f.b();
    }

    public static TreeWalker getInstance() {
        return f31109i;
    }

    private void i() {
        if (f31111k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f31111k = handler;
            handler.post(f31112l);
            f31111k.postDelayed(f31113m, 200L);
        }
    }

    private void k() {
        Handler handler = f31111k;
        if (handler != null) {
            handler.removeCallbacks(f31113m);
            f31111k = null;
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
        if (this.f31114a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f31114a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f31119f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f31118e.a();
        if (this.f31119f.b().size() > 0) {
            Iterator<String> it = this.f31119f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f31119f.a(next), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f31120g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f31119f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            treeWalker.f31120g.b(jSONObjectA2, treeWalker.f31119f.c(), jB);
            if (treeWalker.f31116c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it2 = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f31117d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f31120g.b();
        }
        treeWalker.f31119f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f31114a.clear();
        f31110j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31114a.contains(treeWalkerTimeLogger)) {
            this.f31114a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f31114a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f31114a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f31115b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f31115b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f31119f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f31119f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f31119f.c(strC)));
        this.f31119f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0193a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f31119f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f31116c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f31117d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f31115b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f31118e.b();
        String strB = this.f31119f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0195a c0195aB = this.f31119f.b(view);
        if (c0195aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0195aB);
        return true;
    }
}
