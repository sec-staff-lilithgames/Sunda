package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f58623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar) {
        super(0);
        this.f58623e = sVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m4143invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4143invoke() {
        x0.sendOnFocusEvent(this.f58623e);
    }
}
