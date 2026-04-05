package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.List;
import lb.e;
import lb.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p extends z {

    /* renamed from: o, reason: collision with root package name */
    public int f82706o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f82707p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f82708q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(lb.e session, int i10, boolean z10, boolean z11) {
        e.i currentSessionProgression;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82706o = -1;
        this.f82707p = new ArrayList();
        if (i10 == 1) {
            this.f82708q = true;
        }
        this.f82730i = "list.php";
        addParameter("base", "0");
        lb.e mSession = getMSession();
        String str = "";
        addParameter("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameter("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        if (mSession3 != null && (signature = mSession3.getSignature()) != null) {
            str = signature;
        }
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, str);
        lb.e mSession4 = getMSession();
        addParameter("step", String.valueOf((mSession4 == null || (currentSessionProgression = mSession4.getCurrentSessionProgression()) == null) ? null : Integer.valueOf(currentSessionProgression.getStep())));
        addParameter(ContentDisposition.Parameters.Size, String.valueOf(i10));
        s0.b bVar = s0.f72971j;
        addParameter("max_pic_width", String.valueOf(bVar.sharedInstance().getSettings().getMLargeurPhoto()));
        addParameter("max_pic_height", String.valueOf(bVar.sharedInstance().getSettings().getMHauteurPhoto()));
        addParameter("joueur_VIP", z11 ? "1" : "0");
        addParameter("mode_question", z10 ? "1" : "0");
    }

    public final List<e.b> getLimuleObjects() {
        return this.f82707p;
    }

    public final int getNbObjetsPertinents() {
        return this.f82706o;
    }

    public final boolean isModeObjectPropose() {
        return this.f82708q;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    @Override // qb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseAkWSResponse(org.w3c.dom.Document r21) throws org.w3c.dom.DOMException, qb.l {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.p.parseAkWSResponse(org.w3c.dom.Document):void");
    }
}
