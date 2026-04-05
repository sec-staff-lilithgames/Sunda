package qc;

import jc.q;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final Class f82733b = pe.a.c();

    @Override // qc.a
    public Class<?> getClassJavaNioFilePath() {
        return this.f82733b;
    }

    @Override // qc.a
    public q getDeserializerForJavaNioFilePath(Class<?> cls) {
        if (cls == this.f82733b) {
            return new e();
        }
        return null;
    }

    @Override // qc.a
    public w getSerializerForJavaNioFilePath(Class<?> cls) {
        if (this.f82733b.isAssignableFrom(cls)) {
            return new f();
        }
        return null;
    }
}
