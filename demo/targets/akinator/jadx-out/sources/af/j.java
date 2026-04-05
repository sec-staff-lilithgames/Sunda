package af;

import com.google.android.exoplayer2.scheduler.Requirements;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface j {
    default void onIdle(h hVar) {
    }

    default void onInitialized(h hVar) {
    }

    default void onDownloadRemoved(h hVar, c cVar) {
    }

    default void onDownloadsPausedChanged(h hVar, boolean z10) {
    }

    default void onWaitingForRequirementsChanged(h hVar, boolean z10) {
    }

    default void onDownloadChanged(h hVar, c cVar, Exception exc) {
    }

    default void onRequirementsStateChanged(h hVar, Requirements requirements, int i10) {
    }
}
