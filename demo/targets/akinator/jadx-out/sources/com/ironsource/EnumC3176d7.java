package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC3176d7 {
    SendEvent(0),
    NativeController(1);


    /* renamed from: b, reason: collision with root package name */
    public static final a f36258b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f36262a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d7$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final EnumC3176d7 a(int i10) {
            EnumC3176d7 enumC3176d7;
            EnumC3176d7[] enumC3176d7ArrValues = EnumC3176d7.values();
            int length = enumC3176d7ArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    enumC3176d7 = null;
                    break;
                }
                enumC3176d7 = enumC3176d7ArrValues[i11];
                if (enumC3176d7.b() == i10) {
                    break;
                }
                i11++;
            }
            return enumC3176d7 == null ? EnumC3176d7.SendEvent : enumC3176d7;
        }

        private a() {
        }
    }

    EnumC3176d7(int i10) {
        this.f36262a = i10;
    }

    public final int b() {
        return this.f36262a;
    }
}
