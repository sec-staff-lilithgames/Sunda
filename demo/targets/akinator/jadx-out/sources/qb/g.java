package qb;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import lb.e;
import lb.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends z {

    /* renamed from: o, reason: collision with root package name */
    public e.g f82689o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(lb.e session) {
        e.i currentSessionProgression;
        String signature;
        String session2;
        super(session);
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        this.f82730i = "check_trap.php";
        lb.e mSession = getMSession();
        String str = "";
        addParameter("session", (mSession == null || (session2 = mSession.getSession()) == null) ? "" : session2);
        lb.e mSession2 = getMSession();
        if (mSession2 != null && (signature = mSession2.getSignature()) != null) {
            str = signature;
        }
        addParameter(InAppPurchaseMetaData.KEY_SIGNATURE, str);
        lb.e mSession3 = getMSession();
        addParameter("step", String.valueOf((mSession3 == null || (currentSessionProgression = mSession3.getCurrentSessionProgression()) == null) ? null : Integer.valueOf(currentSessionProgression.getStep())));
        s0.b bVar = s0.f72971j;
        addParameter("max_pic_width", String.valueOf(bVar.sharedInstance().getSettings().getMLargeurPhoto()));
        addParameter("max_pic_height", String.valueOf(bVar.sharedInstance().getSettings().getMHauteurPhoto()));
    }

    public final e.g getProposedLimuleTrap() {
        return this.f82689o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016c  */
    @Override // qb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parseAkWSResponse(org.w3c.dom.Document r18) throws org.w3c.dom.DOMException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.g.parseAkWSResponse(org.w3c.dom.Document):void");
    }
}
