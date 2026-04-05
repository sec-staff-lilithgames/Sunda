package dd;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public t f51997a;

    /* renamed from: b, reason: collision with root package name */
    public t f51998b;

    /* renamed from: c, reason: collision with root package name */
    public int f51999c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f52000d;

    public final void a(Object[] objArr, int i10, int i11, Object obj) {
        int i12 = 0;
        for (t next = this.f51997a; next != null; next = next.next()) {
            Object[] objArr2 = (Object[]) next.value();
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 != i10) {
            throw new IllegalStateException(w0.i.a(i10, i13, "Should have gotten ", " entries, got "));
        }
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        t tVar = new t(objArr, null);
        if (this.f51997a == null) {
            this.f51998b = tVar;
            this.f51997a = tVar;
        } else {
            this.f51998b.linkNext(tVar);
            this.f51998b = tVar;
        }
        int length = objArr.length;
        this.f51999c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final void b() {
        t tVar = this.f51998b;
        if (tVar != null) {
            this.f52000d = (Object[]) tVar.value();
        }
        this.f51998b = null;
        this.f51997a = null;
        this.f51999c = 0;
    }

    public int bufferedSize() {
        return this.f51999c;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i10) {
        int i11 = this.f51999c + i10;
        Object[] objArr2 = new Object[i11];
        a(objArr, i11, i10, objArr2);
        b();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this.f52000d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        b();
        Object[] objArr = this.f52000d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f52000d = objArr2;
        return objArr2;
    }

    public Object[] resetAndStart(Object[] objArr, int i10) {
        b();
        Object[] objArr2 = this.f52000d;
        if (objArr2 == null || objArr2.length < i10) {
            this.f52000d = new Object[Math.max(12, i10)];
        }
        System.arraycopy(objArr, 0, this.f52000d, 0, i10);
        return this.f52000d;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i10, Class<T> cls) {
        int i11 = this.f51999c + i10;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
        a(objArr, i11, i10, tArr);
        b();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i10, List<Object> list) {
        int i11;
        t next = this.f51997a;
        while (true) {
            i11 = 0;
            if (next == null) {
                break;
            }
            Object[] objArr2 = (Object[]) next.value();
            int length = objArr2.length;
            while (i11 < length) {
                list.add(objArr2[i11]);
                i11++;
            }
            next = next.next();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
        b();
    }
}
