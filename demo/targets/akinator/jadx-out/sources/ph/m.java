package ph;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f81325b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f81326c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f81327e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81328f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Reader f81329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f81330h;

    public m(n nVar, Reader reader) {
        this.f81329g = reader;
        this.f81330h = nVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81329g.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        throw new ph.j("Padding cannot start at index " + r6.f81327e);
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() throws java.io.IOException {
        /*
            r6 = this;
            ph.n r0 = r6.f81330h
            ph.g r1 = r0.f81331f
        L4:
            java.io.Reader r2 = r6.f81329g
            int r2 = r2.read()
            r3 = -1
            if (r2 != r3) goto L34
            boolean r0 = r6.f81328f
            if (r0 != 0) goto L33
            int r0 = r6.f81327e
            boolean[] r2 = r1.f81308h
            int r1 = r1.f81305e
            int r0 = r0 % r1
            boolean r0 = r2[r0]
            if (r0 == 0) goto L1d
            goto L33
        L1d:
            ph.j r0 = new ph.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid input length "
            r1.<init>(r2)
            int r2 = r6.f81327e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            return r3
        L34:
            int r3 = r6.f81327e
            r4 = 1
            int r3 = r3 + r4
            r6.f81327e = r3
            char r2 = (char) r2
            java.lang.Character r3 = r0.f81332g
            if (r3 == 0) goto L72
            char r3 = r3.charValue()
            if (r3 != r2) goto L72
            boolean r2 = r6.f81328f
            if (r2 != 0) goto L6f
            int r2 = r6.f81327e
            if (r2 == r4) goto L59
            int r2 = r2 + (-1)
            boolean[] r3 = r1.f81308h
            int r5 = r1.f81305e
            int r2 = r2 % r5
            boolean r2 = r3[r2]
            if (r2 == 0) goto L59
            goto L6f
        L59:
            ph.j r0 = new ph.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Padding cannot start at index "
            r1.<init>(r2)
            int r2 = r6.f81327e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            r6.f81328f = r4
            goto L4
        L72:
            boolean r3 = r6.f81328f
            if (r3 != 0) goto L97
            int r3 = r6.f81325b
            int r4 = r1.f81304d
            int r3 = r3 << r4
            r6.f81325b = r3
            int r2 = r1.a(r2)
            r2 = r2 | r3
            r6.f81325b = r2
            int r3 = r6.f81326c
            int r4 = r1.f81304d
            int r3 = r3 + r4
            r6.f81326c = r3
            r4 = 8
            if (r3 < r4) goto L4
            int r3 = r3 - r4
            r6.f81326c = r3
            int r0 = r2 >> r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L97:
            ph.j r0 = new ph.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected padding character but found '"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = "' at index "
            r1.append(r2)
            int r2 = r6.f81327e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.m.read():int");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        p1.checkPositionIndexes(i10, i12, bArr.length);
        int i13 = i10;
        while (i13 < i12) {
            int i14 = read();
            if (i14 == -1) {
                int i15 = i13 - i10;
                if (i15 == 0) {
                    return -1;
                }
                return i15;
            }
            bArr[i13] = (byte) i14;
            i13++;
        }
        return i13 - i10;
    }
}
