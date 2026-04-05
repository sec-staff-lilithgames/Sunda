package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$CardMessage;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m1 extends GeneratedMessageLite.Builder implements n1 {
    public m1 clearBackgroundHexColor() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearBackgroundHexColor();
        return this;
    }

    public m1 clearBody() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearBody();
        return this;
    }

    public m1 clearLandscapeImageUrl() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearLandscapeImageUrl();
        return this;
    }

    public m1 clearPortraitImageUrl() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearPortraitImageUrl();
        return this;
    }

    public m1 clearPrimaryAction() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearPrimaryAction();
        return this;
    }

    public m1 clearPrimaryActionButton() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearPrimaryActionButton();
        return this;
    }

    public m1 clearSecondaryAction() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearSecondaryAction();
        return this;
    }

    public m1 clearSecondaryActionButton() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearSecondaryActionButton();
        return this;
    }

    public m1 clearTitle() {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).clearTitle();
        return this;
    }

    @Override // bj.n1
    public String getBackgroundHexColor() {
        return ((MessagesProto$CardMessage) this.instance).getBackgroundHexColor();
    }

    @Override // bj.n1
    public ByteString getBackgroundHexColorBytes() {
        return ((MessagesProto$CardMessage) this.instance).getBackgroundHexColorBytes();
    }

    @Override // bj.n1
    public MessagesProto$Text getBody() {
        return ((MessagesProto$CardMessage) this.instance).getBody();
    }

    @Override // bj.n1
    public String getLandscapeImageUrl() {
        return ((MessagesProto$CardMessage) this.instance).getLandscapeImageUrl();
    }

    @Override // bj.n1
    public ByteString getLandscapeImageUrlBytes() {
        return ((MessagesProto$CardMessage) this.instance).getLandscapeImageUrlBytes();
    }

    @Override // bj.n1
    public String getPortraitImageUrl() {
        return ((MessagesProto$CardMessage) this.instance).getPortraitImageUrl();
    }

    @Override // bj.n1
    public ByteString getPortraitImageUrlBytes() {
        return ((MessagesProto$CardMessage) this.instance).getPortraitImageUrlBytes();
    }

    @Override // bj.n1
    public MessagesProto$Action getPrimaryAction() {
        return ((MessagesProto$CardMessage) this.instance).getPrimaryAction();
    }

    @Override // bj.n1
    public MessagesProto$Button getPrimaryActionButton() {
        return ((MessagesProto$CardMessage) this.instance).getPrimaryActionButton();
    }

    @Override // bj.n1
    public MessagesProto$Action getSecondaryAction() {
        return ((MessagesProto$CardMessage) this.instance).getSecondaryAction();
    }

    @Override // bj.n1
    public MessagesProto$Button getSecondaryActionButton() {
        return ((MessagesProto$CardMessage) this.instance).getSecondaryActionButton();
    }

    @Override // bj.n1
    public MessagesProto$Text getTitle() {
        return ((MessagesProto$CardMessage) this.instance).getTitle();
    }

    @Override // bj.n1
    public boolean hasBody() {
        return ((MessagesProto$CardMessage) this.instance).hasBody();
    }

    @Override // bj.n1
    public boolean hasPrimaryAction() {
        return ((MessagesProto$CardMessage) this.instance).hasPrimaryAction();
    }

    @Override // bj.n1
    public boolean hasPrimaryActionButton() {
        return ((MessagesProto$CardMessage) this.instance).hasPrimaryActionButton();
    }

    @Override // bj.n1
    public boolean hasSecondaryAction() {
        return ((MessagesProto$CardMessage) this.instance).hasSecondaryAction();
    }

    @Override // bj.n1
    public boolean hasSecondaryActionButton() {
        return ((MessagesProto$CardMessage) this.instance).hasSecondaryActionButton();
    }

    @Override // bj.n1
    public boolean hasTitle() {
        return ((MessagesProto$CardMessage) this.instance).hasTitle();
    }

    public m1 mergeBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergeBody(messagesProto$Text);
        return this;
    }

    public m1 mergePrimaryAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergePrimaryAction(messagesProto$Action);
        return this;
    }

    public m1 mergePrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergePrimaryActionButton(messagesProto$Button);
        return this;
    }

    public m1 mergeSecondaryAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergeSecondaryAction(messagesProto$Action);
        return this;
    }

    public m1 mergeSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergeSecondaryActionButton(messagesProto$Button);
        return this;
    }

    public m1 mergeTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).mergeTitle(messagesProto$Text);
        return this;
    }

    public m1 setBackgroundHexColor(String str) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setBackgroundHexColor(str);
        return this;
    }

    public m1 setBackgroundHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setBackgroundHexColorBytes(byteString);
        return this;
    }

    public m1 setBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setBody(messagesProto$Text);
        return this;
    }

    public m1 setLandscapeImageUrl(String str) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setLandscapeImageUrl(str);
        return this;
    }

    public m1 setLandscapeImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setLandscapeImageUrlBytes(byteString);
        return this;
    }

    public m1 setPortraitImageUrl(String str) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPortraitImageUrl(str);
        return this;
    }

    public m1 setPortraitImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPortraitImageUrlBytes(byteString);
        return this;
    }

    public m1 setPrimaryAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPrimaryAction(messagesProto$Action);
        return this;
    }

    public m1 setPrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPrimaryActionButton(messagesProto$Button);
        return this;
    }

    public m1 setSecondaryAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setSecondaryAction(messagesProto$Action);
        return this;
    }

    public m1 setSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setSecondaryActionButton(messagesProto$Button);
        return this;
    }

    public m1 setTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setTitle(messagesProto$Text);
        return this;
    }

    public m1 setBody(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setBody((MessagesProto$Text) v1Var.build());
        return this;
    }

    public m1 setPrimaryAction(g1 g1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPrimaryAction((MessagesProto$Action) g1Var.build());
        return this;
    }

    public m1 setPrimaryActionButton(k1 k1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setPrimaryActionButton((MessagesProto$Button) k1Var.build());
        return this;
    }

    public m1 setSecondaryAction(g1 g1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setSecondaryAction((MessagesProto$Action) g1Var.build());
        return this;
    }

    public m1 setSecondaryActionButton(k1 k1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setSecondaryActionButton((MessagesProto$Button) k1Var.build());
        return this;
    }

    public m1 setTitle(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$CardMessage) this.instance).setTitle((MessagesProto$Text) v1Var.build());
        return this;
    }
}
