package io.ktor.websocket;

import com.ironsource.G5;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import rv.t;
import sv.n0;
import tu.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketExtensionHeader {
    private final String name;
    private final List<String> parameters;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.websocket.WebSocketExtensionHeader$parseParameters$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final v invoke(String it) {
            e0.checkNotNullParameter(it, "it");
            int iIndexOf$default = n0.indexOf$default((CharSequence) it, G5.T, 0, false, 6, (Object) null);
            String strSubstring = "";
            if (iIndexOf$default < 0) {
                return tu.e0.to(it, "");
            }
            String strSubstring2 = n0.substring(it, qv.v.until(0, iIndexOf$default));
            int i10 = iIndexOf$default + 1;
            if (i10 < it.length()) {
                strSubstring = it.substring(i10);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return tu.e0.to(strSubstring2, strSubstring);
        }
    }

    public WebSocketExtensionHeader(String name, List<String> parameters) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(parameters, "parameters");
        this.name = name;
        this.parameters = parameters;
    }

    private final String parametersToString() {
        if (this.parameters.isEmpty()) {
            return "";
        }
        return ", " + y0.joinToString$default(this.parameters, ",", null, null, 0, null, null, 62, null);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getParameters() {
        return this.parameters;
    }

    public final t parseParameters() {
        return rv.f0.map(y0.asSequence(this.parameters), AnonymousClass1.INSTANCE);
    }

    public String toString() {
        return this.name + ' ' + parametersToString();
    }
}
