package zn;

import io.bidmachine.media3.exoplayer.scheduler.Requirements;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h {
    default void onIdle(g gVar) {
    }

    default void onInitialized(g gVar) {
    }

    default void onDownloadRemoved(g gVar, c cVar) {
    }

    default void onDownloadsPausedChanged(g gVar, boolean z10) {
    }

    default void onWaitingForRequirementsChanged(g gVar, boolean z10) {
    }

    default void onDownloadChanged(g gVar, c cVar, Exception exc) {
    }

    default void onRequirementsStateChanged(g gVar, Requirements requirements, int i10) {
    }
}
