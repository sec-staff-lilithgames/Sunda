package kh;

import com.google.api.LabelDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u1 extends GeneratedMessageLite.Builder implements y1 {
    public u1 clearDescription() {
        copyOnWrite();
        ((LabelDescriptor) this.instance).clearDescription();
        return this;
    }

    public u1 clearKey() {
        copyOnWrite();
        ((LabelDescriptor) this.instance).clearKey();
        return this;
    }

    public u1 clearValueType() {
        copyOnWrite();
        ((LabelDescriptor) this.instance).clearValueType();
        return this;
    }

    @Override // kh.y1
    public String getDescription() {
        return ((LabelDescriptor) this.instance).getDescription();
    }

    @Override // kh.y1
    public ByteString getDescriptionBytes() {
        return ((LabelDescriptor) this.instance).getDescriptionBytes();
    }

    @Override // kh.y1
    public String getKey() {
        return ((LabelDescriptor) this.instance).getKey();
    }

    @Override // kh.y1
    public ByteString getKeyBytes() {
        return ((LabelDescriptor) this.instance).getKeyBytes();
    }

    @Override // kh.y1
    public x1 getValueType() {
        return ((LabelDescriptor) this.instance).getValueType();
    }

    @Override // kh.y1
    public int getValueTypeValue() {
        return ((LabelDescriptor) this.instance).getValueTypeValue();
    }

    public u1 setDescription(String str) {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setDescription(str);
        return this;
    }

    public u1 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public u1 setKey(String str) {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setKey(str);
        return this;
    }

    public u1 setKeyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setKeyBytes(byteString);
        return this;
    }

    public u1 setValueType(x1 x1Var) {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setValueType(x1Var);
        return this;
    }

    public u1 setValueTypeValue(int i10) {
        copyOnWrite();
        ((LabelDescriptor) this.instance).setValueTypeValue(i10);
        return this;
    }
}
