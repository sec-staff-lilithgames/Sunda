package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public String f3464a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3465b = new int[2];

    public final int[] a(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = this.f3465b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public final String b() {
        String str = this.f3464a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("text");
        return null;
    }

    @Override // a2.h
    public abstract /* synthetic */ int[] following(int i10);

    public void initialize(String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "<set-?>");
        this.f3464a = text;
    }

    @Override // a2.h
    public abstract /* synthetic */ int[] preceding(int i10);
}
