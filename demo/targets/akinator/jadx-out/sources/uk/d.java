package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.DebugInfo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends GeneratedMessageLite.Builder implements e {
    public d addAllStackEntries(Iterable<String> iterable) {
        copyOnWrite();
        ((DebugInfo) this.instance).addAllStackEntries(iterable);
        return this;
    }

    public d addStackEntries(String str) {
        copyOnWrite();
        ((DebugInfo) this.instance).addStackEntries(str);
        return this;
    }

    public d addStackEntriesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DebugInfo) this.instance).addStackEntriesBytes(byteString);
        return this;
    }

    public d clearDetail() {
        copyOnWrite();
        ((DebugInfo) this.instance).clearDetail();
        return this;
    }

    public d clearStackEntries() {
        copyOnWrite();
        ((DebugInfo) this.instance).clearStackEntries();
        return this;
    }

    @Override // uk.e
    public String getDetail() {
        return ((DebugInfo) this.instance).getDetail();
    }

    @Override // uk.e
    public ByteString getDetailBytes() {
        return ((DebugInfo) this.instance).getDetailBytes();
    }

    @Override // uk.e
    public String getStackEntries(int i10) {
        return ((DebugInfo) this.instance).getStackEntries(i10);
    }

    @Override // uk.e
    public ByteString getStackEntriesBytes(int i10) {
        return ((DebugInfo) this.instance).getStackEntriesBytes(i10);
    }

    @Override // uk.e
    public int getStackEntriesCount() {
        return ((DebugInfo) this.instance).getStackEntriesCount();
    }

    @Override // uk.e
    public List<String> getStackEntriesList() {
        return Collections.unmodifiableList(((DebugInfo) this.instance).getStackEntriesList());
    }

    public d setDetail(String str) {
        copyOnWrite();
        ((DebugInfo) this.instance).setDetail(str);
        return this;
    }

    public d setDetailBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DebugInfo) this.instance).setDetailBytes(byteString);
        return this;
    }

    public d setStackEntries(int i10, String str) {
        copyOnWrite();
        ((DebugInfo) this.instance).setStackEntries(i10, str);
        return this;
    }
}
