package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Yc {

    /* renamed from: a, reason: collision with root package name */
    public final String f32583a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f32584b;

    public Yc(String fieldName, Class<?> originClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fieldName, "fieldName");
        kotlin.jvm.internal.e0.checkNotNullParameter(originClass, "originClass");
        this.f32583a = fieldName;
        this.f32584b = originClass;
    }

    public final Yc a(String fieldName, Class<?> originClass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fieldName, "fieldName");
        kotlin.jvm.internal.e0.checkNotNullParameter(originClass, "originClass");
        return new Yc(fieldName, originClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yc)) {
            return false;
        }
        Yc yc2 = (Yc) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32583a, yc2.f32583a) && kotlin.jvm.internal.e0.areEqual(this.f32584b, yc2.f32584b);
    }

    public int hashCode() {
        return this.f32584b.hashCode() + (this.f32583a.hashCode() * 31);
    }

    public String toString() {
        return "RuleKey(fieldName=" + this.f32583a + ", originClass=" + this.f32584b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Yc a(Yc yc2, String str, Class cls, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = yc2.f32583a;
        }
        if ((i10 & 2) != 0) {
            cls = yc2.f32584b;
        }
        return yc2.a(str, cls);
    }
}
