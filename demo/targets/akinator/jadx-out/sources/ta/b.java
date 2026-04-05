package ta;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.e0;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends d0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f86625h;

    /* renamed from: i, reason: collision with root package name */
    public final int f86626i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86627j;

    /* renamed from: k, reason: collision with root package name */
    public final String f86628k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f86629l;

    /* renamed from: m, reason: collision with root package name */
    public String f86630m;

    public b(int i10, int i11, String joueurId, String deviceId, boolean z10) {
        e0.checkNotNullParameter(joueurId, "joueurId");
        e0.checkNotNullParameter(deviceId, "deviceId");
        this.f86625h = i10;
        this.f86626i = i11;
        this.f86627j = joueurId;
        this.f86628k = deviceId;
        this.f86629l = z10;
    }

    @Override // qb.d0
    public int call() {
        addParameter("basel_id", String.valueOf(this.f86625h));
        addParameter("type_classement", String.valueOf(this.f86626i));
        addParameter("joueur_id", this.f86627j);
        addParameter("taille_podium", "10");
        addParameter("taille_precede_joueurs", "1");
        addParameter("device_uid", this.f86628k);
        addParameter("device_filtre_items", this.f86629l ? "true" : "false");
        return super.call();
    }

    @Override // qb.d0
    public int getMTimeout() {
        return 50000;
    }

    @Override // qb.d0
    public String getMUrl() {
        return a.b.l(DtbConstants.HTTP, g.f86657a.getADRESSE_CLASSEMENT(), ":18666/get_classement_aki_awards.php");
    }

    public final String getRawResponse() {
        return this.f86630m;
    }

    @Override // qb.d0
    public int parseWSResponse(String response) {
        e0.checkNotNullParameter(response, "response");
        this.f86630m = response;
        return 0;
    }
}
