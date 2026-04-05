package io.ktor.client.request;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelKt;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ClientUpgradeContent$content$2 extends f0 implements a {
    public static final ClientUpgradeContent$content$2 INSTANCE = new ClientUpgradeContent$content$2();

    public ClientUpgradeContent$content$2() {
        super(0);
    }

    @Override // kv.a
    public final ByteChannel invoke() {
        return ByteChannelKt.ByteChannel$default(false, 1, null);
    }
}
