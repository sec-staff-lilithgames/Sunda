package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final z[] f6613b;

    public j(z[] generatedAdapters) {
        kotlin.jvm.internal.e0.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f6613b = generatedAdapters;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 source, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        new s1();
        z[] zVarArr = this.f6613b;
        if (zVarArr.length > 0) {
            z zVar = zVarArr[0];
            throw null;
        }
        if (zVarArr.length <= 0) {
            return;
        }
        z zVar2 = zVarArr[0];
        throw null;
    }
}
