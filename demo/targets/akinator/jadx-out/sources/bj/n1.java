package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface n1 extends MessageLiteOrBuilder {
    String getBackgroundHexColor();

    ByteString getBackgroundHexColorBytes();

    MessagesProto$Text getBody();

    String getLandscapeImageUrl();

    ByteString getLandscapeImageUrlBytes();

    String getPortraitImageUrl();

    ByteString getPortraitImageUrlBytes();

    MessagesProto$Action getPrimaryAction();

    MessagesProto$Button getPrimaryActionButton();

    MessagesProto$Action getSecondaryAction();

    MessagesProto$Button getSecondaryActionButton();

    MessagesProto$Text getTitle();

    boolean hasBody();

    boolean hasPrimaryAction();

    boolean hasPrimaryActionButton();

    boolean hasSecondaryAction();

    boolean hasSecondaryActionButton();

    boolean hasTitle();
}
