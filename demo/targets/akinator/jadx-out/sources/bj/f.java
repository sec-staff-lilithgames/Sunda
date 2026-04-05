package bj;

import com.google.firebase.inappmessaging.ClientAppInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f extends GeneratedMessageLite.Builder implements g {
    public f clearFirebaseInstanceId() {
        copyOnWrite();
        ((ClientAppInfo) this.instance).clearFirebaseInstanceId();
        return this;
    }

    public f clearGoogleAppId() {
        copyOnWrite();
        ((ClientAppInfo) this.instance).clearGoogleAppId();
        return this;
    }

    @Override // bj.g
    public String getFirebaseInstanceId() {
        return ((ClientAppInfo) this.instance).getFirebaseInstanceId();
    }

    @Override // bj.g
    public ByteString getFirebaseInstanceIdBytes() {
        return ((ClientAppInfo) this.instance).getFirebaseInstanceIdBytes();
    }

    @Override // bj.g
    public String getGoogleAppId() {
        return ((ClientAppInfo) this.instance).getGoogleAppId();
    }

    @Override // bj.g
    public ByteString getGoogleAppIdBytes() {
        return ((ClientAppInfo) this.instance).getGoogleAppIdBytes();
    }

    @Override // bj.g
    public boolean hasFirebaseInstanceId() {
        return ((ClientAppInfo) this.instance).hasFirebaseInstanceId();
    }

    @Override // bj.g
    public boolean hasGoogleAppId() {
        return ((ClientAppInfo) this.instance).hasGoogleAppId();
    }

    public f setFirebaseInstanceId(String str) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setFirebaseInstanceId(str);
        return this;
    }

    public f setFirebaseInstanceIdBytes(ByteString byteString) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setFirebaseInstanceIdBytes(byteString);
        return this;
    }

    public f setGoogleAppId(String str) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setGoogleAppId(str);
        return this;
    }

    public f setGoogleAppIdBytes(ByteString byteString) {
        copyOnWrite();
        ((ClientAppInfo) this.instance).setGoogleAppIdBytes(byteString);
        return this;
    }
}
