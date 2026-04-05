package rh;

import java.io.Serializable;
import mh.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends q0 implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final u f84394c = new u();

    @Override // mh.q0
    public final Object d(Object obj) {
        return ((Integer) obj).toString();
    }

    @Override // mh.q0
    public final Object e(Object obj) {
        return Integer.decode((String) obj);
    }

    public String toString() {
        return "Ints.stringConverter()";
    }
}
