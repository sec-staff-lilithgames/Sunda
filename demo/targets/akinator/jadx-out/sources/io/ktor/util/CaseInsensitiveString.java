package io.ktor.util;

import java.util.Locale;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CaseInsensitiveString {
    private final String content;
    private final int hash;

    public CaseInsensitiveString(String content) {
        e0.checkNotNullParameter(content, "content");
        this.content = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.hash = lowerCase.hashCode();
    }

    public boolean equals(Object obj) {
        String str;
        CaseInsensitiveString caseInsensitiveString = obj instanceof CaseInsensitiveString ? (CaseInsensitiveString) obj : null;
        return (caseInsensitiveString == null || (str = caseInsensitiveString.content) == null || !k0.equals(str, this.content, true)) ? false : true;
    }

    public final String getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.hash;
    }

    public String toString() {
        return this.content;
    }
}
