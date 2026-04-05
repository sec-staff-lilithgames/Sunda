package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e1 extends o6 implements k1 {

    /* renamed from: b, reason: collision with root package name */
    public int f22067b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22068c;

    /* renamed from: e, reason: collision with root package name */
    public List f22069e;

    /* renamed from: f, reason: collision with root package name */
    public pa f22070f;

    /* renamed from: g, reason: collision with root package name */
    public n1 f22071g;

    /* renamed from: h, reason: collision with root package name */
    public xa f22072h;

    /* renamed from: i, reason: collision with root package name */
    public List f22073i;

    /* renamed from: j, reason: collision with root package name */
    public pa f22074j;

    /* renamed from: k, reason: collision with root package name */
    public g8 f22075k;

    public e1() {
        super(null);
        this.f22068c = "";
        List list = Collections.EMPTY_LIST;
        this.f22069e = list;
        this.f22073i = list;
        this.f22075k = f8.f22138e;
        if (k7.alwaysUseFieldBuilders) {
            i();
            if (this.f22072h == null) {
                this.f22072h = new xa(getOptions(), getParentForChildren(), isClean());
                this.f22071g = null;
            }
            g();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22848o;
    }

    public e1 addAllReservedName(Iterable<String> iterable) {
        c();
        b.a.addAll((Iterable) iterable, (List) this.f22075k);
        onChanged();
        return this;
    }

    public e1 addAllReservedRange(Iterable<? extends h1> iterable) {
        pa paVar = this.f22074j;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        e();
        b.a.addAll((Iterable) iterable, this.f22073i);
        onChanged();
        return this;
    }

    public e1 addAllValue(Iterable<? extends r1> iterable) {
        pa paVar = this.f22070f;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        f();
        b.a.addAll((Iterable) iterable, this.f22069e);
        onChanged();
        return this;
    }

    public e1 addReservedName(String str) {
        str.getClass();
        c();
        this.f22075k.add((g8) str);
        onChanged();
        return this;
    }

    public e1 addReservedNameBytes(ByteString byteString) {
        byteString.getClass();
        c();
        this.f22075k.add(byteString);
        onChanged();
        return this;
    }

    public e1 addReservedRange(h1 h1Var) {
        pa paVar = this.f22074j;
        if (paVar != null) {
            paVar.addMessage(h1Var);
            return this;
        }
        h1Var.getClass();
        e();
        this.f22073i.add(h1Var);
        onChanged();
        return this;
    }

    public g1 addReservedRangeBuilder() {
        return (g1) g().addBuilder(h1.getDefaultInstance());
    }

    public e1 addValue(r1 r1Var) {
        pa paVar = this.f22070f;
        if (paVar != null) {
            paVar.addMessage(r1Var);
            return this;
        }
        r1Var.getClass();
        f();
        this.f22069e.add(r1Var);
        onChanged();
        return this;
    }

    public q1 addValueBuilder() {
        return (q1) i().addBuilder(r1.getDefaultInstance());
    }

    public final void c() {
        if ((this.f22067b & 16) == 0) {
            this.f22075k = new f8(this.f22075k);
            this.f22067b |= 16;
        }
    }

    public e1 clearName() {
        this.f22067b &= -2;
        this.f22068c = j1.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public e1 clearOptions() {
        xa xaVar = this.f22072h;
        if (xaVar == null) {
            this.f22071g = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22067b &= -5;
        return this;
    }

    public e1 clearReservedName() {
        this.f22075k = f8.f22138e;
        this.f22067b &= -17;
        onChanged();
        return this;
    }

    public e1 clearReservedRange() {
        pa paVar = this.f22074j;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22073i = Collections.EMPTY_LIST;
        this.f22067b &= -9;
        onChanged();
        return this;
    }

    public e1 clearValue() {
        pa paVar = this.f22070f;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22069e = Collections.EMPTY_LIST;
        this.f22067b &= -3;
        onChanged();
        return this;
    }

    public final void e() {
        if ((this.f22067b & 8) == 0) {
            this.f22073i = new ArrayList(this.f22073i);
            this.f22067b |= 8;
        }
    }

    public final void f() {
        if ((this.f22067b & 2) == 0) {
            this.f22069e = new ArrayList(this.f22069e);
            this.f22067b |= 2;
        }
    }

    public final pa g() {
        if (this.f22074j == null) {
            this.f22074j = new pa(this.f22073i, (this.f22067b & 8) != 0, getParentForChildren(), isClean());
            this.f22073i = null;
        }
        return this.f22074j;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22848o;
    }

    @Override // com.explorestack.protobuf.k1
    public String getName() {
        Serializable serializable = this.f22068c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22068c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.k1
    public ByteString getNameBytes() {
        Serializable serializable = this.f22068c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22068c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k1
    public n1 getOptions() {
        xa xaVar = this.f22072h;
        if (xaVar != null) {
            return (n1) xaVar.getMessage();
        }
        n1 n1Var = this.f22071g;
        return n1Var == null ? n1.getDefaultInstance() : n1Var;
    }

    public m1 getOptionsBuilder() {
        this.f22067b |= 4;
        onChanged();
        if (this.f22072h == null) {
            this.f22072h = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22071g = null;
        }
        return (m1) this.f22072h.getBuilder();
    }

    @Override // com.explorestack.protobuf.k1
    public o1 getOptionsOrBuilder() {
        xa xaVar = this.f22072h;
        if (xaVar != null) {
            return (o1) xaVar.getMessageOrBuilder();
        }
        n1 n1Var = this.f22071g;
        return n1Var == null ? n1.getDefaultInstance() : n1Var;
    }

    @Override // com.explorestack.protobuf.k1
    public String getReservedName(int i10) {
        return (String) this.f22075k.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public ByteString getReservedNameBytes(int i10) {
        return this.f22075k.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public int getReservedNameCount() {
        return this.f22075k.size();
    }

    @Override // com.explorestack.protobuf.k1
    public h1 getReservedRange(int i10) {
        pa paVar = this.f22074j;
        return paVar == null ? (h1) this.f22073i.get(i10) : (h1) paVar.getMessage(i10);
    }

    public g1 getReservedRangeBuilder(int i10) {
        return (g1) g().getBuilder(i10);
    }

    public List<g1> getReservedRangeBuilderList() {
        return g().getBuilderList();
    }

    @Override // com.explorestack.protobuf.k1
    public int getReservedRangeCount() {
        pa paVar = this.f22074j;
        return paVar == null ? this.f22073i.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.k1
    public List<h1> getReservedRangeList() {
        pa paVar = this.f22074j;
        return paVar == null ? Collections.unmodifiableList(this.f22073i) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.k1
    public i1 getReservedRangeOrBuilder(int i10) {
        pa paVar = this.f22074j;
        return paVar == null ? (i1) this.f22073i.get(i10) : (i1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public List<? extends i1> getReservedRangeOrBuilderList() {
        pa paVar = this.f22074j;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22073i);
    }

    @Override // com.explorestack.protobuf.k1
    public r1 getValue(int i10) {
        pa paVar = this.f22070f;
        return paVar == null ? (r1) this.f22069e.get(i10) : (r1) paVar.getMessage(i10);
    }

    public q1 getValueBuilder(int i10) {
        return (q1) i().getBuilder(i10);
    }

    public List<q1> getValueBuilderList() {
        return i().getBuilderList();
    }

    @Override // com.explorestack.protobuf.k1
    public int getValueCount() {
        pa paVar = this.f22070f;
        return paVar == null ? this.f22069e.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.k1
    public List<r1> getValueList() {
        pa paVar = this.f22070f;
        return paVar == null ? Collections.unmodifiableList(this.f22069e) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.k1
    public s1 getValueOrBuilder(int i10) {
        pa paVar = this.f22070f;
        return paVar == null ? (s1) this.f22069e.get(i10) : (s1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public List<? extends s1> getValueOrBuilderList() {
        pa paVar = this.f22070f;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22069e);
    }

    @Override // com.explorestack.protobuf.k1
    public boolean hasName() {
        return (this.f22067b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.k1
    public boolean hasOptions() {
        return (this.f22067b & 4) != 0;
    }

    public final pa i() {
        if (this.f22070f == null) {
            this.f22070f = new pa(this.f22069e, (this.f22067b & 2) != 0, getParentForChildren(), isClean());
            this.f22069e = null;
        }
        return this.f22070f;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22849p.ensureFieldAccessorsInitialized(j1.class, e1.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getValueCount(); i10++) {
            if (!getValue(i10).isInitialized()) {
                return false;
            }
        }
        return !hasOptions() || getOptions().isInitialized();
    }

    public e1 mergeOptions(n1 n1Var) {
        n1 n1Var2;
        xa xaVar = this.f22072h;
        if (xaVar == null) {
            if ((this.f22067b & 4) == 0 || (n1Var2 = this.f22071g) == null || n1Var2 == n1.getDefaultInstance()) {
                this.f22071g = n1Var;
            } else {
                this.f22071g = n1.newBuilder(this.f22071g).mergeFrom(n1Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(n1Var);
        }
        this.f22067b |= 4;
        return this;
    }

    public e1 removeReservedRange(int i10) {
        pa paVar = this.f22074j;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        e();
        this.f22073i.remove(i10);
        onChanged();
        return this;
    }

    public e1 removeValue(int i10) {
        pa paVar = this.f22070f;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        f();
        this.f22069e.remove(i10);
        onChanged();
        return this;
    }

    public e1 setName(String str) {
        str.getClass();
        this.f22067b |= 1;
        this.f22068c = str;
        onChanged();
        return this;
    }

    public e1 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22067b |= 1;
        this.f22068c = byteString;
        onChanged();
        return this;
    }

    public e1 setOptions(n1 n1Var) {
        xa xaVar = this.f22072h;
        if (xaVar == null) {
            n1Var.getClass();
            this.f22071g = n1Var;
            onChanged();
        } else {
            xaVar.setMessage(n1Var);
        }
        this.f22067b |= 4;
        return this;
    }

    public e1 setReservedName(int i10, String str) {
        str.getClass();
        c();
        this.f22075k.set(i10, (int) str);
        onChanged();
        return this;
    }

    public e1 setReservedRange(int i10, h1 h1Var) {
        pa paVar = this.f22074j;
        if (paVar != null) {
            paVar.setMessage(i10, h1Var);
            return this;
        }
        h1Var.getClass();
        e();
        this.f22073i.set(i10, h1Var);
        onChanged();
        return this;
    }

    public e1 setValue(int i10, r1 r1Var) {
        pa paVar = this.f22070f;
        if (paVar != null) {
            paVar.setMessage(i10, r1Var);
            return this;
        }
        r1Var.getClass();
        f();
        this.f22069e.set(i10, r1Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.k1
    public ka getReservedNameList() {
        return this.f22075k.getUnmodifiableView();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e1 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e1) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public j1 build() {
        j1 j1VarBuildPartial = buildPartial();
        if (j1VarBuildPartial.isInitialized()) {
            return j1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) j1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public j1 buildPartial() {
        j1 j1Var = new j1(this);
        j1Var.f22262i = (byte) -1;
        int i10 = this.f22067b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        j1Var.f22257c = this.f22068c;
        pa paVar = this.f22070f;
        if (paVar == null) {
            if ((this.f22067b & 2) != 0) {
                this.f22069e = Collections.unmodifiableList(this.f22069e);
                this.f22067b &= -3;
            }
            j1Var.f22258e = this.f22069e;
        } else {
            j1Var.f22258e = paVar.build();
        }
        if ((i10 & 4) != 0) {
            xa xaVar = this.f22072h;
            if (xaVar == null) {
                j1Var.f22259f = this.f22071g;
            } else {
                j1Var.f22259f = (n1) xaVar.build();
            }
            i11 |= 2;
        }
        pa paVar2 = this.f22074j;
        if (paVar2 == null) {
            if ((this.f22067b & 8) != 0) {
                this.f22073i = Collections.unmodifiableList(this.f22073i);
                this.f22067b &= -9;
            }
            j1Var.f22260g = this.f22073i;
        } else {
            j1Var.f22260g = paVar2.build();
        }
        if ((this.f22067b & 16) != 0) {
            this.f22075k = this.f22075k.getUnmodifiableView();
            this.f22067b &= -17;
        }
        j1Var.f22261h = this.f22075k;
        j1Var.f22256b = i11;
        onBuilt();
        return j1Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e1 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (e1) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public j1 getDefaultInstanceForType() {
        return j1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e1 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e1 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (e1) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final e1 setUnknownFields(gc gcVar) {
        return (e1) super.setUnknownFields(gcVar);
    }

    public g1 addReservedRangeBuilder(int i10) {
        return (g1) g().addBuilder(i10, h1.getDefaultInstance());
    }

    public q1 addValueBuilder(int i10) {
        return (q1) i().addBuilder(i10, r1.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e1 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (e1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final e1 mergeUnknownFields(gc gcVar) {
        return (e1) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public e1 clear() {
        super.clear();
        this.f22068c = "";
        int i10 = this.f22067b;
        this.f22067b = i10 & (-2);
        pa paVar = this.f22070f;
        if (paVar == null) {
            this.f22069e = Collections.EMPTY_LIST;
            this.f22067b = i10 & (-4);
        } else {
            paVar.clear();
        }
        xa xaVar = this.f22072h;
        if (xaVar == null) {
            this.f22071g = null;
        } else {
            xaVar.clear();
        }
        int i11 = this.f22067b;
        this.f22067b = i11 & (-5);
        pa paVar2 = this.f22074j;
        if (paVar2 == null) {
            this.f22073i = Collections.EMPTY_LIST;
            this.f22067b = i11 & (-13);
        } else {
            paVar2.clear();
        }
        this.f22075k = f8.f22138e;
        this.f22067b &= -17;
        return this;
    }

    public e1 addReservedRange(int i10, h1 h1Var) {
        pa paVar = this.f22074j;
        if (paVar == null) {
            h1Var.getClass();
            e();
            this.f22073i.add(i10, h1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, h1Var);
        return this;
    }

    public e1 addValue(int i10, r1 r1Var) {
        pa paVar = this.f22070f;
        if (paVar == null) {
            r1Var.getClass();
            f();
            this.f22069e.add(i10, r1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, r1Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public e1 mo500clone() {
        return (e1) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e1 mergeFrom(Message message) {
        if (message instanceof j1) {
            return mergeFrom((j1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public e1 setOptions(m1 m1Var) {
        xa xaVar = this.f22072h;
        if (xaVar == null) {
            this.f22071g = m1Var.build();
            onChanged();
        } else {
            xaVar.setMessage(m1Var.build());
        }
        this.f22067b |= 4;
        return this;
    }

    public e1 setReservedRange(int i10, g1 g1Var) {
        pa paVar = this.f22074j;
        if (paVar == null) {
            e();
            this.f22073i.set(i10, g1Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, g1Var.build());
        return this;
    }

    public e1 setValue(int i10, q1 q1Var) {
        pa paVar = this.f22070f;
        if (paVar == null) {
            f();
            this.f22069e.set(i10, q1Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q1Var.build());
        return this;
    }

    public e1 mergeFrom(j1 j1Var) {
        if (j1Var == j1.getDefaultInstance()) {
            return this;
        }
        if (j1Var.hasName()) {
            this.f22067b |= 1;
            this.f22068c = j1Var.f22257c;
            onChanged();
        }
        if (this.f22070f == null) {
            if (!j1Var.f22258e.isEmpty()) {
                if (this.f22069e.isEmpty()) {
                    this.f22069e = j1Var.f22258e;
                    this.f22067b &= -3;
                } else {
                    f();
                    this.f22069e.addAll(j1Var.f22258e);
                }
                onChanged();
            }
        } else if (!j1Var.f22258e.isEmpty()) {
            if (this.f22070f.isEmpty()) {
                this.f22070f.dispose();
                this.f22070f = null;
                this.f22069e = j1Var.f22258e;
                this.f22067b &= -3;
                this.f22070f = k7.alwaysUseFieldBuilders ? i() : null;
            } else {
                this.f22070f.addAllMessages(j1Var.f22258e);
            }
        }
        if (j1Var.hasOptions()) {
            mergeOptions(j1Var.getOptions());
        }
        if (this.f22074j == null) {
            if (!j1Var.f22260g.isEmpty()) {
                if (this.f22073i.isEmpty()) {
                    this.f22073i = j1Var.f22260g;
                    this.f22067b &= -9;
                } else {
                    e();
                    this.f22073i.addAll(j1Var.f22260g);
                }
                onChanged();
            }
        } else if (!j1Var.f22260g.isEmpty()) {
            if (this.f22074j.isEmpty()) {
                this.f22074j.dispose();
                this.f22074j = null;
                this.f22073i = j1Var.f22260g;
                this.f22067b &= -9;
                this.f22074j = k7.alwaysUseFieldBuilders ? g() : null;
            } else {
                this.f22074j.addAllMessages(j1Var.f22260g);
            }
        }
        if (!j1Var.f22261h.isEmpty()) {
            if (this.f22075k.isEmpty()) {
                this.f22075k = j1Var.f22261h;
                this.f22067b &= -17;
            } else {
                c();
                this.f22075k.addAll(j1Var.f22261h);
            }
            onChanged();
        }
        mergeUnknownFields(j1Var.unknownFields);
        onChanged();
        return this;
    }

    public e1 addReservedRange(g1 g1Var) {
        pa paVar = this.f22074j;
        if (paVar == null) {
            e();
            this.f22073i.add(g1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(g1Var.build());
        return this;
    }

    public e1 addValue(q1 q1Var) {
        pa paVar = this.f22070f;
        if (paVar == null) {
            f();
            this.f22069e.add(q1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q1Var.build());
        return this;
    }

    public e1 addReservedRange(int i10, g1 g1Var) {
        pa paVar = this.f22074j;
        if (paVar == null) {
            e();
            this.f22073i.add(i10, g1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, g1Var.build());
        return this;
    }

    public e1 addValue(int i10, q1 q1Var) {
        pa paVar = this.f22070f;
        if (paVar == null) {
            f();
            this.f22069e.add(i10, q1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, q1Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.e1 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.d1 r1 = com.explorestack.protobuf.j1.f22255k     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.j1 r3 = (com.explorestack.protobuf.j1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            if (r3 == 0) goto Le
            r2.mergeFrom(r3)
        Le:
            return r2
        Lf:
            r3 = move-exception
            goto L1f
        L11:
            r3 = move-exception
            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
            com.explorestack.protobuf.j1 r4 = (com.explorestack.protobuf.j1) r4     // Catch: java.lang.Throwable -> Lf
            java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.mergeFrom(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.e1.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.e1");
    }
}
