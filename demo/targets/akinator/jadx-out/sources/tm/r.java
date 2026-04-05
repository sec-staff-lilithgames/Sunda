package tm;

import br.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface r {
    void onCalendarEvent(q qVar, String str, um.k kVar);

    void onClose(q qVar);

    void onExpired(q qVar, qm.b bVar);

    void onLoadFailed(q qVar, qm.b bVar);

    void onLoaded(q qVar);

    void onOpenPrivacySheet(q qVar, p1 p1Var);

    void onOpenUrl(q qVar, String str, um.k kVar);

    void onPlayVideo(q qVar, String str);

    void onShowFailed(q qVar, qm.b bVar);

    void onShown(q qVar);

    void onStorePicture(q qVar, String str, um.k kVar);
}
