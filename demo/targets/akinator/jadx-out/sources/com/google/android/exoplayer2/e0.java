package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements com.google.android.exoplayer2.util.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27439c;

    public /* synthetic */ e0(Object obj, int i10) {
        this.f27438b = i10;
        this.f27439c = obj;
    }

    @Override // com.google.android.exoplayer2.util.a0
    public final void invoke(Object obj) {
        int i10 = this.f27438b;
        Object obj2 = this.f27439c;
        switch (i10) {
            case 0:
                int i11 = r0.f27961y0;
                ((p2) obj).onMediaMetadataChanged((w1) obj2);
                break;
            case 1:
                int i12 = r0.f27961y0;
                ((p2) obj).onAudioAttributesChanged((com.google.android.exoplayer2.audio.k) obj2);
                break;
            case 2:
                int i13 = r0.f27961y0;
                ((p2) obj).onTrackSelectionParametersChanged((pf.s) obj2);
                break;
            case 3:
                ((p2) obj).onCues((List<ef.b>) obj2);
                break;
            case 4:
                ((p2) obj).onCues((ef.e) obj2);
                break;
            case 5:
                ((p2) obj).onMediaMetadataChanged(((p0) obj2).f27900b.Q);
                break;
            case 6:
                ((p2) obj).onMetadata((Metadata) obj2);
                break;
            case 7:
                ((p2) obj).onDeviceInfoChanged((q) obj2);
                break;
            default:
                ((p2) obj).onVideoSizeChanged((sf.x) obj2);
                break;
        }
    }
}
