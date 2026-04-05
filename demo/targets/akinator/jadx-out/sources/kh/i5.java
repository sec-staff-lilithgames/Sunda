package kh;

import com.google.api.UsageRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i5 extends GeneratedMessageLite.Builder implements j5 {
    public i5 clearAllowUnregisteredCalls() {
        copyOnWrite();
        ((UsageRule) this.instance).clearAllowUnregisteredCalls();
        return this;
    }

    public i5 clearSelector() {
        copyOnWrite();
        ((UsageRule) this.instance).clearSelector();
        return this;
    }

    public i5 clearSkipServiceControl() {
        copyOnWrite();
        ((UsageRule) this.instance).clearSkipServiceControl();
        return this;
    }

    @Override // kh.j5
    public boolean getAllowUnregisteredCalls() {
        return ((UsageRule) this.instance).getAllowUnregisteredCalls();
    }

    @Override // kh.j5
    public String getSelector() {
        return ((UsageRule) this.instance).getSelector();
    }

    @Override // kh.j5
    public ByteString getSelectorBytes() {
        return ((UsageRule) this.instance).getSelectorBytes();
    }

    @Override // kh.j5
    public boolean getSkipServiceControl() {
        return ((UsageRule) this.instance).getSkipServiceControl();
    }

    public i5 setAllowUnregisteredCalls(boolean z10) {
        copyOnWrite();
        ((UsageRule) this.instance).setAllowUnregisteredCalls(z10);
        return this;
    }

    public i5 setSelector(String str) {
        copyOnWrite();
        ((UsageRule) this.instance).setSelector(str);
        return this;
    }

    public i5 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UsageRule) this.instance).setSelectorBytes(byteString);
        return this;
    }

    public i5 setSkipServiceControl(boolean z10) {
        copyOnWrite();
        ((UsageRule) this.instance).setSkipServiceControl(z10);
        return this;
    }
}
