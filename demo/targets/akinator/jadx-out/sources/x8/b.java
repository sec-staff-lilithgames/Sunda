package x8;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements n8.y {

    /* renamed from: a, reason: collision with root package name */
    public final q8.d f91805a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.y f91806b;

    public b(q8.d dVar, n8.y yVar) {
        this.f91805a = dVar;
        this.f91806b = yVar;
    }

    @Override // n8.y
    public n8.c getEncodeStrategy(n8.v vVar) {
        return this.f91806b.getEncodeStrategy(vVar);
    }

    @Override // n8.y, n8.d
    public boolean encode(p8.v0 v0Var, File file, n8.v vVar) {
        return this.f91806b.encode(new e(((BitmapDrawable) v0Var.get()).getBitmap(), this.f91805a), file, vVar);
    }
}
