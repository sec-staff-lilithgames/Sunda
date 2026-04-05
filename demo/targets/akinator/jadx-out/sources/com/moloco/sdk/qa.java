package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface qa extends MessageLiteOrBuilder {
    UserIntent$UserAdInteractionExt.Position getPos();

    UserIntent$UserAdInteractionExt.Size getSize();

    pa getType();

    int getTypeValue();

    boolean hasPos();

    boolean hasSize();
}
