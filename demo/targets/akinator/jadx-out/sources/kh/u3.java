package kh;

import com.google.api.Property;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u3 extends GeneratedMessageLite.Builder implements y3 {
    public u3 clearDescription() {
        copyOnWrite();
        ((Property) this.instance).clearDescription();
        return this;
    }

    public u3 clearName() {
        copyOnWrite();
        ((Property) this.instance).clearName();
        return this;
    }

    public u3 clearType() {
        copyOnWrite();
        ((Property) this.instance).clearType();
        return this;
    }

    @Override // kh.y3
    public String getDescription() {
        return ((Property) this.instance).getDescription();
    }

    @Override // kh.y3
    public ByteString getDescriptionBytes() {
        return ((Property) this.instance).getDescriptionBytes();
    }

    @Override // kh.y3
    public String getName() {
        return ((Property) this.instance).getName();
    }

    @Override // kh.y3
    public ByteString getNameBytes() {
        return ((Property) this.instance).getNameBytes();
    }

    @Override // kh.y3
    public x3 getType() {
        return ((Property) this.instance).getType();
    }

    @Override // kh.y3
    public int getTypeValue() {
        return ((Property) this.instance).getTypeValue();
    }

    public u3 setDescription(String str) {
        copyOnWrite();
        ((Property) this.instance).setDescription(str);
        return this;
    }

    public u3 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Property) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public u3 setName(String str) {
        copyOnWrite();
        ((Property) this.instance).setName(str);
        return this;
    }

    public u3 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Property) this.instance).setNameBytes(byteString);
        return this;
    }

    public u3 setType(x3 x3Var) {
        copyOnWrite();
        ((Property) this.instance).setType(x3Var);
        return this;
    }

    public u3 setTypeValue(int i10) {
        copyOnWrite();
        ((Property) this.instance).setTypeValue(i10);
        return this;
    }
}
