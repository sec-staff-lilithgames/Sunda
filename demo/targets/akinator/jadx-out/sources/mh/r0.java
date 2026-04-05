package mh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 extends u0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f74678c = new r0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final r0 f74679e = new r0(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74680b;

    public /* synthetic */ r0(int i10) {
        this.f74680b = i10;
    }

    @Override // mh.u0
    public final boolean a(Object obj, Object obj2) {
        switch (this.f74680b) {
            case 0:
                return obj.equals(obj2);
            default:
                return false;
        }
    }

    @Override // mh.u0
    public final int b(Object obj) {
        switch (this.f74680b) {
            case 0:
                return obj.hashCode();
            default:
                return System.identityHashCode(obj);
        }
    }
}
