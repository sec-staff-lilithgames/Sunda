package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k6 extends f5 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f22308a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22309b;

    /* renamed from: c, reason: collision with root package name */
    public final MessageLite f22310c;

    /* renamed from: d, reason: collision with root package name */
    public final j6 f22311d;

    public k6(MessageLite messageLite, Object obj, MessageLite messageLite2, j6 j6Var) {
        if (messageLite == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (j6Var.getLiteType() == bd.f21958h && messageLite2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f22308a = messageLite;
        this.f22309b = obj;
        this.f22310c = messageLite2;
        this.f22311d = j6Var;
    }

    public final Object a(Object obj) {
        j6 j6Var = this.f22311d;
        return j6Var.getLiteJavaType() == cd.ENUM ? j6Var.f22272b.findValueByNumber(((Integer) obj).intValue()) : obj;
    }

    public MessageLite getContainingTypeDefaultInstance() {
        return this.f22308a;
    }

    @Override // com.explorestack.protobuf.f5
    public Object getDefaultValue() {
        return this.f22309b;
    }

    @Override // com.explorestack.protobuf.f5
    public bd getLiteType() {
        return this.f22311d.getLiteType();
    }

    @Override // com.explorestack.protobuf.f5
    public MessageLite getMessageDefaultInstance() {
        return this.f22310c;
    }

    @Override // com.explorestack.protobuf.f5
    public int getNumber() {
        return this.f22311d.getNumber();
    }

    @Override // com.explorestack.protobuf.f5
    public boolean isRepeated() {
        return this.f22311d.f22275f;
    }
}
