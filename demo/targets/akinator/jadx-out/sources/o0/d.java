package o0;

import b1.i0;
import j1.m0;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p0.j4;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends v implements j4 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f77312c;

    /* renamed from: e, reason: collision with root package name */
    public final float f77313e;

    /* renamed from: f, reason: collision with root package name */
    public final v5 f77314f;

    /* renamed from: g, reason: collision with root package name */
    public final v5 f77315g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f77316h;

    public d(boolean z10, float f10, v5 v5Var, v5 v5Var2, kotlin.jvm.internal.u uVar) {
        super(z10, v5Var2);
        this.f77312c = z10;
        this.f77313e = f10;
        this.f77314f = v5Var;
        this.f77315g = v5Var2;
        this.f77316h = z4.mutableStateMapOf();
    }

    @Override // o0.v
    public void addRipple(f0.t interaction, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        i0 i0Var = this.f77316h;
        Iterator it = i0Var.entrySet().iterator();
        while (it.hasNext()) {
            ((q) ((Map.Entry) it.next()).getValue()).finish();
        }
        boolean z10 = this.f77312c;
        q qVar = new q(z10 ? i1.h.m4174boximpl(interaction.m3839getPressPositionF1C5BW0()) : null, this.f77313e, z10, null);
        i0Var.put(interaction, qVar);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new c(qVar, this, interaction, null), 3, null);
    }

    @Override // o0.v, d0.t2
    public void drawIndication(l1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        long jM4868unboximpl = ((m0) this.f77314f.getValue()).m4868unboximpl();
        eVar.drawContent();
        m5762drawStateLayerH2RKhps(eVar, this.f77313e, jM4868unboximpl);
        Iterator it = this.f77316h.entrySet().iterator();
        while (it.hasNext()) {
            q qVar = (q) ((Map.Entry) it.next()).getValue();
            float pressedAlpha = ((i) this.f77315g.getValue()).getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                qVar.m5756draw4WTKRHQ(eVar, m0.m4857copywmQWz5c$default(jM4868unboximpl, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // p0.j4
    public void onAbandoned() {
        this.f77316h.clear();
    }

    @Override // p0.j4
    public void onForgotten() {
        this.f77316h.clear();
    }

    @Override // o0.v
    public void removeRipple(f0.t interaction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        q qVar = (q) this.f77316h.get(interaction);
        if (qVar != null) {
            qVar.finish();
        }
    }

    @Override // p0.j4
    public void onRemembered() {
    }
}
