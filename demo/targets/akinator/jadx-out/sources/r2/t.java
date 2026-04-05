package r2;

import j1.b0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface t {
    b0 getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo6039getColor0d7_KjU();

    default t merge(t other) {
        e0.checkNotNullParameter(other, "other");
        return other.getBrush() != null ? other : getBrush() != null ? this : other.takeOrElse(new s(this));
    }

    default t takeOrElse(kv.a other) {
        e0.checkNotNullParameter(other, "other");
        return !e0.areEqual(this, r.f83722a) ? this : (t) other.invoke();
    }
}
