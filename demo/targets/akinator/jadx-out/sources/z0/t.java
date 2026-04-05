package z0;

import java.util.ArrayList;
import kotlin.jvm.internal.h1;
import p0.i3;
import p0.l3;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements b {

    /* renamed from: b, reason: collision with root package name */
    public final int f97231b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97232c;

    /* renamed from: e, reason: collision with root package name */
    public Object f97233e;

    /* renamed from: f, reason: collision with root package name */
    public i3 f97234f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f97235g;

    public t(int i10, boolean z10, Object obj) {
        this.f97231b = i10;
        this.f97232c = z10;
        this.f97233e = obj;
    }

    public final void a(p0.w wVar) {
        i3 recomposeScope;
        if (!this.f97232c || (recomposeScope = wVar.getRecomposeScope()) == null) {
            return;
        }
        wVar.recordUsed(recomposeScope);
        if (u.replacableWith(this.f97234f, recomposeScope)) {
            this.f97234f = recomposeScope;
            return;
        }
        ArrayList arrayList = this.f97235g;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f97235g = arrayList2;
            arrayList2.add(recomposeScope);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (u.replacableWith((i3) arrayList.get(i10), recomposeScope)) {
                arrayList.set(i10, recomposeScope);
                return;
            }
        }
        arrayList.add(recomposeScope);
    }

    public final int getKey() {
        return this.f97231b;
    }

    @Override // z0.b, kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((p0.w) obj, ((Number) obj2).intValue());
    }

    public final void update(Object obj) {
        if (kotlin.jvm.internal.e0.areEqual(this.f97233e, obj)) {
            return;
        }
        boolean z10 = this.f97233e == null;
        this.f97233e = obj;
        if (z10 || !this.f97232c) {
            return;
        }
        i3 i3Var = this.f97234f;
        if (i3Var != null) {
            i3Var.invalidate();
            this.f97234f = null;
        }
        ArrayList arrayList = this.f97235g;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((i3) arrayList.get(i10)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // z0.b, kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    @Override // z0.b, kv.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(obj, obj2, (p0.w) obj3, ((Number) obj4).intValue());
    }

    @Override // z0.b, kv.s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(obj, obj2, obj3, (p0.w) obj4, ((Number) obj5).intValue());
    }

    @Override // z0.b, kv.t
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(obj, obj2, obj3, obj4, (p0.w) obj5, ((Number) obj6).intValue());
    }

    @Override // z0.b, kv.u
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return invoke(obj, obj2, obj3, obj4, obj5, (p0.w) obj6, ((Number) obj7).intValue());
    }

    @Override // z0.b, kv.v
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, (p0.w) obj7, ((Number) obj8).intValue());
    }

    @Override // z0.b, kv.w
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, (p0.w) obj8, ((Number) obj9).intValue());
    }

    @Override // z0.b, kv.b
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (p0.w) obj9, ((Number) obj10).intValue());
    }

    @Override // z0.b, kv.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (p0.w) obj10, ((Number) obj11).intValue());
    }

    @Override // z0.b, kv.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (p0.w) obj11, ((Number) obj12).intValue(), ((Number) obj13).intValue());
    }

    @Override // z0.b, kv.f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (p0.w) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }

    @Override // z0.b, kv.g
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (p0.w) obj13, ((Number) obj14).intValue(), ((Number) obj15).intValue());
    }

    @Override // z0.b, kv.h
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (p0.w) obj14, ((Number) obj15).intValue(), ((Number) obj16).intValue());
    }

    @Override // z0.b, kv.i
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (p0.w) obj15, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    @Override // z0.b, kv.j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (p0.w) obj16, ((Number) obj17).intValue(), ((Number) obj18).intValue());
    }

    @Override // z0.b, kv.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (p0.w) obj17, ((Number) obj18).intValue(), ((Number) obj19).intValue());
    }

    @Override // z0.b, kv.m
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (p0.w) obj18, ((Number) obj19).intValue(), ((Number) obj20).intValue());
    }

    @Override // z0.b, kv.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (p0.w) obj19, ((Number) obj20).intValue(), ((Number) obj21).intValue());
    }

    public Object invoke(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = i10 | (wVarStartRestartGroup.changed(this) ? u.differentBits(0) : u.sameBits(0));
        Object obj = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.p) h1.beforeCheckcastToFunctionOfArity(obj, 2)).invoke(wVarStartRestartGroup, Integer.valueOf(iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new s(2, this, t.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8));
        }
        return objInvoke;
    }

    public Object invoke(Object obj, p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(1) : u.sameBits(1);
        Object obj2 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.q) h1.beforeCheckcastToFunctionOfArity(obj2, 3)).invoke(obj, wVarStartRestartGroup, Integer.valueOf(iDifferentBits | i10));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a(this, obj, i10, 4));
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(2) : u.sameBits(2);
        Object obj3 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.r) h1.beforeCheckcastToFunctionOfArity(obj3, 4)).invoke(obj, obj2, wVarStartRestartGroup, Integer.valueOf(iDifferentBits | i10));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.n
                @Override // kv.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    this.f97180b.invoke(obj, obj2, (p0.w) obj4, iUpdateChangedFlags);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(3) : u.sameBits(3);
        Object obj4 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.s) h1.beforeCheckcastToFunctionOfArity(obj4, 5)).invoke(obj, obj2, obj3, wVarStartRestartGroup, Integer.valueOf(iDifferentBits | i10));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.o
                @Override // kv.p
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).intValue();
                    this.f97184b.invoke(obj, obj2, obj3, (p0.w) obj5, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(4) : u.sameBits(4);
        Object obj5 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.t) h1.beforeCheckcastToFunctionOfArity(obj5, 6)).invoke(obj, obj2, obj3, obj4, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k(this, obj, obj2, obj3, obj4, i10, 1));
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(5) : u.sameBits(5);
        Object obj6 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.u) h1.beforeCheckcastToFunctionOfArity(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.r
                @Override // kv.p
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).intValue();
                    this.f97224b.invoke(obj, obj2, obj3, obj4, obj5, (p0.w) obj7, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(6) : u.sameBits(6);
        Object obj7 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.v) h1.beforeCheckcastToFunctionOfArity(obj7, 8)).invoke(obj, obj2, obj3, obj4, obj5, obj6, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.j
                @Override // kv.p
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).intValue();
                    this.f97128b.invoke(obj, obj2, obj3, obj4, obj5, obj6, (p0.w) obj8, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(7) : u.sameBits(7);
        Object obj8 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.w) h1.beforeCheckcastToFunctionOfArity(obj8, 9)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.h
                @Override // kv.p
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).intValue();
                    this.f97098b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, (p0.w) obj9, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(8) : u.sameBits(8);
        Object obj9 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.b) h1.beforeCheckcastToFunctionOfArity(obj9, 10)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.l
                @Override // kv.p
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).intValue();
                    this.f97152b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (p0.w) obj10, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, p0.w wVar, final int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(9) : u.sameBits(9);
        Object obj10 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.c) h1.beforeCheckcastToFunctionOfArity(obj10, 11)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, wVarStartRestartGroup, Integer.valueOf(i10 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.e
                @Override // kv.p
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).intValue();
                    this.f97052b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (p0.w) obj11, l3.updateChangedFlags(i10) | 1);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, p0.w wVar, final int i10, int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(10) : u.sameBits(10);
        Object obj11 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.e) h1.beforeCheckcastToFunctionOfArity(obj11, 13)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.f
                @Override // kv.p
                public final Object invoke(Object obj12, Object obj13) {
                    ((Integer) obj13).intValue();
                    int i12 = i10;
                    t tVar = this.f97064b;
                    Object obj14 = obj;
                    Object obj15 = obj2;
                    Object obj16 = obj3;
                    Object obj17 = obj4;
                    Object obj18 = obj5;
                    Object obj19 = obj6;
                    Object obj20 = obj7;
                    Object obj21 = obj8;
                    Object obj22 = obj9;
                    Object obj23 = obj10;
                    tVar.invoke(obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22, obj23, (p0.w) obj12, i12 | 1, i12);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(11) : u.sameBits(11);
        Object obj12 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.f) h1.beforeCheckcastToFunctionOfArity(obj12, 14)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return objInvoke;
        }
        o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.q
            @Override // kv.p
            public final Object invoke(Object obj13, Object obj14) {
                ((Integer) obj14).intValue();
                int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                this.f97210b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (p0.w) obj13, iUpdateChangedFlags, iUpdateChangedFlags2);
                return x0.f87415a;
            }
        });
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(12) : u.sameBits(12);
        Object obj13 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.g) h1.beforeCheckcastToFunctionOfArity(obj13, 15)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.k
                @Override // kv.p
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97137b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (p0.w) obj14, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(13) : u.sameBits(13);
        Object obj14 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.h) h1.beforeCheckcastToFunctionOfArity(obj14, 16)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.c
                @Override // kv.p
                public final Object invoke(Object obj15, Object obj16) {
                    ((Integer) obj16).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97005b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (p0.w) obj15, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(14) : u.sameBits(14);
        Object obj15 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.i) h1.beforeCheckcastToFunctionOfArity(obj15, 17)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.d
                @Override // kv.p
                public final Object invoke(Object obj16, Object obj17) {
                    ((Integer) obj17).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97032b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (p0.w) obj16, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(15) : u.sameBits(15);
        Object obj16 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.j) h1.beforeCheckcastToFunctionOfArity(obj16, 18)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.m
                @Override // kv.p
                public final Object invoke(Object obj17, Object obj18) {
                    ((Integer) obj18).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97162b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (p0.w) obj17, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(16) : u.sameBits(16);
        Object obj17 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.k) h1.beforeCheckcastToFunctionOfArity(obj17, 19)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.g
                @Override // kv.p
                public final Object invoke(Object obj18, Object obj19) {
                    ((Integer) obj19).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97076b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (p0.w) obj18, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(17) : u.sameBits(17);
        Object obj18 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.m) h1.beforeCheckcastToFunctionOfArity(obj18, 20)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.i
                @Override // kv.p
                public final Object invoke(Object obj19, Object obj20) {
                    ((Integer) obj20).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97108b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (p0.w) obj19, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }

    public Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, final Object obj18, p0.w wVar, final int i10, final int i11) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(this.f97231b);
        a(wVarStartRestartGroup);
        int iDifferentBits = wVarStartRestartGroup.changed(this) ? u.differentBits(18) : u.sameBits(18);
        Object obj19 = this.f97233e;
        kotlin.jvm.internal.e0.checkNotNull(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"p9\")] kotlin.Any?, @[ParameterName(name = \"p10\")] kotlin.Any?, @[ParameterName(name = \"p11\")] kotlin.Any?, @[ParameterName(name = \"p12\")] kotlin.Any?, @[ParameterName(name = \"p13\")] kotlin.Any?, @[ParameterName(name = \"p14\")] kotlin.Any?, @[ParameterName(name = \"p15\")] kotlin.Any?, @[ParameterName(name = \"p16\")] kotlin.Any?, @[ParameterName(name = \"p17\")] kotlin.Any?, @[ParameterName(name = \"p18\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, @[ParameterName(name = \"changed1\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((kv.n) h1.beforeCheckcastToFunctionOfArity(obj19, 21)).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, wVarStartRestartGroup, Integer.valueOf(i10), Integer.valueOf(i11 | iDifferentBits));
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: z0.p
                @Override // kv.p
                public final Object invoke(Object obj20, Object obj21) {
                    ((Integer) obj21).intValue();
                    int iUpdateChangedFlags = l3.updateChangedFlags(i10) | 1;
                    int iUpdateChangedFlags2 = l3.updateChangedFlags(i11);
                    this.f97189b.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (p0.w) obj20, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return x0.f87415a;
                }
            });
        }
        return objInvoke;
    }
}
