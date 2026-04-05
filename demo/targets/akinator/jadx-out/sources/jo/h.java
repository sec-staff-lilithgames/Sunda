package jo;

import io.bidmachine.media3.common.util.t;
import java.nio.FloatBuffer;
import jo.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f69836a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f69837b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatBuffer f69838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69839d;

    public h(f.b bVar) {
        this.f69836a = bVar.getVertexCount();
        this.f69837b = t.createBuffer(bVar.f69834c);
        this.f69838c = t.createBuffer(bVar.f69835d);
        int i10 = bVar.f69833b;
        if (i10 == 1) {
            this.f69839d = 5;
        } else if (i10 != 2) {
            this.f69839d = 4;
        } else {
            this.f69839d = 6;
        }
    }
}
