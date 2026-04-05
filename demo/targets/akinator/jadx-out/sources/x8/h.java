package x8;

import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements n8.x {

    /* renamed from: a, reason: collision with root package name */
    public final d f91827a = new d();

    @Override // n8.x
    public p8.v0 decode(ByteBuffer byteBuffer, int i10, int i11, n8.v vVar) throws IOException {
        return this.f91827a.decode(ImageDecoder.createSource(byteBuffer), i10, i11, vVar);
    }

    @Override // n8.x
    public boolean handles(ByteBuffer byteBuffer, n8.v vVar) throws IOException {
        return true;
    }
}
