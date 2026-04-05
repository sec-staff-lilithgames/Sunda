package com.ironsource;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cg {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC3553z> f33930a;

    /* JADX WARN: Multi-variable type inference failed */
    public Cg(List<? extends AbstractC3553z> instances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instances, "instances");
        this.f33930a = instances;
    }

    public final List<AbstractC3553z> a() {
        return this.f33930a;
    }

    public final List<AbstractC3553z> b() {
        return this.f33930a;
    }

    public final int c() {
        return this.f33930a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3553z abstractC3553z : this.f33930a) {
            arrayList.add(a(abstractC3553z.h(), abstractC3553z.r()));
        }
        return uu.y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Cg) && kotlin.jvm.internal.e0.areEqual(this.f33930a, ((Cg) obj).f33930a);
    }

    public int hashCode() {
        return this.f33930a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f33930a + ")";
    }

    public final Cg a(List<? extends AbstractC3553z> instances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instances, "instances");
        return new Cg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cg a(Cg cg2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = cg2.f33930a;
        }
        return cg2.a(list);
    }

    private final String a(C3352n2 c3352n2, int i10) {
        return b0.e2.m("%s%s", "format(format, *args)", 2, new Object[]{Integer.valueOf(i10), c3352n2.c()});
    }
}
