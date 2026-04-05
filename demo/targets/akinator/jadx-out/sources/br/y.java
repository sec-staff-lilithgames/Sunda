package br;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f10016a;

    /* renamed from: b, reason: collision with root package name */
    public final double f10017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10018c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10019d;

    /* renamed from: e, reason: collision with root package name */
    public final b2 f10020e;

    /* renamed from: f, reason: collision with root package name */
    public final double f10021f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10022g;

    public final List<u> getAlgorithms() {
        return this.f10022g;
    }

    public final double getDownscaleFactor() {
        return this.f10017b;
    }

    public final b2 getStopAfter() {
        return this.f10020e;
    }

    public final long getTimeout() {
        return this.f10016a;
    }

    public final double getWeightThreshold() {
        return this.f10021f;
    }

    public final boolean isAllowDuplicate() {
        return this.f10019d;
    }

    public final boolean isErrorOnly() {
        return this.f10018c;
    }

    public y(long j10, double d10, boolean z10, boolean z11, b2 stopAfter, double d11, List<u> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(stopAfter, "stopAfter");
        kotlin.jvm.internal.e0.checkNotNullParameter(list, duhsDlGWdBkekB.cgBgDSQP);
        this.f10016a = j10;
        this.f10017b = d10;
        this.f10018c = z10;
        this.f10019d = z11;
        this.f10020e = stopAfter;
        this.f10021f = d11;
        this.f10022g = list;
    }
}
