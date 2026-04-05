package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$ModalMessage;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t1 extends GeneratedMessageLite.Builder implements u1 {
    public t1 clearAction() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearAction();
        return this;
    }

    public t1 clearActionButton() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearActionButton();
        return this;
    }

    public t1 clearBackgroundHexColor() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearBackgroundHexColor();
        return this;
    }

    public t1 clearBody() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearBody();
        return this;
    }

    public t1 clearImageUrl() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearImageUrl();
        return this;
    }

    public t1 clearTitle() {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).clearTitle();
        return this;
    }

    @Override // bj.u1
    public MessagesProto$Action getAction() {
        return ((MessagesProto$ModalMessage) this.instance).getAction();
    }

    @Override // bj.u1
    public MessagesProto$Button getActionButton() {
        return ((MessagesProto$ModalMessage) this.instance).getActionButton();
    }

    @Override // bj.u1
    public String getBackgroundHexColor() {
        return ((MessagesProto$ModalMessage) this.instance).getBackgroundHexColor();
    }

    @Override // bj.u1
    public ByteString getBackgroundHexColorBytes() {
        return ((MessagesProto$ModalMessage) this.instance).getBackgroundHexColorBytes();
    }

    @Override // bj.u1
    public MessagesProto$Text getBody() {
        return ((MessagesProto$ModalMessage) this.instance).getBody();
    }

    @Override // bj.u1
    public String getImageUrl() {
        return ((MessagesProto$ModalMessage) this.instance).getImageUrl();
    }

    @Override // bj.u1
    public ByteString getImageUrlBytes() {
        return ((MessagesProto$ModalMessage) this.instance).getImageUrlBytes();
    }

    @Override // bj.u1
    public MessagesProto$Text getTitle() {
        return ((MessagesProto$ModalMessage) this.instance).getTitle();
    }

    @Override // bj.u1
    public boolean hasAction() {
        return ((MessagesProto$ModalMessage) this.instance).hasAction();
    }

    @Override // bj.u1
    public boolean hasActionButton() {
        return ((MessagesProto$ModalMessage) this.instance).hasActionButton();
    }

    @Override // bj.u1
    public boolean hasBody() {
        return ((MessagesProto$ModalMessage) this.instance).hasBody();
    }

    @Override // bj.u1
    public boolean hasTitle() {
        return ((MessagesProto$ModalMessage) this.instance).hasTitle();
    }

    public t1 mergeAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).mergeAction(messagesProto$Action);
        return this;
    }

    public t1 mergeActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).mergeActionButton(messagesProto$Button);
        return this;
    }

    public t1 mergeBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).mergeBody(messagesProto$Text);
        return this;
    }

    public t1 mergeTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).mergeTitle(messagesProto$Text);
        return this;
    }

    public t1 setAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setAction(messagesProto$Action);
        return this;
    }

    public t1 setActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setActionButton(messagesProto$Button);
        return this;
    }

    public t1 setBackgroundHexColor(String str) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setBackgroundHexColor(str);
        return this;
    }

    public t1 setBackgroundHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setBackgroundHexColorBytes(byteString);
        return this;
    }

    public t1 setBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setBody(messagesProto$Text);
        return this;
    }

    public t1 setImageUrl(String str) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setImageUrl(str);
        return this;
    }

    public t1 setImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setImageUrlBytes(byteString);
        return this;
    }

    public t1 setTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setTitle(messagesProto$Text);
        return this;
    }

    public t1 setAction(g1 g1Var) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setAction((MessagesProto$Action) g1Var.build());
        return this;
    }

    public t1 setActionButton(k1 k1Var) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setActionButton((MessagesProto$Button) k1Var.build());
        return this;
    }

    public t1 setBody(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setBody((MessagesProto$Text) v1Var.build());
        return this;
    }

    public t1 setTitle(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$ModalMessage) this.instance).setTitle((MessagesProto$Text) v1Var.build());
        return this;
    }
}
