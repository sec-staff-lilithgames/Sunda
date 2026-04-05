package sp;

import io.bidmachine.media3.common.util.m0;
import java.io.IOException;
import ko.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f86104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86105b;

    public d(int i10, long j10) {
        this.f86104a = i10;
        this.f86105b = j10;
    }

    public static d peek(a0 a0Var, m0 m0Var) throws IOException {
        a0Var.peekFully(m0Var.getData(), 0, 8);
        m0Var.setPosition(0);
        return new d(m0Var.readInt(), m0Var.readLittleEndianUnsignedInt());
    }
}
