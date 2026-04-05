package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public enum s4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(x.f6099c),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: b, reason: collision with root package name */
    public final Object f6004b;

    s4(Serializable serializable) {
        this.f6004b = serializable;
    }
}
