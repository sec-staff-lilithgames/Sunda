package d0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51570g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0.q f51571h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z10, CoroutineScope coroutineScope, p0.j2 j2Var, f0.q qVar) {
        super(1);
        this.f51568e = z10;
        this.f51569f = coroutineScope;
        this.f51570g = j2Var;
        this.f51571h = qVar;
    }

    @Override // kv.l
    public final p0.g1 invoke(p0.h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (!this.f51568e) {
            BuildersKt__Builders_commonKt.launch$default(this.f51569f, null, null, new p1(this.f51571h, this.f51570g, null), 3, null);
        }
        return new a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p0.g1 {
        @Override // p0.g1
        public void dispose() {
        }
    }
}
