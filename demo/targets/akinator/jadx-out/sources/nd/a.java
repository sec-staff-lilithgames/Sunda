package nd;

import md.u;
import nd.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends g.a {

    /* renamed from: a, reason: collision with root package name */
    public Iterable f75977a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f75978b;

    @Override // nd.g.a
    public g build() {
        String str = this.f75977a == null ? " events" : "";
        if (str.isEmpty()) {
            return new b(this.f75978b, this.f75977a);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // nd.g.a
    public g.a setEvents(Iterable<u> iterable) {
        if (iterable == null) {
            throw new NullPointerException("Null events");
        }
        this.f75977a = iterable;
        return this;
    }

    @Override // nd.g.a
    public g.a setExtras(byte[] bArr) {
        this.f75978b = bArr;
        return this;
    }
}
