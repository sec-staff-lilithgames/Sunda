package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$ImageOnlyMessage;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r1 extends GeneratedMessageLite.Builder implements s1 {
    public r1 clearAction() {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).clearAction();
        return this;
    }

    public r1 clearImageUrl() {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).clearImageUrl();
        return this;
    }

    @Override // bj.s1
    public MessagesProto$Action getAction() {
        return ((MessagesProto$ImageOnlyMessage) this.instance).getAction();
    }

    @Override // bj.s1
    public String getImageUrl() {
        return ((MessagesProto$ImageOnlyMessage) this.instance).getImageUrl();
    }

    @Override // bj.s1
    public ByteString getImageUrlBytes() {
        return ((MessagesProto$ImageOnlyMessage) this.instance).getImageUrlBytes();
    }

    @Override // bj.s1
    public boolean hasAction() {
        return ((MessagesProto$ImageOnlyMessage) this.instance).hasAction();
    }

    public r1 mergeAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).mergeAction(messagesProto$Action);
        return this;
    }

    public r1 setAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).setAction(messagesProto$Action);
        return this;
    }

    public r1 setImageUrl(String str) {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).setImageUrl(str);
        return this;
    }

    public r1 setImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).setImageUrlBytes(byteString);
        return this;
    }

    public r1 setAction(g1 g1Var) {
        copyOnWrite();
        ((MessagesProto$ImageOnlyMessage) this.instance).setAction((MessagesProto$Action) g1Var.build());
        return this;
    }
}
