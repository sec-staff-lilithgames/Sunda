package d0;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e2.t0 f51678a = new e2.t0("MagnifierPositionInRoot", null, 2, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f51679e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.l f51680f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f51681g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k3 f51682h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar, kv.l lVar2, float f10, k3 k3Var) {
            super(1);
            this.f51679e = lVar;
            this.f51680f = lVar2;
            this.f51681g = f10;
            this.f51682h = k3Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a2.w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(a2.w3 w3Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(w3Var, "$this$null");
            w3Var.setName(y2.isPlatformMagnifierSupported$default(0, 1, null) ? "magnifier" : "magnifier (not supported)");
            w3Var.getProperties().set("sourceCenter", this.f51679e);
            w3Var.getProperties().set("magnifierCenter", this.f51680f);
            w3Var.getProperties().set("zoom", Float.valueOf(this.f51681g));
            w3Var.getProperties().set(TtmlNode.TAG_STYLE, this.f51682h);
        }
    }

    public static final e2.t0 getMagnifierPositionInRoot() {
        return f51678a;
    }

    public static final boolean isPlatformMagnifierSupported(int i10) {
        return i10 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i10);
    }

    public static final e1.v magnifier(e1.v vVar, kv.l sourceCenter, kv.l magnifierCenter, float f10, k3 style, kv.l lVar, y3 platformMagnifierFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformMagnifierFactory, "platformMagnifierFactory");
        return e1.o.composed$default(vVar, null, new j3(sourceCenter, magnifierCenter, f10, lVar, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ e1.v magnifier$default(e1.v vVar, kv.l lVar, kv.l lVar2, float f10, k3 k3Var, kv.l lVar3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = z2.f51694e;
        }
        kv.l lVar4 = lVar2;
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            k3Var = k3.f51464g.getDefault();
        }
        k3 k3Var2 = k3Var;
        if ((i10 & 16) != 0) {
            lVar3 = null;
        }
        return magnifier(vVar, lVar, lVar4, f11, k3Var2, lVar3);
    }

    public static final e1.v magnifier(e1.v vVar, kv.l sourceCenter, kv.l magnifierCenter, float f10, k3 style, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sourceCenter, "sourceCenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kv.l aVar = a2.t3.isDebugInspectorInfoEnabled() ? new a(sourceCenter, magnifierCenter, f10, style) : a2.t3.getNoInspectorInfo();
        boolean zIsPlatformMagnifierSupported$default = isPlatformMagnifierSupported$default(0, 1, null);
        e1.v vVarMagnifier = e1.t.f53496b;
        if (zIsPlatformMagnifierSupported$default) {
            vVarMagnifier = magnifier(vVarMagnifier, sourceCenter, magnifierCenter, f10, style, lVar, x3.f51672a.getForCurrentPlatform());
        }
        return a2.t3.inspectableWrapper(vVar, aVar, vVarMagnifier);
    }
}
