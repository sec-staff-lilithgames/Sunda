package qh;

import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f83261a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f83261a = iArr;
        try {
            iArr[RoundingMode.DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f83261a[RoundingMode.HALF_EVEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f83261a[RoundingMode.HALF_DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f83261a[RoundingMode.HALF_UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f83261a[RoundingMode.FLOOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f83261a[RoundingMode.CEILING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f83261a[RoundingMode.UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f83261a[RoundingMode.UNNECESSARY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
