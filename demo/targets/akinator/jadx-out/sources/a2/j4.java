package a2;

import android.graphics.RenderNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static final j4 f3667a = new j4();

    public final void setRenderEffect(RenderNode renderNode, j1.z1 z1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setRenderEffect(z1Var != null ? z1Var.asAndroidRenderEffect() : null);
    }
}
