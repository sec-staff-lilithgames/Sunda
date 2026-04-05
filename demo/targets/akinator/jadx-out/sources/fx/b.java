package fx;

import mt.b0;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56296b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f56297c;

    public /* synthetic */ b(b0 b0Var, int i10) {
        this.f56296b = i10;
        this.f56297c = b0Var;
    }

    @Override // mt.b0
    public final void subscribeActual(i0 i0Var) {
        switch (this.f56296b) {
            case 0:
                this.f56297c.subscribe(new a(i0Var));
                break;
            default:
                this.f56297c.subscribe(new h(i0Var));
                break;
        }
    }
}
