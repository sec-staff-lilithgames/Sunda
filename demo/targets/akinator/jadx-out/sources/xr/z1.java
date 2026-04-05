package xr;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class z1 extends f {

    /* renamed from: h, reason: collision with root package name */
    public static final s1 f93277h = new s1();

    /* renamed from: i, reason: collision with root package name */
    public static final t1 f93278i = new t1();

    /* renamed from: j, reason: collision with root package name */
    public static final u1 f93279j = new u1();

    /* renamed from: k, reason: collision with root package name */
    public static final v1 f93280k = new v1();

    /* renamed from: l, reason: collision with root package name */
    public static final w1 f93281l = new w1();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f93282b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayDeque f93283c;

    /* renamed from: e, reason: collision with root package name */
    public int f93284e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f93285f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93286g;

    public z1(int i10) {
        this.f93285f = new ArrayDeque(2);
        this.f93282b = new ArrayDeque(i10);
    }

    public void addBuffer(ab abVar) {
        boolean z10 = this.f93286g;
        ArrayDeque arrayDeque = this.f93282b;
        boolean z11 = z10 && arrayDeque.isEmpty();
        if (abVar instanceof z1) {
            z1 z1Var = (z1) abVar;
            ArrayDeque arrayDeque2 = z1Var.f93282b;
            while (!arrayDeque2.isEmpty()) {
                arrayDeque.add((ab) arrayDeque2.remove());
            }
            this.f93284e += z1Var.f93284e;
            z1Var.f93284e = 0;
            z1Var.close();
        } else {
            arrayDeque.add(abVar);
            this.f93284e = abVar.readableBytes() + this.f93284e;
        }
        if (z11) {
            ((ab) arrayDeque.peek()).mark();
        }
    }

    @Override // xr.f, xr.ab
    public boolean byteBufferSupported() {
        Iterator it = this.f93282b.iterator();
        while (it.hasNext()) {
            if (!((ab) it.next()).byteBufferSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // xr.f, xr.ab, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (true) {
            ArrayDeque arrayDeque = this.f93282b;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((ab) arrayDeque.remove()).close();
            }
        }
        if (this.f93283c != null) {
            while (!this.f93283c.isEmpty()) {
                ((ab) this.f93283c.remove()).close();
            }
        }
    }

    public final void d() {
        boolean z10 = this.f93286g;
        ArrayDeque arrayDeque = this.f93282b;
        if (!z10) {
            ((ab) arrayDeque.remove()).close();
            return;
        }
        this.f93283c.add((ab) arrayDeque.remove());
        ab abVar = (ab) arrayDeque.peek();
        if (abVar != null) {
            abVar.mark();
        }
    }

    public final int e(y1 y1Var, int i10, Object obj, int i11) throws IOException {
        a(i10);
        ArrayDeque arrayDeque = this.f93282b;
        if (!arrayDeque.isEmpty() && ((ab) arrayDeque.peek()).readableBytes() == 0) {
            d();
        }
        while (i10 > 0 && !arrayDeque.isEmpty()) {
            ab abVar = (ab) arrayDeque.peek();
            int iMin = Math.min(i10, abVar.readableBytes());
            i11 = y1Var.read(abVar, iMin, obj, i11);
            i10 -= iMin;
            this.f93284e -= iMin;
            if (((ab) arrayDeque.peek()).readableBytes() == 0) {
                d();
            }
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    @Override // xr.f, xr.ab
    public ByteBuffer getByteBuffer() {
        ArrayDeque arrayDeque = this.f93282b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        return ((ab) arrayDeque.peek()).getByteBuffer();
    }

    @Override // xr.f, xr.ab
    public void mark() {
        ArrayDeque arrayDeque = this.f93283c;
        ArrayDeque arrayDeque2 = this.f93282b;
        if (arrayDeque == null) {
            this.f93283c = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f93283c.isEmpty()) {
            ((ab) this.f93283c.remove()).close();
        }
        this.f93286g = true;
        ab abVar = (ab) arrayDeque2.peek();
        if (abVar != null) {
            abVar.mark();
        }
    }

    @Override // xr.f, xr.ab
    public boolean markSupported() {
        Iterator it = this.f93282b.iterator();
        while (it.hasNext()) {
            if (!((ab) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // xr.f, xr.ab
    public void readBytes(byte[] bArr, int i10, int i11) {
        try {
            e(f93279j, i11, bArr, i10);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // xr.f, xr.ab
    public int readUnsignedByte() {
        try {
            return e(f93277h, 1, null, 0);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // xr.f, xr.ab
    public int readableBytes() {
        return this.f93284e;
    }

    @Override // xr.f, xr.ab
    public void reset() {
        if (!this.f93286g) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f93282b;
        ab abVar = (ab) arrayDeque.peek();
        if (abVar != null) {
            int i10 = abVar.readableBytes();
            abVar.reset();
            this.f93284e = (abVar.readableBytes() - i10) + this.f93284e;
        }
        while (true) {
            ab abVar2 = (ab) this.f93283c.pollLast();
            if (abVar2 == null) {
                return;
            }
            abVar2.reset();
            arrayDeque.addFirst(abVar2);
            this.f93284e = abVar2.readableBytes() + this.f93284e;
        }
    }

    @Override // xr.f, xr.ab
    public void skipBytes(int i10) {
        try {
            e(f93278i, i10, null, 0);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // xr.f, xr.ab
    public /* bridge */ /* synthetic */ void touch() {
        super.touch();
    }

    public z1() {
        this.f93285f = new ArrayDeque(2);
        this.f93282b = new ArrayDeque();
    }

    @Override // xr.f, xr.ab
    public void readBytes(ByteBuffer byteBuffer) {
        try {
            e(f93280k, byteBuffer.remaining(), byteBuffer, 0);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // xr.f, xr.ab
    public void readBytes(OutputStream outputStream, int i10) throws IOException {
        e(f93281l, i10, outputStream, 0);
    }

    public void readBytes(z1 z1Var, int i10) {
        a(i10);
        this.f93284e -= i10;
        while (i10 > 0) {
            ArrayDeque arrayDeque = this.f93285f;
            ab abVar = (ab) arrayDeque.peek();
            if (abVar.readableBytes() > i10) {
                z1Var.addBuffer(abVar.readBytes(i10));
                i10 = 0;
            } else {
                z1Var.addBuffer((ab) arrayDeque.poll());
                i10 -= abVar.readableBytes();
            }
        }
    }

    @Override // xr.f, xr.ab
    public ab readBytes(int i10) {
        ab bytes;
        int i11;
        ab bytes2;
        if (i10 <= 0) {
            return fb.empty();
        }
        a(i10);
        this.f93284e -= i10;
        ab abVar = null;
        z1 z1Var = null;
        while (true) {
            ArrayDeque arrayDeque = this.f93282b;
            ab abVar2 = (ab) arrayDeque.peek();
            int i12 = abVar2.readableBytes();
            if (i12 > i10) {
                bytes2 = abVar2.readBytes(i10);
                i11 = 0;
            } else {
                if (this.f93286g) {
                    bytes = abVar2.readBytes(i12);
                    d();
                } else {
                    bytes = (ab) arrayDeque.poll();
                }
                ab abVar3 = bytes;
                i11 = i10 - i12;
                bytes2 = abVar3;
            }
            if (abVar == null) {
                abVar = bytes2;
            } else {
                if (z1Var == null) {
                    z1Var = new z1(i11 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    z1Var.addBuffer(abVar);
                    abVar = z1Var;
                }
                z1Var.addBuffer(bytes2);
            }
            if (i11 <= 0) {
                return abVar;
            }
            i10 = i11;
        }
    }
}
