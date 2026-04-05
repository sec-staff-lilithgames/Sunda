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
public final class o2 extends o6 implements q2 {

    /* renamed from: b, reason: collision with root package name */
    public int f22415b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22416c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f22417e;

    /* renamed from: f, reason: collision with root package name */
    public g8 f22418f;

    /* renamed from: g, reason: collision with root package name */
    public s7 f22419g;

    /* renamed from: h, reason: collision with root package name */
    public s7 f22420h;

    /* renamed from: i, reason: collision with root package name */
    public List f22421i;

    /* renamed from: j, reason: collision with root package name */
    public pa f22422j;

    /* renamed from: k, reason: collision with root package name */
    public List f22423k;

    /* renamed from: l, reason: collision with root package name */
    public pa f22424l;

    /* renamed from: m, reason: collision with root package name */
    public List f22425m;

    /* renamed from: n, reason: collision with root package name */
    public pa f22426n;

    /* renamed from: o, reason: collision with root package name */
    public List f22427o;

    /* renamed from: p, reason: collision with root package name */
    public pa f22428p;

    /* renamed from: q, reason: collision with root package name */
    public u2 f22429q;

    /* renamed from: r, reason: collision with root package name */
    public xa f22430r;

    /* renamed from: s, reason: collision with root package name */
    public n4 f22431s;

    /* renamed from: t, reason: collision with root package name */
    public xa f22432t;

    /* renamed from: u, reason: collision with root package name */
    public Serializable f22433u;

    public o2() {
        super(null);
        this.f22416c = "";
        this.f22417e = "";
        this.f22418f = f8.f22138e;
        this.f22419g = k7.emptyIntList();
        this.f22420h = k7.emptyIntList();
        List list = Collections.EMPTY_LIST;
        this.f22421i = list;
        this.f22423k = list;
        this.f22425m = list;
        this.f22427o = list;
        this.f22433u = "";
        if (k7.alwaysUseFieldBuilders) {
            n();
            l();
            o();
            m();
            if (this.f22430r == null) {
                this.f22430r = new xa(getOptions(), getParentForChildren(), isClean());
                this.f22429q = null;
            }
            if (this.f22432t == null) {
                this.f22432t = new xa(getSourceCodeInfo(), getParentForChildren(), isClean());
                this.f22431s = null;
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22833a;
    }

    public o2 addAllDependency(Iterable<String> iterable) {
        c();
        b.a.addAll((Iterable) iterable, (List) this.f22418f);
        onChanged();
        return this;
    }

    public o2 addAllEnumType(Iterable<? extends j1> iterable) {
        pa paVar = this.f22424l;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        e();
        b.a.addAll((Iterable) iterable, this.f22423k);
        onChanged();
        return this;
    }

    public o2 addAllExtension(Iterable<? extends f2> iterable) {
        pa paVar = this.f22428p;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        f();
        b.a.addAll((Iterable) iterable, this.f22427o);
        onChanged();
        return this;
    }

    public o2 addAllMessageType(Iterable<? extends b1> iterable) {
        pa paVar = this.f22422j;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        g();
        b.a.addAll((Iterable) iterable, this.f22421i);
        onChanged();
        return this;
    }

    public o2 addAllPublicDependency(Iterable<? extends Integer> iterable) {
        i();
        b.a.addAll((Iterable) iterable, (List) this.f22419g);
        onChanged();
        return this;
    }

    public o2 addAllService(Iterable<? extends b4> iterable) {
        pa paVar = this.f22426n;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        j();
        b.a.addAll((Iterable) iterable, this.f22425m);
        onChanged();
        return this;
    }

    public o2 addAllWeakDependency(Iterable<? extends Integer> iterable) {
        k();
        b.a.addAll((Iterable) iterable, (List) this.f22420h);
        onChanged();
        return this;
    }

    public o2 addDependency(String str) {
        str.getClass();
        c();
        this.f22418f.add((g8) str);
        onChanged();
        return this;
    }

    public o2 addDependencyBytes(ByteString byteString) {
        byteString.getClass();
        c();
        this.f22418f.add(byteString);
        onChanged();
        return this;
    }

    public o2 addEnumType(j1 j1Var) {
        pa paVar = this.f22424l;
        if (paVar != null) {
            paVar.addMessage(j1Var);
            return this;
        }
        j1Var.getClass();
        e();
        this.f22423k.add(j1Var);
        onChanged();
        return this;
    }

    public e1 addEnumTypeBuilder() {
        return (e1) l().addBuilder(j1.getDefaultInstance());
    }

    public o2 addExtension(f2 f2Var) {
        pa paVar = this.f22428p;
        if (paVar != null) {
            paVar.addMessage(f2Var);
            return this;
        }
        f2Var.getClass();
        f();
        this.f22427o.add(f2Var);
        onChanged();
        return this;
    }

    public c2 addExtensionBuilder() {
        return (c2) m().addBuilder(f2.getDefaultInstance());
    }

    public o2 addMessageType(b1 b1Var) {
        pa paVar = this.f22422j;
        if (paVar != null) {
            paVar.addMessage(b1Var);
            return this;
        }
        b1Var.getClass();
        g();
        this.f22421i.add(b1Var);
        onChanged();
        return this;
    }

    public s0 addMessageTypeBuilder() {
        return (s0) n().addBuilder(b1.getDefaultInstance());
    }

    public o2 addPublicDependency(int i10) {
        i();
        ((l7) this.f22419g).addInt(i10);
        onChanged();
        return this;
    }

    public o2 addService(b4 b4Var) {
        pa paVar = this.f22426n;
        if (paVar != null) {
            paVar.addMessage(b4Var);
            return this;
        }
        b4Var.getClass();
        j();
        this.f22425m.add(b4Var);
        onChanged();
        return this;
    }

    public a4 addServiceBuilder() {
        return (a4) o().addBuilder(b4.getDefaultInstance());
    }

    public o2 addWeakDependency(int i10) {
        k();
        ((l7) this.f22420h).addInt(i10);
        onChanged();
        return this;
    }

    public final void c() {
        if ((this.f22415b & 4) == 0) {
            this.f22418f = new f8(this.f22418f);
            this.f22415b |= 4;
        }
    }

    public o2 clearDependency() {
        this.f22418f = f8.f22138e;
        this.f22415b &= -5;
        onChanged();
        return this;
    }

    public o2 clearEnumType() {
        pa paVar = this.f22424l;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22423k = Collections.EMPTY_LIST;
        this.f22415b &= -65;
        onChanged();
        return this;
    }

    public o2 clearExtension() {
        pa paVar = this.f22428p;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22427o = Collections.EMPTY_LIST;
        this.f22415b &= -257;
        onChanged();
        return this;
    }

    public o2 clearMessageType() {
        pa paVar = this.f22422j;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22421i = Collections.EMPTY_LIST;
        this.f22415b &= -33;
        onChanged();
        return this;
    }

    public o2 clearName() {
        this.f22415b &= -2;
        this.f22416c = p2.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public o2 clearOptions() {
        xa xaVar = this.f22430r;
        if (xaVar == null) {
            this.f22429q = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22415b &= -513;
        return this;
    }

    public o2 clearPackage() {
        this.f22415b &= -3;
        this.f22417e = p2.getDefaultInstance().getPackage();
        onChanged();
        return this;
    }

    public o2 clearPublicDependency() {
        this.f22419g = k7.emptyIntList();
        this.f22415b &= -9;
        onChanged();
        return this;
    }

    public o2 clearService() {
        pa paVar = this.f22426n;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22425m = Collections.EMPTY_LIST;
        this.f22415b &= -129;
        onChanged();
        return this;
    }

    public o2 clearSourceCodeInfo() {
        xa xaVar = this.f22432t;
        if (xaVar == null) {
            this.f22431s = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22415b &= -1025;
        return this;
    }

    public o2 clearSyntax() {
        this.f22415b &= -2049;
        this.f22433u = p2.getDefaultInstance().getSyntax();
        onChanged();
        return this;
    }

    public o2 clearWeakDependency() {
        this.f22420h = k7.emptyIntList();
        this.f22415b &= -17;
        onChanged();
        return this;
    }

    public final void e() {
        if ((this.f22415b & 64) == 0) {
            this.f22423k = new ArrayList(this.f22423k);
            this.f22415b |= 64;
        }
    }

    public final void f() {
        if ((this.f22415b & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.f22427o = new ArrayList(this.f22427o);
            this.f22415b |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
    }

    public final void g() {
        if ((this.f22415b & 32) == 0) {
            this.f22421i = new ArrayList(this.f22421i);
            this.f22415b |= 32;
        }
    }

    @Override // com.explorestack.protobuf.q2
    public String getDependency(int i10) {
        return (String) this.f22418f.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getDependencyBytes(int i10) {
        return this.f22418f.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getDependencyCount() {
        return this.f22418f.size();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22833a;
    }

    @Override // com.explorestack.protobuf.q2
    public j1 getEnumType(int i10) {
        pa paVar = this.f22424l;
        return paVar == null ? (j1) this.f22423k.get(i10) : (j1) paVar.getMessage(i10);
    }

    public e1 getEnumTypeBuilder(int i10) {
        return (e1) l().getBuilder(i10);
    }

    public List<e1> getEnumTypeBuilderList() {
        return l().getBuilderList();
    }

    @Override // com.explorestack.protobuf.q2
    public int getEnumTypeCount() {
        pa paVar = this.f22424l;
        return paVar == null ? this.f22423k.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.q2
    public List<j1> getEnumTypeList() {
        pa paVar = this.f22424l;
        return paVar == null ? Collections.unmodifiableList(this.f22423k) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.q2
    public k1 getEnumTypeOrBuilder(int i10) {
        pa paVar = this.f22424l;
        return paVar == null ? (k1) this.f22423k.get(i10) : (k1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends k1> getEnumTypeOrBuilderList() {
        pa paVar = this.f22424l;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22423k);
    }

    @Override // com.explorestack.protobuf.q2
    public f2 getExtension(int i10) {
        pa paVar = this.f22428p;
        return paVar == null ? (f2) this.f22427o.get(i10) : (f2) paVar.getMessage(i10);
    }

    public c2 getExtensionBuilder(int i10) {
        return (c2) m().getBuilder(i10);
    }

    public List<c2> getExtensionBuilderList() {
        return m().getBuilderList();
    }

    @Override // com.explorestack.protobuf.q2
    public int getExtensionCount() {
        pa paVar = this.f22428p;
        return paVar == null ? this.f22427o.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.q2
    public List<f2> getExtensionList() {
        pa paVar = this.f22428p;
        return paVar == null ? Collections.unmodifiableList(this.f22427o) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.q2
    public g2 getExtensionOrBuilder(int i10) {
        pa paVar = this.f22428p;
        return paVar == null ? (g2) this.f22427o.get(i10) : (g2) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends g2> getExtensionOrBuilderList() {
        pa paVar = this.f22428p;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22427o);
    }

    @Override // com.explorestack.protobuf.q2
    public b1 getMessageType(int i10) {
        pa paVar = this.f22422j;
        return paVar == null ? (b1) this.f22421i.get(i10) : (b1) paVar.getMessage(i10);
    }

    public s0 getMessageTypeBuilder(int i10) {
        return (s0) n().getBuilder(i10);
    }

    public List<s0> getMessageTypeBuilderList() {
        return n().getBuilderList();
    }

    @Override // com.explorestack.protobuf.q2
    public int getMessageTypeCount() {
        pa paVar = this.f22422j;
        return paVar == null ? this.f22421i.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.q2
    public List<b1> getMessageTypeList() {
        pa paVar = this.f22422j;
        return paVar == null ? Collections.unmodifiableList(this.f22421i) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.q2
    public c1 getMessageTypeOrBuilder(int i10) {
        pa paVar = this.f22422j;
        return paVar == null ? (c1) this.f22421i.get(i10) : (c1) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends c1> getMessageTypeOrBuilderList() {
        pa paVar = this.f22422j;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22421i);
    }

    @Override // com.explorestack.protobuf.q2
    public String getName() {
        Serializable serializable = this.f22416c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22416c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getNameBytes() {
        Serializable serializable = this.f22416c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22416c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public u2 getOptions() {
        xa xaVar = this.f22430r;
        if (xaVar != null) {
            return (u2) xaVar.getMessage();
        }
        u2 u2Var = this.f22429q;
        return u2Var == null ? u2.getDefaultInstance() : u2Var;
    }

    public s2 getOptionsBuilder() {
        this.f22415b |= 512;
        onChanged();
        if (this.f22430r == null) {
            this.f22430r = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22429q = null;
        }
        return (s2) this.f22430r.getBuilder();
    }

    @Override // com.explorestack.protobuf.q2
    public v2 getOptionsOrBuilder() {
        xa xaVar = this.f22430r;
        if (xaVar != null) {
            return (v2) xaVar.getMessageOrBuilder();
        }
        u2 u2Var = this.f22429q;
        return u2Var == null ? u2.getDefaultInstance() : u2Var;
    }

    @Override // com.explorestack.protobuf.q2
    public String getPackage() {
        Serializable serializable = this.f22417e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22417e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getPackageBytes() {
        Serializable serializable = this.f22417e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22417e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public int getPublicDependency(int i10) {
        return ((l7) this.f22419g).getInt(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getPublicDependencyCount() {
        return this.f22419g.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<Integer> getPublicDependencyList() {
        return (this.f22415b & 8) != 0 ? Collections.unmodifiableList(this.f22419g) : this.f22419g;
    }

    @Override // com.explorestack.protobuf.q2
    public b4 getService(int i10) {
        pa paVar = this.f22426n;
        return paVar == null ? (b4) this.f22425m.get(i10) : (b4) paVar.getMessage(i10);
    }

    public a4 getServiceBuilder(int i10) {
        return (a4) o().getBuilder(i10);
    }

    public List<a4> getServiceBuilderList() {
        return o().getBuilderList();
    }

    @Override // com.explorestack.protobuf.q2
    public int getServiceCount() {
        pa paVar = this.f22426n;
        return paVar == null ? this.f22425m.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.q2
    public List<b4> getServiceList() {
        pa paVar = this.f22426n;
        return paVar == null ? Collections.unmodifiableList(this.f22425m) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.q2
    public c4 getServiceOrBuilder(int i10) {
        pa paVar = this.f22426n;
        return paVar == null ? (c4) this.f22425m.get(i10) : (c4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends c4> getServiceOrBuilderList() {
        pa paVar = this.f22426n;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22425m);
    }

    @Override // com.explorestack.protobuf.q2
    public n4 getSourceCodeInfo() {
        xa xaVar = this.f22432t;
        if (xaVar != null) {
            return (n4) xaVar.getMessage();
        }
        n4 n4Var = this.f22431s;
        return n4Var == null ? n4.getDefaultInstance() : n4Var;
    }

    public i4 getSourceCodeInfoBuilder() {
        this.f22415b |= 1024;
        onChanged();
        if (this.f22432t == null) {
            this.f22432t = new xa(getSourceCodeInfo(), getParentForChildren(), isClean());
            this.f22431s = null;
        }
        return (i4) this.f22432t.getBuilder();
    }

    @Override // com.explorestack.protobuf.q2
    public o4 getSourceCodeInfoOrBuilder() {
        xa xaVar = this.f22432t;
        if (xaVar != null) {
            return (o4) xaVar.getMessageOrBuilder();
        }
        n4 n4Var = this.f22431s;
        return n4Var == null ? n4.getDefaultInstance() : n4Var;
    }

    @Override // com.explorestack.protobuf.q2
    public String getSyntax() {
        Serializable serializable = this.f22433u;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22433u = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getSyntaxBytes() {
        Serializable serializable = this.f22433u;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22433u = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public int getWeakDependency(int i10) {
        return ((l7) this.f22420h).getInt(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getWeakDependencyCount() {
        return this.f22420h.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<Integer> getWeakDependencyList() {
        return (this.f22415b & 16) != 0 ? Collections.unmodifiableList(this.f22420h) : this.f22420h;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasName() {
        return (this.f22415b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasOptions() {
        return (this.f22415b & 512) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasPackage() {
        return (this.f22415b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasSourceCodeInfo() {
        return (this.f22415b & 1024) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasSyntax() {
        return (this.f22415b & 2048) != 0;
    }

    public final void i() {
        if ((this.f22415b & 8) == 0) {
            this.f22419g = k7.mutableCopy(this.f22419g);
            this.f22415b |= 8;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22835b.ensureFieldAccessorsInitialized(p2.class, o2.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getMessageTypeCount(); i10++) {
            if (!getMessageType(i10).isInitialized()) {
                return false;
            }
        }
        for (int i11 = 0; i11 < getEnumTypeCount(); i11++) {
            if (!getEnumType(i11).isInitialized()) {
                return false;
            }
        }
        for (int i12 = 0; i12 < getServiceCount(); i12++) {
            if (!getService(i12).isInitialized()) {
                return false;
            }
        }
        for (int i13 = 0; i13 < getExtensionCount(); i13++) {
            if (!getExtension(i13).isInitialized()) {
                return false;
            }
        }
        return !hasOptions() || getOptions().isInitialized();
    }

    public final void j() {
        if ((this.f22415b & 128) == 0) {
            this.f22425m = new ArrayList(this.f22425m);
            this.f22415b |= 128;
        }
    }

    public final void k() {
        if ((this.f22415b & 16) == 0) {
            this.f22420h = k7.mutableCopy(this.f22420h);
            this.f22415b |= 16;
        }
    }

    public final pa l() {
        if (this.f22424l == null) {
            this.f22424l = new pa(this.f22423k, (this.f22415b & 64) != 0, getParentForChildren(), isClean());
            this.f22423k = null;
        }
        return this.f22424l;
    }

    public final pa m() {
        if (this.f22428p == null) {
            this.f22428p = new pa(this.f22427o, (this.f22415b & NotificationCompat.FLAG_LOCAL_ONLY) != 0, getParentForChildren(), isClean());
            this.f22427o = null;
        }
        return this.f22428p;
    }

    public o2 mergeOptions(u2 u2Var) {
        u2 u2Var2;
        xa xaVar = this.f22430r;
        if (xaVar == null) {
            if ((this.f22415b & 512) == 0 || (u2Var2 = this.f22429q) == null || u2Var2 == u2.getDefaultInstance()) {
                this.f22429q = u2Var;
            } else {
                this.f22429q = u2.newBuilder(this.f22429q).mergeFrom(u2Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(u2Var);
        }
        this.f22415b |= 512;
        return this;
    }

    public o2 mergeSourceCodeInfo(n4 n4Var) {
        n4 n4Var2;
        xa xaVar = this.f22432t;
        if (xaVar == null) {
            if ((this.f22415b & 1024) == 0 || (n4Var2 = this.f22431s) == null || n4Var2 == n4.getDefaultInstance()) {
                this.f22431s = n4Var;
            } else {
                this.f22431s = n4.newBuilder(this.f22431s).mergeFrom(n4Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(n4Var);
        }
        this.f22415b |= 1024;
        return this;
    }

    public final pa n() {
        if (this.f22422j == null) {
            this.f22422j = new pa(this.f22421i, (this.f22415b & 32) != 0, getParentForChildren(), isClean());
            this.f22421i = null;
        }
        return this.f22422j;
    }

    public final pa o() {
        if (this.f22426n == null) {
            this.f22426n = new pa(this.f22425m, (this.f22415b & 128) != 0, getParentForChildren(), isClean());
            this.f22425m = null;
        }
        return this.f22426n;
    }

    public o2 removeEnumType(int i10) {
        pa paVar = this.f22424l;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        e();
        this.f22423k.remove(i10);
        onChanged();
        return this;
    }

    public o2 removeExtension(int i10) {
        pa paVar = this.f22428p;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        f();
        this.f22427o.remove(i10);
        onChanged();
        return this;
    }

    public o2 removeMessageType(int i10) {
        pa paVar = this.f22422j;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        g();
        this.f22421i.remove(i10);
        onChanged();
        return this;
    }

    public o2 removeService(int i10) {
        pa paVar = this.f22426n;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        j();
        this.f22425m.remove(i10);
        onChanged();
        return this;
    }

    public o2 setDependency(int i10, String str) {
        str.getClass();
        c();
        this.f22418f.set(i10, (int) str);
        onChanged();
        return this;
    }

    public o2 setEnumType(int i10, j1 j1Var) {
        pa paVar = this.f22424l;
        if (paVar != null) {
            paVar.setMessage(i10, j1Var);
            return this;
        }
        j1Var.getClass();
        e();
        this.f22423k.set(i10, j1Var);
        onChanged();
        return this;
    }

    public o2 setExtension(int i10, f2 f2Var) {
        pa paVar = this.f22428p;
        if (paVar != null) {
            paVar.setMessage(i10, f2Var);
            return this;
        }
        f2Var.getClass();
        f();
        this.f22427o.set(i10, f2Var);
        onChanged();
        return this;
    }

    public o2 setMessageType(int i10, b1 b1Var) {
        pa paVar = this.f22422j;
        if (paVar != null) {
            paVar.setMessage(i10, b1Var);
            return this;
        }
        b1Var.getClass();
        g();
        this.f22421i.set(i10, b1Var);
        onChanged();
        return this;
    }

    public o2 setName(String str) {
        str.getClass();
        this.f22415b |= 1;
        this.f22416c = str;
        onChanged();
        return this;
    }

    public o2 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22415b |= 1;
        this.f22416c = byteString;
        onChanged();
        return this;
    }

    public o2 setOptions(u2 u2Var) {
        xa xaVar = this.f22430r;
        if (xaVar == null) {
            u2Var.getClass();
            this.f22429q = u2Var;
            onChanged();
        } else {
            xaVar.setMessage(u2Var);
        }
        this.f22415b |= 512;
        return this;
    }

    public o2 setPackage(String str) {
        str.getClass();
        this.f22415b |= 2;
        this.f22417e = str;
        onChanged();
        return this;
    }

    public o2 setPackageBytes(ByteString byteString) {
        byteString.getClass();
        this.f22415b |= 2;
        this.f22417e = byteString;
        onChanged();
        return this;
    }

    public o2 setPublicDependency(int i10, int i11) {
        i();
        ((l7) this.f22419g).setInt(i10, i11);
        onChanged();
        return this;
    }

    public o2 setService(int i10, b4 b4Var) {
        pa paVar = this.f22426n;
        if (paVar != null) {
            paVar.setMessage(i10, b4Var);
            return this;
        }
        b4Var.getClass();
        j();
        this.f22425m.set(i10, b4Var);
        onChanged();
        return this;
    }

    public o2 setSourceCodeInfo(n4 n4Var) {
        xa xaVar = this.f22432t;
        if (xaVar == null) {
            n4Var.getClass();
            this.f22431s = n4Var;
            onChanged();
        } else {
            xaVar.setMessage(n4Var);
        }
        this.f22415b |= 1024;
        return this;
    }

    public o2 setSyntax(String str) {
        str.getClass();
        this.f22415b |= 2048;
        this.f22433u = str;
        onChanged();
        return this;
    }

    public o2 setSyntaxBytes(ByteString byteString) {
        byteString.getClass();
        this.f22415b |= 2048;
        this.f22433u = byteString;
        onChanged();
        return this;
    }

    public o2 setWeakDependency(int i10, int i11) {
        k();
        ((l7) this.f22420h).setInt(i10, i11);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q2
    public ka getDependencyList() {
        return this.f22418f.getUnmodifiableView();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public o2 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (o2) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public p2 build() {
        p2 p2VarBuildPartial = buildPartial();
        if (p2VarBuildPartial.isInitialized()) {
            return p2VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) p2VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public p2 buildPartial() {
        p2 p2Var = new p2(this);
        p2Var.f22480p = (byte) -1;
        int i10 = this.f22415b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        p2Var.f22468c = this.f22416c;
        if ((i10 & 2) != 0) {
            i11 |= 2;
        }
        p2Var.f22469e = this.f22417e;
        if ((this.f22415b & 4) != 0) {
            this.f22418f = this.f22418f.getUnmodifiableView();
            this.f22415b &= -5;
        }
        p2Var.f22470f = this.f22418f;
        if ((this.f22415b & 8) != 0) {
            ((e) this.f22419g).makeImmutable();
            this.f22415b &= -9;
        }
        p2Var.f22471g = this.f22419g;
        if ((this.f22415b & 16) != 0) {
            ((e) this.f22420h).makeImmutable();
            this.f22415b &= -17;
        }
        p2Var.f22472h = this.f22420h;
        pa paVar = this.f22422j;
        if (paVar == null) {
            if ((this.f22415b & 32) != 0) {
                this.f22421i = Collections.unmodifiableList(this.f22421i);
                this.f22415b &= -33;
            }
            p2Var.f22473i = this.f22421i;
        } else {
            p2Var.f22473i = paVar.build();
        }
        pa paVar2 = this.f22424l;
        if (paVar2 == null) {
            if ((this.f22415b & 64) != 0) {
                this.f22423k = Collections.unmodifiableList(this.f22423k);
                this.f22415b &= -65;
            }
            p2Var.f22474j = this.f22423k;
        } else {
            p2Var.f22474j = paVar2.build();
        }
        pa paVar3 = this.f22426n;
        if (paVar3 == null) {
            if ((this.f22415b & 128) != 0) {
                this.f22425m = Collections.unmodifiableList(this.f22425m);
                this.f22415b &= -129;
            }
            p2Var.f22475k = this.f22425m;
        } else {
            p2Var.f22475k = paVar3.build();
        }
        pa paVar4 = this.f22428p;
        if (paVar4 == null) {
            if ((this.f22415b & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                this.f22427o = Collections.unmodifiableList(this.f22427o);
                this.f22415b &= -257;
            }
            p2Var.f22476l = this.f22427o;
        } else {
            p2Var.f22476l = paVar4.build();
        }
        if ((i10 & 512) != 0) {
            xa xaVar = this.f22430r;
            if (xaVar == null) {
                p2Var.f22477m = this.f22429q;
            } else {
                p2Var.f22477m = (u2) xaVar.build();
            }
            i11 |= 4;
        }
        if ((i10 & 1024) != 0) {
            xa xaVar2 = this.f22432t;
            if (xaVar2 == null) {
                p2Var.f22478n = this.f22431s;
            } else {
                p2Var.f22478n = (n4) xaVar2.build();
            }
            i11 |= 8;
        }
        if ((i10 & 2048) != 0) {
            i11 |= 16;
        }
        p2Var.f22479o = this.f22433u;
        p2Var.f22467b = i11;
        onBuilt();
        return p2Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public o2 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (o2) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public p2 getDefaultInstanceForType() {
        return p2.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public o2 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (o2) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public o2 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (o2) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final o2 setUnknownFields(gc gcVar) {
        return (o2) super.setUnknownFields(gcVar);
    }

    public e1 addEnumTypeBuilder(int i10) {
        return (e1) l().addBuilder(i10, j1.getDefaultInstance());
    }

    public c2 addExtensionBuilder(int i10) {
        return (c2) m().addBuilder(i10, f2.getDefaultInstance());
    }

    public s0 addMessageTypeBuilder(int i10) {
        return (s0) n().addBuilder(i10, b1.getDefaultInstance());
    }

    public a4 addServiceBuilder(int i10) {
        return (a4) o().addBuilder(i10, b4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public o2 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (o2) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final o2 mergeUnknownFields(gc gcVar) {
        return (o2) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public o2 clear() {
        super.clear();
        this.f22416c = "";
        int i10 = this.f22415b;
        this.f22417e = "";
        this.f22415b = i10 & (-4);
        this.f22418f = f8.f22138e;
        this.f22415b = i10 & (-8);
        this.f22419g = k7.emptyIntList();
        this.f22415b &= -9;
        this.f22420h = k7.emptyIntList();
        int i11 = this.f22415b;
        this.f22415b = i11 & (-17);
        pa paVar = this.f22422j;
        if (paVar == null) {
            this.f22421i = Collections.EMPTY_LIST;
            this.f22415b = i11 & (-49);
        } else {
            paVar.clear();
        }
        pa paVar2 = this.f22424l;
        if (paVar2 == null) {
            this.f22423k = Collections.EMPTY_LIST;
            this.f22415b &= -65;
        } else {
            paVar2.clear();
        }
        pa paVar3 = this.f22426n;
        if (paVar3 == null) {
            this.f22425m = Collections.EMPTY_LIST;
            this.f22415b &= -129;
        } else {
            paVar3.clear();
        }
        pa paVar4 = this.f22428p;
        if (paVar4 == null) {
            this.f22427o = Collections.EMPTY_LIST;
            this.f22415b &= -257;
        } else {
            paVar4.clear();
        }
        xa xaVar = this.f22430r;
        if (xaVar == null) {
            this.f22429q = null;
        } else {
            xaVar.clear();
        }
        this.f22415b &= -513;
        xa xaVar2 = this.f22432t;
        if (xaVar2 == null) {
            this.f22431s = null;
        } else {
            xaVar2.clear();
        }
        int i12 = this.f22415b;
        this.f22433u = "";
        this.f22415b = i12 & (-3073);
        return this;
    }

    public o2 addEnumType(int i10, j1 j1Var) {
        pa paVar = this.f22424l;
        if (paVar == null) {
            j1Var.getClass();
            e();
            this.f22423k.add(i10, j1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, j1Var);
        return this;
    }

    public o2 addExtension(int i10, f2 f2Var) {
        pa paVar = this.f22428p;
        if (paVar == null) {
            f2Var.getClass();
            f();
            this.f22427o.add(i10, f2Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, f2Var);
        return this;
    }

    public o2 addMessageType(int i10, b1 b1Var) {
        pa paVar = this.f22422j;
        if (paVar == null) {
            b1Var.getClass();
            g();
            this.f22421i.add(i10, b1Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, b1Var);
        return this;
    }

    public o2 addService(int i10, b4 b4Var) {
        pa paVar = this.f22426n;
        if (paVar == null) {
            b4Var.getClass();
            j();
            this.f22425m.add(i10, b4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, b4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public o2 mo500clone() {
        return (o2) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public o2 mergeFrom(Message message) {
        if (message instanceof p2) {
            return mergeFrom((p2) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public o2 setEnumType(int i10, e1 e1Var) {
        pa paVar = this.f22424l;
        if (paVar == null) {
            e();
            this.f22423k.set(i10, e1Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, e1Var.build());
        return this;
    }

    public o2 setExtension(int i10, c2 c2Var) {
        pa paVar = this.f22428p;
        if (paVar == null) {
            f();
            this.f22427o.set(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, c2Var.build());
        return this;
    }

    public o2 setMessageType(int i10, s0 s0Var) {
        pa paVar = this.f22422j;
        if (paVar == null) {
            g();
            this.f22421i.set(i10, s0Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, s0Var.build());
        return this;
    }

    public o2 setOptions(s2 s2Var) {
        xa xaVar = this.f22430r;
        if (xaVar == null) {
            this.f22429q = s2Var.build();
            onChanged();
        } else {
            xaVar.setMessage(s2Var.build());
        }
        this.f22415b |= 512;
        return this;
    }

    public o2 setService(int i10, a4 a4Var) {
        pa paVar = this.f22426n;
        if (paVar == null) {
            j();
            this.f22425m.set(i10, a4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, a4Var.build());
        return this;
    }

    public o2 setSourceCodeInfo(i4 i4Var) {
        xa xaVar = this.f22432t;
        if (xaVar == null) {
            this.f22431s = i4Var.build();
            onChanged();
        } else {
            xaVar.setMessage(i4Var.build());
        }
        this.f22415b |= 1024;
        return this;
    }

    public o2 mergeFrom(p2 p2Var) {
        if (p2Var == p2.getDefaultInstance()) {
            return this;
        }
        if (p2Var.hasName()) {
            this.f22415b |= 1;
            this.f22416c = p2Var.f22468c;
            onChanged();
        }
        if (p2Var.hasPackage()) {
            this.f22415b |= 2;
            this.f22417e = p2Var.f22469e;
            onChanged();
        }
        if (!p2Var.f22470f.isEmpty()) {
            if (this.f22418f.isEmpty()) {
                this.f22418f = p2Var.f22470f;
                this.f22415b &= -5;
            } else {
                c();
                this.f22418f.addAll(p2Var.f22470f);
            }
            onChanged();
        }
        if (!p2Var.f22471g.isEmpty()) {
            if (this.f22419g.isEmpty()) {
                this.f22419g = p2Var.f22471g;
                this.f22415b &= -9;
            } else {
                i();
                this.f22419g.addAll(p2Var.f22471g);
            }
            onChanged();
        }
        if (!p2Var.f22472h.isEmpty()) {
            if (this.f22420h.isEmpty()) {
                this.f22420h = p2Var.f22472h;
                this.f22415b &= -17;
            } else {
                k();
                this.f22420h.addAll(p2Var.f22472h);
            }
            onChanged();
        }
        if (this.f22422j == null) {
            if (!p2Var.f22473i.isEmpty()) {
                if (this.f22421i.isEmpty()) {
                    this.f22421i = p2Var.f22473i;
                    this.f22415b &= -33;
                } else {
                    g();
                    this.f22421i.addAll(p2Var.f22473i);
                }
                onChanged();
            }
        } else if (!p2Var.f22473i.isEmpty()) {
            if (this.f22422j.isEmpty()) {
                this.f22422j.dispose();
                this.f22422j = null;
                this.f22421i = p2Var.f22473i;
                this.f22415b &= -33;
                this.f22422j = k7.alwaysUseFieldBuilders ? n() : null;
            } else {
                this.f22422j.addAllMessages(p2Var.f22473i);
            }
        }
        if (this.f22424l == null) {
            if (!p2Var.f22474j.isEmpty()) {
                if (this.f22423k.isEmpty()) {
                    this.f22423k = p2Var.f22474j;
                    this.f22415b &= -65;
                } else {
                    e();
                    this.f22423k.addAll(p2Var.f22474j);
                }
                onChanged();
            }
        } else if (!p2Var.f22474j.isEmpty()) {
            if (this.f22424l.isEmpty()) {
                this.f22424l.dispose();
                this.f22424l = null;
                this.f22423k = p2Var.f22474j;
                this.f22415b &= -65;
                this.f22424l = k7.alwaysUseFieldBuilders ? l() : null;
            } else {
                this.f22424l.addAllMessages(p2Var.f22474j);
            }
        }
        if (this.f22426n == null) {
            if (!p2Var.f22475k.isEmpty()) {
                if (this.f22425m.isEmpty()) {
                    this.f22425m = p2Var.f22475k;
                    this.f22415b &= -129;
                } else {
                    j();
                    this.f22425m.addAll(p2Var.f22475k);
                }
                onChanged();
            }
        } else if (!p2Var.f22475k.isEmpty()) {
            if (this.f22426n.isEmpty()) {
                this.f22426n.dispose();
                this.f22426n = null;
                this.f22425m = p2Var.f22475k;
                this.f22415b &= -129;
                this.f22426n = k7.alwaysUseFieldBuilders ? o() : null;
            } else {
                this.f22426n.addAllMessages(p2Var.f22475k);
            }
        }
        if (this.f22428p == null) {
            if (!p2Var.f22476l.isEmpty()) {
                if (this.f22427o.isEmpty()) {
                    this.f22427o = p2Var.f22476l;
                    this.f22415b &= -257;
                } else {
                    f();
                    this.f22427o.addAll(p2Var.f22476l);
                }
                onChanged();
            }
        } else if (!p2Var.f22476l.isEmpty()) {
            if (this.f22428p.isEmpty()) {
                this.f22428p.dispose();
                this.f22428p = null;
                this.f22427o = p2Var.f22476l;
                this.f22415b &= -257;
                this.f22428p = k7.alwaysUseFieldBuilders ? m() : null;
            } else {
                this.f22428p.addAllMessages(p2Var.f22476l);
            }
        }
        if (p2Var.hasOptions()) {
            mergeOptions(p2Var.getOptions());
        }
        if (p2Var.hasSourceCodeInfo()) {
            mergeSourceCodeInfo(p2Var.getSourceCodeInfo());
        }
        if (p2Var.hasSyntax()) {
            this.f22415b |= 2048;
            this.f22433u = p2Var.f22479o;
            onChanged();
        }
        mergeUnknownFields(p2Var.unknownFields);
        onChanged();
        return this;
    }

    public o2 addEnumType(e1 e1Var) {
        pa paVar = this.f22424l;
        if (paVar == null) {
            e();
            this.f22423k.add(e1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(e1Var.build());
        return this;
    }

    public o2 addExtension(c2 c2Var) {
        pa paVar = this.f22428p;
        if (paVar == null) {
            f();
            this.f22427o.add(c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(c2Var.build());
        return this;
    }

    public o2 addMessageType(s0 s0Var) {
        pa paVar = this.f22422j;
        if (paVar == null) {
            g();
            this.f22421i.add(s0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(s0Var.build());
        return this;
    }

    public o2 addService(a4 a4Var) {
        pa paVar = this.f22426n;
        if (paVar == null) {
            j();
            this.f22425m.add(a4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(a4Var.build());
        return this;
    }

    public o2 addEnumType(int i10, e1 e1Var) {
        pa paVar = this.f22424l;
        if (paVar == null) {
            e();
            this.f22423k.add(i10, e1Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, e1Var.build());
        return this;
    }

    public o2 addExtension(int i10, c2 c2Var) {
        pa paVar = this.f22428p;
        if (paVar == null) {
            f();
            this.f22427o.add(i10, c2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, c2Var.build());
        return this;
    }

    public o2 addMessageType(int i10, s0 s0Var) {
        pa paVar = this.f22422j;
        if (paVar == null) {
            g();
            this.f22421i.add(i10, s0Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, s0Var.build());
        return this;
    }

    public o2 addService(int i10, a4 a4Var) {
        pa paVar = this.f22426n;
        if (paVar == null) {
            j();
            this.f22425m.add(i10, a4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, a4Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.o2 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.n2 r1 = com.explorestack.protobuf.p2.f22466r     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.p2 r3 = (com.explorestack.protobuf.p2) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.p2 r4 = (com.explorestack.protobuf.p2) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.o2.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.o2");
    }
}
