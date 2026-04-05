package de;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface q {
    @Deprecated
    default void onDrmSessionAcquired(int i10, bf.d0 d0Var) {
    }

    default void onDrmSessionAcquired(int i10, bf.d0 d0Var, int i11) {
    }

    default void onDrmKeysLoaded(int i10, bf.d0 d0Var) {
    }

    default void onDrmKeysRemoved(int i10, bf.d0 d0Var) {
    }

    default void onDrmKeysRestored(int i10, bf.d0 d0Var) {
    }

    default void onDrmSessionReleased(int i10, bf.d0 d0Var) {
    }

    default void onDrmSessionManagerError(int i10, bf.d0 d0Var, Exception exc) {
    }
}
