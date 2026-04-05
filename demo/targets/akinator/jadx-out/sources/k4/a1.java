package k4;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a1 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final File f70275a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f70276b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f70277c;

    public a1(File file, h2 serializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
        this.f70275a = file;
        this.f70276b = serializer;
        this.f70277c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [k4.a1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(k4.a1 r7, zu.d r8) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a1.a(k4.a1, zu.d):java.lang.Object");
    }

    @Override // k4.e2, k4.d
    public void close() {
        this.f70277c.set(true);
    }

    @Override // k4.e2
    public Object readData(zu.d<Object> dVar) {
        return a(this, dVar);
    }
}
