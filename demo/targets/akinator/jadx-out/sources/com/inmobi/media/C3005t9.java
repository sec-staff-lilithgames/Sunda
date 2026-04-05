package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3005t9 implements MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3039v9 f33389a;

    public C3005t9(C3039v9 c3039v9) {
        this.f33389a = c3039v9;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp2) {
        HashMap map;
        C2921o9 c2921o9;
        HashMap map2;
        HashMap map3;
        kotlin.jvm.internal.e0.checkNotNullParameter(mp2, "mp");
        if (this.f33389a.getMediaPlayer() == null) {
            return;
        }
        Q8 mediaPlayer = this.f33389a.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.f32168a = 2;
        }
        C3039v9 c3039v9 = this.f33389a;
        c3039v9.f33502r = true;
        c3039v9.f33501q = true;
        c3039v9.f33500p = true;
        C2921o9 c2921o92 = c3039v9.f33498n;
        if (c2921o92 != null) {
            c2921o92.setEnabled(true);
        }
        this.f33389a.f33489e = mp2.getVideoWidth();
        this.f33389a.f33490f = mp2.getVideoHeight();
        Object tag = this.f33389a.getTag();
        C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
        int iIntValue = 0;
        if (c2887m9 != null) {
            Object obj = c2887m9.f33155t.get("didCompleteQ4");
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                this.f33389a.a(8, 0);
                Object obj2 = c2887m9.f33155t.get("placementType");
                kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Byte");
                if (((Byte) obj2).byteValue() == 1) {
                    return;
                }
            }
        }
        InterfaceC2955q9 playbackEventListener = this.f33389a.getPlaybackEventListener();
        if (playbackEventListener != null) {
            ((K8) playbackEventListener).a((byte) 0);
        }
        Object obj3 = (c2887m9 == null || (map3 = c2887m9.f33155t) == null) ? null : map3.get("didCompleteQ4");
        if (kotlin.jvm.internal.e0.areEqual(obj3 instanceof Boolean ? (Boolean) obj3 : null, Boolean.FALSE)) {
            Object obj4 = c2887m9.f33155t.get("seekPosition");
            kotlin.jvm.internal.e0.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) obj4).intValue();
        }
        C3039v9 c3039v92 = this.f33389a;
        if (c3039v92.f33489e == 0 || c3039v92.f33490f == 0) {
            Q8 mediaPlayer2 = c3039v92.getMediaPlayer();
            if (mediaPlayer2 == null || 3 != mediaPlayer2.f32169b) {
                return;
            }
            Object obj5 = (c2887m9 == null || (map = c2887m9.f33155t) == null) ? null : map.get("isFullScreen");
            if (kotlin.jvm.internal.e0.areEqual(obj5 instanceof Boolean ? (Boolean) obj5 : null, Boolean.TRUE)) {
                this.f33389a.start();
                return;
            }
            return;
        }
        Q8 mediaPlayer3 = c3039v92.getMediaPlayer();
        if (mediaPlayer3 == null || 3 != mediaPlayer3.f32169b) {
            if (this.f33389a.isPlaying()) {
                return;
            }
            if ((iIntValue != 0 || this.f33389a.getCurrentPosition() > 0) && (c2921o9 = this.f33389a.f33498n) != null) {
                c2921o9.d();
                return;
            }
            return;
        }
        Object obj6 = (c2887m9 == null || (map2 = c2887m9.f33155t) == null) ? null : map2.get("isFullScreen");
        if (kotlin.jvm.internal.e0.areEqual(obj6 instanceof Boolean ? (Boolean) obj6 : null, Boolean.TRUE)) {
            this.f33389a.start();
        }
        C2921o9 c2921o93 = this.f33389a.f33498n;
        if (c2921o93 != null) {
            c2921o93.d();
        }
    }
}
