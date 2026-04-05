package j1;

import android.graphics.RenderEffect;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public RenderEffect f69057a;

    public z1(kotlin.jvm.internal.u uVar) {
    }

    public abstract RenderEffect a();

    public final RenderEffect asAndroidRenderEffect() {
        RenderEffect renderEffect = this.f69057a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectA = a();
        this.f69057a = renderEffectA;
        return renderEffectA;
    }

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
