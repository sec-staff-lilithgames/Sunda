package bj;

import com.google.firebase.inappmessaging.MessagesProto$Button;
import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k1 extends GeneratedMessageLite.Builder implements l1 {
    public k1 clearButtonHexColor() {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).clearButtonHexColor();
        return this;
    }

    public k1 clearText() {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).clearText();
        return this;
    }

    @Override // bj.l1
    public String getButtonHexColor() {
        return ((MessagesProto$Button) this.instance).getButtonHexColor();
    }

    @Override // bj.l1
    public ByteString getButtonHexColorBytes() {
        return ((MessagesProto$Button) this.instance).getButtonHexColorBytes();
    }

    @Override // bj.l1
    public MessagesProto$Text getText() {
        return ((MessagesProto$Button) this.instance).getText();
    }

    @Override // bj.l1
    public boolean hasText() {
        return ((MessagesProto$Button) this.instance).hasText();
    }

    public k1 mergeText(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).mergeText(messagesProto$Text);
        return this;
    }

    public k1 setButtonHexColor(String str) {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).setButtonHexColor(str);
        return this;
    }

    public k1 setButtonHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).setButtonHexColorBytes(byteString);
        return this;
    }

    public k1 setText(MessagesProto$Text messagesProto$Text) {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).setText(messagesProto$Text);
        return this;
    }

    public k1 setText(v1 v1Var) {
        copyOnWrite();
        ((MessagesProto$Button) this.instance).setText((MessagesProto$Text) v1Var.build());
        return this;
    }
}
