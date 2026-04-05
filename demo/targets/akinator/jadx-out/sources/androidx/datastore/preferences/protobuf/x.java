package androidx.datastore.preferences.protobuf;

import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final s f6099c = new s(t1.f6008c);

    /* renamed from: e, reason: collision with root package name */
    public static final o f6100e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f6101f;

    /* renamed from: b, reason: collision with root package name */
    public int f6102b = 0;

    static {
        f6100e = e.a() ? new w() : new m();
        f6101f = new k();
    }

    public static x a(int i10, Iterator it) {
        if (i10 < 1) {
            throw new IllegalArgumentException(p0.o2.k(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (x) it.next();
        }
        int i11 = i10 >>> 1;
        return a(i11, it).concat(a(i10 - i11, it));
    }

    public static void b(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(w0.i.a(i10, i11, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.b.e(i10, "Index < 0: "));
        }
    }

    public static int c(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(p0.o2.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(w0.i.a(i11, i12, "End index: ", " >= "));
    }

    public static x copyFrom(byte[] bArr, int i10, int i11) {
        c(i10, i10 + i11, bArr.length);
        return new s(f6100e.copyFrom(bArr, i10, i11));
    }

    public static x copyFromUtf8(String str) {
        return new s(str.getBytes(t1.f6006a));
    }

    public static int e(String str, int i10) {
        char cCharAt = str.charAt(i10);
        int i11 = (cCharAt < '0' || cCharAt > '9') ? (cCharAt < 'A' || cCharAt > 'F') ? (cCharAt < 'a' || cCharAt > 'f') ? -1 : cCharAt - 'W' : cCharAt - '7' : cCharAt - '0';
        if (i11 != -1) {
            return i11;
        }
        StringBuilder sbO = e3.g.o("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbO.append(str.charAt(i10));
        sbO.append(" at index ");
        sbO.append(i10);
        throw new NumberFormatException(sbO.toString());
    }

    public static final x empty() {
        return f6099c;
    }

    public static x fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbO = e3.g.o("Invalid hexString ", str, " of length ");
            sbO.append(str.length());
            sbO.append(" must be even.");
            throw new NumberFormatException(sbO.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (e(str, i11 + 1) | (e(str, i11) << 4));
        }
        return new s(bArr);
    }

    public static r m(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new u(byteBuffer);
        }
        return new n(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static v newOutput(int i10) {
        return new v(i10);
    }

    public static x readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, NotificationCompat.FLAG_LOCAL_ONLY, Segment.SIZE);
    }

    public static Comparator<x> unsignedLexicographicalComparator() {
        return f6101f;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    public final x concat(x xVar) {
        if (Integer.MAX_VALUE - size() < xVar.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + xVar.size());
        }
        if (xVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return xVar;
        }
        int size = xVar.size() + size();
        if (size < 128) {
            int size2 = size();
            int size3 = xVar.size();
            byte[] bArr = new byte[size2 + size3];
            copyTo(bArr, 0, 0, size2);
            xVar.copyTo(bArr, 0, size2, size3);
            return new s(bArr);
        }
        if (this instanceof l3) {
            l3 l3Var = (l3) this;
            x xVar2 = l3Var.f5954i;
            int size4 = xVar.size() + xVar2.size();
            x xVar3 = l3Var.f5953h;
            if (size4 < 128) {
                int size5 = xVar2.size();
                int size6 = xVar.size();
                byte[] bArr2 = new byte[size5 + size6];
                xVar2.copyTo(bArr2, 0, 0, size5);
                xVar.copyTo(bArr2, 0, size5, size6);
                return new l3(xVar3, new s(bArr2));
            }
            if (xVar3.f() > xVar2.f() && l3Var.f5956k > xVar.f()) {
                return new l3(xVar3, new l3(xVar2, xVar));
            }
        }
        if (size >= l3.o(Math.max(f(), xVar.f()) + 1)) {
            return new l3(this, xVar);
        }
        i3 i3Var = new i3(0);
        i3Var.a(this);
        i3Var.a(xVar);
        ArrayDeque arrayDeque = i3Var.f5906a;
        x l3Var2 = (x) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            l3Var2 = new l3((x) arrayDeque.pop(), l3Var2);
        }
        return l3Var2;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    public abstract void d(byte[] bArr, int i10, int i11, int i12);

    public final boolean endsWith(x xVar) {
        return size() >= xVar.size() && substring(size() - xVar.size()).equals(xVar);
    }

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract boolean g();

    public abstract int h(int i10, int i11, int i12);

    public final int hashCode() {
        int iH = this.f6102b;
        if (iH == 0) {
            int size = size();
            iH = h(size, 0, size);
            if (iH == 0) {
                iH = 1;
            }
            this.f6102b = iH;
        }
        return iH;
    }

    public abstract int i(int i10, int i11, int i12);

    public abstract byte internalByteAt(int i10);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract String j(Charset charset);

    public abstract void n(l0 l0Var);

    public abstract c0 newCodedInput();

    public abstract InputStream newInput();

    public abstract int size();

    public final boolean startsWith(x xVar) {
        return size() >= xVar.size() && substring(0, xVar.size()).equals(xVar);
    }

    public final x substring(int i10) {
        return substring(i10, size());
    }

    public abstract x substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return t1.f6008c;
        }
        byte[] bArr = new byte[size];
        d(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public final String toStringUtf8() {
        return toString(t1.f6006a);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static v newOutput() {
        return new v(128);
    }

    public static x readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        c(i10, i10 + i12, size());
        c(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            d(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    public p iterator() {
        return new j(this);
    }

    public static x copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static x readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] bArr = new byte[i10];
            int i12 = 0;
            while (i12 < i10) {
                int i13 = inputStream.read(bArr, i12, i10 - i12);
                if (i13 == -1) {
                    break;
                }
                i12 += i13;
            }
            x xVarCopyFrom = i12 == 0 ? null : copyFrom(bArr, 0, i12);
            if (xVarCopyFrom == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(xVarCopyFrom);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    public static x copyFrom(ByteBuffer byteBuffer, int i10) {
        c(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new s(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : j(charset);
    }

    public final String toString() {
        String strK;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strK = kotlin.jvm.internal.d0.k(this);
        } else {
            strK = kotlin.jvm.internal.d0.k(substring(0, 47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        return j1.o2.o(a.b.r(size, "<ByteString@", hexString, " size=", " contents=\""), strK, "\">");
    }

    public static x copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static x copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new s(str.getBytes(str2));
    }

    public static x copyFrom(String str, Charset charset) {
        return new s(str.getBytes(charset));
    }

    public static x copyFrom(Iterable<x> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<x> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return f6099c;
        }
        return a(size, iterable.iterator());
    }
}
