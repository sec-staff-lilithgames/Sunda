package nh;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j7 implements Enumeration {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f76391a;

    public j7(Iterator it) {
        this.f76391a = it;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f76391a.hasNext();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return this.f76391a.next();
    }
}
