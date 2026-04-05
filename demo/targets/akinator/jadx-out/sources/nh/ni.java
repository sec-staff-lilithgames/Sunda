package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ni implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76515b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76516c;

    public ni(Object obj, Object obj2) {
        this.f76515b = mh.p1.checkNotNull(obj);
        this.f76516c = obj2 == null ? this : obj2;
    }

    public String toString() {
        String string;
        synchronized (this.f76516c) {
            string = this.f76515b.toString();
        }
        return string;
    }
}
