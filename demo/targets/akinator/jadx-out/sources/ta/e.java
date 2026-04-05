package ta;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f86641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86643c;

    public e(int i10, String fakeNom, String fakeDescription) {
        e0.checkNotNullParameter(fakeNom, "fakeNom");
        e0.checkNotNullParameter(fakeDescription, "fakeDescription");
        this.f86641a = i10;
        this.f86642b = fakeNom;
        this.f86643c = fakeDescription;
    }

    public final int getFakeAwardIndex() {
        return this.f86641a;
    }

    public final String getFakeDescription() {
        return this.f86643c;
    }

    public final String getFakeNom() {
        return this.f86642b;
    }
}
