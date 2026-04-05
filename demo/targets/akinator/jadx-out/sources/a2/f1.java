package a2;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f3553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t tVar, kv.p pVar, int i10) {
        super(2);
        this.f3552e = tVar;
        this.f3553f = pVar;
        this.f3554g = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.f3552e, this.f3553f, wVar, this.f3554g | 1);
    }
}
