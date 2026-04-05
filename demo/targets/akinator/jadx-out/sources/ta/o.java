package ta;

import ca.r;
import ca.u;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.net.URLEncoder;
import kotlin.jvm.internal.e0;
import lb.e;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f86688a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static o f86689b;

    public static final o sharedInstance() {
        if (f86689b == null) {
            f86689b = f86688a;
        }
        o oVar = f86689b;
        e0.checkNotNull(oVar);
        return oVar;
    }

    public final int updatePseudo() {
        boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
        String idJoueurAccount = zIsUserConnected ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        if ((!zIsUserConnected || e0.areEqual(idJoueurAccount, "none")) && (zIsUserConnected || e0.areEqual(idJoueurAccount, "none"))) {
            return 400;
        }
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        if (currentInstance.getBaseLogiqueId() <= 0) {
            return 400;
        }
        String strEncode = URLEncoder.encode(zIsUserConnected ? ca.m.sharedInstance().getPseudoUser() : r.sharedInstance().getNomJoueur(), C.UTF8_NAME);
        String adresse_classement = g.f86657a.getADRESSE_CLASSEMENT();
        lb.c currentInstance2 = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance2);
        int baseLogiqueId = currentInstance2.getBaseLogiqueId();
        String deviceId = jb.c.f69226m.sharedInstance().getDeviceId();
        StringBuilder sbR = a.b.r(baseLogiqueId, DtbConstants.HTTP, adresse_classement, ":18666/update_pseudo.php?basel_id=", "&joueur_id=");
        com.google.android.gms.internal.play_billing.a.B(sbR, idJoueurAccount, "&pseudo=", strEncode, "&device_uid=");
        sbR.append(deviceId);
        return new l(sbR.toString()).call();
    }

    public final int updateScoreFromClassicAkiAward() {
        e.c stats = u.sharedInstance().getStats();
        boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
        String pseudoUser = zIsUserConnected ? ca.m.sharedInstance().getPseudoUser() : r.sharedInstance().getNomJoueur();
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        int baseLogiqueId = currentInstance.getBaseLogiqueId();
        if (stats == null || pseudoUser == null || baseLogiqueId <= 0) {
            return 400;
        }
        String idJoueurAccount = zIsUserConnected ? r.sharedInstance().getIdJoueurAccount() : r.sharedInstance().getIdJoueur();
        String adresse_classement = g.f86657a.getADRESSE_CLASSEMENT();
        String strReplace$default = k0.replace$default(pseudoUser, " ", "%20", false, 4, (Object) null);
        String signatureAkiAward = stats.getSignatureAkiAward();
        String deviceId = jb.c.f69226m.sharedInstance().getDeviceId();
        StringBuilder sbR = a.b.r(baseLogiqueId, DtbConstants.HTTP, adresse_classement, ":18666/update_score_from_classic_aki_award.php?basel_id=", "&joueur_id=");
        com.google.android.gms.internal.play_billing.a.B(sbR, idJoueurAccount, "&pseudo=", strReplace$default, "&signature=");
        return new n(a.b.o(sbR, signatureAkiAward, "&device_uid=", deviceId), zIsUserConnected).call();
    }

    public final int updateScoreFromChallengeAkiAward(int i10) {
        String nomJoueur;
        String idJoueur;
        boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
        if (zIsUserConnected) {
            nomJoueur = ca.m.sharedInstance().getPseudoUser();
        } else {
            nomJoueur = r.sharedInstance().getNomJoueur();
        }
        String str = nomJoueur;
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        int baseLogiqueId = currentInstance.getBaseLogiqueId();
        if (str != null && baseLogiqueId > 0) {
            if (zIsUserConnected) {
                idJoueur = r.sharedInstance().getIdJoueurAccount();
            } else {
                idJoueur = r.sharedInstance().getIdJoueur();
            }
            String str2 = idJoueur;
            String adresse_classement = g.f86657a.getADRESSE_CLASSEMENT();
            String strReplace$default = k0.replace$default(str, PcrIk.FDDsGEuhsMzp, "%20", false, 4, (Object) null);
            String deviceId = jb.c.f69226m.sharedInstance().getDeviceId();
            StringBuilder sbR = a.b.r(baseLogiqueId, DtbConstants.HTTP, adresse_classement, ":18666/update_score_from_challenge_aki_award.php?basel_id=", "&nb_awards=");
            sbR.append(i10);
            sbR.append("&joueur_id=");
            sbR.append(str2);
            sbR.append("&pseudo=");
            return new m(a.b.o(sbR, strReplace$default, "&device_uid=", deviceId), zIsUserConnected).call();
        }
        return 400;
    }
}
