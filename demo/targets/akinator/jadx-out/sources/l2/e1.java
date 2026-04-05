package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends r1 {

    /* renamed from: j, reason: collision with root package name */
    public final String f72283j;

    /* renamed from: k, reason: collision with root package name */
    public final String f72284k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(String name, String fontFamilyName) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        this.f72283j = name;
        this.f72284k = fontFamilyName;
    }

    public final String getName() {
        return this.f72283j;
    }

    public String toString() {
        return this.f72284k;
    }
}
