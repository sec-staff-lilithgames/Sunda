package o5;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f77586b;

    public h0(f0 f0Var) {
        this.f77586b = f0Var;
    }

    @Override // o5.r, o5.s
    public void onInvalidation(String[] tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        f0 f0Var = this.f77586b;
        BuildersKt__Builders_commonKt.launch$default(f0Var.f77550d, null, null, new g0(tables, f0Var, null), 3, null);
    }
}
