package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o7 extends vi {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f76524c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.v0 f76525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(Iterator it, mh.v0 v0Var, int i10) {
        super(it);
        this.f76524c = i10;
        this.f76525e = v0Var;
    }

    @Override // nh.vi
    public final Object a(Object obj) {
        switch (this.f76524c) {
            case 0:
                return this.f76525e.apply(obj);
            default:
                return ec.immutableEntry(obj, this.f76525e.apply(obj));
        }
    }
}
