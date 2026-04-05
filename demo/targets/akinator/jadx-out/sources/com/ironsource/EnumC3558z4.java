package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC3558z4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* renamed from: b, reason: collision with root package name */
    public static final a f39341b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f39347a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.z4$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final EnumC3558z4 a(String str) {
            EnumC3558z4 enumC3558z4;
            EnumC3558z4[] enumC3558z4ArrValues = EnumC3558z4.values();
            int length = enumC3558z4ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumC3558z4 = null;
                    break;
                }
                enumC3558z4 = enumC3558z4ArrValues[i10];
                if (kotlin.jvm.internal.e0.areEqual(enumC3558z4.b(), str)) {
                    break;
                }
                i10++;
            }
            return enumC3558z4 == null ? EnumC3558z4.NONE : enumC3558z4;
        }

        private a() {
        }
    }

    EnumC3558z4(String str) {
        this.f39347a = str;
    }

    public final String b() {
        return this.f39347a;
    }

    public static final EnumC3558z4 a(String str) {
        return f39341b.a(str);
    }
}
