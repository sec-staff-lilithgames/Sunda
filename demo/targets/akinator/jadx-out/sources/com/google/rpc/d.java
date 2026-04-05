package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.Help;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends GeneratedMessageLite.Builder implements f {
    public d addAllLinks(Iterable<? extends Help.Link> iterable) {
        copyOnWrite();
        ((Help) this.instance).addAllLinks(iterable);
        return this;
    }

    public d addLinks(Help.Link link) {
        copyOnWrite();
        ((Help) this.instance).addLinks(link);
        return this;
    }

    public d clearLinks() {
        copyOnWrite();
        ((Help) this.instance).clearLinks();
        return this;
    }

    @Override // com.google.rpc.f
    public Help.Link getLinks(int i10) {
        return ((Help) this.instance).getLinks(i10);
    }

    @Override // com.google.rpc.f
    public int getLinksCount() {
        return ((Help) this.instance).getLinksCount();
    }

    @Override // com.google.rpc.f
    public List<Help.Link> getLinksList() {
        return Collections.unmodifiableList(((Help) this.instance).getLinksList());
    }

    public d removeLinks(int i10) {
        copyOnWrite();
        ((Help) this.instance).removeLinks(i10);
        return this;
    }

    public d setLinks(int i10, Help.Link link) {
        copyOnWrite();
        ((Help) this.instance).setLinks(i10, link);
        return this;
    }

    public d addLinks(int i10, Help.Link link) {
        copyOnWrite();
        ((Help) this.instance).addLinks(i10, link);
        return this;
    }

    public d setLinks(int i10, e eVar) {
        copyOnWrite();
        ((Help) this.instance).setLinks(i10, (Help.Link) eVar.build());
        return this;
    }

    public d addLinks(e eVar) {
        copyOnWrite();
        ((Help) this.instance).addLinks((Help.Link) eVar.build());
        return this;
    }

    public d addLinks(int i10, e eVar) {
        copyOnWrite();
        ((Help) this.instance).addLinks(i10, (Help.Link) eVar.build());
        return this;
    }
}
