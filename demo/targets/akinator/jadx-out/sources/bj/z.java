package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$TriggerParam;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z extends GeneratedMessageLite.Builder implements a0 {
    public z clearDoubleValue() {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).clearDoubleValue();
        return this;
    }

    public z clearFloatValue() {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).clearFloatValue();
        return this;
    }

    public z clearIntValue() {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).clearIntValue();
        return this;
    }

    public z clearName() {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).clearName();
        return this;
    }

    public z clearStringValue() {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).clearStringValue();
        return this;
    }

    @Override // bj.a0
    public double getDoubleValue() {
        return ((CommonTypesProto$TriggerParam) this.instance).getDoubleValue();
    }

    @Override // bj.a0
    public float getFloatValue() {
        return ((CommonTypesProto$TriggerParam) this.instance).getFloatValue();
    }

    @Override // bj.a0
    public long getIntValue() {
        return ((CommonTypesProto$TriggerParam) this.instance).getIntValue();
    }

    @Override // bj.a0
    public String getName() {
        return ((CommonTypesProto$TriggerParam) this.instance).getName();
    }

    @Override // bj.a0
    public ByteString getNameBytes() {
        return ((CommonTypesProto$TriggerParam) this.instance).getNameBytes();
    }

    @Override // bj.a0
    public String getStringValue() {
        return ((CommonTypesProto$TriggerParam) this.instance).getStringValue();
    }

    @Override // bj.a0
    public ByteString getStringValueBytes() {
        return ((CommonTypesProto$TriggerParam) this.instance).getStringValueBytes();
    }

    public z setDoubleValue(double d10) {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setDoubleValue(d10);
        return this;
    }

    public z setFloatValue(float f10) {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setFloatValue(f10);
        return this;
    }

    public z setIntValue(long j10) {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setIntValue(j10);
        return this;
    }

    public z setName(String str) {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setName(str);
        return this;
    }

    public z setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setNameBytes(byteString);
        return this;
    }

    public z setStringValue(String str) {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setStringValue(str);
        return this;
    }

    public z setStringValueBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CommonTypesProto$TriggerParam) this.instance).setStringValueBytes(byteString);
        return this;
    }
}
