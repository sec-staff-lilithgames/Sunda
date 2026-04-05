package nd;

import java.util.Arrays;
import md.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable f75979a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f75980b;

    public b(byte[] bArr, Iterable iterable) {
        this.f75979a = iterable;
        this.f75980b = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f75979a.equals(gVar.getEvents())) {
                if (Arrays.equals(this.f75980b, gVar instanceof b ? ((b) gVar).f75980b : gVar.getExtras())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // nd.g
    public Iterable<u> getEvents() {
        return this.f75979a;
    }

    @Override // nd.g
    public byte[] getExtras() {
        return this.f75980b;
    }

    public int hashCode() {
        return ((this.f75979a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f75980b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f75979a + ", extras=" + Arrays.toString(this.f75980b) + "}";
    }
}
