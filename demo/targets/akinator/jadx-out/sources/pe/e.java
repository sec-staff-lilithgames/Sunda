package pe;

import com.google.android.exoplayer2.util.v0;
import ee.q;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f80989a;

    /* renamed from: b, reason: collision with root package name */
    public final long f80990b;

    public e(int i10, long j10) {
        this.f80989a = i10;
        this.f80990b = j10;
    }

    public static e peek(q qVar, v0 v0Var) throws IOException {
        qVar.peekFully(v0Var.getData(), 0, 8);
        v0Var.setPosition(0);
        return new e(v0Var.readInt(), v0Var.readLittleEndianUnsignedInt());
    }
}
