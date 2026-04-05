package xr;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class sc {

    /* renamed from: a, reason: collision with root package name */
    public final int f92994a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92995b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92996c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f92997d;

    public sc(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f92997d = atomicInteger;
        this.f92996c = (int) (f11 * 1000.0f);
        int i10 = (int) (f10 * 1000.0f);
        this.f92994a = i10;
        this.f92995b = i10 / 2;
        atomicInteger.set(i10);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.f92997d;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 - 1000;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        return i11 > this.f92995b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return this.f92994a == scVar.f92994a && this.f92996c == scVar.f92996c;
    }

    public int hashCode() {
        return mh.h1.hashCode(Integer.valueOf(this.f92994a), Integer.valueOf(this.f92996c));
    }
}
