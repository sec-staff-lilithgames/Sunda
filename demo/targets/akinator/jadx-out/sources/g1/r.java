package g1;

import j1.f2;
import j1.v0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f56695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2 f56696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f56697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f56698h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f56699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(float f10, f2 f2Var, boolean z10, long j10, long j11) {
        super(1);
        this.f56695e = f10;
        this.f56696f = f2Var;
        this.f56697g = z10;
        this.f56698h = j10;
        this.f56699i = j11;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((v0) obj);
        return x0.f87415a;
    }

    public final void invoke(v0 graphicsLayer) {
        e0.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setShadowElevation(graphicsLayer.mo3425toPx0680j_4(this.f56695e));
        graphicsLayer.setShape(this.f56696f);
        graphicsLayer.setClip(this.f56697g);
        graphicsLayer.mo4664setAmbientShadowColor8_81llA(this.f56698h);
        graphicsLayer.mo4665setSpotShadowColor8_81llA(this.f56699i);
    }
}
