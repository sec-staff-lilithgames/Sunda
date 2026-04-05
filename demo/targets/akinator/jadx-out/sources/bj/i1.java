package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.firebase.inappmessaging.MessagesProto$BannerMessage;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i1 extends GeneratedMessageLite.Builder implements j1 {
    public i1 clearAction() {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).clearAction();
        return this;
    }

    public i1 clearBackgroundHexColor() {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).clearBackgroundHexColor();
        return this;
    }

    public i1 clearBody() {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).clearBody();
        return this;
    }

    public i1 clearImageUrl() {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).clearImageUrl();
        return this;
    }

    public i1 clearTitle() {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).clearTitle();
        return this;
    }

    @Override // bj.j1
    public MessagesProto$Action getAction() {
        return ((MessagesProto$BannerMessage) this.instance).getAction();
    }

    @Override // bj.j1
    public String getBackgroundHexColor() {
        return ((MessagesProto$BannerMessage) this.instance).getBackgroundHexColor();
    }

    @Override // bj.j1
    public ByteString getBackgroundHexColorBytes() {
        return ((MessagesProto$BannerMessage) this.instance).getBackgroundHexColorBytes();
    }

    @Override // bj.j1
    public MessagesProto$Text getBody() {
        return ((MessagesProto$BannerMessage) this.instance).getBody();
    }

    @Override // bj.j1
    public String getImageUrl() {
        return ((MessagesProto$BannerMessage) this.instance).getImageUrl();
    }

    @Override // bj.j1
    public ByteString getImageUrlBytes() {
        return ((MessagesProto$BannerMessage) this.instance).getImageUrlBytes();
    }

    @Override // bj.j1
    public MessagesProto$Text getTitle() {
        return ((MessagesProto$BannerMessage) this.instance).getTitle();
    }

    @Override // bj.j1
    public boolean hasAction() {
        return ((MessagesProto$BannerMessage) this.instance).hasAction();
    }

    @Override // bj.j1
    public boolean hasBody() {
        return ((MessagesProto$BannerMessage) this.instance).hasBody();
    }

    @Override // bj.j1
    public boolean hasTitle() {
        return ((MessagesProto$BannerMessage) this.instance).hasTitle();
    }

    public i1 mergeAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).mergeAction(messagesProto$Action);
        return this;
    }

    public i1 mergeBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).mergeBody(messagesProto$Text);
        return this;
    }

    public i1 mergeTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).mergeTitle(messagesProto$Text);
        return this;
    }

    public i1 setAction(MessagesProto$Action messagesProto$Action) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setAction(messagesProto$Action);
        return this;
    }

    public i1 setBackgroundHexColor(String str) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setBackgroundHexColor(str);
        return this;
    }

    public i1 setBackgroundHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setBackgroundHexColorBytes(byteString);
        return this;
    }

    public i1 setBody(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setBody(messagesProto$Text);
        return this;
    }

    public i1 setImageUrl(String str) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setImageUrl(str);
        return this;
    }

    public i1 setImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setImageUrlBytes(byteString);
        return this;
    }

    public i1 setTitle(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setTitle(messagesProto$Text);
        return this;
    }

    public i1 setAction(g1 g1Var) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setAction((MessagesProto$Action) g1Var.build());
        return this;
    }

    public i1 setBody(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setBody((MessagesProto$Text) v1Var.build());
        return this;
    }

    public i1 setTitle(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$BannerMessage) this.instance).setTitle((MessagesProto$Text) v1Var.build());
        return this;
    }
}
