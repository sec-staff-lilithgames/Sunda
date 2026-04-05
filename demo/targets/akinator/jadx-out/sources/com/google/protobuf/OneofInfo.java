package com.google.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f30074id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i10, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f30074id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f30074id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
