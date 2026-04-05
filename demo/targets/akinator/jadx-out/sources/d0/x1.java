package d0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0.f f51667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51669i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0.q f51670j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(CoroutineScope coroutineScope, p0.j2 j2Var, i0.f fVar, p0.j2 j2Var2, p0.j2 j2Var3, f0.q qVar) {
        super(1);
        this.f51665e = coroutineScope;
        this.f51666f = j2Var;
        this.f51667g = fVar;
        this.f51668h = j2Var2;
        this.f51669i = j2Var3;
        this.f51670j = qVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h1.u0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(h1.u0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        boolean zIsFocused = ((h1.w0) it).isFocused();
        p0.j2 j2Var = this.f51666f;
        j2Var.setValue(Boolean.valueOf(zIsFocused));
        boolean zBooleanValue = ((Boolean) j2Var.getValue()).booleanValue();
        f0.q qVar = this.f51670j;
        p0.j2 j2Var2 = this.f51669i;
        if (!zBooleanValue) {
            BuildersKt__Builders_commonKt.launch$default(this.f51665e, null, null, new w1(qVar, j2Var2, null), 3, null);
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f51665e, null, CoroutineStart.UNDISPATCHED, new u1(this.f51667g, this.f51668h, null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(this.f51665e, null, null, new v1(qVar, j2Var2, null), 3, null);
    }
}
