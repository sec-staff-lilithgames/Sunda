package c0;

import i1.j;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final i1.j f11690a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f11691b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f11690a = new i1.j(0.5f, 0.5f, 0.5f, 0.5f);
        n2 vectorConverter = h3.getVectorConverter(kotlin.jvm.internal.c0.f71819a);
        Float fValueOf2 = Float.valueOf(1.0f);
        tu.v vVar = tu.e0.to(vectorConverter, fValueOf2);
        tu.v vVar2 = tu.e0.to(h3.getVectorConverter(s2.v.f85360b), fValueOf2);
        tu.v vVar3 = tu.e0.to(h3.getVectorConverter(s2.q.f85352b), fValueOf2);
        tu.v vVar4 = tu.e0.to(h3.getVectorConverter(kotlin.jvm.internal.w.f71862a), Float.valueOf(0.01f));
        tu.v vVar5 = tu.e0.to(h3.getVectorConverter(i1.j.f59349e), fValueOf);
        tu.v vVar6 = tu.e0.to(h3.getVectorConverter(i1.o.f59366b), fValueOf);
        tu.v vVar7 = tu.e0.to(h3.getVectorConverter(i1.h.f59344b), fValueOf);
        n2 vectorConverter2 = h3.getVectorConverter(s2.i.f85335c);
        Float fValueOf3 = Float.valueOf(0.1f);
        f11691b = uu.p1.mapOf(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, tu.e0.to(vectorConverter2, fValueOf3), tu.e0.to(h3.getVectorConverter(s2.l.f85340b), fValueOf3));
    }

    public static final int getVisibilityThreshold(kotlin.jvm.internal.c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return 1;
    }

    public static final Map<n2, Float> getVisibilityThresholdMap() {
        return f11691b;
    }

    public static final long getVisibilityThreshold(s2.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        return s2.r.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(i1.g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return i1.i.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(s2.k kVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
        s2.h hVar = s2.i.f85335c;
        return s2.j.m6832DpOffsetYgX7TsA(getVisibilityThreshold(hVar), getVisibilityThreshold(hVar));
    }

    public static final long getVisibilityThreshold(i1.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nVar, "<this>");
        return i1.p.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(s2.u uVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uVar, "<this>");
        return s2.w.IntSize(1, 1);
    }

    public static final i1.j getVisibilityThreshold(j.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f11690a;
    }

    public static final float getVisibilityThreshold(s2.h hVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(hVar, "<this>");
        return s2.i.m6817constructorimpl(0.1f);
    }
}
