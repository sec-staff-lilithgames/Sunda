package com.iab.omid.library.vungle.walking;

import android.view.View;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31503a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0206a> f31504b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31505c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31506d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31507e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31508f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31509g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f31510h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f31511i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f31512j;

    /* renamed from: com.iab.omid.library.vungle.walking.a$a, reason: collision with other inner class name */
    public static class C0206a {

        /* renamed from: a, reason: collision with root package name */
        private final e f31513a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31514b = new ArrayList<>();

        public C0206a(e eVar, String str) {
            this.f31513a = eVar;
            a(str);
        }

        public e a() {
            return this.f31513a;
        }

        public ArrayList<String> b() {
            return this.f31514b;
        }

        public void a(String str) {
            this.f31514b.add(str);
        }
    }

    public View a(String str) {
        return this.f31505c.get(str);
    }

    public C0206a b(View view) {
        C0206a c0206a = this.f31504b.get(view);
        if (c0206a != null) {
            this.f31504b.remove(view);
        }
        return c0206a;
    }

    public String c(View view) {
        if (this.f31503a.size() == 0) {
            return null;
        }
        String str = this.f31503a.get(view);
        if (str != null) {
            this.f31503a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f31506d.contains(view) ? c.PARENT_VIEW : this.f31512j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.vungle.internal.c cVarC = com.iab.omid.library.vungle.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.vungle.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f31510h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f31507e.add(strC);
                            this.f31503a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f31508f.add(strC);
                            this.f31505c.put(strC, viewE);
                            this.f31509g.put(strC, strA);
                        }
                    } else {
                        this.f31508f.add(strC);
                        this.f31509g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f31511i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f31511i.containsKey(view)) {
            return this.f31511i.get(view);
        }
        Map<View, Boolean> map = this.f31511i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f31509g.get(str);
    }

    public HashSet<String> c() {
        return this.f31507e;
    }

    public void d() {
        this.f31512j = true;
    }

    public boolean e(View view) {
        if (!this.f31511i.containsKey(view)) {
            return true;
        }
        this.f31511i.put(view, Boolean.TRUE);
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
        this.f31506d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f31508f;
    }

    public boolean c(String str) {
        return this.f31510h.contains(str);
    }

    public void a() {
        this.f31503a.clear();
        this.f31504b.clear();
        this.f31505c.clear();
        this.f31506d.clear();
        this.f31507e.clear();
        this.f31508f.clear();
        this.f31509g.clear();
        this.f31512j = false;
        this.f31510h.clear();
    }

    private void a(com.iab.omid.library.vungle.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.vungle.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0206a c0206a = this.f31504b.get(view);
        if (c0206a != null) {
            c0206a.a(aVar.c());
        } else {
            this.f31504b.put(view, new C0206a(eVar, aVar.c()));
        }
    }
}
