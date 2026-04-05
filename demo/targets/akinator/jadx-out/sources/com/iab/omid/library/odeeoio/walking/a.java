package com.iab.omid.library.odeeoio.walking;

import android.view.View;
import com.iab.omid.library.odeeoio.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f31241a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0198a> f31242b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f31243c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f31244d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f31245e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f31246f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f31247g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final Map<View, Boolean> f31248h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f31249i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.iab.omid.library.odeeoio.walking.a$a, reason: collision with other inner class name */
    public static class C0198a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.odeeoio.b.c f31250a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f31251b = new ArrayList<>();

        public C0198a(com.iab.omid.library.odeeoio.b.c cVar, String str) {
            this.f31250a = cVar;
            a(str);
        }

        public com.iab.omid.library.odeeoio.b.c a() {
            return this.f31250a;
        }

        public ArrayList<String> b() {
            return this.f31251b;
        }

        public void a(String str) {
            this.f31251b.add(str);
        }
    }

    private String e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (f(view).booleanValue()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f31244d.addAll(hashSet);
        return null;
    }

    private Boolean f(View view) {
        if (view.hasWindowFocus()) {
            this.f31248h.remove(view);
            return Boolean.FALSE;
        }
        if (this.f31248h.containsKey(view)) {
            return this.f31248h.get(view);
        }
        Map<View, Boolean> map = this.f31248h;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String a(View view) {
        if (this.f31241a.size() == 0) {
            return null;
        }
        String str = this.f31241a.get(view);
        if (str != null) {
            this.f31241a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f31243c.get(str);
    }

    public c c(View view) {
        return this.f31244d.contains(view) ? c.PARENT_VIEW : this.f31249i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void d() {
        this.f31241a.clear();
        this.f31242b.clear();
        this.f31243c.clear();
        this.f31244d.clear();
        this.f31245e.clear();
        this.f31246f.clear();
        this.f31247g.clear();
        this.f31249i = false;
    }

    public String a(String str) {
        return this.f31247g.get(str);
    }

    public C0198a b(View view) {
        C0198a c0198a = this.f31242b.get(view);
        if (c0198a != null) {
            this.f31242b.remove(view);
        }
        return c0198a;
    }

    public void c() {
        com.iab.omid.library.odeeoio.b.a aVarA = com.iab.omid.library.odeeoio.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.odeeoio.adsession.a aVar : aVarA.c()) {
                View viewE = aVar.e();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewE != null) {
                        String strE = e(viewE);
                        if (strE == null) {
                            this.f31245e.add(adSessionId);
                            this.f31241a.put(viewE, adSessionId);
                            a(aVar);
                        } else if (strE != "noWindowFocus") {
                            this.f31246f.add(adSessionId);
                            this.f31243c.put(adSessionId, viewE);
                            this.f31247g.put(adSessionId, strE);
                        }
                    } else {
                        this.f31246f.add(adSessionId);
                        this.f31247g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public boolean d(View view) {
        if (!this.f31248h.containsKey(view)) {
            return true;
        }
        this.f31248h.put(view, Boolean.TRUE);
        return false;
    }

    public void e() {
        this.f31249i = true;
    }

    public HashSet<String> a() {
        return this.f31245e;
    }

    public HashSet<String> b() {
        return this.f31246f;
    }

    private void a(com.iab.omid.library.odeeoio.adsession.a aVar) {
        Iterator<com.iab.omid.library.odeeoio.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.odeeoio.b.c cVar, com.iab.omid.library.odeeoio.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C0198a c0198a = this.f31242b.get(view);
        if (c0198a != null) {
            c0198a.a(aVar.getAdSessionId());
        } else {
            this.f31242b.put(view, new C0198a(cVar, aVar.getAdSessionId()));
        }
    }
}
