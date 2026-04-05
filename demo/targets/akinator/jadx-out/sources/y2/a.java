package y2;

import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f93946b = {new a("INT_TYPE", 0), new a("FLOAT_TYPE", 1), new a("COLOR_TYPE", 2), new a(QGjYBESwAiCc.OLEq, 3), new a("STRING_TYPE", 4), new a("BOOLEAN_TYPE", 5), new a("DIMENSION_TYPE", 6), new a("REFERENCE_TYPE", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f93946b.clone();
    }
}
