package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements o, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f87386b;

    public j(Object obj) {
        this.f87386b = obj;
    }

    @Override // tu.o
    public Object getValue() {
        return this.f87386b;
    }

    @Override // tu.o
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
