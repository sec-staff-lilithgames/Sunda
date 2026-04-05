package com.fyber.inneractive.sdk.protobuf;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final q f26471b = new q(l1.f26430b);

    /* renamed from: c, reason: collision with root package name */
    public static final o f26472c;

    /* renamed from: a, reason: collision with root package name */
    public int f26473a = 0;

    static {
        f26472c = d.a() ? new r() : new m();
    }

    public static q a(String str) {
        return new q(str.getBytes(l1.f26429a));
    }

    public abstract int a(int i10, int i11);

    public abstract void a(int i10, byte[] bArr);

    public abstract void a(k kVar);

    public abstract byte c(int i10);

    public abstract boolean c();

    public abstract byte d(int i10);

    public abstract w d();

    public abstract s e(int i10);

    public abstract String e();

    public final String f() {
        Charset charset = l1.f26429a;
        return size() == 0 ? "" : e();
    }

    public final int hashCode() {
        int iA = this.f26473a;
        if (iA == 0) {
            int size = size();
            iA = a(size, size);
            if (iA == 0) {
                iA = 1;
            }
            this.f26473a = iA;
        }
        return iA;
    }

    public abstract int size();

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strA = h3.a(this);
        } else {
            strA = h3.a(e(47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        return j1.o2.o(a.b.r(size, "<ByteString@", hexString, " size=", " contents=\""), strA, "\">");
    }

    public static int a(int i10, int i11, int i12) {
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
}
