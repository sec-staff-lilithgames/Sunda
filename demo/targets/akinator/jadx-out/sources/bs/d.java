package bs;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import zr.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f10050a;

    /* renamed from: b, reason: collision with root package name */
    public final g f10051b;

    public d(c cVar) {
        this.f10050a = cVar.f10048a;
        this.f10051b = cVar.f10049b.build();
    }

    public g headers() {
        return this.f10051b;
    }

    public b httpUrl() {
        return this.f10050a;
    }

    public c newBuilder() {
        return new c();
    }

    public String toString() {
        return "Request{url=" + this.f10050a + AbstractJsonLexerKt.END_OBJ;
    }
}
