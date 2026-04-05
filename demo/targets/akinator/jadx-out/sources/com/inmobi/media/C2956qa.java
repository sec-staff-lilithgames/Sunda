package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.PlayerState;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2956qa {

    /* renamed from: a, reason: collision with root package name */
    public final String f33284a;

    /* renamed from: b, reason: collision with root package name */
    public final ImpressionType f33285b;

    /* renamed from: c, reason: collision with root package name */
    public AdSessionContext f33286c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33287d;

    /* renamed from: e, reason: collision with root package name */
    public byte f33288e;

    /* renamed from: f, reason: collision with root package name */
    public AdSession f33289f;

    /* renamed from: g, reason: collision with root package name */
    public C3080y f33290g;

    public C2956qa(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mAdSessionType, "mAdSessionType");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionType, "impressionType");
        this.f33284a = mAdSessionType;
        this.f33285b = impressionType;
        this.f33286c = adSessionContext;
        this.f33287d = z10;
    }

    public static boolean a(byte b10, byte b11) {
        if (b10 == b11) {
            return true;
        }
        Y5 y52 = Y5.f32563a;
        C2796h2 event = new C2796h2(new Exception(w0.i.a(b10, b11, "Omid AdSession State Error currentState :: ", ", expectedState :: ")));
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        Y5.f32566d.a(event);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r8, java.util.Map r9, android.view.View r10) {
        /*
            r7 = this;
            java.lang.String r0 = "trackingView"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            com.iab.omid.library.inmobi.adsession.AdSession r0 = r7.f33289f
            r1 = 1
            if (r0 == 0) goto Lc
            goto L85
        Lc:
            boolean r0 = r7.f33287d
            com.iab.omid.library.inmobi.adsession.Owner r2 = com.iab.omid.library.inmobi.adsession.Owner.JAVASCRIPT
            com.iab.omid.library.inmobi.adsession.CreativeType r3 = com.iab.omid.library.inmobi.adsession.CreativeType.DEFINED_BY_JAVASCRIPT
            java.lang.String r4 = r7.f33284a
            int r5 = r4.hashCode()
            switch(r5) {
                case -2139264536: goto L52;
                case -1329992236: goto L44;
                case -1191784049: goto L36;
                case 363190080: goto L2a;
                case 538665083: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L5a
        L1c:
            java.lang.String r5 = "html_video_ad"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L25
            goto L5a
        L25:
            com.iab.omid.library.inmobi.adsession.CreativeType r3 = com.iab.omid.library.inmobi.adsession.CreativeType.VIDEO
        L27:
            r4 = r3
            r3 = r2
            goto L65
        L2a:
            java.lang.String r5 = "html_audio_ad"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L33
            goto L5a
        L33:
            com.iab.omid.library.inmobi.adsession.CreativeType r3 = com.iab.omid.library.inmobi.adsession.CreativeType.AUDIO
            goto L27
        L36:
            java.lang.String r5 = "native_video_ad"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3f
            goto L5a
        L3f:
            com.iab.omid.library.inmobi.adsession.Owner r2 = com.iab.omid.library.inmobi.adsession.Owner.NATIVE
            com.iab.omid.library.inmobi.adsession.CreativeType r3 = com.iab.omid.library.inmobi.adsession.CreativeType.VIDEO
            goto L27
        L44:
            java.lang.String r5 = "html_display_ad"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4d
            goto L5a
        L4d:
            com.iab.omid.library.inmobi.adsession.Owner r3 = com.iab.omid.library.inmobi.adsession.Owner.NONE
            com.iab.omid.library.inmobi.adsession.CreativeType r4 = com.iab.omid.library.inmobi.adsession.CreativeType.HTML_DISPLAY
            goto L65
        L52:
            java.lang.String r5 = "native_display_ad"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L5f
        L5a:
            r4 = 0
            r6 = r4
            r4 = r3
            r3 = r6
            goto L65
        L5f:
            com.iab.omid.library.inmobi.adsession.Owner r2 = com.iab.omid.library.inmobi.adsession.Owner.NATIVE
            com.iab.omid.library.inmobi.adsession.Owner r3 = com.iab.omid.library.inmobi.adsession.Owner.NONE
            com.iab.omid.library.inmobi.adsession.CreativeType r4 = com.iab.omid.library.inmobi.adsession.CreativeType.NATIVE_DISPLAY
        L65:
            com.iab.omid.library.inmobi.adsession.ImpressionType r5 = r7.f33285b
            com.iab.omid.library.inmobi.adsession.AdSessionConfiguration r0 = com.iab.omid.library.inmobi.adsession.AdSessionConfiguration.createAdSessionConfiguration(r4, r5, r2, r3, r0)
            com.iab.omid.library.inmobi.adsession.AdSessionContext r2 = r7.f33286c
            com.iab.omid.library.inmobi.adsession.AdSession r0 = com.iab.omid.library.inmobi.adsession.AdSession.createAdSession(r0, r2)
            java.lang.String r2 = "createAdSession(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r2)
            r7.f33289f = r0
            if (r0 == 0) goto L85
            com.inmobi.media.y r2 = new com.inmobi.media.y
            java.lang.String r3 = r7.f33284a
            r2.<init>(r0, r3)
            r7.f33290g = r2
            r7.f33288e = r1
        L85:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            byte r0 = r7.f33288e
            boolean r0 = a(r0, r1)
            if (r0 == 0) goto L99
            com.iab.omid.library.inmobi.adsession.AdSession r0 = r7.f33289f
            if (r0 == 0) goto L99
            r0.registerAdView(r8)
        L99:
            if (r9 == 0) goto Lbf
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r2.getValue()
            com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose r2 = (com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose) r2
            r7.a(r3, r2)
            goto La3
        Lbf:
            if (r10 == 0) goto Lca
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lca
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r7.a(r8, r9, r10)
        Lca:
            byte r8 = r7.f33288e
            boolean r8 = a(r8, r1)
            if (r8 == 0) goto Ldc
            com.iab.omid.library.inmobi.adsession.AdSession r8 = r7.f33289f
            if (r8 == 0) goto Ld9
            r8.start()
        Ld9:
            r8 = 2
            r7.f33288e = r8
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C2956qa.a(android.view.View, java.util.Map, android.view.View):void");
    }

    public final void a(int i10, int i11, float f10, VastProperties vastProps) throws JSONException {
        C3080y c3080y;
        AdEvents adEvents;
        AdSession adSession;
        kotlin.jvm.internal.e0.checkNotNullParameter(vastProps, "vastProperties");
        if (a(this.f33288e, (byte) 2)) {
            byte b10 = (byte) i10;
            if (b10 == 17) {
                ErrorType errorType = ErrorType.VIDEO;
                kotlin.jvm.internal.e0.checkNotNullParameter(errorType, "errorType");
                kotlin.jvm.internal.e0.checkNotNullParameter("Unknown Player error", "errorMsg");
                if (a(this.f33288e, (byte) 2) && (adSession = this.f33289f) != null) {
                    adSession.error(errorType, "Unknown Player error");
                }
            } else if (b10 == 0 && (c3080y = this.f33290g) != null && (adEvents = c3080y.f33589a) != null) {
                adEvents.impressionOccurred();
            }
            C3080y c3080y2 = this.f33290g;
            if (c3080y2 != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(vastProps, "vastProps");
                MediaEvents mediaEvents = c3080y2.f33590b;
                if (mediaEvents == null) {
                    return;
                }
                if (b10 == 7) {
                    mediaEvents.pause();
                    return;
                }
                if (b10 == 5) {
                    AdEvents adEvents2 = c3080y2.f33589a;
                    if (adEvents2 != null) {
                        adEvents2.loaded(vastProps);
                        return;
                    }
                    return;
                }
                if (b10 == 6) {
                    mediaEvents.start(i11, f10);
                    return;
                }
                if (b10 == 8 || b10 == 16) {
                    mediaEvents.resume();
                    return;
                }
                if (b10 == 15) {
                    mediaEvents.skipped();
                    return;
                }
                if (b10 == 9) {
                    mediaEvents.firstQuartile();
                    return;
                }
                if (b10 == 10) {
                    mediaEvents.midpoint();
                    return;
                }
                if (b10 == 11) {
                    mediaEvents.thirdQuartile();
                    return;
                }
                if (b10 == 12) {
                    mediaEvents.complete();
                    return;
                }
                if (b10 == 13) {
                    mediaEvents.volumeChange(0.0f);
                    return;
                }
                if (b10 == 14) {
                    mediaEvents.volumeChange(f10);
                    return;
                }
                if (b10 == 1) {
                    mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
                    return;
                }
                if (b10 == 2) {
                    mediaEvents.playerStateChange(PlayerState.NORMAL);
                } else if (b10 == 4) {
                    mediaEvents.adUserInteraction(InteractionType.CLICK);
                } else if (b10 == 18) {
                    mediaEvents.adUserInteraction(InteractionType.INVITATION_ACCEPTED);
                }
            }
        }
    }

    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        byte b10 = this.f33288e;
        if (b10 > 0) {
            AdSession adSession = this.f33289f;
            if (adSession != null) {
                adSession.addFriendlyObstruction(childView, obstructionCode, null);
                return;
            }
            return;
        }
        Y5 y52 = Y5.f32563a;
        C2796h2 event = new C2796h2(new Exception(p0.o2.k(b10, "Omid AdSession State Error currentState :: ", ", expectedState :: 1")));
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        Y5.f32566d.a(event);
    }

    public final void a(View view, Map map, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (!kotlin.jvm.internal.e0.areEqual(childAt, view)) {
                if (map == null || !map.containsKey(childAt)) {
                    kotlin.jvm.internal.e0.checkNotNull(childAt);
                    a(childAt, FriendlyObstructionPurpose.OTHER);
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (viewGroup2.getChildCount() > 0) {
                        a(view, map, viewGroup2);
                    }
                }
            }
        }
    }
}
