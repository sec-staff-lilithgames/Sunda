package io.ktor.websocket;

import io.ktor.util.NIOKt;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SimpleFrameCollector {
    private ByteBuffer buffer;
    private final ByteBuffer maskBuffer = ByteBuffer.allocate(4);
    private int remaining;

    public final boolean getHasRemaining() {
        return this.remaining > 0;
    }

    public final void handle(ByteBuffer bb2) {
        e0.checkNotNullParameter(bb2, "bb");
        int i10 = this.remaining;
        ByteBuffer byteBuffer = this.buffer;
        e0.checkNotNull(byteBuffer);
        this.remaining = i10 - NIOKt.moveTo(bb2, byteBuffer, this.remaining);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(int r2, java.nio.ByteBuffer r3) {
        /*
            r1 = this;
            java.lang.String r0 = "bb"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            int r0 = r1.remaining
            if (r0 != 0) goto L2a
            r1.remaining = r2
            java.nio.ByteBuffer r0 = r1.buffer
            if (r0 == 0) goto L18
            kotlin.jvm.internal.e0.checkNotNull(r0)
            int r0 = r0.capacity()
            if (r0 >= r2) goto L1e
        L18:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.buffer = r2
        L1e:
            java.nio.ByteBuffer r2 = r1.buffer
            kotlin.jvm.internal.e0.checkNotNull(r2)
            r2.clear()
            r1.handle(r3)
            return
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "remaining should be 0"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.SimpleFrameCollector.start(int, java.nio.ByteBuffer):void");
    }

    public final ByteBuffer take(Integer num) {
        ByteBuffer byteBuffer = this.buffer;
        e0.checkNotNull(byteBuffer);
        byteBuffer.flip();
        ByteBuffer view = byteBuffer.slice();
        if (num != null) {
            this.maskBuffer.clear();
            this.maskBuffer.asIntBuffer().put(num.intValue());
            this.maskBuffer.clear();
            e0.checkNotNullExpressionValue(view, "view");
            ByteBuffer maskBuffer = this.maskBuffer;
            e0.checkNotNullExpressionValue(maskBuffer, "maskBuffer");
            UtilsKt.xor(view, maskBuffer);
        }
        this.buffer = null;
        ByteBuffer byteBufferAsReadOnlyBuffer = view.asReadOnlyBuffer();
        e0.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "buffer!!.run {\n        f….asReadOnlyBuffer()\n    }");
        return byteBufferAsReadOnlyBuffer;
    }
}
