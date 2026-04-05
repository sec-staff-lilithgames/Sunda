package u8;

import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Queue f88084d = j9.s.createQueue(0);

    /* renamed from: a, reason: collision with root package name */
    public int f88085a;

    /* renamed from: b, reason: collision with root package name */
    public int f88086b;

    /* renamed from: c, reason: collision with root package name */
    public Object f88087c;

    public static i0 a(int i10, int i11, Object obj) {
        i0 i0Var;
        Queue queue = f88084d;
        synchronized (queue) {
            i0Var = (i0) queue.poll();
        }
        if (i0Var == null) {
            i0Var = new i0();
        }
        i0Var.f88087c = obj;
        i0Var.f88086b = i10;
        i0Var.f88085a = i11;
        return i0Var;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f88086b == i0Var.f88086b && this.f88085a == i0Var.f88085a && this.f88087c.equals(i0Var.f88087c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f88087c.hashCode() + (((this.f88085a * 31) + this.f88086b) * 31);
    }

    public void release() {
        Queue queue = f88084d;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
