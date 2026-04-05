package ci;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f12358c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12359e;

    public /* synthetic */ p(int i10, Object obj, Runnable runnable) {
        this.f12357b = i10;
        this.f12358c = runnable;
        this.f12359e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12357b) {
            case 0:
                this.f12358c.run();
                break;
            default:
                this.f12358c.run();
                break;
        }
        return this.f12359e;
    }
}
