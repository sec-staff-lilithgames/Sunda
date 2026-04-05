package gn;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w1 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f58238c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f58239d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final v1 f58240a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f58241b;

    public w1(v1 v1Var, int i10) {
        this(v1Var, b5.of(Integer.valueOf(i10)));
    }

    public static w1 fromBundle(Bundle bundle) {
        return new w1(v1.fromBundle((Bundle) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getBundle(f58238c))), rh.w.asList((int[]) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getIntArray(f58239d))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w1.class == obj.getClass()) {
            w1 w1Var = (w1) obj;
            if (this.f58240a.equals(w1Var.f58240a) && this.f58241b.equals(w1Var.f58241b)) {
                return true;
            }
        }
        return false;
    }

    public int getType() {
        return this.f58240a.f58207c;
    }

    public int hashCode() {
        return (this.f58241b.hashCode() * 31) + this.f58240a.hashCode();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f58238c, this.f58240a.toBundle());
        bundle.putIntArray(f58239d, rh.w.toArray(this.f58241b));
        return bundle;
    }

    public w1(v1 v1Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= v1Var.f58205a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f58240a = v1Var;
        this.f58241b = b5.copyOf((Collection) list);
    }
}
