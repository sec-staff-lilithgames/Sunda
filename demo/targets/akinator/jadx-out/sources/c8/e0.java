package c8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f11877a = new e0();

    @Override // c8.l0
    public f8.d parse(d8.c cVar, float f10) throws IOException {
        boolean z10 = cVar.peek() == d8.b.f51924b;
        if (z10) {
            cVar.beginArray();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        if (z10) {
            cVar.endArray();
        }
        return new f8.d((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
