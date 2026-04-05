package y8;

import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f94143a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: y8.a$a, reason: collision with other inner class name */
    public static class C0813a implements f {
        @Override // com.bumptech.glide.load.data.f
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.f
        public g build(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f94143a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public ByteBuffer rewindAndGet() {
        ByteBuffer byteBuffer = this.f94143a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }
}
