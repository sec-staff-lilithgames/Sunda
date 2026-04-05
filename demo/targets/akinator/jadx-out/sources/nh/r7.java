package nh;

import java.util.Enumeration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r7 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Enumeration f76600b;

    public r7(Enumeration enumeration) {
        this.f76600b = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76600b.hasMoreElements();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f76600b.nextElement();
    }
}
