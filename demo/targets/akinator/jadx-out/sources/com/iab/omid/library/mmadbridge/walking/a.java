package com.iab.omid.library.mmadbridge.walking;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31123a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0195a> f31124b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31125c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31126d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31127e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31128f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31129g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f31130h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f31131i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f31132j;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a$a, reason: collision with other inner class name */
    public static class C0195a {

        /* renamed from: a, reason: collision with root package name */
        private final e f31133a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31134b = new ArrayList<>();

        public C0195a(e eVar, String str) {
            this.f31133a = eVar;
            a(str);
        }

        public e a() {
            return this.f31133a;
        }

        public ArrayList<String> b() {
            return this.f31134b;
        }

        public void a(String str) {
            this.f31134b.add(str);
        }
    }

    public View a(String str) {
        return this.f31125c.get(str);
    }

    public C0195a b(View view) {
        C0195a c0195a = this.f31124b.get(view);
        if (c0195a != null) {
            this.f31124b.remove(view);
        }
        return c0195a;
    }

    public String c(View view) {
        if (this.f31123a.size() == 0) {
            return null;
        }
        String str = this.f31123a.get(view);
        if (str != null) {
            this.f31123a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f31126d.contains(view) ? c.PARENT_VIEW : this.f31132j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f31130h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f31127e.add(adSessionId);
                            this.f31123a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f31128f.add(adSessionId);
                            this.f31125c.put(adSessionId, viewC);
                            this.f31129g.put(adSessionId, strA);
                        }
                    } else {
                        this.f31128f.add(adSessionId);
                        this.f31129g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f31131i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f31131i.containsKey(view)) {
            return this.f31131i.get(view);
        }
        Map<View, Boolean> map = this.f31131i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f31129g.get(str);
    }

    public HashSet<String> c() {
        return this.f31127e;
    }

    public void d() {
        this.f31132j = true;
    }

    public boolean e(View view) {
        if (!this.f31131i.containsKey(view)) {
            return true;
        }
        this.f31131i.put(view, Boolean.TRUE);
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
        this.f31126d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f31128f;
    }

    public boolean c(String str) {
        return this.f31130h.contains(str);
    }

    public void a() {
        this.f31123a.clear();
        this.f31124b.clear();
        this.f31125c.clear();
        this.f31126d.clear();
        this.f31127e.clear();
        this.f31128f.clear();
        this.f31129g.clear();
        this.f31132j = false;
        this.f31130h.clear();
    }

    private void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.mmadbridge.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0195a c0195a = this.f31124b.get(view);
        if (c0195a != null) {
            c0195a.a(aVar.getAdSessionId());
        } else {
            this.f31124b.put(view, new C0195a(eVar, aVar.getAdSessionId()));
        }
    }
}
