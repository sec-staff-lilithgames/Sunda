package rh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum b implements Comparator {
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    FALSE_FIRST(-1, "Booleans.falseFirst()");


    /* renamed from: b, reason: collision with root package name */
    public final int f84351b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84352c;

    b(int i10, String str) {
        this.f84351b = i10;
        this.f84352c = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f84352c;
    }

    @Override // java.util.Comparator
    public int compare(Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        int i10 = this.f84351b;
        return (bool2.booleanValue() ? i10 : 0) - (zBooleanValue ? i10 : 0);
    }
}
