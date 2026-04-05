package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s0 extends o6 implements c1 {

    /* renamed from: b, reason: collision with root package name */
    public int f22564b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22565c;

    /* renamed from: e, reason: collision with root package name */
    public List f22566e;

    /* renamed from: f, reason: collision with root package name */
    public pa f22567f;

    /* renamed from: g, reason: collision with root package name */
    public List f22568g;

    /* renamed from: h, reason: collision with root package name */
    public pa f22569h;

    /* renamed from: i, reason: collision with root package name */
    public List f22570i;

    /* renamed from: j, reason: collision with root package name */
    public pa f22571j;

    /* renamed from: k, reason: collision with root package name */
    public List f22572k;

    /* renamed from: l, reason: collision with root package name */
    public pa f22573l;

    /* renamed from: m, reason: collision with root package name */
    public List f22574m;

    /* renamed from: n, reason: collision with root package name */
    public pa f22575n;

    /* renamed from: o, reason: collision with root package name */
    public List f22576o;

    /* renamed from: p, reason: collision with root package name */
    public pa f22577p;

    /* renamed from: q, reason: collision with root package name */
    public g3 f22578q;

    /* renamed from: r, reason: collision with root package name */
    public xa f22579r;

    /* renamed from: s, reason: collision with root package name */
    public List f22580s;

    /* renamed from: t, reason: collision with root package name */
    public pa f22581t;

    /* renamed from: u, reason: collision with root package name */
    public g8 f22582u;

    public s0() {
        super(null);
        this.f22565c = "";
        List list = Collections.EMPTY_LIST;
        this.f22566e = list;
        this.f22568g = list;
        this.f22570i = list;
        this.f22572k = list;
        this.f22574m = list;
        this.f22576o = list;
        this.f22580s = list;
        this.f22582u = f8.f22138e;
        t();
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22836c;
    }

    public s0 addAllEnumType(Iterable<? extends j1> iterable) {
        pa paVar = this.f22573l;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f22572k);
        onChanged();
        return this;
    }

    public s0 addAllExtension(Iterable<? extends f2> iterable) {
        pa paVar = this.f22569h;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        e();
        b.a.addAll((Iterable) iterable, this.f22568g);
        onChanged();
        return this;
    }

    public s0 addAllExtensionRange(Iterable<? extends v0> iterable) {
        pa paVar = this.f22575n;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        f();
        b.a.addAll((Iterable) iterable, this.f22574m);
        onChanged();
        return this;
    }

    public s0 addAllField(Iterable<? extends f2> iterable) {
        pa paVar = this.f22567f;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        g();
        b.a.addAll((Iterable) iterable, this.f22566e);
        onChanged();
        return this;
    }

    public s0 addAllNestedType(Iterable<? extends b1> iterable) {
        pa paVar = this.f22571j;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22570i);
        onChanged();
        return this;
    }

    public s0 addAllOneofDecl(Iterable<? extends t3> iterable) {
        pa paVar = this.f22577p;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        j();
        b.a.addAll((Iterable) iterable, this.f22576o);
        onChanged();
        return this;
    }

    public s0 addAllReservedName(Iterable<String> iterable) {
        k();
        b.a.addAll((Iterable) iterable, (List) this.f22582u);
        onChanged();
        return this;
    }

    public s0 addAllReservedRange(Iterable<? extends z0> iterable) {
        pa paVar = this.f22581t;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        l();
        b.a.addAll((Iterable) iterable, this.f22580s);
        onChanged();
        return this;
    }

    public s0 addEnumType(j1 j1Var) {
        pa paVar = this.f22573l;
        if (paVar != null) {
            paVar.addMessage(j1Var);
            return this;
        }
        j1Var.getClass();
        c();
        this.f22572k.add(j1Var);
        onChanged();
        return this;
    }

    public e1 addEnumTypeBuilder() {
        return (e1) m().addBuilder(j1.getDefaultInstance());
    }

    public s0 addExtension(f2 f2Var) {
        pa paVar = this.f22569h;
        if (paVar != null) {
            paVar.addMessage(f2Var);
            return this;
        }
        f2Var.getClass();
        e();
        this.f22568g.add(f2Var);
        onChanged();
        return this;
    }

    public c2 addExtensionBuilder() {
        return (c2) n().addBuilder(f2.getDefaultInstance());
    }

    public s0 addExtensionRange(v0 v0Var) {
        pa paVar = this.f22575n;
        if (paVar != null) {
            paVar.addMessage(v0Var);
            return this;
        }
        v0Var.getClass();
        f();
        this.f22574m.add(v0Var);
        onChanged();
        return this;
    }

    public u0 addExtensionRangeBuilder() {
        return (u0) o().addBuilder(v0.getDefaultInstance());
    }

    public s0 addField(f2 f2Var) {
        pa paVar = this.f22567f;
        if (paVar != null) {
            paVar.addMessage(f2Var);
            return this;
        }
        f2Var.getClass();
        g();
        this.f22566e.add(f2Var);
        onChanged();
        return this;
    }

    public c2 addFieldBuilder() {
        return (c2) p().addBuilder(f2.getDefaultInstance());
    }

    public s0 addNestedType(b1 b1Var) {
        pa paVar = this.f22571j;
        if (paVar != null) {
            paVar.addMessage(b1Var);
            return this;
        }
        b1Var.getClass();
        i();
        this.f22570i.add(b1Var);
        onChanged();
        return this;
    }

    public s0 addNestedTypeBuilder() {
        return (s0) q().addBuilder(b1.getDefaultInstance());
    }

    public s0 addOneofDecl(t3 t3Var) {
        pa paVar = this.f22577p;
        if (paVar != null) {
            paVar.addMessage(t3Var);
            return this;
        }
        t3Var.getClass();
        j();
        this.f22576o.add(t3Var);
        onChanged();
        return this;
    }

    public s3 addOneofDeclBuilder() {
        return (s3) r().addBuilder(t3.getDefaultInstance());
    }

    public s0 addReservedName(String str) {
        str.getClass();
        k();
        this.f22582u.add((g8) str);
        onChanged();
        return this;
    }

    public s0 addReservedNameBytes(ByteString byteString) {
        byteString.getClass();
        k();
        this.f22582u.add(byteString);
        onChanged();
        return this;
    }

    public s0 addReservedRange(z0 z0Var) {
        pa paVar = this.f22581t;
        if (paVar != null) {
            paVar.addMessage(z0Var);
            return this;
        }
        z0Var.getClass();
        l();
        this.f22580s.add(z0Var);
        onChanged();
        return this;
    }

    public y0 addReservedRangeBuilder() {
        return (y0) s().addBuilder(z0.getDefaultInstance());
    }

    public final void c() {
        if ((this.f22564b & 16) == 0) {
            this.f22572k = new ArrayList(this.f22572k);
            this.f22564b |= 16;
        }
    }

    public s0 clearEnumType() {
        pa paVar = this.f22573l;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22572k = Collections.EMPTY_LIST;
        this.f22564b &= -17;
        onChanged();
        return this;
    }

    public s0 clearExtension() {
        pa paVar = this.f22569h;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22568g = Collections.EMPTY_LIST;
        this.f22564b &= -5;
        onChanged();
        return this;
    }

    public s0 clearExtensionRange() {
        pa paVar = this.f22575n;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22574m = Collections.EMPTY_LIST;
        this.f22564b &= -33;
        onChanged();
        return this;
    }

    public s0 clearName() {
        this.f22564b &= -2;
        this.f22565c = b1.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public s0 clearNestedType() {
        pa paVar = this.f22571j;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22570i = Collections.EMPTY_LIST;
        this.f22564b &= -9;
        onChanged();
        return this;
    }

    public s0 clearOneofDecl() {
        pa paVar = this.f22577p;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22576o = Collections.EMPTY_LIST;
        this.f22564b &= -65;
        onChanged();
        return this;
    }

    public s0 clearOptions() {
        xa xaVar = this.f22579r;
        if (xaVar == null) {
            this.f22578q = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22564b &= -129;
        return this;
    }

    public s0 clearReservedName() {
        this.f22582u = f8.f22138e;
        this.f22564b &= -513;
        onChanged();
        return this;
    }

    public s0 clearReservedRange() {
        pa paVar = this.f22581t;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22580s = Collections.EMPTY_LIST;
        this.f22564b &= -257;
        onChanged();
        return this;
    }

    public final void e() {
        if ((this.f22564b & 4) == 0) {
            this.f22568g = new ArrayList(this.f22568g);
            this.f22564b |= 4;
        }
    }

    public final void f() {
        if ((this.f22564b & 32) == 0) {
            this.f22574m = new ArrayList(this.f22574m);
            this.f22564b |= 32;
        }
    }

    public final void g() {
        if ((this.f22564b & 2) == 0) {
            this.f22566e = new ArrayList(this.f22566e);
            this.f22564b |= 2;
        }
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22836c;
    }

    @Override // com.explorestack.protobuf.c1
    public j1 getEnumType(int i10) {
        pa paVar = this.f22573l;
        return paVar == null ? (j1) this.f22572k.get(i10) : (j1) paVar.getMessage(i10);
    }

    public e1 getEnumTypeBuilder(int i10) {
        return (e1) m().getBuilder(i10);
    }

    public List<e1> getEnumTypeBuilderList() {
        return m().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getEnumTypeCount() {
        pa paVar = this.f22573l;
        return paVar == null ? this.f22572k.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<j1> getEnumTypeList() {
        pa paVar = this.f22573l;
        return paVar == null ? Collections.unmodifiableList(this.f22572k) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public k1 getEnumTypeOrBuilder(int i10) {
        pa paVar = this.f22573l;
        return paVar == null ? (k1) this.f22572k.get(i10) : (k1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends k1> getEnumTypeOrBuilderList() {
        pa paVar = this.f22573l;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22572k);
    }

    @Override // com.explorestack.protobuf.c1
    public f2 getExtension(int i10) {
        pa paVar = this.f22569h;
        return paVar == null ? (f2) this.f22568g.get(i10) : (f2) paVar.getMessage(i10);
    }

    public c2 getExtensionBuilder(int i10) {
        return (c2) n().getBuilder(i10);
    }

    public List<c2> getExtensionBuilderList() {
        return n().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getExtensionCount() {
        pa paVar = this.f22569h;
        return paVar == null ? this.f22568g.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<f2> getExtensionList() {
        pa paVar = this.f22569h;
        return paVar == null ? Collections.unmodifiableList(this.f22568g) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public g2 getExtensionOrBuilder(int i10) {
        pa paVar = this.f22569h;
        return paVar == null ? (g2) this.f22568g.get(i10) : (g2) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends g2> getExtensionOrBuilderList() {
        pa paVar = this.f22569h;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22568g);
    }

    @Override // com.explorestack.protobuf.c1
    public v0 getExtensionRange(int i10) {
        pa paVar = this.f22575n;
        return paVar == null ? (v0) this.f22574m.get(i10) : (v0) paVar.getMessage(i10);
    }

    public u0 getExtensionRangeBuilder(int i10) {
        return (u0) o().getBuilder(i10);
    }

    public List<u0> getExtensionRangeBuilderList() {
        return o().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getExtensionRangeCount() {
        pa paVar = this.f22575n;
        return paVar == null ? this.f22574m.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<v0> getExtensionRangeList() {
        pa paVar = this.f22575n;
        return paVar == null ? Collections.unmodifiableList(this.f22574m) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public w0 getExtensionRangeOrBuilder(int i10) {
        pa paVar = this.f22575n;
        return paVar == null ? (w0) this.f22574m.get(i10) : (w0) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends w0> getExtensionRangeOrBuilderList() {
        pa paVar = this.f22575n;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22574m);
    }

    @Override // com.explorestack.protobuf.c1
    public f2 getField(int i10) {
        pa paVar = this.f22567f;
        return paVar == null ? (f2) this.f22566e.get(i10) : (f2) paVar.getMessage(i10);
    }

    public c2 getFieldBuilder(int i10) {
        return (c2) p().getBuilder(i10);
    }

    public List<c2> getFieldBuilderList() {
        return p().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getFieldCount() {
        pa paVar = this.f22567f;
        return paVar == null ? this.f22566e.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<f2> getFieldList() {
        pa paVar = this.f22567f;
        return paVar == null ? Collections.unmodifiableList(this.f22566e) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public g2 getFieldOrBuilder(int i10) {
        pa paVar = this.f22567f;
        return paVar == null ? (g2) this.f22566e.get(i10) : (g2) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends g2> getFieldOrBuilderList() {
        pa paVar = this.f22567f;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22566e);
    }

    @Override // com.explorestack.protobuf.c1
    public String getName() {
        Serializable serializable = this.f22565c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22565c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.c1
    public ByteString getNameBytes() {
        Serializable serializable = this.f22565c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22565c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.c1
    public b1 getNestedType(int i10) {
        pa paVar = this.f22571j;
        return paVar == null ? (b1) this.f22570i.get(i10) : (b1) paVar.getMessage(i10);
    }

    public s0 getNestedTypeBuilder(int i10) {
        return (s0) q().getBuilder(i10);
    }

    public List<s0> getNestedTypeBuilderList() {
        return q().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getNestedTypeCount() {
        pa paVar = this.f22571j;
        return paVar == null ? this.f22570i.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<b1> getNestedTypeList() {
        pa paVar = this.f22571j;
        return paVar == null ? Collections.unmodifiableList(this.f22570i) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public c1 getNestedTypeOrBuilder(int i10) {
        pa paVar = this.f22571j;
        return paVar == null ? (c1) this.f22570i.get(i10) : (c1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends c1> getNestedTypeOrBuilderList() {
        pa paVar = this.f22571j;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22570i);
    }

    @Override // com.explorestack.protobuf.c1
    public t3 getOneofDecl(int i10) {
        pa paVar = this.f22577p;
        return paVar == null ? (t3) this.f22576o.get(i10) : (t3) paVar.getMessage(i10);
    }

    public s3 getOneofDeclBuilder(int i10) {
        return (s3) r().getBuilder(i10);
    }

    public List<s3> getOneofDeclBuilderList() {
        return r().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getOneofDeclCount() {
        pa paVar = this.f22577p;
        return paVar == null ? this.f22576o.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<t3> getOneofDeclList() {
        pa paVar = this.f22577p;
        return paVar == null ? Collections.unmodifiableList(this.f22576o) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public u3 getOneofDeclOrBuilder(int i10) {
        pa paVar = this.f22577p;
        return paVar == null ? (u3) this.f22576o.get(i10) : (u3) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends u3> getOneofDeclOrBuilderList() {
        pa paVar = this.f22577p;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22576o);
    }

    @Override // com.explorestack.protobuf.c1
    public g3 getOptions() {
        xa xaVar = this.f22579r;
        if (xaVar != null) {
            return (g3) xaVar.getMessage();
        }
        g3 g3Var = this.f22578q;
        return g3Var == null ? g3.getDefaultInstance() : g3Var;
    }

    public f3 getOptionsBuilder() {
        this.f22564b |= 128;
        onChanged();
        if (this.f22579r == null) {
            this.f22579r = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22578q = null;
        }
        return (f3) this.f22579r.getBuilder();
    }

    @Override // com.explorestack.protobuf.c1
    public h3 getOptionsOrBuilder() {
        xa xaVar = this.f22579r;
        if (xaVar != null) {
            return (h3) xaVar.getMessageOrBuilder();
        }
        g3 g3Var = this.f22578q;
        return g3Var == null ? g3.getDefaultInstance() : g3Var;
    }

    @Override // com.explorestack.protobuf.c1
    public String getReservedName(int i10) {
        return (String) this.f22582u.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public ByteString getReservedNameBytes(int i10) {
        return this.f22582u.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getReservedNameCount() {
        return this.f22582u.size();
    }

    @Override // com.explorestack.protobuf.c1
    public z0 getReservedRange(int i10) {
        pa paVar = this.f22581t;
        return paVar == null ? (z0) this.f22580s.get(i10) : (z0) paVar.getMessage(i10);
    }

    public y0 getReservedRangeBuilder(int i10) {
        return (y0) s().getBuilder(i10);
    }

    public List<y0> getReservedRangeBuilderList() {
        return s().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c1
    public int getReservedRangeCount() {
        pa paVar = this.f22581t;
        return paVar == null ? this.f22580s.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c1
    public List<z0> getReservedRangeList() {
        pa paVar = this.f22581t;
        return paVar == null ? Collections.unmodifiableList(this.f22580s) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c1
    public a1 getReservedRangeOrBuilder(int i10) {
        pa paVar = this.f22581t;
        return paVar == null ? (a1) this.f22580s.get(i10) : (a1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends a1> getReservedRangeOrBuilderList() {
        pa paVar = this.f22581t;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22580s);
    }

    @Override // com.explorestack.protobuf.c1
    public boolean hasName() {
        return (this.f22564b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.c1
    public boolean hasOptions() {
        return (this.f22564b & 128) != 0;
    }

    public final void i() {
        if ((this.f22564b & 8) == 0) {
            this.f22570i = new ArrayList(this.f22570i);
            this.f22564b |= 8;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22837d.ensureFieldAccessorsInitialized(b1.class, s0.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getFieldCount(); i10++) {
            if (!getField(i10).isInitialized()) {
                return false;
            }
        }
        for (int i11 = 0; i11 < getExtensionCount(); i11++) {
            if (!getExtension(i11).isInitialized()) {
                return false;
            }
        }
        for (int i12 = 0; i12 < getNestedTypeCount(); i12++) {
            if (!getNestedType(i12).isInitialized()) {
                return false;
            }
        }
        for (int i13 = 0; i13 < getEnumTypeCount(); i13++) {
            if (!getEnumType(i13).isInitialized()) {
                return false;
            }
        }
        for (int i14 = 0; i14 < getExtensionRangeCount(); i14++) {
            if (!getExtensionRange(i14).isInitialized()) {
                return false;
            }
        }
        for (int i15 = 0; i15 < getOneofDeclCount(); i15++) {
            if (!getOneofDecl(i15).isInitialized()) {
                return false;
            }
        }
        return !hasOptions() || getOptions().isInitialized();
    }

    public final void j() {
        if ((this.f22564b & 64) == 0) {
            this.f22576o = new ArrayList(this.f22576o);
            this.f22564b |= 64;
        }
    }

    public final void k() {
        if ((this.f22564b & 512) == 0) {
            this.f22582u = new f8(this.f22582u);
            this.f22564b |= 512;
        }
    }

    public final void l() {
        if ((this.f22564b & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.f22580s = new ArrayList(this.f22580s);
            this.f22564b |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
    }

    public final pa m() {
        if (this.f22573l == null) {
            this.f22573l = new pa(this.f22572k, (this.f22564b & 16) != 0, getParentForChildren(), isClean());
            this.f22572k = null;
        }
        return this.f22573l;
    }

    public s0 mergeOptions(g3 g3Var) {
        g3 g3Var2;
        xa xaVar = this.f22579r;
        if (xaVar == null) {
            if ((this.f22564b & 128) == 0 || (g3Var2 = this.f22578q) == null || g3Var2 == g3.getDefaultInstance()) {
                this.f22578q = g3Var;
            } else {
                this.f22578q = g3.newBuilder(this.f22578q).mergeFrom(g3Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(g3Var);
        }
        this.f22564b |= 128;
        return this;
    }

    public final pa n() {
        if (this.f22569h == null) {
            this.f22569h = new pa(this.f22568g, (this.f22564b & 4) != 0, getParentForChildren(), isClean());
            this.f22568g = null;
        }
        return this.f22569h;
    }

    public final pa o() {
        if (this.f22575n == null) {
            this.f22575n = new pa(this.f22574m, (this.f22564b & 32) != 0, getParentForChildren(), isClean());
            this.f22574m = null;
        }
        return this.f22575n;
    }

    public final pa p() {
        if (this.f22567f == null) {
            this.f22567f = new pa(this.f22566e, (this.f22564b & 2) != 0, getParentForChildren(), isClean());
            this.f22566e = null;
        }
        return this.f22567f;
    }

    public final pa q() {
        if (this.f22571j == null) {
            this.f22571j = new pa(this.f22570i, (this.f22564b & 8) != 0, getParentForChildren(), isClean());
            this.f22570i = null;
        }
        return this.f22571j;
    }

    public final pa r() {
        if (this.f22577p == null) {
            this.f22577p = new pa(this.f22576o, (this.f22564b & 64) != 0, getParentForChildren(), isClean());
            this.f22576o = null;
        }
        return this.f22577p;
    }

    public s0 removeEnumType(int i10) {
        pa paVar = this.f22573l;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f22572k.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeExtension(int i10) {
        pa paVar = this.f22569h;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        e();
        this.f22568g.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeExtensionRange(int i10) {
        pa paVar = this.f22575n;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        f();
        this.f22574m.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeField(int i10) {
        pa paVar = this.f22567f;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        g();
        this.f22566e.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeNestedType(int i10) {
        pa paVar = this.f22571j;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22570i.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeOneofDecl(int i10) {
        pa paVar = this.f22577p;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        j();
        this.f22576o.remove(i10);
        onChanged();
        return this;
    }

    public s0 removeReservedRange(int i10) {
        pa paVar = this.f22581t;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        l();
        this.f22580s.remove(i10);
        onChanged();
        return this;
    }

    public final pa s() {
        if (this.f22581t == null) {
            this.f22581t = new pa(this.f22580s, (this.f22564b & NotificationCompat.FLAG_LOCAL_ONLY) != 0, getParentForChildren(), isClean());
            this.f22580s = null;
        }
        return this.f22581t;
    }

    public s0 setEnumType(int i10, j1 j1Var) {
        pa paVar = this.f22573l;
        if (paVar != null) {
            paVar.setMessage(i10, j1Var);
            return this;
        }
        j1Var.getClass();
        c();
        this.f22572k.set(i10, j1Var);
        onChanged();
        return this;
    }

    public s0 setExtension(int i10, f2 f2Var) {
        pa paVar = this.f22569h;
        if (paVar != null) {
            paVar.setMessage(i10, f2Var);
            return this;
        }
        f2Var.getClass();
        e();
        this.f22568g.set(i10, f2Var);
        onChanged();
        return this;
    }

    public s0 setExtensionRange(int i10, v0 v0Var) {
        pa paVar = this.f22575n;
        if (paVar != null) {
            paVar.setMessage(i10, v0Var);
            return this;
        }
        v0Var.getClass();
        f();
        this.f22574m.set(i10, v0Var);
        onChanged();
        return this;
    }

    public s0 setName(String str) {
        str.getClass();
        this.f22564b |= 1;
        this.f22565c = str;
        onChanged();
        return this;
    }

    public s0 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22564b |= 1;
        this.f22565c = byteString;
        onChanged();
        return this;
    }

    public s0 setNestedType(int i10, b1 b1Var) {
        pa paVar = this.f22571j;
        if (paVar != null) {
            paVar.setMessage(i10, b1Var);
            return this;
        }
        b1Var.getClass();
        i();
        this.f22570i.set(i10, b1Var);
        onChanged();
        return this;
    }

    public s0 setOneofDecl(int i10, t3 t3Var) {
        pa paVar = this.f22577p;
        if (paVar != null) {
            paVar.setMessage(i10, t3Var);
            return this;
        }
        t3Var.getClass();
        j();
        this.f22576o.set(i10, t3Var);
        onChanged();
        return this;
    }

    public s0 setOptions(g3 g3Var) {
        xa xaVar = this.f22579r;
        if (xaVar == null) {
            g3Var.getClass();
            this.f22578q = g3Var;
            onChanged();
        } else {
            xaVar.setMessage(g3Var);
        }
        this.f22564b |= 128;
        return this;
    }

    public s0 setReservedName(int i10, String str) {
        str.getClass();
        k();
        this.f22582u.set(i10, (int) str);
        onChanged();
        return this;
    }

    public s0 setReservedRange(int i10, z0 z0Var) {
        pa paVar = this.f22581t;
        if (paVar != null) {
            paVar.setMessage(i10, z0Var);
            return this;
        }
        z0Var.getClass();
        l();
        this.f22580s.set(i10, z0Var);
        onChanged();
        return this;
    }

    public final void t() {
        if (k7.alwaysUseFieldBuilders) {
            p();
            n();
            q();
            m();
            o();
            r();
            if (this.f22579r == null) {
                this.f22579r = new xa(getOptions(), getParentForChildren(), isClean());
                this.f22578q = null;
            }
            s();
        }
    }

    @Override // com.explorestack.protobuf.c1
    public ka getReservedNameList() {
        return this.f22582u.getUnmodifiableView();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s0 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b1 build() {
        b1 b1VarBuildPartial = buildPartial();
        if (b1VarBuildPartial.isInitialized()) {
            return b1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) b1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b1 buildPartial() {
        b1 b1Var = new b1(this);
        b1Var.f21927n = (byte) -1;
        int i10 = this.f22564b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        b1Var.f21917c = this.f22565c;
        pa paVar = this.f22567f;
        if (paVar == null) {
            if ((this.f22564b & 2) != 0) {
                this.f22566e = Collections.unmodifiableList(this.f22566e);
                this.f22564b &= -3;
            }
            b1Var.f21918e = this.f22566e;
        } else {
            b1Var.f21918e = paVar.build();
        }
        pa paVar2 = this.f22569h;
        if (paVar2 == null) {
            if ((this.f22564b & 4) != 0) {
                this.f22568g = Collections.unmodifiableList(this.f22568g);
                this.f22564b &= -5;
            }
            b1Var.f21919f = this.f22568g;
        } else {
            b1Var.f21919f = paVar2.build();
        }
        pa paVar3 = this.f22571j;
        if (paVar3 == null) {
            if ((this.f22564b & 8) != 0) {
                this.f22570i = Collections.unmodifiableList(this.f22570i);
                this.f22564b &= -9;
            }
            b1Var.f21920g = this.f22570i;
        } else {
            b1Var.f21920g = paVar3.build();
        }
        pa paVar4 = this.f22573l;
        if (paVar4 == null) {
            if ((this.f22564b & 16) != 0) {
                this.f22572k = Collections.unmodifiableList(this.f22572k);
                this.f22564b &= -17;
            }
            b1Var.f21921h = this.f22572k;
        } else {
            b1Var.f21921h = paVar4.build();
        }
        pa paVar5 = this.f22575n;
        if (paVar5 == null) {
            if ((this.f22564b & 32) != 0) {
                this.f22574m = Collections.unmodifiableList(this.f22574m);
                this.f22564b &= -33;
            }
            b1Var.f21922i = this.f22574m;
        } else {
            b1Var.f21922i = paVar5.build();
        }
        pa paVar6 = this.f22577p;
        if (paVar6 == null) {
            if ((this.f22564b & 64) != 0) {
                this.f22576o = Collections.unmodifiableList(this.f22576o);
                this.f22564b &= -65;
            }
            b1Var.f21923j = this.f22576o;
        } else {
            b1Var.f21923j = paVar6.build();
        }
        if ((i10 & 128) != 0) {
            xa xaVar = this.f22579r;
            if (xaVar == null) {
                b1Var.f21924k = this.f22578q;
            } else {
                b1Var.f21924k = (g3) xaVar.build();
            }
            i11 |= 2;
        }
        pa paVar7 = this.f22581t;
        if (paVar7 == null) {
            if ((this.f22564b & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                this.f22580s = Collections.unmodifiableList(this.f22580s);
                this.f22564b &= -257;
            }
            b1Var.f21925l = this.f22580s;
        } else {
            b1Var.f21925l = paVar7.build();
        }
        if ((this.f22564b & 512) != 0) {
            this.f22582u = this.f22582u.getUnmodifiableView();
            this.f22564b &= -513;
        }
        b1Var.f21926m = this.f22582u;
        b1Var.f21916b = i11;
        onBuilt();
        return b1Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s0 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s0) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public b1 getDefaultInstanceForType() {
        return b1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s0 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s0 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (s0) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final s0 setUnknownFields(gc gcVar) {
        return (s0) super.setUnknownFields(gcVar);
    }

    public e1 addEnumTypeBuilder(int i10) {
        return (e1) m().addBuilder(i10, j1.getDefaultInstance());
    }

    public c2 addExtensionBuilder(int i10) {
        return (c2) n().addBuilder(i10, f2.getDefaultInstance());
    }

    public u0 addExtensionRangeBuilder(int i10) {
        return (u0) o().addBuilder(i10, v0.getDefaultInstance());
    }

    public c2 addFieldBuilder(int i10) {
        return (c2) p().addBuilder(i10, f2.getDefaultInstance());
    }

    public s0 addNestedTypeBuilder(int i10) {
        return (s0) q().addBuilder(i10, b1.getDefaultInstance());
    }

    public s3 addOneofDeclBuilder(int i10) {
        return (s3) r().addBuilder(i10, t3.getDefaultInstance());
    }

    public y0 addReservedRangeBuilder(int i10) {
        return (y0) s().addBuilder(i10, z0.getDefaultInstance());
    }

    public s0 clearField() {
        pa paVar = this.f22567f;
        if (paVar == null) {
            this.f22566e = Collections.EMPTY_LIST;
            this.f22564b &= -3;
            onChanged();
            return this;
        }
        paVar.clear();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s0 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final s0 mergeUnknownFields(gc gcVar) {
        return (s0) super.mergeUnknownFields(gcVar);
    }

    public s0 setField(int i10, f2 f2Var) {
        pa paVar = this.f22567f;
        if (paVar == null) {
            f2Var.getClass();
            g();
            this.f22566e.set(i10, f2Var);
            onChanged();
            return this;
        }
        paVar.setMessage(i10, f2Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s0 clear() {
        super.clear();
        this.f22565c = "";
        int i10 = this.f22564b;
        this.f22564b = i10 & (-2);
        pa paVar = this.f22567f;
        if (paVar == null) {
            this.f22566e = Collections.EMPTY_LIST;
            this.f22564b = i10 & (-4);
        } else {
            paVar.clear();
        }
        pa paVar2 = this.f22569h;
        if (paVar2 == null) {
            this.f22568g = Collections.EMPTY_LIST;
            this.f22564b &= -5;
        } else {
            paVar2.clear();
        }
        pa paVar3 = this.f22571j;
        if (paVar3 == null) {
            this.f22570i = Collections.EMPTY_LIST;
            this.f22564b &= -9;
        } else {
            paVar3.clear();
        }
        pa paVar4 = this.f22573l;
        if (paVar4 == null) {
            this.f22572k = Collections.EMPTY_LIST;
            this.f22564b &= -17;
        } else {
            paVar4.clear();
        }
        pa paVar5 = this.f22575n;
        if (paVar5 == null) {
            this.f22574m = Collections.EMPTY_LIST;
            this.f22564b &= -33;
        } else {
            paVar5.clear();
        }
        pa paVar6 = this.f22577p;
        if (paVar6 == null) {
            this.f22576o = Collections.EMPTY_LIST;
            this.f22564b &= -65;
        } else {
            paVar6.clear();
        }
        xa xaVar = this.f22579r;
        if (xaVar == null) {
            this.f22578q = null;
        } else {
            xaVar.clear();
        }
        int i11 = this.f22564b;
        this.f22564b = i11 & (-129);
        pa paVar7 = this.f22581t;
        if (paVar7 == null) {
            this.f22580s = Collections.EMPTY_LIST;
            this.f22564b = i11 & (-385);
        } else {
            paVar7.clear();
        }
        this.f22582u = f8.f22138e;
        this.f22564b &= -513;
        return this;
    }

    public s0 addEnumType(int i10, j1 j1Var) {
        pa paVar = this.f22573l;
        if (paVar == null) {
            j1Var.getClass();
            c();
            this.f22572k.add(i10, j1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, j1Var);
        return this;
    }

    public s0 addExtension(int i10, f2 f2Var) {
        pa paVar = this.f22569h;
        if (paVar == null) {
            f2Var.getClass();
            e();
            this.f22568g.add(i10, f2Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, f2Var);
        return this;
    }

    public s0 addExtensionRange(int i10, v0 v0Var) {
        pa paVar = this.f22575n;
        if (paVar == null) {
            v0Var.getClass();
            f();
            this.f22574m.add(i10, v0Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v0Var);
        return this;
    }

    public s0 addField(int i10, f2 f2Var) {
        pa paVar = this.f22567f;
        if (paVar == null) {
            f2Var.getClass();
            g();
            this.f22566e.add(i10, f2Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, f2Var);
        return this;
    }

    public s0 addNestedType(int i10, b1 b1Var) {
        pa paVar = this.f22571j;
        if (paVar == null) {
            b1Var.getClass();
            i();
            this.f22570i.add(i10, b1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, b1Var);
        return this;
    }

    public s0 addOneofDecl(int i10, t3 t3Var) {
        pa paVar = this.f22577p;
        if (paVar == null) {
            t3Var.getClass();
            j();
            this.f22576o.add(i10, t3Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, t3Var);
        return this;
    }

    public s0 addReservedRange(int i10, z0 z0Var) {
        pa paVar = this.f22581t;
        if (paVar == null) {
            z0Var.getClass();
            l();
            this.f22580s.add(i10, z0Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, z0Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public s0 mo500clone() {
        return (s0) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s0 mergeFrom(Message message) {
        if (message instanceof b1) {
            return mergeFrom((b1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s0 setEnumType(int i10, e1 e1Var) {
        pa paVar = this.f22573l;
        if (paVar == null) {
            c();
            this.f22572k.set(i10, e1Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, e1Var.build());
        return this;
    }

    public s0 setExtension(int i10, c2 c2Var) {
        pa paVar = this.f22569h;
        if (paVar == null) {
            e();
            this.f22568g.set(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, c2Var.build());
        return this;
    }

    public s0 setExtensionRange(int i10, u0 u0Var) {
        pa paVar = this.f22575n;
        if (paVar == null) {
            f();
            this.f22574m.set(i10, u0Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, u0Var.build());
        return this;
    }

    public s0 setNestedType(int i10, s0 s0Var) {
        pa paVar = this.f22571j;
        if (paVar == null) {
            i();
            this.f22570i.set(i10, s0Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, s0Var.build());
        return this;
    }

    public s0 setOneofDecl(int i10, s3 s3Var) {
        pa paVar = this.f22577p;
        if (paVar == null) {
            j();
            this.f22576o.set(i10, s3Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, s3Var.build());
        return this;
    }

    public s0 setOptions(f3 f3Var) {
        xa xaVar = this.f22579r;
        if (xaVar == null) {
            this.f22578q = f3Var.build();
            onChanged();
        } else {
            xaVar.setMessage(f3Var.build());
        }
        this.f22564b |= 128;
        return this;
    }

    public s0 setReservedRange(int i10, y0 y0Var) {
        pa paVar = this.f22581t;
        if (paVar == null) {
            l();
            this.f22580s.set(i10, y0Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, y0Var.build());
        return this;
    }

    public s0 mergeFrom(b1 b1Var) {
        if (b1Var == b1.getDefaultInstance()) {
            return this;
        }
        if (b1Var.hasName()) {
            this.f22564b |= 1;
            this.f22565c = b1Var.f21917c;
            onChanged();
        }
        if (this.f22567f == null) {
            if (!b1Var.f21918e.isEmpty()) {
                if (this.f22566e.isEmpty()) {
                    this.f22566e = b1Var.f21918e;
                    this.f22564b &= -3;
                } else {
                    g();
                    this.f22566e.addAll(b1Var.f21918e);
                }
                onChanged();
            }
        } else if (!b1Var.f21918e.isEmpty()) {
            if (this.f22567f.isEmpty()) {
                this.f22567f.dispose();
                this.f22567f = null;
                this.f22566e = b1Var.f21918e;
                this.f22564b &= -3;
                this.f22567f = k7.alwaysUseFieldBuilders ? p() : null;
            } else {
                this.f22567f.addAllMessages(b1Var.f21918e);
            }
        }
        if (this.f22569h == null) {
            if (!b1Var.f21919f.isEmpty()) {
                if (this.f22568g.isEmpty()) {
                    this.f22568g = b1Var.f21919f;
                    this.f22564b &= -5;
                } else {
                    e();
                    this.f22568g.addAll(b1Var.f21919f);
                }
                onChanged();
            }
        } else if (!b1Var.f21919f.isEmpty()) {
            if (this.f22569h.isEmpty()) {
                this.f22569h.dispose();
                this.f22569h = null;
                this.f22568g = b1Var.f21919f;
                this.f22564b &= -5;
                this.f22569h = k7.alwaysUseFieldBuilders ? n() : null;
            } else {
                this.f22569h.addAllMessages(b1Var.f21919f);
            }
        }
        if (this.f22571j == null) {
            if (!b1Var.f21920g.isEmpty()) {
                if (this.f22570i.isEmpty()) {
                    this.f22570i = b1Var.f21920g;
                    this.f22564b &= -9;
                } else {
                    i();
                    this.f22570i.addAll(b1Var.f21920g);
                }
                onChanged();
            }
        } else if (!b1Var.f21920g.isEmpty()) {
            if (this.f22571j.isEmpty()) {
                this.f22571j.dispose();
                this.f22571j = null;
                this.f22570i = b1Var.f21920g;
                this.f22564b &= -9;
                this.f22571j = k7.alwaysUseFieldBuilders ? q() : null;
            } else {
                this.f22571j.addAllMessages(b1Var.f21920g);
            }
        }
        if (this.f22573l == null) {
            if (!b1Var.f21921h.isEmpty()) {
                if (this.f22572k.isEmpty()) {
                    this.f22572k = b1Var.f21921h;
                    this.f22564b &= -17;
                } else {
                    c();
                    this.f22572k.addAll(b1Var.f21921h);
                }
                onChanged();
            }
        } else if (!b1Var.f21921h.isEmpty()) {
            if (this.f22573l.isEmpty()) {
                this.f22573l.dispose();
                this.f22573l = null;
                this.f22572k = b1Var.f21921h;
                this.f22564b &= -17;
                this.f22573l = k7.alwaysUseFieldBuilders ? m() : null;
            } else {
                this.f22573l.addAllMessages(b1Var.f21921h);
            }
        }
        if (this.f22575n == null) {
            if (!b1Var.f21922i.isEmpty()) {
                if (this.f22574m.isEmpty()) {
                    this.f22574m = b1Var.f21922i;
                    this.f22564b &= -33;
                } else {
                    f();
                    this.f22574m.addAll(b1Var.f21922i);
                }
                onChanged();
            }
        } else if (!b1Var.f21922i.isEmpty()) {
            if (this.f22575n.isEmpty()) {
                this.f22575n.dispose();
                this.f22575n = null;
                this.f22574m = b1Var.f21922i;
                this.f22564b &= -33;
                this.f22575n = k7.alwaysUseFieldBuilders ? o() : null;
            } else {
                this.f22575n.addAllMessages(b1Var.f21922i);
            }
        }
        if (this.f22577p == null) {
            if (!b1Var.f21923j.isEmpty()) {
                if (this.f22576o.isEmpty()) {
                    this.f22576o = b1Var.f21923j;
                    this.f22564b &= -65;
                } else {
                    j();
                    this.f22576o.addAll(b1Var.f21923j);
                }
                onChanged();
            }
        } else if (!b1Var.f21923j.isEmpty()) {
            if (this.f22577p.isEmpty()) {
                this.f22577p.dispose();
                this.f22577p = null;
                this.f22576o = b1Var.f21923j;
                this.f22564b &= -65;
                this.f22577p = k7.alwaysUseFieldBuilders ? r() : null;
            } else {
                this.f22577p.addAllMessages(b1Var.f21923j);
            }
        }
        if (b1Var.hasOptions()) {
            mergeOptions(b1Var.getOptions());
        }
        if (this.f22581t == null) {
            if (!b1Var.f21925l.isEmpty()) {
                if (this.f22580s.isEmpty()) {
                    this.f22580s = b1Var.f21925l;
                    this.f22564b &= -257;
                } else {
                    l();
                    this.f22580s.addAll(b1Var.f21925l);
                }
                onChanged();
            }
        } else if (!b1Var.f21925l.isEmpty()) {
            if (this.f22581t.isEmpty()) {
                this.f22581t.dispose();
                this.f22581t = null;
                this.f22580s = b1Var.f21925l;
                this.f22564b &= -257;
                this.f22581t = k7.alwaysUseFieldBuilders ? s() : null;
            } else {
                this.f22581t.addAllMessages(b1Var.f21925l);
            }
        }
        if (!b1Var.f21926m.isEmpty()) {
            if (this.f22582u.isEmpty()) {
                this.f22582u = b1Var.f21926m;
                this.f22564b &= -513;
            } else {
                k();
                this.f22582u.addAll(b1Var.f21926m);
            }
            onChanged();
        }
        mergeUnknownFields(b1Var.unknownFields);
        onChanged();
        return this;
    }

    public s0 setField(int i10, c2 c2Var) {
        pa paVar = this.f22567f;
        if (paVar == null) {
            g();
            this.f22566e.set(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, c2Var.build());
        return this;
    }

    public s0 addEnumType(e1 e1Var) {
        pa paVar = this.f22573l;
        if (paVar == null) {
            c();
            this.f22572k.add(e1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(e1Var.build());
        return this;
    }

    public s0 addExtension(c2 c2Var) {
        pa paVar = this.f22569h;
        if (paVar == null) {
            e();
            this.f22568g.add(c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(c2Var.build());
        return this;
    }

    public s0 addExtensionRange(u0 u0Var) {
        pa paVar = this.f22575n;
        if (paVar == null) {
            f();
            this.f22574m.add(u0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(u0Var.build());
        return this;
    }

    public s0 addField(c2 c2Var) {
        pa paVar = this.f22567f;
        if (paVar == null) {
            g();
            this.f22566e.add(c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(c2Var.build());
        return this;
    }

    public s0 addNestedType(s0 s0Var) {
        pa paVar = this.f22571j;
        if (paVar == null) {
            i();
            this.f22570i.add(s0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(s0Var.build());
        return this;
    }

    public s0 addOneofDecl(s3 s3Var) {
        pa paVar = this.f22577p;
        if (paVar == null) {
            j();
            this.f22576o.add(s3Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(s3Var.build());
        return this;
    }

    public s0 addReservedRange(y0 y0Var) {
        pa paVar = this.f22581t;
        if (paVar == null) {
            l();
            this.f22580s.add(y0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(y0Var.build());
        return this;
    }

    public s0 addEnumType(int i10, e1 e1Var) {
        pa paVar = this.f22573l;
        if (paVar == null) {
            c();
            this.f22572k.add(i10, e1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, e1Var.build());
        return this;
    }

    public s0 addExtension(int i10, c2 c2Var) {
        pa paVar = this.f22569h;
        if (paVar == null) {
            e();
            this.f22568g.add(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, c2Var.build());
        return this;
    }

    public s0 addExtensionRange(int i10, u0 u0Var) {
        pa paVar = this.f22575n;
        if (paVar == null) {
            f();
            this.f22574m.add(i10, u0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, u0Var.build());
        return this;
    }

    public s0 addField(int i10, c2 c2Var) {
        pa paVar = this.f22567f;
        if (paVar == null) {
            g();
            this.f22566e.add(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, c2Var.build());
        return this;
    }

    public s0 addNestedType(int i10, s0 s0Var) {
        pa paVar = this.f22571j;
        if (paVar == null) {
            i();
            this.f22570i.add(i10, s0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, s0Var.build());
        return this;
    }

    public s0 addOneofDecl(int i10, s3 s3Var) {
        pa paVar = this.f22577p;
        if (paVar == null) {
            j();
            this.f22576o.add(i10, s3Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, s3Var.build());
        return this;
    }

    public s0 addReservedRange(int i10, y0 y0Var) {
        pa paVar = this.f22581t;
        if (paVar == null) {
            l();
            this.f22580s.add(i10, y0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, y0Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.s0 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.r0 r1 = com.explorestack.protobuf.b1.f21915p     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.b1 r3 = (com.explorestack.protobuf.b1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.b1 r4 = (com.explorestack.protobuf.b1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.s0.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.s0");
    }
}
