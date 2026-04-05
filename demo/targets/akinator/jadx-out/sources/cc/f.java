package cc;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final f f12064h = new f(null, false);

    /* renamed from: i, reason: collision with root package name */
    public static final f f12065i = new f(null, false);

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f12066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12067c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12068e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12069f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12070g;

    public f(Object obj, boolean z10) {
        this(z10, obj, -1, -1, ub.e.defaults());
    }

    public static void a(int i10, int[] iArr) {
        int i11 = iArr[0];
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= i10) {
            i11 = i10;
        }
        iArr[0] = i11;
        int i12 = iArr[1];
        int i13 = i10 - i11;
        if (i12 < 0 || i12 > i13) {
            iArr[1] = i13;
        }
    }

    @Deprecated
    public static f construct(boolean z10, Object obj) {
        return new f(z10, obj, ub.e.defaults());
    }

    public static f rawReference(boolean z10, Object obj) {
        return obj instanceof f ? (f) obj : new f(obj, z10);
    }

    public static f redacted() {
        return f12065i;
    }

    public static f unknown() {
        return f12064h;
    }

    public StringBuilder appendSourceDescription(StringBuilder sb2) {
        String str;
        Object rawContent = getRawContent();
        if (rawContent == null) {
            if (this == f12065i) {
                sb2.append("REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled)");
                return sb2;
            }
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = rawContent instanceof Class ? (Class) rawContent : rawContent.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (rawContent instanceof byte[]) {
            name = "byte[]";
        } else if (rawContent instanceof char[]) {
            name = "char[]";
        }
        sb2.append('(');
        sb2.append(name);
        sb2.append(')');
        if (hasTextualContent()) {
            int[] iArr = {contentOffset(), contentLength()};
            boolean z10 = rawContent instanceof CharSequence;
            String str2 = " chars";
            int i10 = this.f12070g;
            if (z10) {
                CharSequence charSequence = (CharSequence) rawContent;
                a(charSequence.length(), iArr);
                int i11 = iArr[0];
                str = charSequence.subSequence(i11, Math.min(iArr[1], i10) + i11).toString();
            } else if (rawContent instanceof char[]) {
                char[] cArr = (char[]) rawContent;
                a(cArr.length, iArr);
                str = new String(cArr, iArr[0], Math.min(iArr[1], i10));
            } else if (rawContent instanceof byte[]) {
                byte[] bArr = (byte[]) rawContent;
                a(bArr.length, iArr);
                str2 = " bytes";
                str = new String(bArr, iArr[0], Math.min(iArr[1], i10), StandardCharsets.UTF_8);
            } else {
                str = null;
            }
            if (str != null) {
                sb2.append(AbstractJsonLexerKt.STRING);
                int length = str.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = str.charAt(i12);
                    if (!Character.isISOControl(cCharAt) || cCharAt == '\r' || cCharAt == '\n') {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append(AbstractJsonLexerKt.STRING_ESC);
                        sb2.append(AbstractJsonLexerKt.UNICODE_ESC);
                        sb2.append(d.hexToChar((cCharAt >> '\f') & 15));
                        sb2.append(d.hexToChar((cCharAt >> '\b') & 15));
                        sb2.append(d.hexToChar((cCharAt >> 4) & 15));
                        sb2.append(d.hexToChar(cCharAt & 15));
                    }
                }
                sb2.append(AbstractJsonLexerKt.STRING);
                if (iArr[1] > i10) {
                    sb2.append("[truncated ");
                    sb2.append(iArr[1] - i10);
                    sb2.append(str2);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2;
                }
            }
        } else if (rawContent instanceof byte[]) {
            int iContentLength = contentLength();
            if (iContentLength < 0) {
                iContentLength = ((byte[]) rawContent).length;
            }
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(iContentLength);
            sb2.append(" bytes]");
        }
        return sb2;
    }

    public String buildSourceDescription() {
        return appendSourceDescription(new StringBuilder(200)).toString();
    }

    public int contentLength() {
        return this.f12068e;
    }

    public int contentOffset() {
        return this.f12067c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f12067c != fVar.f12067c || this.f12068e != fVar.f12068e) {
            return false;
        }
        Object obj2 = fVar.f12066b;
        Object obj3 = this.f12066b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) ? obj3.equals(obj2) : obj3 == obj2;
    }

    public Object getRawContent() {
        return this.f12066b;
    }

    public boolean hasTextualContent() {
        return this.f12069f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f12066b);
    }

    public f(boolean z10, Object obj, ub.e eVar) {
        this(z10, obj, -1, -1, eVar);
    }

    @Deprecated
    public static f construct(boolean z10, Object obj, int i10, int i11) {
        return new f(z10, obj, i10, i11, ub.e.defaults());
    }

    public f(boolean z10, Object obj, int i10, int i11, ub.e eVar) {
        this.f12069f = z10;
        this.f12066b = obj;
        this.f12067c = i10;
        this.f12068e = i11;
        this.f12070g = eVar.getMaxRawContentLength();
    }

    public static f construct(boolean z10, Object obj, int i10, int i11, ub.e eVar) {
        return new f(z10, obj, i10, i11, eVar);
    }

    public static f construct(boolean z10, Object obj, ub.e eVar) {
        return new f(z10, obj, eVar);
    }

    public static f rawReference(Object obj) {
        return rawReference(false, obj);
    }
}
