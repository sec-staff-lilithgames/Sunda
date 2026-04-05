package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x3 implements r3 {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f3883b;

    /* renamed from: c, reason: collision with root package name */
    public w3 f3884c;

    public x3(kv.l info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        this.f3883b = info;
    }

    public final w3 a() {
        w3 w3Var = this.f3884c;
        if (w3Var == null) {
            w3Var = new w3();
            this.f3883b.invoke(w3Var);
        }
        this.f3884c = w3Var;
        return w3Var;
    }

    @Override // a2.r3
    public rv.t getInspectableElements() {
        return a().getProperties();
    }

    @Override // a2.r3
    public String getNameFallback() {
        return a().getName();
    }

    @Override // a2.r3
    public Object getValueOverride() {
        return a().getValue();
    }
}
