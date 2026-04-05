package a2;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l6 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6 f3722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f3723f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(o6 o6Var, kv.p pVar) {
        super(2);
        this.f3722e = o6Var;
        this.f3723f = pVar;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.f3722e.getOwner(), this.f3723f, wVar, 8);
        }
    }
}
