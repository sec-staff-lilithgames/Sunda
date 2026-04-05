package kh;

import com.google.api.DocumentationRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a1 extends GeneratedMessageLite.Builder implements b1 {
    public a1 clearDeprecationDescription() {
        copyOnWrite();
        ((DocumentationRule) this.instance).clearDeprecationDescription();
        return this;
    }

    public a1 clearDescription() {
        copyOnWrite();
        ((DocumentationRule) this.instance).clearDescription();
        return this;
    }

    public a1 clearSelector() {
        copyOnWrite();
        ((DocumentationRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.b1
    public String getDeprecationDescription() {
        return ((DocumentationRule) this.instance).getDeprecationDescription();
    }

    @Override // kh.b1
    public ByteString getDeprecationDescriptionBytes() {
        return ((DocumentationRule) this.instance).getDeprecationDescriptionBytes();
    }

    @Override // kh.b1
    public String getDescription() {
        return ((DocumentationRule) this.instance).getDescription();
    }

    @Override // kh.b1
    public ByteString getDescriptionBytes() {
        return ((DocumentationRule) this.instance).getDescriptionBytes();
    }

    @Override // kh.b1
    public String getSelector() {
        return ((DocumentationRule) this.instance).getSelector();
    }

    @Override // kh.b1
    public ByteString getSelectorBytes() {
        return ((DocumentationRule) this.instance).getSelectorBytes();
    }

    public a1 setDeprecationDescription(String str) {
        copyOnWrite();
        ((DocumentationRule) this.instance).setDeprecationDescription(str);
        return this;
    }

    public a1 setDeprecationDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DocumentationRule) this.instance).setDeprecationDescriptionBytes(byteString);
        return this;
    }

    public a1 setDescription(String str) {
        copyOnWrite();
        ((DocumentationRule) this.instance).setDescription(str);
        return this;
    }

    public a1 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DocumentationRule) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public a1 setSelector(String str) {
        copyOnWrite();
        ((DocumentationRule) this.instance).setSelector(str);
        return this;
    }

    public a1 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DocumentationRule) this.instance).setSelectorBytes(byteString);
        return this;
    }
}
