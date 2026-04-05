package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f49458a;

    /* renamed from: b, reason: collision with root package name */
    public final c f49459b;

    /* renamed from: c, reason: collision with root package name */
    public final List f49460c;

    /* renamed from: d, reason: collision with root package name */
    public final List f49461d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f49462e;

    public a(g linear, c cVar, List<String> impressionTracking, List<String> errorTracking, a0 a0Var) {
        e0.checkNotNullParameter(linear, "linear");
        e0.checkNotNullParameter(impressionTracking, "impressionTracking");
        e0.checkNotNullParameter(errorTracking, "errorTracking");
        this.f49458a = linear;
        this.f49459b = cVar;
        this.f49460c = impressionTracking;
        this.f49461d = errorTracking;
        this.f49462e = a0Var;
    }

    public final g a() {
        return this.f49458a;
    }

    public final c b() {
        return this.f49459b;
    }

    public final List<String> c() {
        return this.f49460c;
    }

    public final List<String> d() {
        return this.f49461d;
    }

    public final a0 e() {
        return this.f49462e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f49458a, aVar.f49458a) && e0.areEqual(this.f49459b, aVar.f49459b) && e0.areEqual(this.f49460c, aVar.f49460c) && e0.areEqual(this.f49461d, aVar.f49461d) && e0.areEqual(this.f49462e, aVar.f49462e);
    }

    public final c f() {
        return this.f49459b;
    }

    public final a0 g() {
        return this.f49462e;
    }

    public final List<String> h() {
        return this.f49461d;
    }

    public int hashCode() {
        int iHashCode = this.f49458a.hashCode() * 31;
        c cVar = this.f49459b;
        int iC = o2.c(o2.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f49460c), 31, this.f49461d);
        a0 a0Var = this.f49462e;
        return iC + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final List<String> i() {
        return this.f49460c;
    }

    public final g j() {
        return this.f49458a;
    }

    public String toString() {
        return "Ad(linear=" + this.f49458a + ", companion=" + this.f49459b + ", impressionTracking=" + this.f49460c + ", errorTracking=" + this.f49461d + ", dec=" + this.f49462e + ')';
    }

    public final a a(g linear, c cVar, List<String> impressionTracking, List<String> errorTracking, a0 a0Var) {
        e0.checkNotNullParameter(linear, "linear");
        e0.checkNotNullParameter(impressionTracking, "impressionTracking");
        e0.checkNotNullParameter(errorTracking, "errorTracking");
        return new a(linear, cVar, impressionTracking, errorTracking, a0Var);
    }

    public static /* synthetic */ a a(a aVar, g gVar, c cVar, List list, List list2, a0 a0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = aVar.f49458a;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f49459b;
        }
        if ((i10 & 4) != 0) {
            list = aVar.f49460c;
        }
        if ((i10 & 8) != 0) {
            list2 = aVar.f49461d;
        }
        if ((i10 & 16) != 0) {
            a0Var = aVar.f49462e;
        }
        a0 a0Var2 = a0Var;
        List list3 = list;
        return aVar.a(gVar, cVar, list3, list2, a0Var2);
    }

    public /* synthetic */ a(g gVar, c cVar, List list, List list2, a0 a0Var, int i10, u uVar) {
        this(gVar, cVar, list, list2, (i10 & 16) != 0 ? null : a0Var);
    }
}
