package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30582a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0179a> f30583b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30584c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30585d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30586e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30587f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30588g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f30589h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f30590i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a, reason: collision with other inner class name */
    public static class C0179a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30591a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30592b = new ArrayList<>();

        public C0179a(e eVar, String str) {
            this.f30591a = eVar;
            a(str);
        }

        public e a() {
            return this.f30591a;
        }

        public ArrayList<String> b() {
            return this.f30592b;
        }

        public void a(String str) {
            this.f30592b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f30589h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30589h.containsKey(view)) {
            return this.f30589h.get(view);
        }
        Map<View, Boolean> map = this.f30589h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public View a(String str) {
        return this.f30584c.get(str);
    }

    public C0179a c(View view) {
        C0179a c0179a = this.f30583b.get(view);
        if (c0179a != null) {
            this.f30583b.remove(view);
        }
        return c0179a;
    }

    public String d(View view) {
        if (this.f30582a.size() == 0) {
            return null;
        }
        String str = this.f30582a.get(view);
        if (str != null) {
            this.f30582a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f30585d.contains(view) ? c.PARENT_VIEW : this.f30590i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (!this.f30589h.containsKey(view)) {
            return true;
        }
        this.f30589h.put(view, Boolean.TRUE);
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
        this.f30585d.addAll(hashSet);
        return null;
    }

    public String b(String str) {
        return this.f30588g.get(str);
    }

    public HashSet<String> c() {
        return this.f30586e;
    }

    public void d() {
        this.f30590i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c cVarC = com.iab.omid.library.bytedance2.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        String strA = a(viewC);
                        if (strA == null) {
                            this.f30586e.add(adSessionId);
                            this.f30582a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30587f.add(adSessionId);
                            this.f30584c.put(adSessionId, viewC);
                            this.f30588g.put(adSessionId, strA);
                        }
                    } else {
                        this.f30587f.add(adSessionId);
                        this.f30588g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f30582a.clear();
        this.f30583b.clear();
        this.f30584c.clear();
        this.f30585d.clear();
        this.f30586e.clear();
        this.f30587f.clear();
        this.f30588g.clear();
        this.f30590i = false;
    }

    public HashSet<String> b() {
        return this.f30587f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0179a c0179a = this.f30583b.get(view);
        if (c0179a != null) {
            c0179a.a(aVar.getAdSessionId());
        } else {
            this.f30583b.put(view, new C0179a(eVar, aVar.getAdSessionId()));
        }
    }
}
