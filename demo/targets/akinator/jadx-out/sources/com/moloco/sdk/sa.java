package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface sa extends MessageLiteOrBuilder {
    UserIntent$UserAdInteractionExt.Button getButtons(int i10);

    int getButtonsCount();

    List<UserIntent$UserAdInteractionExt.Button> getButtonsList();

    UserIntent$UserAdInteractionExt.Position getClickPos();

    UserIntent$UserAdInteractionExt.Size getScreenSize();

    UserIntent$UserAdInteractionExt.Position getViewPos();

    UserIntent$UserAdInteractionExt.Size getViewSize();

    boolean hasClickPos();

    boolean hasScreenSize();

    boolean hasViewPos();

    boolean hasViewSize();
}
