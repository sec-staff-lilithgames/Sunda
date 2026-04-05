package kh;

import com.google.api.Endpoint;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d1 extends GeneratedMessageLite.Builder implements e1 {
    @Deprecated
    public d1 addAliases(String str) {
        copyOnWrite();
        ((Endpoint) this.instance).addAliases(str);
        return this;
    }

    @Deprecated
    public d1 addAliasesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Endpoint) this.instance).addAliasesBytes(byteString);
        return this;
    }

    @Deprecated
    public d1 addAllAliases(Iterable<String> iterable) {
        copyOnWrite();
        ((Endpoint) this.instance).addAllAliases(iterable);
        return this;
    }

    public d1 addAllFeatures(Iterable<String> iterable) {
        copyOnWrite();
        ((Endpoint) this.instance).addAllFeatures(iterable);
        return this;
    }

    public d1 addFeatures(String str) {
        copyOnWrite();
        ((Endpoint) this.instance).addFeatures(str);
        return this;
    }

    public d1 addFeaturesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Endpoint) this.instance).addFeaturesBytes(byteString);
        return this;
    }

    @Deprecated
    public d1 clearAliases() {
        copyOnWrite();
        ((Endpoint) this.instance).clearAliases();
        return this;
    }

    public d1 clearAllowCors() {
        copyOnWrite();
        ((Endpoint) this.instance).clearAllowCors();
        return this;
    }

    public d1 clearFeatures() {
        copyOnWrite();
        ((Endpoint) this.instance).clearFeatures();
        return this;
    }

    public d1 clearName() {
        copyOnWrite();
        ((Endpoint) this.instance).clearName();
        return this;
    }

    public d1 clearTarget() {
        copyOnWrite();
        ((Endpoint) this.instance).clearTarget();
        return this;
    }

    @Override // kh.e1
    @Deprecated
    public String getAliases(int i10) {
        return ((Endpoint) this.instance).getAliases(i10);
    }

    @Override // kh.e1
    @Deprecated
    public ByteString getAliasesBytes(int i10) {
        return ((Endpoint) this.instance).getAliasesBytes(i10);
    }

    @Override // kh.e1
    @Deprecated
    public int getAliasesCount() {
        return ((Endpoint) this.instance).getAliasesCount();
    }

    @Override // kh.e1
    @Deprecated
    public List<String> getAliasesList() {
        return Collections.unmodifiableList(((Endpoint) this.instance).getAliasesList());
    }

    @Override // kh.e1
    public boolean getAllowCors() {
        return ((Endpoint) this.instance).getAllowCors();
    }

    @Override // kh.e1
    public String getFeatures(int i10) {
        return ((Endpoint) this.instance).getFeatures(i10);
    }

    @Override // kh.e1
    public ByteString getFeaturesBytes(int i10) {
        return ((Endpoint) this.instance).getFeaturesBytes(i10);
    }

    @Override // kh.e1
    public int getFeaturesCount() {
        return ((Endpoint) this.instance).getFeaturesCount();
    }

    @Override // kh.e1
    public List<String> getFeaturesList() {
        return Collections.unmodifiableList(((Endpoint) this.instance).getFeaturesList());
    }

    @Override // kh.e1
    public String getName() {
        return ((Endpoint) this.instance).getName();
    }

    @Override // kh.e1
    public ByteString getNameBytes() {
        return ((Endpoint) this.instance).getNameBytes();
    }

    @Override // kh.e1
    public String getTarget() {
        return ((Endpoint) this.instance).getTarget();
    }

    @Override // kh.e1
    public ByteString getTargetBytes() {
        return ((Endpoint) this.instance).getTargetBytes();
    }

    @Deprecated
    public d1 setAliases(int i10, String str) {
        copyOnWrite();
        ((Endpoint) this.instance).setAliases(i10, str);
        return this;
    }

    public d1 setAllowCors(boolean z10) {
        copyOnWrite();
        ((Endpoint) this.instance).setAllowCors(z10);
        return this;
    }

    public d1 setFeatures(int i10, String str) {
        copyOnWrite();
        ((Endpoint) this.instance).setFeatures(i10, str);
        return this;
    }

    public d1 setName(String str) {
        copyOnWrite();
        ((Endpoint) this.instance).setName(str);
        return this;
    }

    public d1 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Endpoint) this.instance).setNameBytes(byteString);
        return this;
    }

    public d1 setTarget(String str) {
        copyOnWrite();
        ((Endpoint) this.instance).setTarget(str);
        return this;
    }

    public d1 setTargetBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Endpoint) this.instance).setTargetBytes(byteString);
        return this;
    }
}
