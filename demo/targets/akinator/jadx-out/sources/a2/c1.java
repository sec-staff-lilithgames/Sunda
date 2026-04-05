package a2;

import android.content.res.Configuration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f3467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p0.j2 j2Var) {
        super(1);
        this.f3467e = j2Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Configuration it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f3467e.setValue(it);
    }
}
