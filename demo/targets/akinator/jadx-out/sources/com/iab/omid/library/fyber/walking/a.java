package com.iab.omid.library.fyber.walking;

import android.view.View;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30717a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0183a> f30718b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30719c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30720d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30721e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30722f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30723g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f30724h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f30725i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f30726j;

    /* renamed from: com.iab.omid.library.fyber.walking.a$a, reason: collision with other inner class name */
    public static class C0183a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30727a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30728b = new ArrayList<>();

        public C0183a(e eVar, String str) {
            this.f30727a = eVar;
            a(str);
        }

        public e a() {
            return this.f30727a;
        }

        public ArrayList<String> b() {
            return this.f30728b;
        }

        public void a(String str) {
            this.f30728b.add(str);
        }
    }

    public View a(String str) {
        return this.f30719c.get(str);
    }

    public C0183a b(View view) {
        C0183a c0183a = this.f30718b.get(view);
        if (c0183a != null) {
            this.f30718b.remove(view);
        }
        return c0183a;
    }

    public String c(View view) {
        if (this.f30717a.size() == 0) {
            return null;
        }
        String str = this.f30717a.get(view);
        if (str != null) {
            this.f30717a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f30720d.contains(view) ? c.PARENT_VIEW : this.f30726j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f30724h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f30721e.add(strC);
                            this.f30717a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30722f.add(strC);
                            this.f30719c.put(strC, viewE);
                            this.f30723g.put(strC, strA);
                        }
                    } else {
                        this.f30722f.add(strC);
                        this.f30723g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f30725i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30725i.containsKey(view)) {
            return this.f30725i.get(view);
        }
        Map<View, Boolean> map = this.f30725i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f30723g.get(str);
    }

    public HashSet<String> c() {
        return this.f30721e;
    }

    public void d() {
        this.f30726j = true;
    }

    public boolean e(View view) {
        if (!this.f30725i.containsKey(view)) {
            return true;
        }
        this.f30725i.put(view, Boolean.TRUE);
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
        this.f30720d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f30722f;
    }

    public boolean c(String str) {
        return this.f30724h.contains(str);
    }

    public void a() {
        this.f30717a.clear();
        this.f30718b.clear();
        this.f30719c.clear();
        this.f30720d.clear();
        this.f30721e.clear();
        this.f30722f.clear();
        this.f30723g.clear();
        this.f30726j = false;
        this.f30724h.clear();
    }

    private void a(com.iab.omid.library.fyber.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.fyber.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0183a c0183a = this.f30718b.get(view);
        if (c0183a != null) {
            c0183a.a(aVar.c());
        } else {
            this.f30718b.put(view, new C0183a(eVar, aVar.c()));
        }
    }
}
