package w8;

import j9.q;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f90460b;

    public c(Object obj) {
        this.f90460b = q.checkNotNull(obj);
    }

    @Override // p8.v0
    public final Object get() {
        return this.f90460b;
    }

    @Override // p8.v0
    public Class<Object> getResourceClass() {
        return this.f90460b.getClass();
    }

    @Override // p8.v0
    public final int getSize() {
        return 1;
    }

    @Override // p8.v0
    public void recycle() {
    }
}
