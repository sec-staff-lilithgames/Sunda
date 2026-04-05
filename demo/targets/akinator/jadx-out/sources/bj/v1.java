package bj;

import com.google.firebase.inappmessaging.MessagesProto$Text;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v1 extends GeneratedMessageLite.Builder implements w1 {
    public v1 clearHexColor() {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).clearHexColor();
        return this;
    }

    public v1 clearText() {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).clearText();
        return this;
    }

    @Override // bj.w1
    public String getHexColor() {
        return ((MessagesProto$Text) this.instance).getHexColor();
    }

    @Override // bj.w1
    public ByteString getHexColorBytes() {
        return ((MessagesProto$Text) this.instance).getHexColorBytes();
    }

    @Override // bj.w1
    public String getText() {
        return ((MessagesProto$Text) this.instance).getText();
    }

    @Override // bj.w1
    public ByteString getTextBytes() {
        return ((MessagesProto$Text) this.instance).getTextBytes();
    }

    public v1 setHexColor(String str) {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).setHexColor(str);
        return this;
    }

    public v1 setHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).setHexColorBytes(byteString);
        return this;
    }

    public v1 setText(String str) {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).setText(str);
        return this;
    }

    public v1 setTextBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$Text) this.instance).setTextBytes(byteString);
        return this;
    }
}
