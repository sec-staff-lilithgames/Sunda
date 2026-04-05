package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface r extends a1 {
    default void onCreate(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    default void onPause(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    default void onResume(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    default void onStart(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }

    default void onStop(b1 owner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
    }
}
