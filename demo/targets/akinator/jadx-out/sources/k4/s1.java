package k4;

import k4.i2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f70506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(q1 q1Var) {
        super(0);
        this.f70506e = q1Var;
    }

    @Override // kv.a
    public final i2 invoke() {
        i2.a aVar = i2.f70366b;
        aVar.loadLib();
        return aVar.create$datastore_core_release(new r1(this.f70506e));
    }
}
