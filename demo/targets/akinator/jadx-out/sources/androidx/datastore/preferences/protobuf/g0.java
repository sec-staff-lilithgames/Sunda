package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends f0 {

    /* renamed from: i, reason: collision with root package name */
    public final ByteBuffer f5883i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5884j;

    public g0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f5883i = byteBuffer;
        this.f5884j = byteBuffer.position();
    }

    @Override // androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.l0
    public void flush() {
        this.f5883i.position(getTotalBytesWritten() + this.f5884j);
    }
}
