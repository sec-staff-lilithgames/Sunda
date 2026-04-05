package com.iab.omid.library.appodeal.walking;

import android.view.View;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30452a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0175a> f30453b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30454c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30455d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30456e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30457f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30458g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f30459h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f30460i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f30461j;

    /* renamed from: com.iab.omid.library.appodeal.walking.a$a, reason: collision with other inner class name */
    public static class C0175a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30462a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30463b = new ArrayList<>();

        public C0175a(e eVar, String str) {
            this.f30462a = eVar;
            a(str);
        }

        public e a() {
            return this.f30462a;
        }

        public ArrayList<String> b() {
            return this.f30463b;
        }

        public void a(String str) {
            this.f30463b.add(str);
        }
    }

    public View a(String str) {
        return this.f30454c.get(str);
    }

    public C0175a b(View view) {
        C0175a c0175a = this.f30453b.get(view);
        if (c0175a != null) {
            this.f30453b.remove(view);
        }
        return c0175a;
    }

    public String c(View view) {
        if (this.f30452a.size() == 0) {
            return null;
        }
        String str = this.f30452a.get(view);
        if (str != null) {
            this.f30452a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f30455d.contains(view) ? c.PARENT_VIEW : this.f30461j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f30459h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f30456e.add(strC);
                            this.f30452a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30457f.add(strC);
                            this.f30454c.put(strC, viewE);
                            this.f30458g.put(strC, strA);
                        }
                    } else {
                        this.f30457f.add(strC);
                        this.f30458g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f30460i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30460i.containsKey(view)) {
            return this.f30460i.get(view);
        }
        Map<View, Boolean> map = this.f30460i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f30458g.get(str);
    }

    public HashSet<String> c() {
        return this.f30456e;
    }

    public void d() {
        this.f30461j = true;
    }

    public boolean e(View view) {
        if (!this.f30460i.containsKey(view)) {
            return true;
        }
        this.f30460i.put(view, Boolean.TRUE);
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
        this.f30455d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f30457f;
    }

    public boolean c(String str) {
        return this.f30459h.contains(str);
    }

    public void a() {
        this.f30452a.clear();
        this.f30453b.clear();
        this.f30454c.clear();
        this.f30455d.clear();
        this.f30456e.clear();
        this.f30457f.clear();
        this.f30458g.clear();
        this.f30461j = false;
        this.f30459h.clear();
    }

    private void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.appodeal.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0175a c0175a = this.f30453b.get(view);
        if (c0175a != null) {
            c0175a.a(aVar.c());
        } else {
            this.f30453b.put(view, new C0175a(eVar, aVar.c()));
        }
    }
}
