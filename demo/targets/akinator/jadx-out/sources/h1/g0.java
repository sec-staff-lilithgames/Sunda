package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f58555b;

    public g0(kv.l focusOrderReceiver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        this.f58555b = focusOrderReceiver;
    }

    public final kv.l getFocusOrderReceiver() {
        return this.f58555b;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h0) obj);
        return tu.x0.f87415a;
    }

    public void invoke(h0 focusProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusProperties, "focusProperties");
        this.f58555b.invoke(new c0(focusProperties));
    }
}
