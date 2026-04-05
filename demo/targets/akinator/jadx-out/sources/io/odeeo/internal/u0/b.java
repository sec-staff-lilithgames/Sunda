package io.odeeo.internal.u0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b<T> extends q3<T> {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0656b f66523a = EnumC0656b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public T f66524b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66525a;

        static {
            int[] iArr = new int[EnumC0656b.values().length];
            f66525a = iArr;
            try {
                iArr[EnumC0656b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66525a[EnumC0656b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.u0.b$b, reason: collision with other inner class name */
    public enum EnumC0656b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public final T a() {
        this.f66523a = EnumC0656b.DONE;
        return null;
    }

    public final boolean b() {
        this.f66523a = EnumC0656b.FAILED;
        this.f66524b = computeNext();
        if (this.f66523a == EnumC0656b.DONE) {
            return false;
        }
        this.f66523a = EnumC0656b.READY;
        return true;
    }

    public abstract T computeNext();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        io.odeeo.internal.t0.u.checkState(this.f66523a != EnumC0656b.FAILED);
        int i10 = a.f66525a[this.f66523a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return b();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f66523a = EnumC0656b.NOT_READY;
        T t10 = this.f66524b;
        this.f66524b = null;
        return t10;
    }

    public final T peek() {
        if (hasNext()) {
            return this.f66524b;
        }
        throw new NoSuchElementException();
    }
}
