package ci;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f12356c;

    public /* synthetic */ o(Runnable runnable, int i10) {
        this.f12355b = i10;
        this.f12356c = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12355b) {
            case 0:
                this.f12356c.run();
                break;
            default:
                this.f12356c.run();
                break;
        }
        return null;
    }
}
