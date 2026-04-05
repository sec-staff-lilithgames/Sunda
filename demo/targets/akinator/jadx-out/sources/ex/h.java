package ex;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import pubsubBOCollector.MessageOuterClass$UpdateAppKeyList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends GeneratedMessageLite.Builder implements i {
    public h addAllAppKeys(Iterable<String> iterable) {
        copyOnWrite();
        ((MessageOuterClass$UpdateAppKeyList) this.instance).addAllAppKeys(iterable);
        return this;
    }

    public h addAppKeys(String str) {
        copyOnWrite();
        ((MessageOuterClass$UpdateAppKeyList) this.instance).addAppKeys(str);
        return this;
    }

    public h addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessageOuterClass$UpdateAppKeyList) this.instance).addAppKeysBytes(byteString);
        return this;
    }

    public h clearAppKeys() {
        copyOnWrite();
        ((MessageOuterClass$UpdateAppKeyList) this.instance).clearAppKeys();
        return this;
    }

    @Override // ex.i
    public String getAppKeys(int i10) {
        return ((MessageOuterClass$UpdateAppKeyList) this.instance).getAppKeys(i10);
    }

    @Override // ex.i
    public ByteString getAppKeysBytes(int i10) {
        return ((MessageOuterClass$UpdateAppKeyList) this.instance).getAppKeysBytes(i10);
    }

    @Override // ex.i
    public int getAppKeysCount() {
        return ((MessageOuterClass$UpdateAppKeyList) this.instance).getAppKeysCount();
    }

    @Override // ex.i
    public List<String> getAppKeysList() {
        return Collections.unmodifiableList(((MessageOuterClass$UpdateAppKeyList) this.instance).getAppKeysList());
    }

    public h setAppKeys(int i10, String str) {
        copyOnWrite();
        ((MessageOuterClass$UpdateAppKeyList) this.instance).setAppKeys(i10, str);
        return this;
    }
}
