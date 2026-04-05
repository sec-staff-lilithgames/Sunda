package ta;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.e0;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f86620h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86621i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86622j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f86623k;

    /* renamed from: l, reason: collision with root package name */
    public String f86624l;

    public a(int i10, String joueurId, String deviceId, boolean z10) {
        e0.checkNotNullParameter(joueurId, "joueurId");
        e0.checkNotNullParameter(deviceId, "deviceId");
        this.f86620h = i10;
        this.f86621i = joueurId;
        this.f86622j = deviceId;
        this.f86623k = z10;
    }

    @Override // qb.d0
    public int call() {
        addParameter("basel_id", String.valueOf(this.f86620h));
        addParameter("joueur_id", this.f86621i);
        addParameter("taille_podium", "10");
        addParameter("taille_precede_joueurs", "1");
        addParameter("device_uid", this.f86622j);
        addParameter("device_filtre_items", this.f86623k ? "true" : "false");
        return super.call();
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 10000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return a.b.l(DtbConstants.HTTP, g.f86657a.getADRESSE_CLASSEMENT(), ":18666/get_all_classements.php");
    }

    public final String getRawResponse() {
        return this.f86624l;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) {
        e0.checkNotNullParameter(response, "response");
        this.f86624l = response;
        return 0;
    }
}
