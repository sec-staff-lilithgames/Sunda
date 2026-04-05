package eu;

import iu.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import vt.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends AtomicReferenceArray implements n {

    /* renamed from: h, reason: collision with root package name */
    public static final Integer f55137h = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: b, reason: collision with root package name */
    public final int f55138b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f55139c;

    /* renamed from: e, reason: collision with root package name */
    public long f55140e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f55141f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55142g;

    public c(int i10) {
        super(x.roundToPowerOfTwo(i10));
        this.f55138b = length() - 1;
        this.f55139c = new AtomicLong();
        this.f55141f = new AtomicLong();
        this.f55142g = Math.min(i10 / 4, f55137h.intValue());
    }

    @Override // vt.n, vt.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // vt.n, vt.o
    public boolean isEmpty() {
        return this.f55139c.get() == this.f55141f.get();
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f55139c;
        long j10 = atomicLong.get();
        int i10 = this.f55138b;
        int i11 = ((int) j10) & i10;
        if (j10 >= this.f55140e) {
            long j11 = this.f55142g + j10;
            if (get(i10 & ((int) j11)) == null) {
                this.f55140e = j11;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, obj);
        atomicLong.lazySet(j10 + 1);
        return true;
    }

    @Override // vt.n, vt.o
    public Object poll() {
        AtomicLong atomicLong = this.f55141f;
        long j10 = atomicLong.get();
        int i10 = ((int) j10) & this.f55138b;
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j10 + 1);
        lazySet(i10, null);
        return obj;
    }

    @Override // vt.n, vt.o
    public boolean offer(Object obj, Object obj2) {
        return offer(obj) && offer(obj2);
    }
}
