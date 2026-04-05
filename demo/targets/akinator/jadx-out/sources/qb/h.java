package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends z {

    /* renamed from: o, reason: collision with root package name */
    public final int f82692o;

    /* renamed from: p, reason: collision with root package name */
    public final e.c f82693p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(lb.e session, int i10, boolean z10, boolean z11, String str) {
        lb.c eVar;
        e.i currentSessionProgression;
        String signature;
        String session2;
        String channel;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82692o = i10;
        this.f82693p = new e.c();
        this.f82730i = "choice.php";
        addParameter("base", "0");
        lb.e mSession = getMSession();
        String str2 = "";
        addParameter("channel", (mSession == null || (channel = mSession.getChannel()) == null) ? "" : channel);
        lb.e mSession2 = getMSession();
        addParameter("session", (mSession2 == null || (session2 = mSession2.getSession()) == null) ? "" : session2);
        lb.e mSession3 = getMSession();
        if (mSession3 != null && (signature = mSession3.getSignature()) != null) {
            str2 = signature;
        }
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
        lb.e mSession4 = getMSession();
        Integer numValueOf = null;
        addParameter("step", String.valueOf((mSession4 == null || (currentSessionProgression = mSession4.getCurrentSessionProgression()) == null) ? null : Integer.valueOf(currentSessionProgression.getStep())));
        addParameter("jackpot", z10 ? "1" : "0");
        addParameter("element", String.valueOf(i10));
        lb.e mSession5 = getMSession();
        if (mSession5 != null && (eVar = mSession5.getInstance()) != null) {
            numValueOf = Integer.valueOf(eVar.getBaseLogiqueId());
        }
        addParameter("basel_id", String.valueOf(numValueOf));
        addParameter("duel_allowed", "1");
        if (str != null) {
            addParameter("joueur_id", str);
        }
        if (z11) {
            addParameter("byname", "1");
        }
    }

    public final int getIdSession() {
        return this.f82692o;
    }

    public final e.c getLimuleObjectStats() {
        return this.f82693p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    @Override // qb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseAkWSResponse(org.w3c.dom.Document r9) throws org.w3c.dom.DOMException, qb.b0 {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.h.parseAkWSResponse(org.w3c.dom.Document):void");
    }
}
