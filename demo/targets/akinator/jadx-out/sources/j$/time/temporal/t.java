package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f68663a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68665c;

    /* renamed from: d, reason: collision with root package name */
    public final long f68666d;

    public static t e(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j10, j10, j11, j11);
    }

    public static t f(long j10, long j11, long j12) {
        if (j10 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j12) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new t(j10, 1L, j11, j12);
    }

    public t(long j10, long j11, long j12, long j13) {
        this.f68663a = j10;
        this.f68664b = j11;
        this.f68665c = j12;
        this.f68666d = j13;
    }

    public final int a(long j10, p pVar) {
        if (this.f68663a < -2147483648L || this.f68666d > 2147483647L || !d(j10)) {
            throw new j$.time.c(c(j10, pVar));
        }
        return (int) j10;
    }

    public final boolean d(long j10) {
        return j10 >= this.f68663a && j10 <= this.f68666d;
    }

    public final void b(long j10, p pVar) {
        if (!d(j10)) {
            throw new j$.time.c(c(j10, pVar));
        }
    }

    public final String c(long j10, p pVar) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f68663a;
        long j11 = this.f68664b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f68665c;
        long j13 = this.f68666d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f68663a == tVar.f68663a && this.f68664b == tVar.f68664b && this.f68665c == tVar.f68665c && this.f68666d == tVar.f68666d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f68663a;
        long j11 = this.f68664b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f68665c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f68666d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f68663a);
        if (this.f68663a != this.f68664b) {
            sb2.append('/');
            sb2.append(this.f68664b);
        }
        sb2.append(" - ");
        sb2.append(this.f68665c);
        if (this.f68665c != this.f68666d) {
            sb2.append('/');
            sb2.append(this.f68666d);
        }
        return sb2.toString();
    }
}
