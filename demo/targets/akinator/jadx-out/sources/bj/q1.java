package bj;

import com.google.firebase.inappmessaging.MessagesProto$BannerMessage;
import com.google.firebase.inappmessaging.MessagesProto$CardMessage;
import com.google.firebase.inappmessaging.MessagesProto$ImageOnlyMessage;
import com.google.firebase.inappmessaging.MessagesProto$ModalMessage;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface q1 extends MessageLiteOrBuilder {
    MessagesProto$BannerMessage getBanner();

    MessagesProto$CardMessage getCard();

    MessagesProto$ImageOnlyMessage getImageOnly();

    p1 getMessageDetailsCase();

    MessagesProto$ModalMessage getModal();

    boolean hasBanner();

    boolean hasCard();

    boolean hasImageOnly();

    boolean hasModal();
}
