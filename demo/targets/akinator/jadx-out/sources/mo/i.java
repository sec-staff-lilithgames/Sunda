package mo;

import io.bidmachine.media3.common.util.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74898a;

    public i(String str) {
        this.f74898a = str;
    }

    public static i parseFrom(m0 m0Var) {
        return new i(m0Var.readString(m0Var.bytesLeft()));
    }

    @Override // mo.a
    public int getType() {
        return 1852994675;
    }
}
