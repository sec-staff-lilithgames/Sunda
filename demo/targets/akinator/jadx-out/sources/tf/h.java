package tf;

import com.google.android.exoplayer2.util.x;
import java.nio.FloatBuffer;
import tf.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f86856a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f86857b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatBuffer f86858c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86859d;

    public h(f.b bVar) {
        this.f86856a = bVar.getVertexCount();
        this.f86857b = x.createBuffer(bVar.f86854c);
        this.f86858c = x.createBuffer(bVar.f86855d);
        int i10 = bVar.f86853b;
        if (i10 == 1) {
            this.f86859d = 5;
        } else if (i10 != 2) {
            this.f86859d = 4;
        } else {
            this.f86859d = 6;
        }
    }
}
