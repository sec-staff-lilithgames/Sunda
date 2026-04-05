package ic;

import ic.f;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends f.b {

    /* renamed from: g, reason: collision with root package name */
    public static final String f59461g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f59462h;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f59463c;

    /* renamed from: e, reason: collision with root package name */
    public final int f59464e;

    /* renamed from: f, reason: collision with root package name */
    public final String f59465f;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f59461g = property;
        f59462h = new e("  ", property);
    }

    public e() {
        this("  ", f59461g);
    }

    public String getEol() {
        return this.f59465f;
    }

    public String getIndent() {
        return new String(this.f59463c, 0, this.f59464e);
    }

    @Override // ic.f.b, ic.g
    public boolean isInline() {
        return false;
    }

    public e withIndent(String str) {
        return str.equals(getIndent()) ? this : new e(str, this.f59465f);
    }

    public e withLinefeed(String str) {
        return str.equals(this.f59465f) ? this : new e(getIndent(), str);
    }

    @Override // ic.f.b, ic.g
    public void writeIndentation(ub.o oVar, int i10) throws IOException {
        oVar.writeRaw(this.f59465f);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.f59464e;
        while (true) {
            char[] cArr = this.f59463c;
            if (length <= cArr.length) {
                oVar.writeRaw(cArr, 0, length);
                return;
            } else {
                oVar.writeRaw(cArr, 0, cArr.length);
                length -= cArr.length;
            }
        }
    }

    public e(String str, String str2) {
        this.f59464e = str.length();
        this.f59463c = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.f59463c, length);
            length += str.length();
        }
        this.f59465f = str2;
    }
}
