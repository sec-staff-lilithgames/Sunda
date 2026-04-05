package ic;

import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final char f59489b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f59490c;

    /* renamed from: e, reason: collision with root package name */
    public final char f59491e;

    /* renamed from: f, reason: collision with root package name */
    public final h0 f59492f;

    /* renamed from: g, reason: collision with root package name */
    public final String f59493g;

    /* renamed from: h, reason: collision with root package name */
    public final char f59494h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f59495i;

    /* renamed from: j, reason: collision with root package name */
    public final String f59496j;

    /* renamed from: k, reason: collision with root package name */
    public final String f59497k;

    public i0() {
        this(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA);
    }

    public static i0 createDefaultInstance() {
        return new i0();
    }

    public String getArrayEmptySeparator() {
        return this.f59496j;
    }

    public char getArrayValueSeparator() {
        return this.f59494h;
    }

    public h0 getArrayValueSpacing() {
        return this.f59495i;
    }

    public String getObjectEmptySeparator() {
        return this.f59493g;
    }

    public char getObjectEntrySeparator() {
        return this.f59491e;
    }

    public h0 getObjectEntrySpacing() {
        return this.f59492f;
    }

    public char getObjectFieldValueSeparator() {
        return this.f59489b;
    }

    public h0 getObjectFieldValueSpacing() {
        return this.f59490c;
    }

    public String getRootSeparator() {
        return this.f59497k;
    }

    public i0 withArrayEmptySeparator(String str) {
        if (Objects.equals(this.f59496j, str)) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, this.f59491e, this.f59492f, this.f59493g, this.f59494h, this.f59495i, str);
    }

    public i0 withArrayValueSeparator(char c10) {
        if (this.f59494h == c10) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, this.f59491e, this.f59492f, this.f59493g, c10, this.f59495i, this.f59496j);
    }

    public i0 withArrayValueSpacing(h0 h0Var) {
        if (this.f59495i == h0Var) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, this.f59491e, this.f59492f, this.f59493g, this.f59494h, h0Var, this.f59496j);
    }

    public i0 withObjectEmptySeparator(String str) {
        if (Objects.equals(this.f59493g, str)) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, this.f59491e, this.f59492f, str, this.f59494h, this.f59495i, this.f59496j);
    }

    public i0 withObjectEntrySeparator(char c10) {
        if (this.f59491e == c10) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, c10, this.f59492f, this.f59493g, this.f59494h, this.f59495i, this.f59496j);
    }

    public i0 withObjectEntrySpacing(h0 h0Var) {
        if (this.f59492f == h0Var) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, this.f59490c, this.f59491e, h0Var, this.f59493g, this.f59494h, this.f59495i, this.f59496j);
    }

    public i0 withObjectFieldValueSeparator(char c10) {
        if (this.f59489b == c10) {
            return this;
        }
        return new i0(this.f59497k, c10, this.f59490c, this.f59491e, this.f59492f, this.f59493g, this.f59494h, this.f59495i, this.f59496j);
    }

    public i0 withObjectFieldValueSpacing(h0 h0Var) {
        if (this.f59490c == h0Var) {
            return this;
        }
        return new i0(this.f59497k, this.f59489b, h0Var, this.f59491e, this.f59492f, this.f59493g, this.f59494h, this.f59495i, this.f59496j);
    }

    public i0 withRootSeparator(String str) {
        if (Objects.equals(this.f59497k, str)) {
            return this;
        }
        return new i0(str, this.f59489b, this.f59490c, this.f59491e, this.f59492f, this.f59493g, this.f59494h, this.f59495i, this.f59496j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(char c10, char c11, char c12) {
        h0 h0Var = h0.BOTH;
        h0 h0Var2 = h0.NONE;
        this(" ", c10, h0Var, c11, h0Var2, " ", c12, h0Var2, " ");
    }

    @Deprecated
    public i0(String str, char c10, h0 h0Var, char c11, h0 h0Var2, char c12, h0 h0Var3) {
        this(str, c10, h0Var, c11, h0Var2, " ", c12, h0Var3, " ");
    }

    public i0(String str, char c10, h0 h0Var, char c11, h0 h0Var2, String str2, char c12, h0 h0Var3, String str3) {
        this.f59497k = str;
        this.f59489b = c10;
        this.f59490c = h0Var;
        this.f59491e = c11;
        this.f59492f = h0Var2;
        this.f59493g = str2;
        this.f59494h = c12;
        this.f59495i = h0Var3;
        this.f59496j = str3;
    }
}
