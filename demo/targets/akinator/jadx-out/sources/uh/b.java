package uh;

import com.google.developers.mobile.targeting.proto.ClientSignalsProto$AppInstanceClaim;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearAppInstanceId() {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).clearAppInstanceId();
        return this;
    }

    public b clearAppInstanceToken() {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).clearAppInstanceToken();
        return this;
    }

    public b clearGmpAppId() {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).clearGmpAppId();
        return this;
    }

    @Override // uh.c
    public String getAppInstanceId() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getAppInstanceId();
    }

    @Override // uh.c
    public ByteString getAppInstanceIdBytes() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getAppInstanceIdBytes();
    }

    @Override // uh.c
    public String getAppInstanceToken() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getAppInstanceToken();
    }

    @Override // uh.c
    public ByteString getAppInstanceTokenBytes() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getAppInstanceTokenBytes();
    }

    @Override // uh.c
    public String getGmpAppId() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getGmpAppId();
    }

    @Override // uh.c
    public ByteString getGmpAppIdBytes() {
        return ((ClientSignalsProto$AppInstanceClaim) this.instance).getGmpAppIdBytes();
    }

    public b setAppInstanceId(String str) {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setAppInstanceId(str);
        return this;
    }

    public b setAppInstanceIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setAppInstanceIdBytes(byteString);
        return this;
    }

    public b setAppInstanceToken(String str) {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setAppInstanceToken(str);
        return this;
    }

    public b setAppInstanceTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setAppInstanceTokenBytes(byteString);
        return this;
    }

    public b setGmpAppId(String str) {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setGmpAppId(str);
        return this;
    }

    public b setGmpAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientSignalsProto$AppInstanceClaim) this.instance).setGmpAppIdBytes(byteString);
        return this;
    }
}
