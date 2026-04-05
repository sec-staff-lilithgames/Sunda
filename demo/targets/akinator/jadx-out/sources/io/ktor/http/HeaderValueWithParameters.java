package io.ktor.http;

import ao.kwoC.zAQQWzBxnS;
import com.ironsource.C3191e4;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;
import sv.k0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class HeaderValueWithParameters {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final List<HeaderValueParam> parameters;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final <R> R parse(String value, p init) {
            e0.checkNotNullParameter(value, "value");
            e0.checkNotNullParameter(init, "init");
            HeaderValue headerValue = (HeaderValue) y0.last((List) HttpHeaderValueParserKt.parseHeaderValue(value));
            return (R) init.invoke(headerValue.getValue(), headerValue.getParams());
        }

        private Companion() {
        }
    }

    public HeaderValueWithParameters(String content, List<HeaderValueParam> parameters) {
        e0.checkNotNullParameter(content, "content");
        e0.checkNotNullParameter(parameters, "parameters");
        this.content = content;
        this.parameters = parameters;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<HeaderValueParam> getParameters() {
        return this.parameters;
    }

    public String toString() {
        if (this.parameters.isEmpty()) {
            return this.content;
        }
        int length = this.content.length();
        int i10 = 0;
        int length2 = 0;
        for (HeaderValueParam headerValueParam : this.parameters) {
            length2 += headerValueParam.getValue().length() + headerValueParam.getName().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.content);
        int lastIndex = p0.getLastIndex(this.parameters);
        if (lastIndex >= 0) {
            while (true) {
                HeaderValueParam headerValueParam2 = this.parameters.get(i10);
                sb2.append("; ");
                sb2.append(headerValueParam2.getName());
                sb2.append(C3191e4.i.f36525b);
                String value = headerValueParam2.getValue();
                if (HeaderValueWithParametersKt.needQuotes(value)) {
                    sb2.append(HeaderValueWithParametersKt.quote(value));
                } else {
                    sb2.append(value);
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "{\n            val size =…   }.toString()\n        }");
        return string;
    }

    public final String parameter(String str) {
        e0.checkNotNullParameter(str, zAQQWzBxnS.CjsCZCxzr);
        int lastIndex = p0.getLastIndex(this.parameters);
        if (lastIndex < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            HeaderValueParam headerValueParam = this.parameters.get(i10);
            if (k0.equals(headerValueParam.getName(), str, true)) {
                return headerValueParam.getValue();
            }
            if (i10 == lastIndex) {
                return null;
            }
            i10++;
        }
    }

    public /* synthetic */ HeaderValueWithParameters(String str, List list, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? p0.emptyList() : list);
    }
}
