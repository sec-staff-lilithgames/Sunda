package n6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f75782c;

    public /* synthetic */ t(AtomicBoolean atomicBoolean, int i10) {
        this.f75781b = i10;
        this.f75782c = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75781b) {
            case 0:
                this.f75782c.set(true);
                break;
            default:
                this.f75782c.set(true);
                break;
        }
    }
}
