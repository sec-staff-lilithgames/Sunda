package z8;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.List;
import n8.v;
import n8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f97693a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f97694b;

    public d(List list, q8.b bVar) {
        this.f97693a = list;
        this.f97694b = bVar;
    }

    public static a a(ImageDecoder.Source source, int i10, int i11, v vVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new w8.b(i10, i11, vVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static x byteBufferDecoder(List<n8.g> list, q8.b bVar) {
        return new b(new d(list, bVar));
    }

    public static x streamDecoder(List<n8.g> list, q8.b bVar) {
        return new c(new d(list, bVar));
    }
}
