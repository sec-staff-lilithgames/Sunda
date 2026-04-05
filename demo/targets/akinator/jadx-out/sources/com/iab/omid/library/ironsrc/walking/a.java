package com.iab.omid.library.ironsrc.walking;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30988a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0191a> f30989b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30990c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30991d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30992e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30993f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30994g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f30995h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f30996i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f30997j;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a$a, reason: collision with other inner class name */
    public static class C0191a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30998a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30999b = new ArrayList<>();

        public C0191a(e eVar, String str) {
            this.f30998a = eVar;
            a(str);
        }

        public e a() {
            return this.f30998a;
        }

        public ArrayList<String> b() {
            return this.f30999b;
        }

        public void a(String str) {
            this.f30999b.add(str);
        }
    }

    public View a(String str) {
        return this.f30990c.get(str);
    }

    public C0191a b(View view) {
        C0191a c0191a = this.f30989b.get(view);
        if (c0191a != null) {
            this.f30989b.remove(view);
        }
        return c0191a;
    }

    public String c(View view) {
        if (this.f30988a.size() == 0) {
            return null;
        }
        String str = this.f30988a.get(view);
        if (str != null) {
            this.f30988a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f30991d.contains(view) ? c.PARENT_VIEW : this.f30997j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.a()) {
                View viewC = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewC != null) {
                        boolean zE = h.e(viewC);
                        if (zE) {
                            this.f30995h.add(adSessionId);
                        }
                        String strA = a(viewC, zE);
                        if (strA == null) {
                            this.f30992e.add(adSessionId);
                            this.f30988a.put(viewC, adSessionId);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30993f.add(adSessionId);
                            this.f30990c.put(adSessionId, viewC);
                            this.f30994g.put(adSessionId, strA);
                        }
                    } else {
                        this.f30993f.add(adSessionId);
                        this.f30994g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f30996i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30996i.containsKey(view)) {
            return this.f30996i.get(view);
        }
        Map<View, Boolean> map = this.f30996i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f30994g.get(str);
    }

    public HashSet<String> c() {
        return this.f30992e;
    }

    public void d() {
        this.f30997j = true;
    }

    public boolean e(View view) {
        if (!this.f30996i.containsKey(view)) {
            return true;
        }
        this.f30996i.put(view, Boolean.TRUE);
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
        this.f30991d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f30993f;
    }

    public boolean c(String str) {
        return this.f30995h.contains(str);
    }

    public void a() {
        this.f30988a.clear();
        this.f30989b.clear();
        this.f30990c.clear();
        this.f30991d.clear();
        this.f30992e.clear();
        this.f30993f.clear();
        this.f30994g.clear();
        this.f30997j = false;
        this.f30995h.clear();
    }

    private void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        Iterator<e> it = aVar.d().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.ironsrc.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0191a c0191a = this.f30989b.get(view);
        if (c0191a != null) {
            c0191a.a(aVar.getAdSessionId());
        } else {
            this.f30989b.put(view, new C0191a(eVar, aVar.getAdSessionId()));
        }
    }
}
