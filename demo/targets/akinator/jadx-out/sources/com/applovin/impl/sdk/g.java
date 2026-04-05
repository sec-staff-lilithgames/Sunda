package com.applovin.impl.sdk;

import com.applovin.impl.k1;
import com.applovin.impl.v2;
import com.ironsource.C3352n2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f15399a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f15400b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f15401c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f15402d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f15403e = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15404a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15405b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15406c;

        /* renamed from: d, reason: collision with root package name */
        private final String f15407d;

        /* renamed from: e, reason: collision with root package name */
        private final String f15408e;

        /* renamed from: f, reason: collision with root package name */
        private final String f15409f;

        /* renamed from: g, reason: collision with root package name */
        private final String f15410g;

        /* renamed from: h, reason: collision with root package name */
        private long f15411h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayDeque f15412i;

        public String b() {
            return this.f15407d;
        }

        public String c() {
            return this.f15406c;
        }

        public String d() {
            return this.f15408e;
        }

        public String e() {
            return this.f15409f;
        }

        public String f() {
            return this.f15410g;
        }

        public String g() {
            return this.f15405b;
        }

        public String h() {
            return this.f15409f;
        }

        public c i() {
            return (c) this.f15412i.getLast();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdInfo{state='");
            sb2.append(i());
            sb2.append("', adUnitId='");
            sb2.append(this.f15404a);
            sb2.append("', format='");
            sb2.append(this.f15405b);
            sb2.append("', adapterName='");
            sb2.append(this.f15406c);
            sb2.append("', adapterClass='");
            sb2.append(this.f15407d);
            sb2.append("', adapterVersion='");
            sb2.append(this.f15408e);
            sb2.append("', bCode='");
            sb2.append(this.f15409f);
            sb2.append("', creativeId='");
            sb2.append(this.f15410g);
            sb2.append("', updated=");
            return e3.g.n(sb2, this.f15411h, AbstractJsonLexerKt.END_OBJ);
        }

        private b(v2 v2Var, c cVar) {
            this.f15412i = new ArrayDeque();
            this.f15404a = v2Var.getAdUnitId();
            this.f15405b = v2Var.getFormat().getLabel();
            this.f15406c = v2Var.c();
            this.f15407d = v2Var.b();
            this.f15408e = v2Var.z();
            this.f15409f = v2Var.C();
            this.f15410g = v2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f15404a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f15411h = System.currentTimeMillis();
            this.f15412i.add(cVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW(C3352n2.f37928v),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f15421a;

        c(String str) {
            this.f15421a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f15421a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f15399a = kVar;
        a();
    }

    public void a(v2 v2Var, c cVar) {
        synchronized (this.f15403e) {
            try {
                String strC = v2Var.C();
                b bVar = (b) this.f15402d.get(strC);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(v2Var, cVar);
                    this.f15402d.put(strC, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f15402d.remove(strC);
                }
                a(bVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f15401c) {
            try {
                for (c cVar : c.values()) {
                    this.f15400b.put(cVar, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f15401c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f15401c) {
            try {
                Iterator it = this.f15400b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f15401c) {
            try {
                Set set = (Set) this.f15400b.get(cVar);
                if (k1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f15401c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
