package n6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f75784c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.j f75785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.a f75786f;

    public /* synthetic */ u(AtomicBoolean atomicBoolean, w2.j jVar, kv.a aVar, int i10) {
        this.f75783b = i10;
        this.f75784c = atomicBoolean;
        this.f75785e = jVar;
        this.f75786f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75783b) {
            case 0:
                w2.j jVar = this.f75785e;
                kv.a aVar = this.f75786f;
                if (!this.f75784c.get()) {
                    try {
                        jVar.set(aVar.invoke());
                        break;
                    } catch (Throwable th2) {
                        jVar.setException(th2);
                        return;
                    }
                }
                break;
            default:
                w2.j jVar2 = this.f75785e;
                kv.a aVar2 = this.f75786f;
                if (!this.f75784c.get()) {
                    try {
                        jVar2.set(aVar2.invoke());
                        break;
                    } catch (Throwable th3) {
                        jVar2.setException(th3);
                    }
                }
                break;
        }
    }
}
