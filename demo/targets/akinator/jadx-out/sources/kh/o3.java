package kh;

import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o3 extends GeneratedMessageLite.Builder implements p3 {
    public o3 addAllSubpages(Iterable<? extends Page> iterable) {
        copyOnWrite();
        ((Page) this.instance).addAllSubpages(iterable);
        return this;
    }

    public o3 addSubpages(Page page) {
        copyOnWrite();
        ((Page) this.instance).addSubpages(page);
        return this;
    }

    public o3 clearContent() {
        copyOnWrite();
        ((Page) this.instance).clearContent();
        return this;
    }

    public o3 clearName() {
        copyOnWrite();
        ((Page) this.instance).clearName();
        return this;
    }

    public o3 clearSubpages() {
        copyOnWrite();
        ((Page) this.instance).clearSubpages();
        return this;
    }

    @Override // kh.p3
    public String getContent() {
        return ((Page) this.instance).getContent();
    }

    @Override // kh.p3
    public ByteString getContentBytes() {
        return ((Page) this.instance).getContentBytes();
    }

    @Override // kh.p3
    public String getName() {
        return ((Page) this.instance).getName();
    }

    @Override // kh.p3
    public ByteString getNameBytes() {
        return ((Page) this.instance).getNameBytes();
    }

    @Override // kh.p3
    public Page getSubpages(int i10) {
        return ((Page) this.instance).getSubpages(i10);
    }

    @Override // kh.p3
    public int getSubpagesCount() {
        return ((Page) this.instance).getSubpagesCount();
    }

    @Override // kh.p3
    public List<Page> getSubpagesList() {
        return Collections.unmodifiableList(((Page) this.instance).getSubpagesList());
    }

    public o3 removeSubpages(int i10) {
        copyOnWrite();
        ((Page) this.instance).removeSubpages(i10);
        return this;
    }

    public o3 setContent(String str) {
        copyOnWrite();
        ((Page) this.instance).setContent(str);
        return this;
    }

    public o3 setContentBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Page) this.instance).setContentBytes(byteString);
        return this;
    }

    public o3 setName(String str) {
        copyOnWrite();
        ((Page) this.instance).setName(str);
        return this;
    }

    public o3 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Page) this.instance).setNameBytes(byteString);
        return this;
    }

    public o3 setSubpages(int i10, Page page) {
        copyOnWrite();
        ((Page) this.instance).setSubpages(i10, page);
        return this;
    }

    public o3 addSubpages(int i10, Page page) {
        copyOnWrite();
        ((Page) this.instance).addSubpages(i10, page);
        return this;
    }

    public o3 setSubpages(int i10, o3 o3Var) {
        copyOnWrite();
        ((Page) this.instance).setSubpages(i10, (Page) o3Var.build());
        return this;
    }

    public o3 addSubpages(o3 o3Var) {
        copyOnWrite();
        ((Page) this.instance).addSubpages((Page) o3Var.build());
        return this;
    }

    public o3 addSubpages(int i10, o3 o3Var) {
        copyOnWrite();
        ((Page) this.instance).addSubpages(i10, (Page) o3Var.build());
        return this;
    }
}
