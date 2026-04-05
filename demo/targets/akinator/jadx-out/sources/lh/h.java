package lh;

import com.google.cloud.audit.AuthorizationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends GeneratedMessageLite.Builder implements i {
    public h clearGranted() {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).clearGranted();
        return this;
    }

    public h clearPermission() {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).clearPermission();
        return this;
    }

    public h clearResource() {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).clearResource();
        return this;
    }

    @Override // lh.i
    public boolean getGranted() {
        return ((AuthorizationInfo) this.instance).getGranted();
    }

    @Override // lh.i
    public String getPermission() {
        return ((AuthorizationInfo) this.instance).getPermission();
    }

    @Override // lh.i
    public ByteString getPermissionBytes() {
        return ((AuthorizationInfo) this.instance).getPermissionBytes();
    }

    @Override // lh.i
    public String getResource() {
        return ((AuthorizationInfo) this.instance).getResource();
    }

    @Override // lh.i
    public ByteString getResourceBytes() {
        return ((AuthorizationInfo) this.instance).getResourceBytes();
    }

    public h setGranted(boolean z10) {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).setGranted(z10);
        return this;
    }

    public h setPermission(String str) {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).setPermission(str);
        return this;
    }

    public h setPermissionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).setPermissionBytes(byteString);
        return this;
    }

    public h setResource(String str) {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).setResource(str);
        return this;
    }

    public h setResourceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthorizationInfo) this.instance).setResourceBytes(byteString);
        return this;
    }
}
