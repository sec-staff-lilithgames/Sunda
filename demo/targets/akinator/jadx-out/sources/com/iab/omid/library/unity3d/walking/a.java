package com.iab.omid.library.unity3d.walking;

import android.view.View;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31369a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0202a> f31370b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31371c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31372d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31373e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31374f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31375g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f31376h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f31377i;

    /* renamed from: com.iab.omid.library.unity3d.walking.a$a, reason: collision with other inner class name */
    public static class C0202a {

        /* renamed from: a, reason: collision with root package name */
        private final e f31378a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31379b = new ArrayList<>();

        public C0202a(e eVar, String str) {
            this.f31378a = eVar;
            a(str);
        }

        public e a() {
            return this.f31378a;
        }

        public ArrayList<String> b() {
            return this.f31379b;
        }

        public void a(String str) {
            this.f31379b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f31376h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f31376h.containsKey(view)) {
            return this.f31376h.get(view);
        }
        Map<View, Boolean> map = this.f31376h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f31371c.get(str);
    }

    public C0202a c(View view) {
        C0202a c0202a = this.f31370b.get(view);
        if (c0202a != null) {
            this.f31370b.remove(view);
        }
        return c0202a;
    }

    public String d(View view) {
        if (this.f31369a.size() == 0) {
            return null;
        }
        String str = this.f31369a.get(view);
        if (str != null) {
            this.f31369a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f31372d.contains(view) ? c.PARENT_VIEW : this.f31377i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f31376h.containsKey(view)) {
            return true;
        }
        this.f31376h.put(view, Boolean.TRUE);
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
        this.f31372d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f31375g.get(str);
    }

    public HashSet<String> c() {
        return this.f31373e;
    }

    public void d() {
        this.f31377i = true;
    }

    public void e() {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f31373e.add(adSessionId);
                            this.f31369a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f31374f.add(adSessionId);
                            this.f31371c.put(adSessionId, viewC);
                            this.f31375g.put(adSessionId, strA);
                        }
                    } else {
                        this.f31374f.add(adSessionId);
                        this.f31375g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f31369a.clear();
        this.f31370b.clear();
        this.f31371c.clear();
        this.f31372d.clear();
        this.f31373e.clear();
        this.f31374f.clear();
        this.f31375g.clear();
        this.f31377i = false;
    }

    public HashSet<String> b() {
        return this.f31374f;
    }

    private void a(com.iab.omid.library.unity3d.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.unity3d.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0202a c0202a = this.f31370b.get(view);
        if (c0202a != null) {
            c0202a.a(aVar.getAdSessionId());
        } else {
            this.f31370b.put(view, new C0202a(eVar, aVar.getAdSessionId()));
        }
    }
}
