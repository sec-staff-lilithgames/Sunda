package x8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a1 implements n8.t {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f91804a = ByteBuffer.allocate(4);

    @Override // n8.t
    public void update(byte[] bArr, Integer num, MessageDigest messageDigest) {
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f91804a) {
            this.f91804a.position(0);
            messageDigest.update(this.f91804a.putInt(num.intValue()).array());
        }
    }
}
