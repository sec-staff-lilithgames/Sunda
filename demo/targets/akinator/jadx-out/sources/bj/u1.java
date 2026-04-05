package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface u1 extends MessageLiteOrBuilder {
    MessagesProto$Action getAction();

    MessagesProto$Button getActionButton();

    String getBackgroundHexColor();

    ByteString getBackgroundHexColorBytes();

    MessagesProto$Text getBody();

    String getImageUrl();

    ByteString getImageUrlBytes();

    MessagesProto$Text getTitle();

    boolean hasAction();

    boolean hasActionButton();

    boolean hasBody();

    boolean hasTitle();
}
