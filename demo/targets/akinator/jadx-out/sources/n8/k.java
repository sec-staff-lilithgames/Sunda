package n8;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f75843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.b f75844b;

    public k(ByteBuffer byteBuffer, q8.b bVar) {
        this.f75843a = byteBuffer;
        this.f75844b = bVar;
    }

    @Override // n8.n
    public int getOrientationAndRewind(g gVar) throws IOException {
        ByteBuffer byteBuffer = this.f75843a;
        try {
            return gVar.getOrientation(byteBuffer, this.f75844b);
        } finally {
            j9.b.rewind(byteBuffer);
        }
    }
}
