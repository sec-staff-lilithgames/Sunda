package io.odeeo.internal.t0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0648b f66361a = EnumC0648b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public T f66362b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66363a;

        static {
            int[] iArr = new int[EnumC0648b.values().length];
            f66363a = iArr;
            try {
                iArr[EnumC0648b.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66363a[EnumC0648b.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.t0.b$b, reason: collision with other inner class name */
    public enum EnumC0648b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    public final T b() {
        this.f66361a = EnumC0648b.DONE;
        return null;
    }

    public final boolean c() {
        this.f66361a = EnumC0648b.FAILED;
        this.f66362b = a();
        if (this.f66361a == EnumC0648b.DONE) {
            return false;
        }
        this.f66361a = EnumC0648b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        u.checkState(this.f66361a != EnumC0648b.FAILED);
        int i10 = a.f66363a[this.f66361a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f66361a = EnumC0648b.NOT_READY;
        T t10 = this.f66362b;
        this.f66362b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
