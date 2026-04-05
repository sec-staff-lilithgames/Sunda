package s4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f85409a;

    public j0(ByteBuffer byteBuffer) {
        this.f85409a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // s4.m0
    public long getPosition() {
        return this.f85409a.position();
    }

    @Override // s4.m0
    public int readTag() throws IOException {
        return this.f85409a.getInt();
    }

    @Override // s4.m0
    public long readUnsignedInt() throws IOException {
        return this.f85409a.getInt() & 4294967295L;
    }

    @Override // s4.m0
    public int readUnsignedShort() throws IOException {
        return this.f85409a.getShort() & 65535;
    }

    @Override // s4.m0
    public void skip(int i10) throws IOException {
        ByteBuffer byteBuffer = this.f85409a;
        byteBuffer.position(byteBuffer.position() + i10);
    }
}
