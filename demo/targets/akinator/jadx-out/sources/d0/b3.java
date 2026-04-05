package d0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b3 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w3 f51320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.e f51321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v5 f51322g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v5 f51323h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v5 f51324i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51325j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5 f51326k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.a1 f51327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v5 f51328m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(w3 w3Var, s2.e eVar, v5 v5Var, v5 v5Var2, v5 v5Var3, p0.j2 j2Var, v5 v5Var4, kotlin.jvm.internal.a1 a1Var, v5 v5Var5) {
        super(0);
        this.f51320e = w3Var;
        this.f51321f = eVar;
        this.f51322g = v5Var;
        this.f51323h = v5Var2;
        this.f51324i = v5Var3;
        this.f51325j = j2Var;
        this.f51326k = v5Var4;
        this.f51327l = a1Var;
        this.f51328m = v5Var5;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3685invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3685invoke() {
        boolean zBooleanValue = ((Boolean) this.f51322g.getValue()).booleanValue();
        w3 w3Var = this.f51320e;
        if (!zBooleanValue) {
            w3Var.dismiss();
            return;
        }
        long jM4195unboximpl = ((i1.h) this.f51323h.getValue()).m4195unboximpl();
        kv.l lVarM3699access$invoke$lambda4 = j3.m3699access$invoke$lambda4(this.f51324i);
        s2.e eVar = this.f51321f;
        long jM4195unboximpl2 = ((i1.h) lVarM3699access$invoke$lambda4.invoke(eVar)).m4195unboximpl();
        this.f51320e.mo3686updateWko1d7g(jM4195unboximpl, i1.i.m4198isSpecifiedk4lQ0M(jM4195unboximpl2) ? i1.h.m4190plusMKHz9U(((i1.h) this.f51325j.getValue()).m4195unboximpl(), jM4195unboximpl2) : i1.h.f59344b.m4172getUnspecifiedF1C5BW0(), ((Number) this.f51326k.getValue()).floatValue());
        long jMo3735getSizeYbymL2g = w3Var.mo3735getSizeYbymL2g();
        kotlin.jvm.internal.a1 a1Var = this.f51327l;
        if (s2.v.m6970equalsimpl0(jMo3735getSizeYbymL2g, a1Var.f71813b)) {
            return;
        }
        a1Var.f71813b = jMo3735getSizeYbymL2g;
        kv.l lVarM3701access$invoke$lambda6 = j3.m3701access$invoke$lambda6(this.f51328m);
        if (lVarM3701access$invoke$lambda6 != null) {
            lVarM3701access$invoke$lambda6.invoke(s2.o.m6899boximpl(eVar.mo3423toDpSizekrfVVM(s2.w.m6981toSizeozmzZPI(jMo3735getSizeYbymL2g))));
        }
    }
}
