package tu;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f87416b;

    public y(Throwable exception) {
        kotlin.jvm.internal.e0.checkNotNullParameter(exception, "exception");
        this.f87416b = exception;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            return kotlin.jvm.internal.e0.areEqual(this.f87416b, ((y) obj).f87416b);
        }
        return false;
    }

    public int hashCode() {
        return this.f87416b.hashCode();
    }

    public String toString() {
        return "Failure(" + this.f87416b + ')';
    }
}
