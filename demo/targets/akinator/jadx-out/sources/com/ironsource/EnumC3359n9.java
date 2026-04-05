package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC3359n9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* renamed from: b, reason: collision with root package name */
    public static final a f37971b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f37976a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n9$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final EnumC3359n9 a(int i10) {
            EnumC3359n9 enumC3359n9;
            EnumC3359n9[] enumC3359n9ArrValues = EnumC3359n9.values();
            int length = enumC3359n9ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC3359n9 = null;
                    break;
                }
                enumC3359n9 = enumC3359n9ArrValues[i11];
                if (enumC3359n9.f37976a == i10) {
                    break;
                }
                i11++;
            }
            return enumC3359n9 == null ? EnumC3359n9.NotSupported : enumC3359n9;
        }

        private a() {
        }
    }

    EnumC3359n9(int i10) {
        this.f37976a = i10;
    }

    public final int b() {
        return this.f37976a;
    }

    public final boolean b(EnumC3359n9 instanceType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.f37976a;
    }
}
