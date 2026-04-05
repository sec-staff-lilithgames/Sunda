package io.ktor.utils.io;

import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2 extends f0 implements a {
    final /* synthetic */ int $count;
    final /* synthetic */ ByteChannelSequentialBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$awaitAtLeastNBytesAvailableForWrite$2(ByteChannelSequentialBase byteChannelSequentialBase, int i10) {
        super(0);
        this.this$0 = byteChannelSequentialBase;
        this.$count = i10;
    }

    @Override // kv.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.getAvailableForWrite() < this.$count && !this.this$0.getClosed());
    }
}
