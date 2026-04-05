package d1;

import kotlin.jvm.internal.e0;
import sv.j0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f51715a;

    /* renamed from: b, reason: collision with root package name */
    public int f51716b;

    public w(String str) {
        this.f51715a = str;
    }

    public static /* synthetic */ void advance$default(w wVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        wVar.advance(i10);
    }

    public final void advance(int i10) {
        this.f51716b += i10;
    }

    public final boolean atEnd() {
        return this.f51716b >= this.f51715a.length();
    }

    public final char current() {
        return this.f51715a.charAt(this.f51716b);
    }

    public final void expect(char c10) throws u {
        if (matches(c10)) {
            return;
        }
        throwParseError("expected " + c10);
        throw new tu.k();
    }

    public final String getData() {
        return this.f51715a;
    }

    public final int getI() {
        return this.f51716b;
    }

    public final boolean matches(char c10) {
        int i10 = this.f51716b;
        String str = this.f51715a;
        return i10 < str.length() && str.charAt(this.f51716b) == c10;
    }

    public final void setI(int i10) {
        this.f51716b = i10;
    }

    public final void skipUntil(String str) {
        while (true) {
            int i10 = this.f51716b;
            String str2 = this.f51715a;
            if (i10 >= str2.length() || n0.contains$default((CharSequence) str, str2.charAt(this.f51716b), false, 2, (Object) null)) {
                return;
            } else {
                this.f51716b++;
            }
        }
    }

    public final int takeIntUntil(String str) throws u {
        Integer intOrNull = j0.toIntOrNull(takeUntil(str));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throwParseError("expected int");
        throw new tu.k();
    }

    public final String takeUntil(String str) {
        int i10 = this.f51716b;
        skipUntil(str);
        int i11 = this.f51716b;
        if (i11 <= i10) {
            return "";
        }
        String strSubstring = this.f51715a.substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String takeUntilEnd() {
        int i10 = this.f51716b;
        String str = this.f51715a;
        String strSubstring = str.substring(i10, str.length());
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Void throwParseError(String str) throws u {
        int i10 = this.f51716b;
        String str2 = this.f51715a;
        int iMin = Math.min(i10, str2.length());
        StringBuilder sbO = e3.g.o("Error while parsing source information: ", str, " at ");
        String strSubstring = str2.substring(0, iMin);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sbO.append(strSubstring);
        sbO.append('|');
        String strSubstring2 = str2.substring(iMin);
        e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sbO.append(strSubstring2);
        throw new u(sbO.toString());
    }
}
