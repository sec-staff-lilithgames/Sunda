package x8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z0 implements n8.t {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f91887a = ByteBuffer.allocate(8);

    @Override // n8.t
    public void update(byte[] bArr, Long l9, MessageDigest messageDigest) {
        messageDigest.update(bArr);
        synchronized (this.f91887a) {
            this.f91887a.position(0);
            messageDigest.update(this.f91887a.putLong(l9.longValue()).array());
        }
    }
}
