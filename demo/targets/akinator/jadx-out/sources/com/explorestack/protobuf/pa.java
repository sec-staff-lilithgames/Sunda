package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class pa implements AbstractMessage.BuilderParent {

    /* renamed from: a, reason: collision with root package name */
    public AbstractMessage.BuilderParent f22493a;

    /* renamed from: b, reason: collision with root package name */
    public List f22494b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22495c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f22496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22497e;

    /* renamed from: f, reason: collision with root package name */
    public na f22498f;

    /* renamed from: g, reason: collision with root package name */
    public ma f22499g;

    /* renamed from: h, reason: collision with root package name */
    public oa f22500h;

    public pa(List<AbstractMessage> list, boolean z10, AbstractMessage.BuilderParent builderParent, boolean z11) {
        this.f22494b = list;
        this.f22495c = z10;
        this.f22493a = builderParent;
        this.f22497e = z11;
    }

    public final void a() {
        if (this.f22496d == null) {
            this.f22496d = new ArrayList(this.f22494b.size());
            for (int i10 = 0; i10 < this.f22494b.size(); i10++) {
                this.f22496d.add(null);
            }
        }
    }

    public pa addAllMessages(Iterable<AbstractMessage> iterable) {
        int size;
        for (AbstractMessage abstractMessage : iterable) {
            Charset charset = x7.f22881a;
            abstractMessage.getClass();
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return this;
            }
            size = collection.size();
        } else {
            size = -1;
        }
        b();
        if (size >= 0) {
            List list = this.f22494b;
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
        }
        Iterator<AbstractMessage> it = iterable.iterator();
        while (it.hasNext()) {
            addMessage(it.next());
        }
        e();
        d();
        return this;
    }

    public AbstractMessage.Builder addBuilder(AbstractMessage abstractMessage) {
        b();
        a();
        xa xaVar = new xa(abstractMessage, this, this.f22497e);
        this.f22494b.add(null);
        this.f22496d.add(xaVar);
        e();
        d();
        return xaVar.getBuilder();
    }

    public pa addMessage(AbstractMessage abstractMessage) {
        Charset charset = x7.f22881a;
        abstractMessage.getClass();
        b();
        this.f22494b.add(abstractMessage);
        ArrayList arrayList = this.f22496d;
        if (arrayList != null) {
            arrayList.add(null);
        }
        e();
        d();
        return this;
    }

    public final void b() {
        if (this.f22495c) {
            return;
        }
        this.f22494b = new ArrayList(this.f22494b);
        this.f22495c = true;
    }

    public List<AbstractMessage> build() {
        this.f22497e = true;
        boolean z10 = this.f22495c;
        if (!z10 && this.f22496d == null) {
            return this.f22494b;
        }
        if (!z10) {
            for (int i10 = 0; i10 < this.f22494b.size(); i10++) {
                Message message = (Message) this.f22494b.get(i10);
                xa xaVar = (xa) this.f22496d.get(i10);
                if (xaVar == null || xaVar.build() == message) {
                }
            }
            return this.f22494b;
        }
        b();
        for (int i11 = 0; i11 < this.f22494b.size(); i11++) {
            this.f22494b.set(i11, c(i11, true));
        }
        List<AbstractMessage> listUnmodifiableList = Collections.unmodifiableList(this.f22494b);
        this.f22494b = listUnmodifiableList;
        this.f22495c = false;
        return listUnmodifiableList;
    }

    public final AbstractMessage c(int i10, boolean z10) {
        ArrayList arrayList = this.f22496d;
        if (arrayList == null) {
            return (AbstractMessage) this.f22494b.get(i10);
        }
        xa xaVar = (xa) arrayList.get(i10);
        return xaVar == null ? (AbstractMessage) this.f22494b.get(i10) : z10 ? xaVar.build() : xaVar.getMessage();
    }

    public void clear() {
        this.f22494b = Collections.EMPTY_LIST;
        this.f22495c = false;
        ArrayList arrayList = this.f22496d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xa xaVar = (xa) it.next();
                if (xaVar != null) {
                    xaVar.dispose();
                }
            }
            this.f22496d = null;
        }
        e();
        d();
    }

    public final void d() {
        na naVar = this.f22498f;
        if (naVar != null) {
            naVar.c();
        }
        ma maVar = this.f22499g;
        if (maVar != null) {
            maVar.c();
        }
        oa oaVar = this.f22500h;
        if (oaVar != null) {
            oaVar.c();
        }
    }

    public void dispose() {
        this.f22493a = null;
    }

    public final void e() {
        AbstractMessage.BuilderParent builderParent;
        if (!this.f22497e || (builderParent = this.f22493a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f22497e = false;
    }

    public AbstractMessage.Builder getBuilder(int i10) {
        a();
        xa xaVar = (xa) this.f22496d.get(i10);
        if (xaVar == null) {
            xa xaVar2 = new xa((AbstractMessage) this.f22494b.get(i10), this, this.f22497e);
            this.f22496d.set(i10, xaVar2);
            xaVar = xaVar2;
        }
        return xaVar.getBuilder();
    }

    public List<AbstractMessage.Builder> getBuilderList() {
        if (this.f22499g == null) {
            this.f22499g = new ma(this);
        }
        return this.f22499g;
    }

    public int getCount() {
        return this.f22494b.size();
    }

    public AbstractMessage getMessage(int i10) {
        return c(i10, false);
    }

    public List<AbstractMessage> getMessageList() {
        if (this.f22498f == null) {
            this.f22498f = new na(this);
        }
        return this.f22498f;
    }

    public MessageOrBuilder getMessageOrBuilder(int i10) {
        ArrayList arrayList = this.f22496d;
        if (arrayList == null) {
            return (MessageOrBuilder) this.f22494b.get(i10);
        }
        xa xaVar = (xa) arrayList.get(i10);
        return xaVar == null ? (MessageOrBuilder) this.f22494b.get(i10) : xaVar.getMessageOrBuilder();
    }

    public List<MessageOrBuilder> getMessageOrBuilderList() {
        if (this.f22500h == null) {
            this.f22500h = new oa(this);
        }
        return this.f22500h;
    }

    public boolean isEmpty() {
        return this.f22494b.isEmpty();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        e();
    }

    public void remove(int i10) {
        xa xaVar;
        b();
        this.f22494b.remove(i10);
        ArrayList arrayList = this.f22496d;
        if (arrayList != null && (xaVar = (xa) arrayList.remove(i10)) != null) {
            xaVar.dispose();
        }
        e();
        d();
    }

    public pa setMessage(int i10, AbstractMessage abstractMessage) {
        xa xaVar;
        Charset charset = x7.f22881a;
        abstractMessage.getClass();
        b();
        this.f22494b.set(i10, abstractMessage);
        ArrayList arrayList = this.f22496d;
        if (arrayList != null && (xaVar = (xa) arrayList.set(i10, null)) != null) {
            xaVar.dispose();
        }
        e();
        d();
        return this;
    }

    public AbstractMessage.Builder addBuilder(int i10, AbstractMessage abstractMessage) {
        b();
        a();
        xa xaVar = new xa(abstractMessage, this, this.f22497e);
        this.f22494b.add(i10, null);
        this.f22496d.add(i10, xaVar);
        e();
        d();
        return xaVar.getBuilder();
    }

    public pa addMessage(int i10, AbstractMessage abstractMessage) {
        Charset charset = x7.f22881a;
        abstractMessage.getClass();
        b();
        this.f22494b.add(i10, abstractMessage);
        ArrayList arrayList = this.f22496d;
        if (arrayList != null) {
            arrayList.add(i10, null);
        }
        e();
        d();
        return this;
    }
}
