package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6158a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6159b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6160c;

    public z2(int i10, Field field, Field field2) {
        this.f6158a = i10;
        this.f6159b = field;
        this.f6160c = field2;
    }

    public Field getCaseField() {
        return this.f6159b;
    }

    public int getId() {
        return this.f6158a;
    }

    public Field getValueField() {
        return this.f6160c;
    }
}
