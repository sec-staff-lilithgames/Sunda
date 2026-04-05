package b1;

import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.l f8700c;

    public /* synthetic */ x(int i10, kv.l lVar) {
        this.f8699b = i10;
        this.f8700c = lVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f8699b) {
            case 0:
                m mVar = (m) this.f8700c.invoke((u) obj);
                synchronized (y.getLock()) {
                    y.f8705d = y.f8705d.set(mVar.getSnapshotId());
                }
                return mVar;
            case 1:
                return ExceptionsConstructorKt.safeCtor$lambda$9(this.f8700c, (Throwable) obj);
            case 2:
                kv.l lVar = this.f8700c;
                x5.d it = (x5.d) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                lVar.invoke(new o5.d(it));
                return tu.x0.f87415a;
            default:
                this.f8700c.invoke(obj);
                return obj;
        }
    }
}
