package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.processor.a;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import com.iab.omid.library.ironsrc.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TreeWalker implements a.InterfaceC0189a {

    /* renamed from: i, reason: collision with root package name */
    private static TreeWalker f30974i = new TreeWalker();

    /* renamed from: j, reason: collision with root package name */
    private static Handler f30975j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private static Handler f30976k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f30977l = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Runnable f30978m = new c();

    /* renamed from: b, reason: collision with root package name */
    private int f30980b;

    /* renamed from: h, reason: collision with root package name */
    private long f30986h;

    /* renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f30979a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f30981c = false;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f30982d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f30984f = new com.iab.omid.library.ironsrc.walking.a();

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f30983e = new com.iab.omid.library.ironsrc.processor.b();

    /* renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f30985g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f30985g.b();
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
            if (TreeWalker.f30976k != null) {
                TreeWalker.f30976k.post(TreeWalker.f30977l);
                TreeWalker.f30976k.postDelayed(TreeWalker.f30978m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f30986h);
    }

    private void e() {
        this.f30980b = 0;
        this.f30982d.clear();
        this.f30981c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.f30981c = true;
                break;
            }
        }
        this.f30986h = f.b();
    }

    public static TreeWalker getInstance() {
        return f30974i;
    }

    private void i() {
        if (f30976k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f30976k = handler;
            handler.post(f30977l);
            f30976k.postDelayed(f30978m, 200L);
        }
    }

    private void k() {
        Handler handler = f30976k;
        if (handler != null) {
            handler.removeCallbacks(f30978m);
            f30976k = null;
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
        if (this.f30979a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f30979a.add(treeWalkerTimeLogger);
    }

    public void f() throws JSONException {
        TreeWalker treeWalker;
        this.f30984f.e();
        long jB = f.b();
        com.iab.omid.library.ironsrc.processor.a aVarA = this.f30983e.a();
        if (this.f30984f.b().size() > 0) {
            Iterator<String> it = this.f30984f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject jSONObjectA = aVarA.a(null);
                a(next, this.f30984f.a(next), jSONObjectA);
                com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f30985g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f30984f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA2);
            treeWalker.f30985g.b(jSONObjectA2, treeWalker.f30984f.c(), jB);
            if (treeWalker.f30981c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it2 = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    it2.next().a(treeWalker.f30982d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f30985g.b();
        }
        treeWalker.f30984f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f30979a.clear();
        f30975j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f30979a.contains(treeWalkerTimeLogger)) {
            this.f30979a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f30979a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f30979a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f30980b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f30980b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) throws JSONException {
        String strC = this.f30984f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, strC);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f30984f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f30984f.c(strC)));
        this.f30984f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0189a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) throws JSONException {
        com.iab.omid.library.ironsrc.walking.c cVarD;
        TreeWalker treeWalker;
        if (h.f(view) && (cVarD = this.f30984f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f30981c && cVarD == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f30982d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarD, z11);
            }
            treeWalker.f30980b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) throws JSONException {
        com.iab.omid.library.ironsrc.processor.a aVarB = this.f30983e.b();
        String strB = this.f30984f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) throws JSONException {
        a.C0191a c0191aB = this.f30984f.b(view);
        if (c0191aB == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c0191aB);
        return true;
    }
}
