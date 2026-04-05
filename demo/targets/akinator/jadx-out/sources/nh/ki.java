package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ki extends ei implements ud {

    /* renamed from: e, reason: collision with root package name */
    public transient pi f76430e;

    /* renamed from: f, reason: collision with root package name */
    public transient pi f76431f;

    @Override // nh.ud
    public int add(Object obj, int i10) {
        int iAdd;
        synchronized (this.f76516c) {
            iAdd = c().add(obj, i10);
        }
        return iAdd;
    }

    @Override // nh.ud
    public int count(Object obj) {
        int iCount;
        synchronized (this.f76516c) {
            iCount = c().count(obj);
        }
        return iCount;
    }

    @Override // nh.ei
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ud c() {
        return (ud) ((Collection) this.f76515b);
    }

    @Override // nh.ud
    public Set<Object> elementSet() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76430e == null) {
                    this.f76430e = jh.i.b(c().elementSet(), this.f76516c);
                }
                piVar = this.f76430e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    @Override // nh.ud
    public Set<td> entrySet() {
        pi piVar;
        synchronized (this.f76516c) {
            try {
                if (this.f76431f == null) {
                    this.f76431f = jh.i.b(c().entrySet(), this.f76516c);
                }
                piVar = this.f76431f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return piVar;
    }

    @Override // java.util.Collection, nh.ud
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76516c) {
            zEquals = c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, nh.ud
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    @Override // nh.ud
    public int remove(Object obj, int i10) {
        int iRemove;
        synchronized (this.f76516c) {
            iRemove = c().remove(obj, i10);
        }
        return iRemove;
    }

    @Override // nh.ud
    public int setCount(Object obj, int i10) {
        int count;
        synchronized (this.f76516c) {
            count = c().setCount(obj, i10);
        }
        return count;
    }

    @Override // nh.ud
    public boolean setCount(Object obj, int i10, int i11) {
        boolean count;
        synchronized (this.f76516c) {
            count = c().setCount(obj, i10, i11);
        }
        return count;
    }
}
