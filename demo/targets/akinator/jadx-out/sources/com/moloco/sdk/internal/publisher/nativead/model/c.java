package com.moloco.sdk.internal.publisher.nativead.model;

import a1.e;
import android.net.Uri;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.o;
import tu.q;
import tu.v;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f46578a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f46579b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f46580c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f46581d;

    /* renamed from: e, reason: collision with root package name */
    public final List f46582e;

    /* renamed from: f, reason: collision with root package name */
    public final o f46583f;

    public c(Map<Integer, b.a> data, Map<Integer, b.C0380b> images, Map<Integer, b.c> titles, Map<Integer, b.d> videos, List<? extends v> failedAssets) {
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(images, "images");
        e0.checkNotNullParameter(titles, "titles");
        e0.checkNotNullParameter(videos, "videos");
        e0.checkNotNullParameter(failedAssets, "failedAssets");
        this.f46578a = data;
        this.f46579b = images;
        this.f46580c = titles;
        this.f46581d = videos;
        this.f46582e = failedAssets;
        this.f46583f = q.lazy(new e(this, 9));
    }

    public final Map<Integer, b.a> a() {
        return this.f46578a;
    }

    public final Map<Integer, b.C0380b> b() {
        return this.f46579b;
    }

    public final Map<Integer, b.c> c() {
        return this.f46580c;
    }

    public final Map<Integer, b.d> d() {
        return this.f46581d;
    }

    public final List<v> e() {
        return this.f46582e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.f46578a, cVar.f46578a) && e0.areEqual(this.f46579b, cVar.f46579b) && e0.areEqual(this.f46580c, cVar.f46580c) && e0.areEqual(this.f46581d, cVar.f46581d) && e0.areEqual(this.f46582e, cVar.f46582e);
    }

    public final Map<Integer, b> f() {
        return (Map) this.f46583f.getValue();
    }

    public int hashCode() {
        return this.f46582e.hashCode() + o2.f(this.f46581d, o2.f(this.f46580c, o2.f(this.f46579b, this.f46578a.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreparedNativeAssets(data=");
        sb2.append(this.f46578a);
        sb2.append(", images=");
        sb2.append(this.f46579b);
        sb2.append(", titles=");
        sb2.append(this.f46580c);
        sb2.append(", videos=");
        sb2.append(this.f46581d);
        sb2.append(", failedAssets=");
        return j1.o2.p(sb2, this.f46582e, ')');
    }

    public final c a(Map<Integer, b.a> data, Map<Integer, b.C0380b> images, Map<Integer, b.c> titles, Map<Integer, b.d> videos, List<? extends v> failedAssets) {
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(images, "images");
        e0.checkNotNullParameter(titles, "titles");
        e0.checkNotNullParameter(videos, "videos");
        e0.checkNotNullParameter(failedAssets, "failedAssets");
        return new c(data, images, titles, videos, failedAssets);
    }

    public final Uri b(int i10) {
        b.C0380b c0380b = (b.C0380b) this.f46579b.get(Integer.valueOf(i10));
        if (c0380b != null) {
            return c0380b.d();
        }
        return null;
    }

    public final String c(int i10) {
        b.c cVar = (b.c) this.f46580c.get(Integer.valueOf(i10));
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d(int i10) {
        b.d dVar = (b.d) this.f46581d.get(Integer.valueOf(i10));
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public static /* synthetic */ c a(c cVar, Map map, Map map2, Map map3, Map map4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = cVar.f46578a;
        }
        if ((i10 & 2) != 0) {
            map2 = cVar.f46579b;
        }
        if ((i10 & 4) != 0) {
            map3 = cVar.f46580c;
        }
        if ((i10 & 8) != 0) {
            map4 = cVar.f46581d;
        }
        if ((i10 & 16) != 0) {
            list = cVar.f46582e;
        }
        List list2 = list;
        Map map5 = map3;
        return cVar.a(map, map2, map5, map4, list2);
    }

    public static final Map a(c cVar) {
        return p1.plus(p1.plus(p1.plus(cVar.f46578a, cVar.f46579b), cVar.f46580c), cVar.f46581d);
    }

    public final String a(int i10) {
        b.a aVar = (b.a) this.f46578a.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }
}
