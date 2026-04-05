package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.38, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public interface AnonymousClass38 {
    public static final ByteBuffer A00 = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    AnonymousClass36 A4z(AnonymousClass36 anonymousClass36) throws AnonymousClass37;

    ByteBuffer A8V();

    boolean AAC();

    boolean AAG();

    void AGW();

    void AGX(ByteBuffer byteBuffer);

    void flush();
}
