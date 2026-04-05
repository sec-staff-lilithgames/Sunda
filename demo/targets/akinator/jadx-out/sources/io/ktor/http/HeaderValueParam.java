package io.ktor.http;

import a.b;
import be.nVUQ.UupKET;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeaderValueParam {
    private final boolean escapeValue;
    private final String name;
    private final String value;

    public HeaderValueParam(String name, String value, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.escapeValue = z10;
    }

    public static /* synthetic */ HeaderValueParam copy$default(HeaderValueParam headerValueParam, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = headerValueParam.name;
        }
        if ((i10 & 2) != 0) {
            str2 = headerValueParam.value;
        }
        if ((i10 & 4) != 0) {
            z10 = headerValueParam.escapeValue;
        }
        return headerValueParam.copy(str, str2, z10);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.escapeValue;
    }

    public final HeaderValueParam copy(String name, String value, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return new HeaderValueParam(name, value, z10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HeaderValueParam)) {
            return false;
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) obj;
        return k0.equals(headerValueParam.name, this.name, true) && k0.equals(headerValueParam.value, this.value, true);
    }

    public final boolean getEscapeValue() {
        return this.escapeValue;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", escapeValue=");
        return b.p(sb2, this.escapeValue, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderValueParam(String name, String value) {
        this(name, value, false);
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
    }

    public int hashCode() {
        String str = this.name;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String str2 = UupKET.rZeI;
        e0.checkNotNullExpressionValue(lowerCase, str2);
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.value.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase2, str2);
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }
}
