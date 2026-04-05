package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6006a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f6007b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6008c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f6009d;

    static {
        Charset.forName(C.ASCII_NAME);
        f6006a = Charset.forName(C.UTF8_NAME);
        f6007b = Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6008c = bArr;
        f6009d = ByteBuffer.wrap(bArr);
        c0.newInstance(bArr);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(f6007b);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static x bytesDefaultValue(String str) {
        return x.copyFrom(str.getBytes(f6007b));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
        byteBufferDuplicate2.clear();
        return byteBufferDuplicate.equals(byteBufferDuplicate2);
    }

    public static <T extends r2> T getDefaultInstance(Class<T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException(a.b.i(cls, "Failed to get default instance for "), e10);
        }
    }

    public static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashEnum(m1 m1Var) {
        return m1Var.getNumber();
    }

    public static int hashEnumList(List<? extends m1> list) {
        Iterator<? extends m1> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            iHashEnum = (iHashEnum * 31) + hashEnum(null);
        }
        return iHashEnum;
    }

    public static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return m4.f5958a.E(bArr, 0, bArr.length);
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(f6007b), f6006a);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(f6006a);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, f6006a);
    }

    public static boolean isValidUtf8(x xVar) {
        return xVar.isValidUtf8();
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int iB = b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iB = b(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (iB == 0) {
                return 1;
            }
            return iB;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = b(iCapacity2, bArr, 0, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!equalsByteBuffer(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
