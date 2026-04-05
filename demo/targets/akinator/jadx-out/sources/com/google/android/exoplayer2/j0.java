package com.google.android.exoplayer2;

import io.odeeo.internal.b.l0;
import io.odeeo.internal.q0.o;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j0 implements com.google.android.exoplayer2.util.a0, rr.b, io.bidmachine.media3.common.util.w, o.a, mh.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27540c;

    public /* synthetic */ j0(int i10, int i11) {
        this.f27539b = i11;
        this.f27540c = i10;
    }

    @Override // rr.b
    public Object get() {
        switch (this.f27539b) {
            case 2:
                return a.b.e(this.f27540c, "Sending event to server - ");
            case 7:
                return p0.o2.k(this.f27540c, "Video started: ", "%");
            case 8:
                return p0.o2.k(this.f27540c, "Video at first quartile: ", "%");
            case 9:
                return p0.o2.k(this.f27540c, "Video at midpoint: ", "%");
            default:
                return p0.o2.k(this.f27540c, "Video at third quartile: ", "%");
        }
    }

    @Override // com.google.android.exoplayer2.util.a0
    public void invoke(Object obj) {
        int i10 = this.f27539b;
        int i11 = this.f27540c;
        switch (i10) {
            case 0:
                int i12 = r0.f27961y0;
                ((p2) obj).onRepeatModeChanged(i11);
                break;
            case 1:
                int i13 = r0.f27961y0;
                ((p2) obj).onAudioSessionIdChanged(i11);
                break;
            case 2:
            default:
                ((l0.c) obj).onRepeatModeChanged(i11);
                break;
            case 3:
                int i14 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onRepeatModeChanged(i11);
                break;
            case 4:
                int i15 = io.bidmachine.media3.exoplayer.l0.A0;
                ((gn.g1) obj).onAudioSessionIdChanged(i11);
                break;
        }
    }

    @Override // mh.q2
    public Iterator iterator(mh.r2 r2Var, CharSequence charSequence) {
        return new mh.m2(r2Var, charSequence, this.f27540c);
    }
}
