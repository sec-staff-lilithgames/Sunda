package uh;

import com.google.developers.mobile.targeting.proto.ClientSignalsProto$ClientSignals;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d extends GeneratedMessageLite.Builder implements e {
    public d clearAppVersion() {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).clearAppVersion();
        return this;
    }

    public d clearLanguageCode() {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).clearLanguageCode();
        return this;
    }

    public d clearPlatformVersion() {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).clearPlatformVersion();
        return this;
    }

    public d clearTimeZone() {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).clearTimeZone();
        return this;
    }

    @Override // uh.e
    public String getAppVersion() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getAppVersion();
    }

    @Override // uh.e
    public ByteString getAppVersionBytes() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getAppVersionBytes();
    }

    @Override // uh.e
    public String getLanguageCode() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getLanguageCode();
    }

    @Override // uh.e
    public ByteString getLanguageCodeBytes() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getLanguageCodeBytes();
    }

    @Override // uh.e
    public String getPlatformVersion() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getPlatformVersion();
    }

    @Override // uh.e
    public ByteString getPlatformVersionBytes() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getPlatformVersionBytes();
    }

    @Override // uh.e
    public String getTimeZone() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getTimeZone();
    }

    @Override // uh.e
    public ByteString getTimeZoneBytes() {
        return ((ClientSignalsProto$ClientSignals) this.instance).getTimeZoneBytes();
    }

    public d setAppVersion(String str) {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setAppVersion(str);
        return this;
    }

    public d setAppVersionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setAppVersionBytes(byteString);
        return this;
    }

    public d setLanguageCode(String str) {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setLanguageCode(str);
        return this;
    }

    public d setLanguageCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setLanguageCodeBytes(byteString);
        return this;
    }

    public d setPlatformVersion(String str) {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setPlatformVersion(str);
        return this;
    }

    public d setPlatformVersionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setPlatformVersionBytes(byteString);
        return this;
    }

    public d setTimeZone(String str) {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setTimeZone(str);
        return this;
    }

    public d setTimeZoneBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$ClientSignals) this.instance).setTimeZoneBytes(byteString);
        return this;
    }
}
