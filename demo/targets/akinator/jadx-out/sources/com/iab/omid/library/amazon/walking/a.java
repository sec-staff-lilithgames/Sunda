package com.iab.omid.library.amazon.walking;

import android.view.View;
import com.iab.omid.library.amazon.internal.e;
import com.iab.omid.library.amazon.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30182a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0167a> f30183b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30184c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30185d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30186e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30187f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30188g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f30189h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f30190i;

    /* renamed from: com.iab.omid.library.amazon.walking.a$a, reason: collision with other inner class name */
    public static class C0167a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30191a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30192b = new ArrayList<>();

        public C0167a(e eVar, String str) {
            this.f30191a = eVar;
            a(str);
        }

        public e a() {
            return this.f30191a;
        }

        public ArrayList<String> b() {
            return this.f30192b;
        }

        public void a(String str) {
            this.f30192b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f30189h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30189h.containsKey(view)) {
            return this.f30189h.get(view);
        }
        Map<View, Boolean> map = this.f30189h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f30184c.get(str);
    }

    public C0167a c(View view) {
        C0167a c0167a = this.f30183b.get(view);
        if (c0167a != null) {
            this.f30183b.remove(view);
        }
        return c0167a;
    }

    public String d(View view) {
        if (this.f30182a.size() == 0) {
            return null;
        }
        String str = this.f30182a.get(view);
        if (str != null) {
            this.f30182a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f30185d.contains(view) ? c.PARENT_VIEW : this.f30190i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f30189h.containsKey(view)) {
            return true;
        }
        this.f30189h.put(view, Boolean.TRUE);
        return false;
    }

    private String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (b(view).booleanValue()) {
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
        this.f30185d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f30188g.get(str);
    }

    public HashSet<String> c() {
        return this.f30186e;
    }

    public void d() {
        this.f30190i = true;
    }

    public void e() {
        com.iab.omid.library.amazon.internal.c cVarC = com.iab.omid.library.amazon.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.amazon.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f30186e.add(adSessionId);
                            this.f30182a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30187f.add(adSessionId);
                            this.f30184c.put(adSessionId, viewC);
                            this.f30188g.put(adSessionId, strA);
                        }
                    } else {
                        this.f30187f.add(adSessionId);
                        this.f30188g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f30182a.clear();
        this.f30183b.clear();
        this.f30184c.clear();
        this.f30185d.clear();
        this.f30186e.clear();
        this.f30187f.clear();
        this.f30188g.clear();
        this.f30190i = false;
    }

    public HashSet<String> b() {
        return this.f30187f;
    }

    private void a(com.iab.omid.library.amazon.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.amazon.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0167a c0167a = this.f30183b.get(view);
        if (c0167a != null) {
            c0167a.a(aVar.getAdSessionId());
        } else {
            this.f30183b.put(view, new C0167a(eVar, aVar.getAdSessionId()));
        }
    }
}
