package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.q0;
import uu.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: p, reason: collision with root package name */
    public static final a f50023p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f50024a;

    /* renamed from: b, reason: collision with root package name */
    public List f50025b;

    /* renamed from: c, reason: collision with root package name */
    public final List f50026c;

    /* renamed from: d, reason: collision with root package name */
    public final List f50027d;

    /* renamed from: e, reason: collision with root package name */
    public final List f50028e;

    /* renamed from: f, reason: collision with root package name */
    public final List f50029f;

    /* renamed from: g, reason: collision with root package name */
    public final List f50030g;

    /* renamed from: h, reason: collision with root package name */
    public final List f50031h;

    /* renamed from: i, reason: collision with root package name */
    public List f50032i;

    /* renamed from: j, reason: collision with root package name */
    public final p f50033j;

    /* renamed from: k, reason: collision with root package name */
    public final n f50034k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f50035l;

    /* renamed from: m, reason: collision with root package name */
    public int f50036m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f50037n;

    /* renamed from: o, reason: collision with root package name */
    public int f50038o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public final k a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i linearTracking, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService) {
            e0.checkNotNullParameter(linearTracking, "linearTracking");
            e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
            return new k(customUserEventBuilderService, linearTracking.a(), linearTracking.d(), linearTracking.m(), linearTracking.e(), linearTracking.f(), linearTracking.n(), linearTracking.c(), linearTracking.g(), linearTracking.o(), linearTracking.h(), linearTracking.j(), linearTracking.k(), linearTracking.l(), linearTracking.b(), linearTracking.i(), null, null, 196608, null);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj).a()), Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(Integer.valueOf(((m) obj).a()), Integer.valueOf(((m) obj2).a()));
        }
    }

    public k(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10, List<String> list11, List<String> list12, List<String> list13, List<String> list14, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h> list15, p buttonTracker, n vastTracker) {
        e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        e0.checkNotNullParameter(vastTracker, "vastTracker");
        this.f50024a = customUserEventBuilderService;
        this.f50025b = list;
        this.f50026c = list8;
        this.f50027d = list9;
        this.f50028e = list10;
        this.f50029f = list11;
        this.f50030g = list12;
        this.f50031h = list13;
        this.f50032i = list14;
        this.f50033j = buttonTracker;
        this.f50034k = vastTracker;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(q0.collectionSizeOrDefault(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new m((String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList(q0.collectionSizeOrDefault(list5, 10));
            Iterator<T> it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new m((String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList(q0.collectionSizeOrDefault(list6, 10));
            Iterator<T> it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new m((String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(q0.collectionSizeOrDefault(list7, 10));
            Iterator<T> it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new m((String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar : list15) {
                t tVarA = hVar.a();
                if (tVarA instanceof t.b) {
                    arrayList.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a(hVar.b(), ((t.b) hVar.a()).a()));
                } else {
                    if (!(tVarA instanceof t.a)) {
                        throw new tu.t();
                    }
                    arrayList2.add(new m(hVar.b(), ((t.a) hVar.a()).a()));
                }
            }
        }
        if (arrayList.size() > 1) {
            u0.sortWith(arrayList, new b());
        }
        this.f50035l = arrayList;
        if (arrayList2.size() > 1) {
            u0.sortWith(arrayList2, new c());
        }
        this.f50037n = arrayList2;
    }

    public static /* synthetic */ void a(k kVar, a.f fVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        kVar.a(fVar, num, str);
    }

    public static /* synthetic */ void b(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.b(num, str);
    }

    public static /* synthetic */ void c(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.c(num, str);
    }

    public static /* synthetic */ void d(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.d(num, str);
    }

    public static /* synthetic */ void e(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.e(num, str);
    }

    public static /* synthetic */ void f(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.f(num, str);
    }

    public static /* synthetic */ void g(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.g(num, str);
    }

    public final void a(a.f lastClickPosition, Integer num, String str) {
        e0.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List<String> list = this.f50025b;
        if (list != null) {
            this.f50034k.a(list, null, num, str, this.f50033j.q(), this.f50024a, lastClickPosition);
            this.f50025b = null;
        }
    }

    public final void b(Integer num, String str) {
        List<String> list = this.f50026c;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public final void c(Integer num, String str) {
        List<String> list = this.f50028e;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public final void d(Integer num, String str) {
        List<String> list = this.f50029f;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public final void e(Integer num, String str) {
        List<String> list = this.f50030g;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public final void f(Integer num, String str) {
        List<String> list = this.f50031h;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public final void g(Integer num, String str) {
        List<String> list = this.f50027d;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
        }
    }

    public static /* synthetic */ void a(k kVar, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        kVar.a(num, str);
    }

    public final void a(Integer num, String str) {
        List<String> list = this.f50032i;
        if (list != null) {
            this.f50034k.a(list, null, num, str);
            this.f50032i = null;
        }
    }

    public final void a(a.c button) {
        e0.checkNotNullParameter(button, "button");
        this.f50033j.a(button);
    }

    public final void a(a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(buttonType, "buttonType");
        this.f50033j.a(buttonType);
    }

    public static /* synthetic */ void a(k kVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = null;
        }
        kVar.a(str, i10, i11);
    }

    public final void a(String str, int i10, int i11) {
        double d10 = (i10 / i11) * 100;
        int i12 = this.f50038o;
        ArrayList arrayList = this.f50037n;
        List listSubList = arrayList.subList(i12, arrayList.size());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSubList) {
            if (((m) obj).a() > d10) {
                break;
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((m) it.next()).b());
        }
        Integer numValueOf = Integer.valueOf(i10);
        n nVar = this.f50034k;
        nVar.a(arrayList3, null, numValueOf, str);
        this.f50038o = arrayList2.size() + this.f50038o;
        int i13 = this.f50036m;
        ArrayList arrayList4 = this.f50035l;
        List listSubList2 = arrayList4.subList(i13, arrayList4.size());
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : listSubList2) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a() > i10) {
                break;
            } else {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(q0.collectionSizeOrDefault(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) it2.next()).b());
        }
        nVar.a(arrayList6, null, Integer.valueOf(i10), str);
        this.f50036m = arrayList5.size() + this.f50036m;
    }

    public /* synthetic */ k(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, p pVar, n nVar, int i10, u uVar) {
        this(bVar, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? r.a() : pVar, (i10 & 131072) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p.b() : nVar);
    }
}
