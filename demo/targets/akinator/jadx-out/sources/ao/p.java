package ao;

import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class p implements v2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f7772c;

    public /* synthetic */ p(Class cls, int i10) {
        this.f7771b = i10;
        this.f7772c = cls;
    }

    @Override // mh.v2
    public final Object get() {
        switch (this.f7771b) {
            case 0:
                try {
                    return (j0) this.f7772c.getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            default:
                try {
                    return (bf.c0) this.f7772c.getConstructor(null).newInstance(null);
                } catch (Exception e11) {
                    throw new IllegalStateException(e11);
                }
        }
    }
}
