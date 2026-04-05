package b9;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f extends z8.f {
    public f(d dVar) {
        super(dVar);
    }

    @Override // z8.f, p8.v0
    public Class<d> getResourceClass() {
        return d.class;
    }

    @Override // z8.f, p8.v0
    public int getSize() {
        return ((d) this.f97696b).getSize();
    }

    @Override // z8.f, p8.r0
    public void initialize() {
        ((d) this.f97696b).getFirstFrame().prepareToDraw();
    }

    @Override // z8.f, p8.v0
    public void recycle() {
        Drawable drawable = this.f97696b;
        ((d) drawable).stop();
        ((d) drawable).recycle();
    }
}
