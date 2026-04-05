package io.ktor.client.request.forms;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ChannelProvider {
    private final a block;
    private final Long size;

    public ChannelProvider(Long l9, a block) {
        e0.checkNotNullParameter(block, "block");
        this.size = l9;
        this.block = block;
    }

    public final a getBlock() {
        return this.block;
    }

    public final Long getSize() {
        return this.size;
    }

    public /* synthetic */ ChannelProvider(Long l9, a aVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : l9, aVar);
    }
}
