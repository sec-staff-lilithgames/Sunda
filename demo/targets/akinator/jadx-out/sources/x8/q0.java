package x8;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f91863a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.e f91864b;

    public q0(o0 o0Var, j9.e eVar) {
        this.f91863a = o0Var;
        this.f91864b = eVar;
    }

    @Override // x8.z
    public void onDecodeComplete(q8.d dVar, Bitmap bitmap) throws IOException {
        IOException exception = this.f91864b.getException();
        if (exception != null) {
            if (bitmap == null) {
                throw exception;
            }
            dVar.put(bitmap);
            throw exception;
        }
    }

    @Override // x8.z
    public void onObtainBounds() {
        this.f91863a.fixMarkLimit();
    }
}
