package x8;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f91847a;

    public l(ByteBuffer byteBuffer) {
        this.f91847a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // x8.n
    public int getUInt16() throws m {
        return (getUInt8() << 8) | getUInt8();
    }

    @Override // x8.n
    public short getUInt8() throws m {
        ByteBuffer byteBuffer = this.f91847a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        throw new m();
    }

    @Override // x8.n
    public int read(byte[] bArr, int i10) {
        ByteBuffer byteBuffer = this.f91847a;
        int iMin = Math.min(i10, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // x8.n
    public long skip(long j10) {
        ByteBuffer byteBuffer = this.f91847a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }
}
