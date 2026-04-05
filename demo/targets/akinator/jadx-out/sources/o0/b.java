package o0;

import j1.m0;
import kotlinx.coroutines.CoroutineScope;
import p0.j2;
import p0.j4;
import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends v implements j4 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77291c;

    /* renamed from: e, reason: collision with root package name */
    public final float f77292e;

    /* renamed from: f, reason: collision with root package name */
    public final v5 f77293f;

    /* renamed from: g, reason: collision with root package name */
    public final v5 f77294g;

    /* renamed from: h, reason: collision with root package name */
    public final s f77295h;

    /* renamed from: i, reason: collision with root package name */
    public final j2 f77296i;

    /* renamed from: j, reason: collision with root package name */
    public final j2 f77297j;

    /* renamed from: k, reason: collision with root package name */
    public long f77298k;

    /* renamed from: l, reason: collision with root package name */
    public int f77299l;

    /* renamed from: m, reason: collision with root package name */
    public final a f77300m;

    public b(boolean z10, float f10, v5 v5Var, v5 v5Var2, s sVar, kotlin.jvm.internal.u uVar) {
        super(z10, v5Var2);
        this.f77291c = z10;
        this.f77292e = f10;
        this.f77293f = v5Var;
        this.f77294g = v5Var2;
        this.f77295h = sVar;
        this.f77296i = o5.mutableStateOf$default(null, null, 2, null);
        this.f77297j = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f77298k = i1.o.f59366b.m4239getZeroNHjbRc();
        this.f77299l = -1;
        this.f77300m = new a(this);
    }

    @Override // o0.v
    public void addRipple(f0.t interaction, CoroutineScope scope) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        u rippleHostView = this.f77295h.getRippleHostView(this);
        rippleHostView.m5760addRippleKOepWvA(interaction, this.f77291c, this.f77298k, this.f77299l, ((m0) this.f77293f.getValue()).m4868unboximpl(), ((i) this.f77294g.getValue()).getPressedAlpha(), this.f77300m);
        this.f77296i.setValue(rippleHostView);
    }

    @Override // o0.v, d0.t2
    public void drawIndication(l1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        this.f77298k = eVar.mo5314getSizeNHjbRc();
        float f10 = this.f77292e;
        this.f77299l = Float.isNaN(f10) ? mv.d.roundToInt(r.m5757getRippleEndRadiuscSwnlzA(eVar, this.f77291c, eVar.mo5314getSizeNHjbRc())) : eVar.mo3419roundToPx0680j_4(f10);
        long jM4868unboximpl = ((m0) this.f77293f.getValue()).m4868unboximpl();
        float pressedAlpha = ((i) this.f77294g.getValue()).getPressedAlpha();
        eVar.drawContent();
        m5762drawStateLayerH2RKhps(eVar, f10, jM4868unboximpl);
        j1.e0 canvas = ((l1.b) eVar.getDrawContext()).getCanvas();
        ((Boolean) this.f77297j.getValue()).booleanValue();
        u uVar = (u) this.f77296i.getValue();
        if (uVar != null) {
            uVar.m5761updateRipplePropertiesbiQXAtU(eVar.mo5314getSizeNHjbRc(), this.f77299l, jM4868unboximpl, pressedAlpha);
            uVar.draw(j1.d.getNativeCanvas(canvas));
        }
    }

    @Override // p0.j4
    public void onAbandoned() throws InterruptedException {
        this.f77295h.disposeRippleIfNeeded(this);
    }

    @Override // p0.j4
    public void onForgotten() throws InterruptedException {
        this.f77295h.disposeRippleIfNeeded(this);
    }

    @Override // o0.v
    public void removeRipple(f0.t interaction) throws InterruptedException {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        u uVar = (u) this.f77296i.getValue();
        if (uVar != null) {
            uVar.removeRipple();
        }
    }

    public final void resetHostView() {
        this.f77296i.setValue(null);
    }

    @Override // p0.j4
    public void onRemembered() {
    }
}
