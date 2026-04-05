package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.ErrorInfo;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g extends GeneratedMessageLite.Builder implements i {
    public g clearDomain() {
        copyOnWrite();
        ((ErrorInfo) this.instance).clearDomain();
        return this;
    }

    public g clearMetadata() {
        copyOnWrite();
        ((ErrorInfo) this.instance).getMutableMetadataMap().clear();
        return this;
    }

    public g clearReason() {
        copyOnWrite();
        ((ErrorInfo) this.instance).clearReason();
        return this;
    }

    @Override // uk.i
    public boolean containsMetadata(String str) {
        str.getClass();
        return ((ErrorInfo) this.instance).getMetadataMap().containsKey(str);
    }

    @Override // uk.i
    public String getDomain() {
        return ((ErrorInfo) this.instance).getDomain();
    }

    @Override // uk.i
    public ByteString getDomainBytes() {
        return ((ErrorInfo) this.instance).getDomainBytes();
    }

    @Override // uk.i
    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    @Override // uk.i
    public int getMetadataCount() {
        return ((ErrorInfo) this.instance).getMetadataMap().size();
    }

    @Override // uk.i
    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(((ErrorInfo) this.instance).getMetadataMap());
    }

    @Override // uk.i
    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> metadataMap = ((ErrorInfo) this.instance).getMetadataMap();
        return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
    }

    @Override // uk.i
    public String getMetadataOrThrow(String str) {
        str.getClass();
        Map<String, String> metadataMap = ((ErrorInfo) this.instance).getMetadataMap();
        if (metadataMap.containsKey(str)) {
            return metadataMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // uk.i
    public String getReason() {
        return ((ErrorInfo) this.instance).getReason();
    }

    @Override // uk.i
    public ByteString getReasonBytes() {
        return ((ErrorInfo) this.instance).getReasonBytes();
    }

    public g putAllMetadata(Map<String, String> map) {
        copyOnWrite();
        ((ErrorInfo) this.instance).getMutableMetadataMap().putAll(map);
        return this;
    }

    public g putMetadata(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((ErrorInfo) this.instance).getMutableMetadataMap().put(str, str2);
        return this;
    }

    public g removeMetadata(String str) {
        str.getClass();
        copyOnWrite();
        ((ErrorInfo) this.instance).getMutableMetadataMap().remove(str);
        return this;
    }

    public g setDomain(String str) {
        copyOnWrite();
        ((ErrorInfo) this.instance).setDomain(str);
        return this;
    }

    public g setDomainBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ErrorInfo) this.instance).setDomainBytes(byteString);
        return this;
    }

    public g setReason(String str) {
        copyOnWrite();
        ((ErrorInfo) this.instance).setReason(str);
        return this;
    }

    public g setReasonBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ErrorInfo) this.instance).setReasonBytes(byteString);
        return this;
    }
}
