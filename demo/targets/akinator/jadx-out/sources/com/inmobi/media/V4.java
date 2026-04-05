package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V4 implements InterfaceC2714c5 {

    /* renamed from: a, reason: collision with root package name */
    public long f32390a;

    @Override // com.inmobi.media.Ef
    public final boolean a(View view, View view2, int i10, Object obj) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = view2 instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) view2 : null;
                if (gestureDetectorOnGestureListenerC3093yc == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3093yc.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3093yc.getHeight() <= 0 || gestureDetectorOnGestureListenerC3093yc.getWidth() <= 0)) {
                    return false;
                }
                if (!gestureDetectorOnGestureListenerC3093yc.getGlobalVisibleRect(new Rect())) {
                    return false;
                }
                this.f32390a = r8.height() * r8.width();
                if (gestureDetectorOnGestureListenerC3093yc.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3093yc.setConfiguredArea(gestureDetectorOnGestureListenerC3093yc.getHeight() * gestureDetectorOnGestureListenerC3093yc.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3093yc.getArea() > 0) {
                    if (100 * this.f32390a >= gestureDetectorOnGestureListenerC3093yc.getConfiguredArea() * i10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[SYNTHETIC] */
    @Override // com.inmobi.media.Ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r17, android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.V4.a(android.view.View, android.view.View, int):boolean");
    }
}
