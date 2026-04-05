package p8;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements r8.b {

    /* renamed from: a, reason: collision with root package name */
    public final n8.d f80773a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f80774b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.v f80775c;

    public i(n8.d dVar, Object obj, n8.v vVar) {
        this.f80773a = dVar;
        this.f80774b = obj;
        this.f80775c = vVar;
    }

    @Override // r8.b
    public boolean write(File file) {
        return this.f80773a.encode(this.f80774b, file, this.f80775c);
    }
}
