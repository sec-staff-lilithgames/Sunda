package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.ResourceInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w extends GeneratedMessageLite.Builder implements x {
    public w clearDescription() {
        copyOnWrite();
        ((ResourceInfo) this.instance).clearDescription();
        return this;
    }

    public w clearOwner() {
        copyOnWrite();
        ((ResourceInfo) this.instance).clearOwner();
        return this;
    }

    public w clearResourceName() {
        copyOnWrite();
        ((ResourceInfo) this.instance).clearResourceName();
        return this;
    }

    public w clearResourceType() {
        copyOnWrite();
        ((ResourceInfo) this.instance).clearResourceType();
        return this;
    }

    @Override // uk.x
    public String getDescription() {
        return ((ResourceInfo) this.instance).getDescription();
    }

    @Override // uk.x
    public ByteString getDescriptionBytes() {
        return ((ResourceInfo) this.instance).getDescriptionBytes();
    }

    @Override // uk.x
    public String getOwner() {
        return ((ResourceInfo) this.instance).getOwner();
    }

    @Override // uk.x
    public ByteString getOwnerBytes() {
        return ((ResourceInfo) this.instance).getOwnerBytes();
    }

    @Override // uk.x
    public String getResourceName() {
        return ((ResourceInfo) this.instance).getResourceName();
    }

    @Override // uk.x
    public ByteString getResourceNameBytes() {
        return ((ResourceInfo) this.instance).getResourceNameBytes();
    }

    @Override // uk.x
    public String getResourceType() {
        return ((ResourceInfo) this.instance).getResourceType();
    }

    @Override // uk.x
    public ByteString getResourceTypeBytes() {
        return ((ResourceInfo) this.instance).getResourceTypeBytes();
    }

    public w setDescription(String str) {
        copyOnWrite();
        ((ResourceInfo) this.instance).setDescription(str);
        return this;
    }

    public w setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceInfo) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public w setOwner(String str) {
        copyOnWrite();
        ((ResourceInfo) this.instance).setOwner(str);
        return this;
    }

    public w setOwnerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceInfo) this.instance).setOwnerBytes(byteString);
        return this;
    }

    public w setResourceName(String str) {
        copyOnWrite();
        ((ResourceInfo) this.instance).setResourceName(str);
        return this;
    }

    public w setResourceNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceInfo) this.instance).setResourceNameBytes(byteString);
        return this;
    }

    public w setResourceType(String str) {
        copyOnWrite();
        ((ResourceInfo) this.instance).setResourceType(str);
        return this;
    }

    public w setResourceTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceInfo) this.instance).setResourceTypeBytes(byteString);
        return this;
    }
}
