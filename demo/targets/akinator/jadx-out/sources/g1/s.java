package g1;

import a2.t3;
import a2.w3;
import e1.t;
import e1.v;
import j1.f2;
import j1.m0;
import j1.u0;
import j1.w0;
import j1.y1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f56700e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f2 f56701f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f56702g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f56703h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f56704i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, f2 f2Var, boolean z10, long j10, long j11) {
            super(1);
            this.f56700e = f10;
            this.f56701f = f2Var;
            this.f56702g = z10;
            this.f56703h = j10;
            this.f56704i = j11;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            e3.g.g(this.f56700e, a.b.b(w3Var, "$this$null", "shadow"), "elevation", w3Var).set("shape", this.f56701f);
            com.google.android.gms.internal.play_billing.a.d(this.f56702g, w3Var.getProperties(), "clip", w3Var).set("ambientColor", m0.m4848boximpl(this.f56703h));
            w3Var.getProperties().set("spotColor", m0.m4848boximpl(this.f56704i));
        }
    }

    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final v m3937shadows4CzXII(v shadow, float f10, f2 shape, boolean z10, long j10, long j11) {
        e0.checkNotNullParameter(shadow, "$this$shadow");
        e0.checkNotNullParameter(shape, "shape");
        if (s2.i.m6816compareTo0680j_4(f10, s2.i.m6817constructorimpl(0)) > 0 || z10) {
            return t3.inspectableWrapper(shadow, t3.isDebugInspectorInfoEnabled() ? new a(f10, shape, z10, j10, j11) : t3.getNoInspectorInfo(), u0.graphicsLayer(t.f53496b, new r(f10, shape, z10, j10, j11)));
        }
        return shadow;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ v m3938shadows4CzXII$default(v vVar, float f10, f2 f2Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        f2 rectangleShape = (i10 & 2) != 0 ? y1.getRectangleShape() : f2Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (s2.i.m6816compareTo0680j_4(f10, s2.i.m6817constructorimpl(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return m3937shadows4CzXII(vVar, f10, rectangleShape, z11, (i10 & 8) != 0 ? w0.getDefaultShadowColor() : j10, (i10 & 16) != 0 ? w0.getDefaultShadowColor() : j11);
    }

    @tu.f
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ v m3939shadowziNgDLE(v shadow, float f10, f2 shape, boolean z10) {
        e0.checkNotNullParameter(shadow, "$this$shadow");
        e0.checkNotNullParameter(shape, "shape");
        return m3937shadows4CzXII(shadow, f10, shape, z10, w0.getDefaultShadowColor(), w0.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ v m3940shadowziNgDLE$default(v vVar, float f10, f2 f2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f2Var = y1.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (s2.i.m6816compareTo0680j_4(f10, s2.i.m6817constructorimpl(0)) > 0) {
                z10 = true;
            }
        }
        return m3939shadowziNgDLE(vVar, f10, f2Var, z10);
    }
}
