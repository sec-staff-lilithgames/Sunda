package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c0 {
    void hideSoftwareKeyboard();

    @tu.f
    default void notifyFocusedRect(i1.j rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
    }

    void showSoftwareKeyboard();

    void startInput(j0 j0Var, n nVar, kv.l lVar, kv.l lVar2);

    void stopInput();

    void updateState(j0 j0Var, j0 j0Var2);
}
