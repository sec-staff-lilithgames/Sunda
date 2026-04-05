package lb;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final ArrayList R;
    public int S;
    public String T;

    /* renamed from: a, reason: collision with root package name */
    public int f72761a;

    /* renamed from: b, reason: collision with root package name */
    public int f72762b;

    /* renamed from: c, reason: collision with root package name */
    public String f72763c;

    /* renamed from: d, reason: collision with root package name */
    public String f72764d;

    /* renamed from: e, reason: collision with root package name */
    public int f72765e;

    /* renamed from: f, reason: collision with root package name */
    public String f72766f;

    /* renamed from: g, reason: collision with root package name */
    public String f72767g;

    /* renamed from: h, reason: collision with root package name */
    public String f72768h;

    /* renamed from: i, reason: collision with root package name */
    public String f72769i;

    /* renamed from: j, reason: collision with root package name */
    public String f72770j;

    /* renamed from: k, reason: collision with root package name */
    public int f72771k;

    /* renamed from: l, reason: collision with root package name */
    public int f72772l;

    /* renamed from: m, reason: collision with root package name */
    public String f72773m;

    /* renamed from: n, reason: collision with root package name */
    public int f72774n;

    /* renamed from: o, reason: collision with root package name */
    public String f72775o;

    /* renamed from: p, reason: collision with root package name */
    public String f72776p;

    /* renamed from: q, reason: collision with root package name */
    public String f72777q;

    /* renamed from: r, reason: collision with root package name */
    public String f72778r;

    /* renamed from: s, reason: collision with root package name */
    public String f72779s;

    /* renamed from: t, reason: collision with root package name */
    public String f72780t;

    /* renamed from: u, reason: collision with root package name */
    public String f72781u;

    /* renamed from: v, reason: collision with root package name */
    public String f72782v;

    /* renamed from: w, reason: collision with root package name */
    public String f72783w;

    /* renamed from: x, reason: collision with root package name */
    public String f72784x;

    /* renamed from: y, reason: collision with root package name */
    public String f72785y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f72786z;

    public c() {
        this.f72761a = -1;
        this.f72762b = -1;
        this.f72763c = null;
        this.f72764d = null;
        this.f72765e = -1;
        this.f72766f = null;
        this.f72767g = null;
        this.f72768h = null;
        this.f72769i = null;
        this.f72770j = null;
        this.f72771k = -1;
        this.f72772l = -1;
        this.f72773m = null;
        this.f72774n = -1;
        this.f72775o = null;
        this.f72776p = null;
        this.f72777q = null;
        this.f72778r = null;
        this.f72779s = null;
        this.f72780t = null;
        this.f72781u = null;
        this.f72782v = null;
        this.f72783w = null;
        this.f72784x = null;
        this.f72785y = null;
        this.f72786z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = new ArrayList();
        this.S = -1;
        this.T = null;
    }

    public int getAwardIdLimit() {
        return this.f72761a;
    }

    public int getBaseLogiqueId() {
        return this.f72765e;
    }

    public String getBaseUrlWS() {
        return this.f72779s;
    }

    public String getCandidateURL(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.R;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (String) arrayList.get(i10);
    }

    public int getCandidatesURLCount() {
        return this.R.size();
    }

    public String getFacebookMobileUrl() {
        return this.f72783w;
    }

    public String getFacebookUrl() {
        return this.f72782v;
    }

    public String getInstagramMobileUrl() {
        return this.f72785y;
    }

    public String getInstagramUrl() {
        return this.f72784x;
    }

    public String getLanguage() {
        return this.f72770j;
    }

    public String getNomExterneVarCible() {
        return this.f72768h;
    }

    public String getNomReseauEntropique() {
        return this.f72767g;
    }

    public int getPrioAvailable() {
        return this.S;
    }

    public int getRankingLimit() {
        return this.f72762b;
    }

    public String getServiceId() {
        return this.f72763c;
    }

    public String getServiceIdAlias() {
        return this.f72764d;
    }

    public String getState() {
        return this.T;
    }

    public String getSubjectIconSelectedUrl() {
        return this.f72778r;
    }

    public String getSubjectIconUrl() {
        return this.f72776p;
    }

    public int getSubjectId() {
        return this.f72771k;
    }

    public String getSubjectLabel() {
        return this.f72773m;
    }

    public String getSubjectPictureEndgameUrl() {
        return this.f72777q;
    }

    public String getSubjectPictureUrl() {
        return this.f72775o;
    }

    public int getSubjectPrice() {
        return this.f72774n;
    }

    public int getTradsAppId() {
        return this.f72772l;
    }

    public String getTranslatedSubjectName() {
        return this.f72769i;
    }

    public String getTwitterMobileUrl() {
        return this.f72781u;
    }

    public String getTwitterUrl() {
        return this.f72780t;
    }

    public String getTypeSession() {
        return this.f72766f;
    }

    public boolean isDisableAddObject() {
        return this.K;
    }

    public boolean isDisableAddPhoto() {
        return this.F;
    }

    public boolean isDisableAddQuestion() {
        return this.G;
    }

    public boolean isDisableAds() {
        return this.J;
    }

    public boolean isDisableAkiAwards() {
        return this.f72786z;
    }

    public boolean isDisableChildFilter() {
        return this.I;
    }

    public boolean isDisableComplementaryQuestion() {
        return this.M;
    }

    public boolean isDisableCorrectName() {
        return this.L;
    }

    public boolean isDisableCustomizeAkinator() {
        return this.B;
    }

    public boolean isDisableDailyChallenge() {
        return this.C;
    }

    public boolean isDisableDescription() {
        return this.P;
    }

    public boolean isDisableGameReport() {
        return this.H;
    }

    public boolean isDisableHallOfFame() {
        return this.A;
    }

    public boolean isDisableMyWorld() {
        return this.E;
    }

    public boolean isDisablePopularityCap() {
        return this.D;
    }

    public boolean isDisableSignalementDoublons() {
        return this.Q;
    }

    public boolean isDisableSoundlikeCompletion() {
        return this.O;
    }

    public boolean isDisableVoteClassement() {
        return this.N;
    }

    public c(c cVar) {
        this.f72761a = -1;
        this.f72762b = -1;
        this.f72763c = null;
        this.f72764d = null;
        this.f72765e = -1;
        this.f72766f = null;
        this.f72767g = null;
        this.f72768h = null;
        this.f72769i = null;
        this.f72770j = null;
        this.f72771k = -1;
        this.f72772l = -1;
        this.f72773m = null;
        this.f72774n = -1;
        this.f72775o = null;
        this.f72776p = null;
        this.f72777q = null;
        this.f72778r = null;
        this.f72779s = null;
        this.f72780t = null;
        this.f72781u = null;
        this.f72782v = null;
        this.f72783w = null;
        this.f72784x = null;
        this.f72785y = null;
        this.f72786z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = -1;
        this.T = null;
        this.f72782v = cVar.f72782v;
        this.f72783w = cVar.f72783w;
        this.f72784x = cVar.f72784x;
        this.f72785y = cVar.f72785y;
        this.f72780t = cVar.f72780t;
        this.f72781u = cVar.f72781u;
        this.f72762b = cVar.f72762b;
        this.f72761a = cVar.f72761a;
        this.f72763c = cVar.f72763c;
        this.f72764d = cVar.f72764d;
        this.f72765e = cVar.f72765e;
        this.f72766f = cVar.f72766f;
        this.f72767g = cVar.f72767g;
        this.f72768h = cVar.f72768h;
        this.f72769i = cVar.f72769i;
        this.f72770j = cVar.f72770j;
        this.f72771k = cVar.f72771k;
        this.f72772l = cVar.f72772l;
        this.f72773m = cVar.f72773m;
        this.f72774n = cVar.f72774n;
        this.f72775o = cVar.f72775o;
        this.f72776p = cVar.f72776p;
        this.f72777q = cVar.f72777q;
        this.f72778r = cVar.f72778r;
        this.f72779s = cVar.f72779s;
        this.S = cVar.S;
        this.T = cVar.T;
        arrayList.addAll(cVar.R);
        this.f72786z = cVar.f72786z;
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = cVar.D;
        this.E = cVar.E;
        this.F = cVar.F;
        this.G = cVar.G;
        this.H = cVar.H;
        this.I = cVar.I;
        this.J = cVar.J;
        this.K = cVar.K;
        this.L = cVar.L;
        this.M = cVar.M;
        this.N = cVar.N;
        this.O = cVar.O;
        this.P = cVar.P;
    }
}
