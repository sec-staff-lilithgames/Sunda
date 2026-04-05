package com.iab.omid.library.inmobi.walking;

import android.view.View;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f30853a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C0187a> f30854b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f30855c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f30856d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f30857e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f30858f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f30859g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet<String> f30860h = new HashSet<>();

    /* renamed from: i, reason: collision with root package name */
    private final Map<View, Boolean> f30861i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f30862j;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a, reason: collision with other inner class name */
    public static class C0187a {

        /* renamed from: a, reason: collision with root package name */
        private final e f30863a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f30864b = new ArrayList<>();

        public C0187a(e eVar, String str) {
            this.f30863a = eVar;
            a(str);
        }

        public e a() {
            return this.f30863a;
        }

        public ArrayList<String> b() {
            return this.f30864b;
        }

        public void a(String str) {
            this.f30864b.add(str);
        }
    }

    public View a(String str) {
        return this.f30855c.get(str);
    }

    public C0187a b(View view) {
        C0187a c0187a = this.f30854b.get(view);
        if (c0187a != null) {
            this.f30854b.remove(view);
        }
        return c0187a;
    }

    public String c(View view) {
        if (this.f30853a.size() == 0) {
            return null;
        }
        String str = this.f30853a.get(view);
        if (str != null) {
            this.f30853a.remove(view);
        }
        return str;
    }

    public c d(View view) {
        return this.f30856d.contains(view) ? c.PARENT_VIEW : this.f30862j ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.a()) {
                View viewE = aVar.e();
                if (aVar.h()) {
                    String strC = aVar.c();
                    if (viewE != null) {
                        boolean zE = h.e(viewE);
                        if (zE) {
                            this.f30860h.add(strC);
                        }
                        String strA = a(viewE, zE);
                        if (strA == null) {
                            this.f30857e.add(strC);
                            this.f30853a.put(viewE, strC);
                            a(aVar);
                        } else if (strA != "noWindowFocus") {
                            this.f30858f.add(strC);
                            this.f30855c.put(strC, viewE);
                            this.f30859g.put(strC, strA);
                        }
                    } else {
                        this.f30858f.add(strC);
                        this.f30859g.put(strC, "noAdView");
                    }
                }
            }
        }
    }

    private Boolean a(View view) {
        if (view.hasWindowFocus()) {
            this.f30861i.remove(view);
            return Boolean.FALSE;
        }
        if (this.f30861i.containsKey(view)) {
            return this.f30861i.get(view);
        }
        Map<View, Boolean> map = this.f30861i;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    public String b(String str) {
        return this.f30859g.get(str);
    }

    public HashSet<String> c() {
        return this.f30857e;
    }

    public void d() {
        this.f30862j = true;
    }

    public boolean e(View view) {
        if (!this.f30861i.containsKey(view)) {
            return true;
        }
        this.f30861i.put(view, Boolean.TRUE);
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
        this.f30856d.addAll(hashSet);
        return null;
    }

    public HashSet<String> b() {
        return this.f30858f;
    }

    public boolean c(String str) {
        return this.f30860h.contains(str);
    }

    public void a() {
        this.f30853a.clear();
        this.f30854b.clear();
        this.f30855c.clear();
        this.f30856d.clear();
        this.f30857e.clear();
        this.f30858f.clear();
        this.f30859g.clear();
        this.f30862j = false;
        this.f30860h.clear();
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        Iterator<e> it = aVar.f().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0187a c0187a = this.f30854b.get(view);
        if (c0187a != null) {
            c0187a.a(aVar.c());
        } else {
            this.f30854b.put(view, new C0187a(eVar, aVar.c()));
        }
    }
}
