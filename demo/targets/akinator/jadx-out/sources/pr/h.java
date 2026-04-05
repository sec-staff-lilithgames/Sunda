package pr;

import com.explorestack.protobuf.Value;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f81816a;

    static {
        int[] iArr = new int[Value.KindCase.values().length];
        f81816a = iArr;
        try {
            iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f81816a[Value.KindCase.STRING_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f81816a[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f81816a[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f81816a[Value.KindCase.LIST_VALUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
