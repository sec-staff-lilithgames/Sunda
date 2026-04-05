package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
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
/* renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC1073Ae implements InterfaceC2259ip<Map.Entry<?, ?>, Object> {
    public static byte[] A00;
    public static final /* synthetic */ EnumC1073Ae[] A01;
    public static final EnumC1073Ae A02;
    public static final EnumC1073Ae A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final String strA01 = A01(0, 3, 56);
        final int i10 = 0;
        A02 = new EnumC1073Ae(strA01, i10) { // from class: com.facebook.ads.redexgen.X.1e
            {
                C1075Ag c1075Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC2259ip
            @CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String strA012 = A01(3, 5, 110);
        final int i11 = 1;
        A03 = new EnumC1073Ae(strA012, i11) { // from class: com.facebook.ads.redexgen.X.1d
            {
                C1075Ag c1075Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC2259ip
            @CheckForNull
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public EnumC1073Ae(String $enum$name, int $enum$ordinal) {
    }

    public /* synthetic */ EnumC1073Ae(String str, int i10, C1075Ag c1075Ag) {
        this(str, i10);
    }

    public static /* synthetic */ EnumC1073Ae[] A03() {
        return new EnumC1073Ae[]{A02, A03};
    }

    public static EnumC1073Ae valueOf(String name) {
        return (EnumC1073Ae) Enum.valueOf(EnumC1073Ae.class, name);
    }

    public static EnumC1073Ae[] values() {
        return (EnumC1073Ae[]) A01.clone();
    }
}
