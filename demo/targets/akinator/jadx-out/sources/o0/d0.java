package o0;

import com.vungle.ads.internal.protos.Sdk;
import j1.k0;
import j1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p0.v5;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f77317a;

    /* renamed from: b, reason: collision with root package name */
    public final v5 f77318b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.e f77319c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f77320d;

    /* renamed from: e, reason: collision with root package name */
    public f0.n f77321e;

    public d0(boolean z10, v5 rippleAlpha) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f77317a = z10;
        this.f77318b = rippleAlpha;
        this.f77319c = c0.f.Animatable$default(0.0f, 0.0f, 2, null);
        this.f77320d = new ArrayList();
    }

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m5753drawStateLayerH2RKhps(l1.i drawStateLayer, float f10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        boolean zIsNaN = Float.isNaN(f10);
        boolean z10 = this.f77317a;
        float fM5757getRippleEndRadiuscSwnlzA = zIsNaN ? r.m5757getRippleEndRadiuscSwnlzA(drawStateLayer, z10, drawStateLayer.mo5314getSizeNHjbRc()) : drawStateLayer.mo3425toPx0680j_4(f10);
        float fFloatValue = ((Number) this.f77319c.getValue()).floatValue();
        if (fFloatValue > 0.0f) {
            long jM4857copywmQWz5c$default = m0.m4857copywmQWz5c$default(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!z10) {
                l1.i.m5398drawCircleVaOC9Bg$default(drawStateLayer, jM4857copywmQWz5c$default, fM5757getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
                return;
            }
            float fM4252getWidthimpl = i1.o.m4252getWidthimpl(drawStateLayer.mo5314getSizeNHjbRc());
            float fM4249getHeightimpl = i1.o.m4249getHeightimpl(drawStateLayer.mo5314getSizeNHjbRc());
            int iM4778getIntersectrtfAjoo = k0.f68900b.m4778getIntersectrtfAjoo();
            l1.b bVar = (l1.b) drawStateLayer.getDrawContext();
            long jMo5320getSizeNHjbRc = bVar.mo5320getSizeNHjbRc();
            bVar.getCanvas().save();
            ((l1.c) bVar.getTransform()).mo5323clipRectN_I0leg(0.0f, 0.0f, fM4252getWidthimpl, fM4249getHeightimpl, iM4778getIntersectrtfAjoo);
            l1.i.m5398drawCircleVaOC9Bg$default(drawStateLayer, jM4857copywmQWz5c$default, fM5757getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
            bVar.getCanvas().restore();
            bVar.mo5321setSizeuvyYCjk(jMo5320getSizeNHjbRc);
        }
    }

    public final void handleInteraction(f0.n interaction, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        boolean z10 = interaction instanceof f0.i;
        ArrayList arrayList = this.f77320d;
        if (z10) {
            arrayList.add(interaction);
        } else if (interaction instanceof f0.j) {
            arrayList.remove(((f0.j) interaction).getEnter());
        } else if (interaction instanceof f0.d) {
            arrayList.add(interaction);
        } else if (interaction instanceof f0.e) {
            arrayList.remove(((f0.e) interaction).getFocus());
        } else if (interaction instanceof f0.b) {
            arrayList.add(interaction);
        } else if (interaction instanceof f0.c) {
            arrayList.remove(((f0.c) interaction).getStart());
        } else if (!(interaction instanceof f0.a)) {
            return;
        } else {
            arrayList.remove(((f0.a) interaction).getStart());
        }
        f0.n nVar = (f0.n) y0.lastOrNull((List) arrayList);
        if (kotlin.jvm.internal.e0.areEqual(this.f77321e, nVar)) {
            return;
        }
        if (nVar != null) {
            v5 v5Var = this.f77318b;
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b0(this, z10 ? ((i) v5Var.getValue()).getHoveredAlpha() : interaction instanceof f0.d ? ((i) v5Var.getValue()).getFocusedAlpha() : interaction instanceof f0.b ? ((i) v5Var.getValue()).getDraggedAlpha() : 0.0f, w.access$incomingStateLayerAnimationSpecFor(nVar), null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new c0(this, w.access$outgoingStateLayerAnimationSpecFor(this.f77321e), null), 3, null);
        }
        this.f77321e = nVar;
    }
}
