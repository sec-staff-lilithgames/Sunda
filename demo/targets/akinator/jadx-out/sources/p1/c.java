package p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f80664b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f80665a;

    public /* synthetic */ c(int i10) {
        this.f80665a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ c m5863boximpl(int i10) {
        return new c(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5865equalsimpl(int i10, Object obj) {
        return (obj instanceof c) && i10 == ((c) obj).m5869unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5866equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5867hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5868toStringimpl(int i10) {
        b bVar = f80664b;
        return m5866equalsimpl0(i10, bVar.m5861getLongPress5zf0vsI()) ? "LongPress" : m5866equalsimpl0(i10, bVar.m5862getTextHandleMove5zf0vsI()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5865equalsimpl(this.f80665a, obj);
    }

    public int hashCode() {
        return m5867hashCodeimpl(this.f80665a);
    }

    public String toString() {
        return m5868toStringimpl(this.f80665a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5869unboximpl() {
        return this.f80665a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5864constructorimpl(int i10) {
        return i10;
    }
}
