package b3;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f8724b;

    /* renamed from: c, reason: collision with root package name */
    public long f8725c = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f8726e = Long.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public b f8727f;

    /* renamed from: g, reason: collision with root package name */
    public int f8728g;

    public c(char[] cArr) {
        this.f8724b = cArr;
    }

    public static void a(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public final String c() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public String content() {
        String str = new String(this.f8724b);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f8726e;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f8725c;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f8725c;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8725c == cVar.f8725c && this.f8726e == cVar.f8726e && this.f8728g == cVar.f8728g && Arrays.equals(this.f8724b, cVar.f8724b)) {
            return Objects.equals(this.f8727f, cVar.f8727f);
        }
        return false;
    }

    public c getContainer() {
        return this.f8727f;
    }

    public long getEnd() {
        return this.f8726e;
    }

    public float getFloat() {
        if (this instanceof e) {
            return ((e) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof e) {
            return ((e) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.f8728g;
    }

    public long getStart() {
        return this.f8725c;
    }

    public boolean hasContent() {
        char[] cArr = this.f8724b;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f8724b) * 31;
        long j10 = this.f8725c;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8726e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f8727f;
        return ((i11 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f8728g;
    }

    public boolean isDone() {
        return this.f8726e != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.f8725c > -1;
    }

    public boolean notStarted() {
        return this.f8725c == -1;
    }

    public void setContainer(b bVar) {
        this.f8727f = bVar;
    }

    public void setEnd(long j10) {
        if (this.f8726e != Long.MAX_VALUE) {
            return;
        }
        this.f8726e = j10;
        b bVar = this.f8727f;
        if (bVar != null) {
            bVar.add(this);
        }
    }

    public void setLine(int i10) {
        this.f8728g = i10;
    }

    public void setStart(long j10) {
        this.f8725c = j10;
    }

    public String toFormattedJSON(int i10, int i11) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j10 = this.f8725c;
        long j11 = this.f8726e;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f8725c);
            sb2.append("-");
            return a.b.g(this.f8726e, ")", sb2);
        }
        return c() + " (" + this.f8725c + " : " + this.f8726e + ") <<" + new String(this.f8724b).substring((int) this.f8725c, ((int) this.f8726e) + 1) + ">>";
    }

    @Override // 
    /* renamed from: clone */
    public c mo128clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
