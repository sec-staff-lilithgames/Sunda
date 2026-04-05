package n1;

import p0.j2;
import p0.o4;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends m1.e {

    /* renamed from: h, reason: collision with root package name */
    public final j2 f75335h = o5.mutableStateOf$default(i1.o.m4240boximpl(i1.o.f59366b.m4239getZeroNHjbRc()), null, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public final j2 f75336i = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public final q f75337j;

    /* renamed from: k, reason: collision with root package name */
    public p0.e0 f75338k;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f75339l;

    /* renamed from: m, reason: collision with root package name */
    public float f75340m;

    /* renamed from: n, reason: collision with root package name */
    public j1.n0 f75341n;

    public c1() {
        q qVar = new q();
        qVar.setInvalidateCallback$ui_release(new b1(this));
        this.f75337j = qVar;
        this.f75339l = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f75340m = 1.0f;
    }

    public final void RenderVector$ui_release(String name, float f10, float f11, kv.r content, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1264894527);
        q qVar = this.f75337j;
        qVar.setName(name);
        qVar.setViewportWidth(f10);
        qVar.setViewportHeight(f11);
        p0.f0 f0VarRememberCompositionContext = p0.p.rememberCompositionContext(wVarStartRestartGroup, 0);
        p0.e0 e0VarComposition = this.f75338k;
        if (e0VarComposition == null || e0VarComposition.isDisposed()) {
            e0VarComposition = p0.k0.Composition(new m(qVar.getRoot()), f0VarRememberCompositionContext);
        }
        this.f75338k = e0VarComposition;
        e0VarComposition.setContent(z0.u.composableLambdaInstance(-1916507005, true, new a1(content, this)));
        p0.k1.DisposableEffect(e0VarComposition, new y0(e0VarComposition), wVarStartRestartGroup, 8);
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new z0(this, name, f10, f11, content, i10));
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f75340m = f10;
        return true;
    }

    @Override // m1.e
    public final boolean b(j1.n0 n0Var) {
        this.f75341n = n0Var;
        return true;
    }

    @Override // m1.e
    public final void d(l1.i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        j1.n0 intrinsicColorFilter$ui_release = this.f75341n;
        q qVar = this.f75337j;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = qVar.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && iVar.getLayoutDirection() == s2.x.f85364c) {
            long jMo5313getCenterF1C5BW0 = iVar.mo5313getCenterF1C5BW0();
            l1.b bVar = (l1.b) iVar.getDrawContext();
            long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
            bVar.getCanvas().save();
            ((l1.c) bVar.getTransform()).mo5327scale0AR0LA0(-1.0f, 1.0f, jMo5313getCenterF1C5BW0);
            qVar.draw(iVar, this.f75340m, intrinsicColorFilter$ui_release);
            bVar.getCanvas().restore();
            bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
        } else {
            qVar.draw(iVar, this.f75340m, intrinsicColorFilter$ui_release);
        }
        j2 j2Var = this.f75339l;
        if (((Boolean) j2Var.getValue()).booleanValue()) {
            j2Var.setValue(Boolean.FALSE);
        }
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.f75336i.getValue()).booleanValue();
    }

    public final j1.n0 getIntrinsicColorFilter$ui_release() {
        return this.f75337j.getIntrinsicColorFilter$ui_release();
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo138getIntrinsicSizeNHjbRc() {
        return m5715getSizeNHjbRc$ui_release();
    }

    /* renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m5715getSizeNHjbRc$ui_release() {
        return ((i1.o) this.f75335h.getValue()).m4257unboximpl();
    }

    public final void setAutoMirror$ui_release(boolean z10) {
        this.f75336i.setValue(Boolean.valueOf(z10));
    }

    public final void setIntrinsicColorFilter$ui_release(j1.n0 n0Var) {
        this.f75337j.setIntrinsicColorFilter$ui_release(n0Var);
    }

    /* renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m5716setSizeuvyYCjk$ui_release(long j10) {
        this.f75335h.setValue(i1.o.m4240boximpl(j10));
    }
}
