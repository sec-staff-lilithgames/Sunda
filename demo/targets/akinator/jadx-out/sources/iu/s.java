package iu;

import com.ironsource.C3191e4;
import java.io.Serializable;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f68422b;

    public s(Throwable th2) {
        this.f68422b = th2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return o0.equals(this.f68422b, ((s) obj).f68422b);
        }
        return false;
    }

    public int hashCode() {
        return this.f68422b.hashCode();
    }

    public String toString() {
        return "NotificationLite.Error[" + this.f68422b + C3191e4.i.f36531e;
    }
}
