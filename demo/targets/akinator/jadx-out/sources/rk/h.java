package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.ClientAppInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h extends GeneratedMessageLite.Builder implements i {
    public h clearAppInstanceId() {
        copyOnWrite();
        ((ClientAppInfo) this.instance).clearAppInstanceId();
        return this;
    }

    public h clearAppInstanceIdToken() {
        copyOnWrite();
        ((ClientAppInfo) this.instance).clearAppInstanceIdToken();
        return this;
    }

    public h clearGmpAppId() {
        copyOnWrite();
        ((ClientAppInfo) this.instance).clearGmpAppId();
        return this;
    }

    @Override // rk.i
    public String getAppInstanceId() {
        return ((ClientAppInfo) this.instance).getAppInstanceId();
    }

    @Override // rk.i
    public ByteString getAppInstanceIdBytes() {
        return ((ClientAppInfo) this.instance).getAppInstanceIdBytes();
    }

    @Override // rk.i
    public String getAppInstanceIdToken() {
        return ((ClientAppInfo) this.instance).getAppInstanceIdToken();
    }

    @Override // rk.i
    public ByteString getAppInstanceIdTokenBytes() {
        return ((ClientAppInfo) this.instance).getAppInstanceIdTokenBytes();
    }

    @Override // rk.i
    public String getGmpAppId() {
        return ((ClientAppInfo) this.instance).getGmpAppId();
    }

    @Override // rk.i
    public ByteString getGmpAppIdBytes() {
        return ((ClientAppInfo) this.instance).getGmpAppIdBytes();
    }

    public h setAppInstanceId(String str) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setAppInstanceId(str);
        return this;
    }

    public h setAppInstanceIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setAppInstanceIdBytes(byteString);
        return this;
    }

    public h setAppInstanceIdToken(String str) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setAppInstanceIdToken(str);
        return this;
    }

    public h setAppInstanceIdTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setAppInstanceIdTokenBytes(byteString);
        return this;
    }

    public h setGmpAppId(String str) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setGmpAppId(str);
        return this;
    }

    public h setGmpAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setGmpAppIdBytes(byteString);
        return this;
    }
}
