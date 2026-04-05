package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends OutputStream {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f6040h = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final int f6041b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6042c;

    /* renamed from: e, reason: collision with root package name */
    public int f6043e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f6044f;

    /* renamed from: g, reason: collision with root package name */
    public int f6045g;

    public v(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.f6041b = i10;
        this.f6042c = new ArrayList();
        this.f6044f = new byte[i10];
    }

    public final void a(int i10) {
        this.f6042c.add(new s(this.f6044f));
        int length = this.f6043e + this.f6044f.length;
        this.f6043e = length;
        this.f6044f = new byte[Math.max(this.f6041b, Math.max(i10, length >>> 1))];
        this.f6045g = 0;
    }

    public final void d() {
        int i10 = this.f6045g;
        byte[] bArr = this.f6044f;
        int length = bArr.length;
        ArrayList arrayList = this.f6042c;
        if (i10 >= length) {
            arrayList.add(new s(this.f6044f));
            this.f6044f = f6040h;
        } else if (i10 > 0) {
            arrayList.add(new s(Arrays.copyOf(bArr, i10)));
        }
        this.f6043e += this.f6045g;
        this.f6045g = 0;
    }

    public synchronized void reset() {
        this.f6042c.clear();
        this.f6043e = 0;
        this.f6045g = 0;
    }

    public synchronized int size() {
        return this.f6043e + this.f6045g;
    }

    public synchronized x toByteString() {
        d();
        return x.copyFrom(this.f6042c);
    }

    public String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i10) {
        try {
            if (this.f6045g == this.f6044f.length) {
                a(1);
            }
            byte[] bArr = this.f6044f;
            int i11 = this.f6045g;
            this.f6045g = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int i10;
        x[] xVarArr;
        byte[] bArr;
        int i11;
        synchronized (this) {
            xVarArr = (x[]) this.f6042c.toArray(new x[0]);
            bArr = this.f6044f;
            i11 = this.f6045g;
        }
        for (x xVar : xVarArr) {
            xVar.writeTo(outputStream);
        }
        outputStream.write(Arrays.copyOf(bArr, i11));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f6044f;
            int length = bArr2.length;
            int i12 = this.f6045g;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f6045g += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                a(i13);
                System.arraycopy(bArr, i10 + length2, this.f6044f, 0, i13);
                this.f6045g = i13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
