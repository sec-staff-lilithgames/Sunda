package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class xa implements AbstractMessage.BuilderParent {

    /* renamed from: a, reason: collision with root package name */
    public AbstractMessage.BuilderParent f22889a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractMessage.Builder f22890b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractMessage f22891c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22892d;

    public xa(AbstractMessage abstractMessage, AbstractMessage.BuilderParent builderParent, boolean z10) {
        Charset charset = x7.f22881a;
        abstractMessage.getClass();
        this.f22891c = abstractMessage;
        this.f22889a = builderParent;
        this.f22892d = z10;
    }

    public final void a() {
        AbstractMessage.BuilderParent builderParent;
        if (this.f22890b != null) {
            this.f22891c = null;
        }
        if (!this.f22892d || (builderParent = this.f22889a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f22892d = false;
    }

    public AbstractMessage build() {
        this.f22892d = true;
        return getMessage();
    }

    public xa clear() {
        AbstractMessage abstractMessage = this.f22891c;
        this.f22891c = (AbstractMessage) (abstractMessage != null ? abstractMessage.getDefaultInstanceForType() : this.f22890b.getDefaultInstanceForType());
        AbstractMessage.Builder builder = this.f22890b;
        if (builder != null) {
            builder.dispose();
            this.f22890b = null;
        }
        a();
        return this;
    }

    public void dispose() {
        this.f22889a = null;
    }

    public AbstractMessage.Builder getBuilder() {
        if (this.f22890b == null) {
            AbstractMessage.Builder builder = (AbstractMessage.Builder) this.f22891c.newBuilderForType(this);
            this.f22890b = builder;
            builder.mergeFrom((Message) this.f22891c);
            this.f22890b.markClean();
        }
        return this.f22890b;
    }

    public AbstractMessage getMessage() {
        if (this.f22891c == null) {
            this.f22891c = (AbstractMessage) this.f22890b.buildPartial();
        }
        return this.f22891c;
    }

    public MessageOrBuilder getMessageOrBuilder() {
        AbstractMessage.Builder builder = this.f22890b;
        return builder != null ? builder : this.f22891c;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.xa mergeFrom(com.explorestack.protobuf.AbstractMessage r3) {
        /*
            r2 = this;
            com.explorestack.protobuf.AbstractMessage$Builder r0 = r2.f22890b
            if (r0 != 0) goto Lf
            com.explorestack.protobuf.AbstractMessage r0 = r2.f22891c
            com.explorestack.protobuf.Message r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.f22891c = r3
            goto L16
        Lf:
            com.explorestack.protobuf.AbstractMessage$Builder r0 = r2.getBuilder()
            r0.mergeFrom(r3)
        L16:
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.xa.mergeFrom(com.explorestack.protobuf.AbstractMessage):com.explorestack.protobuf.xa");
    }

    public xa setMessage(AbstractMessage abstractMessage) {
        Charset charset = x7.f22881a;
        abstractMessage.getClass();
        this.f22891c = abstractMessage;
        AbstractMessage.Builder builder = this.f22890b;
        if (builder != null) {
            builder.dispose();
            this.f22890b = null;
        }
        a();
        return this;
    }
}
