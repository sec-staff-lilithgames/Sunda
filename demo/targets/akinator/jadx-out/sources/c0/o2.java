package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f11557a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f11558b;

    public o2(kv.l convertToVector, kv.l convertFromVector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(convertToVector, "convertToVector");
        kotlin.jvm.internal.e0.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f11557a = convertToVector;
        this.f11558b = convertFromVector;
    }

    @Override // c0.n2
    public kv.l getConvertFromVector() {
        return this.f11558b;
    }

    @Override // c0.n2
    public kv.l getConvertToVector() {
        return this.f11557a;
    }
}
