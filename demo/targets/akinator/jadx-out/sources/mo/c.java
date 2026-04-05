package mo;

import gn.z0;
import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f74869a;

    /* renamed from: b, reason: collision with root package name */
    public int f74870b;

    /* renamed from: c, reason: collision with root package name */
    public int f74871c;

    public void populateFrom(m0 m0Var) {
        this.f74869a = m0Var.readLittleEndianInt();
        this.f74870b = m0Var.readLittleEndianInt();
        this.f74871c = 0;
    }

    public void populateWithListHeaderFrom(m0 m0Var) throws z0 {
        populateFrom(m0Var);
        if (this.f74869a == 1414744396) {
            this.f74871c = m0Var.readLittleEndianInt();
        } else {
            throw z0.createForMalformedContainer("LIST expected, found: " + this.f74869a, null);
        }
    }
}
