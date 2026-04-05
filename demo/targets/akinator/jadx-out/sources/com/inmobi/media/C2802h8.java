package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2802h8 implements Ef {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f32895a = new Rect();

    @Override // com.inmobi.media.Ef
    public final boolean a(View rootView, View adView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootView, "rootView");
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        return true;
    }

    @Override // com.inmobi.media.Ef
    public final boolean a(View view, View view2, int i10, Object obj) {
        Q8 mediaPlayer;
        if (!(obj instanceof C2734d8) || ((C2734d8) obj).f32759t) {
            return false;
        }
        if ((!(view2 instanceof C3039v9) || (mediaPlayer = ((C3039v9) view2).getMediaPlayer()) == null || 3 == mediaPlayer.f32168a) && view2 != null && view2.isShown()) {
            if ((view != null ? view.getParent() : null) == null || !view2.getGlobalVisibleRect(this.f32895a)) {
                return false;
            }
            long jHeight = this.f32895a.height() * this.f32895a.width();
            long width = view.getWidth() * view.getHeight();
            if (width > 0 && 100 * jHeight >= i10 * width) {
                return true;
            }
        }
        return false;
    }
}
