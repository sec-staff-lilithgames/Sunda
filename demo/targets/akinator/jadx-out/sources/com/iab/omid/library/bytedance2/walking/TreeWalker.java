package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0177a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30568i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30569j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30570k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30571l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30572m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30574b;

    /* renamed from: h, reason: collision with root package name */
    private long f30580h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30573a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30575c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f30576d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f30578f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f30577e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f30579g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f30579g.b();
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
            if (TreeWalker.f30570k != null) {
                TreeWalker.f30570k.post(TreeWalker.f30571l);
                TreeWalker.f30570k.postDelayed(TreeWalker.f30572m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30580h);
    }

    private void e() {
        this.f30574b = 0;
        this.f30576d.clear();
        this.f30575c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f30575c = true;
                break;
            }
        }
        this.f30580h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30568i;
    }

    private void i() {
        if (f30570k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30570k = handler;
            handler.post(f30571l);
            f30570k.postDelayed(f30572m, 200L);
        }
    }

    private void k() {
        Handler handler = f30570k;
        if (handler != null) {
            handler.removeCallbacks(f30572m);
            f30570k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws JSONException {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30573a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30573a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30578f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f30577e.a();
        if (this.f30578f.b().size() > 0) {
            Iterator<String> it = this.f30578f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30578f.a(next), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30579g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30578f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f30579g.b(jSONObjectA2, treeWalker.f30578f.c(), jB);
            if (treeWalker.f30575c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it2 = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30576d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30579g.b();
        }
        treeWalker.f30578f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30573a.clear();
        f30569j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30573a.contains(treeWalkerTimeLogger)) {
            this.f30573a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30573a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30573a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30574b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30574b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strD = this.f30578f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f30578f.f(view)));
        this.f30578f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0177a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f30578f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30575c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30576d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z11);
            }
            treeWalker.f30574b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f30577e.b();
        String strB = this.f30578f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0179a c0179aC = this.f30578f.c(view);
        if (c0179aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0179aC);
        return true;
    }
}
