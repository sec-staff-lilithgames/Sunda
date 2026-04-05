package io.ktor.utils.io.core;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BIG_ENDIAN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteOrder {
    private static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;
    public static final Companion Companion;
    public static final ByteOrder LITTLE_ENDIAN;

    /* renamed from: native, reason: not valid java name */
    private static final ByteOrder f3379native;
    private final java.nio.ByteOrder nioOrder;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final ByteOrder nativeOrder() {
            return ByteOrder.f3379native;
        }

        public final ByteOrder of(java.nio.ByteOrder nioOrder) {
            e0.checkNotNullParameter(nioOrder, "nioOrder");
            return ByteOrderJVMKt.orderOf(nioOrder);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ByteOrder[] $values() {
        return new ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    static {
        java.nio.ByteOrder BIG_ENDIAN2 = java.nio.ByteOrder.BIG_ENDIAN;
        e0.checkNotNullExpressionValue(BIG_ENDIAN2, "BIG_ENDIAN");
        BIG_ENDIAN = new ByteOrder("BIG_ENDIAN", 0, BIG_ENDIAN2);
        java.nio.ByteOrder LITTLE_ENDIAN2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        e0.checkNotNullExpressionValue(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
        LITTLE_ENDIAN = new ByteOrder("LITTLE_ENDIAN", 1, LITTLE_ENDIAN2);
        $VALUES = $values();
        Companion = new Companion(null);
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        e0.checkNotNullExpressionValue(byteOrderNativeOrder, "nativeOrder()");
        f3379native = ByteOrderJVMKt.orderOf(byteOrderNativeOrder);
    }

    private ByteOrder(String str, int i10, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }
}
