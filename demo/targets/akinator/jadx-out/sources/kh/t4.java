package kh;

import com.google.api.SourceInfo;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t4 extends GeneratedMessageLite.Builder implements u4 {
    public t4 addAllSourceFiles(Iterable<? extends Any> iterable) {
        copyOnWrite();
        ((SourceInfo) this.instance).addAllSourceFiles(iterable);
        return this;
    }

    public t4 addSourceFiles(Any any) {
        copyOnWrite();
        ((SourceInfo) this.instance).addSourceFiles(any);
        return this;
    }

    public t4 clearSourceFiles() {
        copyOnWrite();
        ((SourceInfo) this.instance).clearSourceFiles();
        return this;
    }

    @Override // kh.u4
    public Any getSourceFiles(int i10) {
        return ((SourceInfo) this.instance).getSourceFiles(i10);
    }

    @Override // kh.u4
    public int getSourceFilesCount() {
        return ((SourceInfo) this.instance).getSourceFilesCount();
    }

    @Override // kh.u4
    public List<Any> getSourceFilesList() {
        return Collections.unmodifiableList(((SourceInfo) this.instance).getSourceFilesList());
    }

    public t4 removeSourceFiles(int i10) {
        copyOnWrite();
        ((SourceInfo) this.instance).removeSourceFiles(i10);
        return this;
    }

    public t4 setSourceFiles(int i10, Any any) {
        copyOnWrite();
        ((SourceInfo) this.instance).setSourceFiles(i10, any);
        return this;
    }

    public t4 addSourceFiles(int i10, Any any) {
        copyOnWrite();
        ((SourceInfo) this.instance).addSourceFiles(i10, any);
        return this;
    }

    public t4 setSourceFiles(int i10, Any.Builder builder) {
        copyOnWrite();
        ((SourceInfo) this.instance).setSourceFiles(i10, builder.build());
        return this;
    }

    public t4 addSourceFiles(Any.Builder builder) {
        copyOnWrite();
        ((SourceInfo) this.instance).addSourceFiles(builder.build());
        return this;
    }

    public t4 addSourceFiles(int i10, Any.Builder builder) {
        copyOnWrite();
        ((SourceInfo) this.instance).addSourceFiles(i10, builder.build());
        return this;
    }
}
