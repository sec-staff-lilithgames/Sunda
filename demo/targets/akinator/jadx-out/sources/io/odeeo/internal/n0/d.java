package io.odeeo.internal.n0;

import io.odeeo.internal.a0.k0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.y0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface d extends g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f64980a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f64981b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64982c;

        public a(k0 k0Var, int... iArr) {
            this(k0Var, iArr, 0);
        }

        public a(k0 k0Var, int[] iArr, int i10) {
            this.f64980a = k0Var;
            this.f64981b = iArr;
            this.f64982c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        d[] createTrackSelections(a[] aVarArr, io.odeeo.internal.p0.d dVar, t.a aVar, y0 y0Var);
    }

    boolean blacklist(int i10, long j10);

    void disable();

    void enable();

    int evaluateQueueSize(long j10, List<? extends io.odeeo.internal.c0.b> list);

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ io.odeeo.internal.b.t getFormat(int i10);

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ int getIndexInTrackGroup(int i10);

    io.odeeo.internal.b.t getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ k0 getTrackGroup();

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ int getType();

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ int indexOf(int i10);

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ int indexOf(io.odeeo.internal.b.t tVar);

    boolean isBlacklisted(int i10, long j10);

    @Override // io.odeeo.internal.n0.g
    /* synthetic */ int length();

    void onPlaybackSpeed(float f10);

    default boolean shouldCancelChunkLoad(long j10, io.odeeo.internal.c0.a aVar, List<? extends io.odeeo.internal.c0.b> list) {
        return false;
    }

    void updateSelectedTrack(long j10, long j11, long j12, List<? extends io.odeeo.internal.c0.b> list, io.odeeo.internal.c0.c[] cVarArr);

    default void onDiscontinuity() {
    }

    default void onRebuffer() {
    }

    default void onPlayWhenReadyChanged(boolean z10) {
    }
}
