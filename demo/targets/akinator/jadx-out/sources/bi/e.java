package bi;

import com.google.firebase.components.ComponentRegistrar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements sj.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9561b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f9560a = i10;
        this.f9561b = obj;
    }

    @Override // sj.c
    public final Object get() {
        switch (this.f9560a) {
            case 0:
                return h.a((String) this.f9561b);
            case 1:
                return (ComponentRegistrar) this.f9561b;
            default:
                return new vj.c((com.google.firebase.g) this.f9561b);
        }
    }
}
