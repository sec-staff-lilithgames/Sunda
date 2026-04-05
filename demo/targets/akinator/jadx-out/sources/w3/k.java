package w3;

import java.util.Objects;
import o9.b3;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k {
    static <T> k isEqual(Object obj) {
        return obj == null ? new t(11) : new com.amazon.aps.shared.util.b(obj);
    }

    static <T> k not(k kVar) {
        Objects.requireNonNull(kVar);
        return kVar.negate();
    }

    default k and(k kVar) {
        Objects.requireNonNull(kVar);
        return new j(this, kVar, 1);
    }

    default k negate() {
        return new b3(this, 22);
    }

    default k or(k kVar) {
        Objects.requireNonNull(kVar);
        return new j(this, kVar, 0);
    }

    boolean test(Object obj);
}
