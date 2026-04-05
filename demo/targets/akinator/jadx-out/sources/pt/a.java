package pt;

import iu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81819b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(obj);
        this.f81819b = i10;
    }

    @Override // pt.f
    public final void a(Object obj) {
        switch (this.f81819b) {
            case 0:
                try {
                    ((st.a) obj).run();
                    return;
                } catch (Throwable th2) {
                    throw m.wrapOrThrow(th2);
                }
            default:
                ((tw.d) obj).cancel();
                return;
        }
    }
}
