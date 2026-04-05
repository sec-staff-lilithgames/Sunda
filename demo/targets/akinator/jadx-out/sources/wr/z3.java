package wr;

import com.amazon.device.ads.DTBMetricReport;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class z3 {

    /* renamed from: e, reason: collision with root package name */
    public static final BitSet f91222e;

    /* renamed from: a, reason: collision with root package name */
    public final String f91223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91224b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f91225c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f91226d;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        f91222e = bitSet;
    }

    public z3(Object obj, String str, boolean z10) {
        String str2 = (String) mh.p1.checkNotNull(str, "name");
        this.f91223a = str2;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        mh.p1.checkNotNull(lowerCase, "name");
        mh.p1.checkArgument(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals(DTBMetricReport.CONNECTION)) {
            e4.f90904c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i10 = 0; i10 < lowerCase.length(); i10++) {
            char cCharAt = lowerCase.charAt(i10);
            if (!z10 || cCharAt != ':' || i10 != 0) {
                mh.p1.checkArgument(f91222e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, (Object) lowerCase);
            }
        }
        this.f91224b = lowerCase;
        this.f91225c = lowerCase.getBytes(mh.h0.f74626a);
        this.f91226d = obj;
    }

    public static <T> z3 of(String str, v3 v3Var) {
        return new u3(str, v3Var);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f91224b.equals(((z3) obj).f91224b);
    }

    public final int hashCode() {
        return this.f91224b.hashCode();
    }

    public final String name() {
        return this.f91224b;
    }

    public final String originalName() {
        return this.f91223a;
    }

    public String toString() {
        return j1.o2.o(new StringBuilder("Key{name='"), this.f91224b, "'}");
    }

    public static <T> z3 of(String str, w3 w3Var) {
        a4 a4Var = new a4(w3Var, str, false);
        mh.p1.checkArgument(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        mh.p1.checkArgument(str.length() > 4, "empty key name");
        if (mh.p1.checkNotNull(w3Var, "marshaller is null") == null) {
            return a4Var;
        }
        throw new ClassCastException();
    }

    public static <T> z3 of(String str, t3 t3Var) {
        return new s3(str, false, t3Var);
    }
}
