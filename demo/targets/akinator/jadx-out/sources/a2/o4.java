package a2;

import android.view.RenderNode;
import hr.kNq.ikJMrW;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f3744a = new o4();

    public final int getAmbientShadowColor(RenderNode renderNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final void setAmbientShadowColor(RenderNode renderNode, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    public final void setSpotShadowColor(RenderNode renderNode, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }

    public final int getSpotShadowColor(RenderNode renderNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(renderNode, ikJMrW.IKtKAWc);
        return renderNode.getSpotShadowColor();
    }
}
