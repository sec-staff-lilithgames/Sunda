package bj;

import com.google.firebase.inappmessaging.MessagesProto$BannerMessage;
import com.google.firebase.inappmessaging.MessagesProto$CardMessage;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.firebase.inappmessaging.MessagesProto$ImageOnlyMessage;
import com.google.firebase.inappmessaging.MessagesProto$ModalMessage;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o1 extends GeneratedMessageLite.Builder implements q1 {
    public o1 clearBanner() {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).clearBanner();
        return this;
    }

    public o1 clearCard() {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).clearCard();
        return this;
    }

    public o1 clearImageOnly() {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).clearImageOnly();
        return this;
    }

    public o1 clearMessageDetails() {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).clearMessageDetails();
        return this;
    }

    public o1 clearModal() {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).clearModal();
        return this;
    }

    @Override // bj.q1
    public MessagesProto$BannerMessage getBanner() {
        return ((MessagesProto$Content) this.instance).getBanner();
    }

    @Override // bj.q1
    public MessagesProto$CardMessage getCard() {
        return ((MessagesProto$Content) this.instance).getCard();
    }

    @Override // bj.q1
    public MessagesProto$ImageOnlyMessage getImageOnly() {
        return ((MessagesProto$Content) this.instance).getImageOnly();
    }

    @Override // bj.q1
    public p1 getMessageDetailsCase() {
        return ((MessagesProto$Content) this.instance).getMessageDetailsCase();
    }

    @Override // bj.q1
    public MessagesProto$ModalMessage getModal() {
        return ((MessagesProto$Content) this.instance).getModal();
    }

    @Override // bj.q1
    public boolean hasBanner() {
        return ((MessagesProto$Content) this.instance).hasBanner();
    }

    @Override // bj.q1
    public boolean hasCard() {
        return ((MessagesProto$Content) this.instance).hasCard();
    }

    @Override // bj.q1
    public boolean hasImageOnly() {
        return ((MessagesProto$Content) this.instance).hasImageOnly();
    }

    @Override // bj.q1
    public boolean hasModal() {
        return ((MessagesProto$Content) this.instance).hasModal();
    }

    public o1 mergeBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).mergeBanner(messagesProto$BannerMessage);
        return this;
    }

    public o1 mergeCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).mergeCard(messagesProto$CardMessage);
        return this;
    }

    public o1 mergeImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).mergeImageOnly(messagesProto$ImageOnlyMessage);
        return this;
    }

    public o1 mergeModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).mergeModal(messagesProto$ModalMessage);
        return this;
    }

    public o1 setBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setBanner(messagesProto$BannerMessage);
        return this;
    }

    public o1 setCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setCard(messagesProto$CardMessage);
        return this;
    }

    public o1 setImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setImageOnly(messagesProto$ImageOnlyMessage);
        return this;
    }

    public o1 setModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setModal(messagesProto$ModalMessage);
        return this;
    }

    public o1 setBanner(i1 i1Var) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setBanner((MessagesProto$BannerMessage) i1Var.build());
        return this;
    }

    public o1 setCard(m1 m1Var) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setCard((MessagesProto$CardMessage) m1Var.build());
        return this;
    }

    public o1 setImageOnly(r1 r1Var) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setImageOnly((MessagesProto$ImageOnlyMessage) r1Var.build());
        return this;
    }

    public o1 setModal(t1 t1Var) {
        copyOnWrite();
        ((MessagesProto$Content) this.instance).setModal((MessagesProto$ModalMessage) t1Var.build());
        return this;
    }
}
