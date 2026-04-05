package pf;

import android.os.Bundle;
import bf.m1;
import com.google.android.exoplayer2.util.n1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements com.google.android.exoplayer2.i {

    /* renamed from: e, reason: collision with root package name */
    public static final String f81134e = n1.intToStringMaxRadix(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f81135f = n1.intToStringMaxRadix(1);

    /* renamed from: g, reason: collision with root package name */
    public static final pe.a f81136g = new pe.a(2);

    /* renamed from: b, reason: collision with root package name */
    public final m1 f81137b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f81138c;

    public q(m1 m1Var, int i10) {
        this(m1Var, b5.of(Integer.valueOf(i10)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f81137b.equals(qVar.f81137b) && this.f81138c.equals(qVar.f81138c)) {
                return true;
            }
        }
        return false;
    }

    public int getType() {
        return this.f81137b.f9334e;
    }

    public int hashCode() {
        return (this.f81138c.hashCode() * 31) + this.f81137b.hashCode();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f81134e, this.f81137b.toBundle());
        bundle.putIntArray(f81135f, rh.w.toArray(this.f81138c));
        return bundle;
    }

    public q(m1 m1Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m1Var.f9332b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f81137b = m1Var;
        this.f81138c = b5.copyOf((Collection) list);
    }
}
