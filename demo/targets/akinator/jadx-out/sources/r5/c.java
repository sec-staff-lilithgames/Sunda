package r5;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements x5.c {

    /* renamed from: a, reason: collision with root package name */
    public final y5.g f83785a;

    public c(y5.g openHelper) {
        e0.checkNotNullParameter(openHelper, "openHelper");
        this.f83785a = openHelper;
    }

    public final y5.g getOpenHelper() {
        return this.f83785a;
    }

    @Override // x5.c
    public a open(String fileName) {
        e0.checkNotNullParameter(fileName, "fileName");
        return new a(this.f83785a.getWritableDatabase());
    }
}
