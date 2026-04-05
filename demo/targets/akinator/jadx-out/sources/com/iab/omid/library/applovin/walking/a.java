package com.iab.omid.library.applovin.walking;

import android.view.View;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30316a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0171a> f30317b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30318c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30319d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30320e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30321f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30322g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f30323h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f30324i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f30325j;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a, reason: collision with other inner class name */
    public static class C0171a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30326a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30327b = new ArrayList<>();

        public C0171a(e eVar, String str) {
            this.f30326a = eVar;
            a(str);
        }

        public e a() {
            return this.f30326a;
        }

        public ArrayList<String> b() {
            return this.f30327b;
        }

        public void a(String str) {
            this.f30327b.add(str);
        }
    }

    public View a(String str) {
        return this.f30318c.get(str);
    }

    public C0171a b(View view) {
        C0171a c0171a = this.f30317b.get(view);
        if (c0171a != null) {
            this.f30317b.remove(view);
        }
        return c0171a;
    }

    public String c(View view) {
        if (this.f30316a.size() == 0) {
            return null;
        }
        String str = this.f30316a.get(view);
        if (str != null) {
            this.f30316a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f30319d.contains(view) ? c.PARENT_VIEW : this.f30325j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f30323h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f30320e.add(strC);
                            this.f30316a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30321f.add(strC);
                            this.f30318c.put(strC, viewE);
                            this.f30322g.put(strC, strA);
                        }
                    } else {
                        this.f30321f.add(strC);
                        this.f30322g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f30324i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30324i.containsKey(view)) {
            return this.f30324i.get(view);
        }
        Map<View, Boolean> map = this.f30324i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f30322g.get(str);
    }

    public HashSet<String> c() {
        return this.f30320e;
    }

    public void d() {
        this.f30325j = true;
    }

    public boolean e(View view) {
        if (!this.f30324i.containsKey(view)) {
            return true;
        }
        this.f30324i.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view, boolean z10) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (a(view).booleanValue() && !z10) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strA = h.a(view);
            if (strA != null) {
                return strA;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f30319d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f30321f;
    }

    public boolean c(String str) {
        return this.f30323h.contains(str);
    }

    public void a() {
        this.f30316a.clear();
        this.f30317b.clear();
        this.f30318c.clear();
        this.f30319d.clear();
        this.f30320e.clear();
        this.f30321f.clear();
        this.f30322g.clear();
        this.f30325j = false;
        this.f30323h.clear();
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0171a c0171a = this.f30317b.get(view);
        if (c0171a != null) {
            c0171a.a(aVar.c());
        } else {
            this.f30317b.put(view, new C0171a(eVar, aVar.c()));
        }
    }
}
