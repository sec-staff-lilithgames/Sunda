package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f53605e = new q0();

    public q0() {
        super(2);
    }

    @Override // kv.p
    public final a invoke(a aVar, a childValue) {
        String label;
        tu.i action;
        kotlin.jvm.internal.e0.checkNotNullParameter(childValue, "childValue");
        if (aVar == null || (label = aVar.getLabel()) == null) {
            label = childValue.getLabel();
        }
        if (aVar == null || (action = aVar.getAction()) == null) {
            action = childValue.getAction();
        }
        return new a(label, action);
    }
}
