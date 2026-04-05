package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.processor.a;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import com.iab.omid.library.vungle.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0204a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f31489i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f31490j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f31491k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f31492l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f31493m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f31495b;

    /* renamed from: h, reason: collision with root package name */
    private long f31501h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f31494a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f31496c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f31497d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f31499f = new com.iab.omid.library.vungle.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f31498e = new com.iab.omid.library.vungle.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f31500g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

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
            TreeWalker.this.f31500g.b();
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
            if (TreeWalker.f31491k != null) {
                TreeWalker.f31491k.post(TreeWalker.f31492l);
                TreeWalker.f31491k.postDelayed(TreeWalker.f31493m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f31501h);
    }

    private void e() {
        this.f31495b = 0;
        this.f31497d.clear();
        this.f31496c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().g()) {
                this.f31496c = true;
                break;
            }
        }
        this.f31501h = f.b();
    }

    public static TreeWalker getInstance() {
        return f31489i;
    }

    private void i() {
        if (f31491k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f31491k = handler;
            handler.post(f31492l);
            f31491k.postDelayed(f31493m, 200L);
        }
    }

    private void k() {
        Handler handler = f31491k;
        if (handler != null) {
            handler.removeCallbacks(f31493m);
            f31491k = null;
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
        if (this.f31494a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f31494a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f31499f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f31498e.a();
        if (this.f31499f.b().size() > 0) {
            Iterator<String> it = this.f31499f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f31499f.a(next), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f31500g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f31499f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA2);
            treeWalker.f31500g.b(jSONObjectA2, treeWalker.f31499f.c(), jB);
            if (treeWalker.f31496c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it2 = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f31497d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f31500g.b();
        }
        treeWalker.f31499f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f31494a.clear();
        f31490j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f31494a.contains(treeWalkerTimeLogger)) {
            this.f31494a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f31494a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f31494a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f31495b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f31495b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f31499f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f31499f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f31499f.c(strC)));
        this.f31499f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0204a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.vungle.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f31499f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f31496c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f31497d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f31495b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.vungle.processor.a aVarB = this.f31498e.b();
        String strB = this.f31499f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0206a c0206aB = this.f31499f.b(view);
        if (c0206aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0206aB);
        return true;
    }
}
