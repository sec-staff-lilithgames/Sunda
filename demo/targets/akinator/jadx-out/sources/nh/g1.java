package nh;

import java.util.Collections;
import java.util.EnumMap;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final BinaryOperator f76277a;

    /* renamed from: b, reason: collision with root package name */
    public EnumMap f76278b = null;

    public g1(BinaryOperator binaryOperator) {
        this.f76277a = binaryOperator;
    }

    public final void a(Enum r32, Object obj) {
        EnumMap enumMap = this.f76278b;
        if (enumMap == null) {
            this.f76278b = new EnumMap(Collections.singletonMap(r32, obj));
        } else {
            enumMap.merge(r32, obj, this.f76277a);
        }
    }
}
