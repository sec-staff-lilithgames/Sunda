package com.explorestack.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final int f21853a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f21854b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f21855c;

    public aa(int i10, Field field, Field field2) {
        this.f21853a = i10;
        this.f21854b = field;
        this.f21855c = field2;
    }

    public Field getCaseField() {
        return this.f21854b;
    }

    public int getId() {
        return this.f21853a;
    }

    public Field getValueField() {
        return this.f21855c;
    }
}
