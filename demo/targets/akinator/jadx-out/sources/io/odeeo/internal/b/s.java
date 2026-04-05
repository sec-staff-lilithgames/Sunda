package io.odeeo.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f62959a;

    public s(int i10) {
        super(a(i10));
        this.f62959a = i10;
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
