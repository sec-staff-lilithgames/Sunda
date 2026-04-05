package c9;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import n8.v;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f11930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11931b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // c9.e
    public v0 transcode(v0 v0Var, v vVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) v0Var.get()).compress(this.f11930a, this.f11931b, byteArrayOutputStream);
        v0Var.recycle();
        return new y8.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f11930a = compressFormat;
        this.f11931b = i10;
    }
}
