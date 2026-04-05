package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g0 {
    void onTransitionCancel(c0 c0Var);

    void onTransitionEnd(c0 c0Var);

    default void onTransitionEnd(c0 c0Var, boolean z10) {
        onTransitionEnd(c0Var);
    }

    void onTransitionPause(c0 c0Var);

    void onTransitionResume(c0 c0Var);

    void onTransitionStart(c0 c0Var);

    default void onTransitionStart(c0 c0Var, boolean z10) {
        onTransitionStart(c0Var);
    }
}
