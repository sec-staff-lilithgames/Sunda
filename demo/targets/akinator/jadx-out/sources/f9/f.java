package f9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface f {
    boolean canNotifyCleared(e eVar);

    boolean canNotifyStatusChanged(e eVar);

    boolean canSetImage(e eVar);

    f getRoot();

    boolean isAnyResourceSet();

    void onRequestFailed(e eVar);

    void onRequestSuccess(e eVar);
}
