package ca;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lb.e;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: u, reason: collision with root package name */
    public static u f12013u;

    /* renamed from: a, reason: collision with root package name */
    public int f12014a;

    /* renamed from: b, reason: collision with root package name */
    public String f12015b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12016c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12018e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12019f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12020g;

    /* renamed from: h, reason: collision with root package name */
    public String f12021h;

    /* renamed from: i, reason: collision with root package name */
    public float f12022i;

    /* renamed from: j, reason: collision with root package name */
    public SharedPreferences f12023j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f12024k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12025l;

    /* renamed from: m, reason: collision with root package name */
    public e.g f12026m;

    /* renamed from: n, reason: collision with root package name */
    public e.c f12027n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12028o;

    /* renamed from: p, reason: collision with root package name */
    public Bitmap f12029p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12030q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12031r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12032s;

    /* renamed from: t, reason: collision with root package name */
    public SharedPreferences.Editor f12033t;

    public static u sharedInstance() {
        if (f12013u == null) {
            u uVar = new u();
            uVar.f12017d = false;
            uVar.f12018e = false;
            uVar.f12019f = false;
            uVar.f12020g = false;
            uVar.f12025l = true;
            uVar.f12028o = false;
            uVar.f12031r = false;
            uVar.f12032s = false;
            uVar.f12033t = null;
            uVar.f12023j = AkApplication.getAppContext().getSharedPreferences("session", 0);
            f12013u = uVar;
        }
        return f12013u;
    }

    public boolean areAnalyticsSendLastTime() {
        return this.f12023j.getBoolean("keyAnalyticsSent", true);
    }

    public String getCharacterNameProposed() {
        return this.f12015b;
    }

    public Bitmap getImageDefi() {
        return this.f12024k;
    }

    public Bitmap getImagePerso() {
        return this.f12029p;
    }

    public float getLastProgression() {
        return this.f12022i;
    }

    public String getLastQuestion() {
        return this.f12021h;
    }

    public int getLastSessionAdded() {
        return this.f12023j.getInt("last", 0);
    }

    public boolean getNoMoreQuestionsStatus() {
        return this.f12020g;
    }

    public e.g getPersoPropose() {
        return this.f12026m;
    }

    public e.c getStats() {
        return this.f12027n;
    }

    public long getTimeOfCurrentSessionStart() {
        return this.f12023j.getLong("timeOfCurrentSessionStart", 0L);
    }

    public long getTimeOfLastScreenOnPause() {
        return this.f12023j.getLong("timeOfLastScreenOnPause", Long.MAX_VALUE);
    }

    public int getTotalSessionActuelle() {
        return this.f12023j.getInt("totalsession", 0);
    }

    public boolean hasAlreadyAnsweredComplementaryQuestions() {
        return this.f12019f;
    }

    public boolean hasAlreadyCheat() {
        return this.f12023j.getBoolean("hasAlreadyCheat", false);
    }

    public boolean hasAlreadyProposedCom() {
        return this.f12018e;
    }

    public boolean hasAlreadyProposedPhoto() {
        return this.f12016c;
    }

    public boolean hasAlreadyProposedQuestion() {
        return this.f12017d;
    }

    public boolean hasNotReinitPolfishSdk() {
        return this.f12023j.getBoolean("reinitPollfishSdk", false);
    }

    public boolean hasclickSubmit() {
        return this.f12028o;
    }

    public boolean isAbleToFind() {
        e.i currentSessionProgression = o.sharedInstance().getCurrentSession().getCurrentSessionProgression();
        int step = currentSessionProgression.getStep();
        int i10 = this.f12014a;
        float progression = currentSessionProgression.getProgression();
        int i11 = step - i10;
        if (this.f12020g || step == 79) {
            return true;
        }
        if (i11 < 5) {
            return false;
        }
        return step <= 25 ? progression > 97.0f : (progression > 80.0f || i11 >= 30) && 79 - step > 5;
    }

    public boolean isPopuUnlockedForThisPartie() {
        return this.f12030q;
    }

    public boolean isPotionBoughtInSession() {
        return this.f12031r && this.f12032s;
    }

    public void lockPopuForThisPartie() {
        this.f12030q = false;
    }

    public void mustReinitSdk(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putBoolean("reinitPollfishSdk", z10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public boolean mustShowPubTemp() {
        return this.f12025l;
    }

    public void noMoreQuestions(boolean z10) {
        this.f12020g = z10;
    }

    public void resetMarketOpen() {
        this.f12032s = false;
    }

    public void resetPotionBoughtInSession() {
        this.f12031r = false;
    }

    public void setAlreadyAnsweredComplementaryQuestions(boolean z10) {
        this.f12019f = z10;
    }

    public void setAnalyticsSend(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putBoolean("keyAnalyticsSent", z10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void setCharacterNameProposed(String str) {
        this.f12015b = str;
    }

    public void setCorrectNameAlreadyProposed(boolean z10) {
        this.f12018e = z10;
    }

    public void setHasAlreadyCheat() {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putBoolean("hasAlreadyCheat", true);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void setImageDefi(Bitmap bitmap) {
        this.f12024k = bitmap;
    }

    public void setImagePerso(Bitmap bitmap) {
        this.f12029p = bitmap;
    }

    public void setLastProgression(float f10) {
        this.f12022i = f10;
    }

    public void setLastQuestion(String str) {
        this.f12021h = str;
    }

    public void setLastSessionAdded(int i10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putInt("last", i10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void setMarketOpen() {
        this.f12032s = true;
    }

    public void setNewTotalSession(int i10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putInt("totalsession", i10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void setPersoPropose(e.g gVar) {
        this.f12026m = gVar;
    }

    public void setPhotoAlreadyProposed(boolean z10) {
        this.f12016c = z10;
    }

    public void setPollShowed() {
        if (jb.c.sharedInstance().getCampaign(a.getAbtestIdSondageKey()) != null) {
            SharedPreferences.Editor editorEdit = this.f12033t;
            if (editorEdit == null) {
                editorEdit = this.f12023j.edit();
            }
            editorEdit.putString("sondageAffiche", jb.c.sharedInstance().getCampaign(a.getAbtestIdSondageKey()));
            if (this.f12033t == null) {
                editorEdit.commit();
            }
        }
    }

    public void setPotionBoughtInSession() {
        this.f12031r = true;
    }

    public void setQuestionAlreadyProposed(boolean z10) {
        this.f12017d = z10;
    }

    public void setStats(e.c cVar) {
        this.f12027n = cVar;
    }

    public void setStepOfLastProp(int i10) {
        this.f12014a = i10;
    }

    public void setSubmit(boolean z10) {
        this.f12028o = z10;
    }

    public void setTimeOfCurrentSessionStart(long j10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putLong("timeOfCurrentSessionStart", j10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void setTimeOfLastScreenOnPause(long j10) {
        SharedPreferences.Editor editorEdit = this.f12033t;
        if (editorEdit == null) {
            editorEdit = this.f12023j.edit();
        }
        editorEdit.putLong("timeOfLastScreenOnPause", j10);
        if (this.f12033t == null) {
            editorEdit.commit();
        }
    }

    public void showPubTemp(boolean z10) {
        this.f12025l = z10;
    }

    public void startBatchEdit() {
        this.f12033t = this.f12023j.edit();
    }

    public void stopBatchEdit() {
        this.f12033t.apply();
        this.f12033t = null;
    }

    public void unlockPopuForThispPartie() {
        this.f12030q = true;
    }

    public boolean wasPollShowed() {
        SharedPreferences sharedPreferences = this.f12023j;
        String campaign = jb.c.sharedInstance().getCampaign(a.getAbtestIdSondageKey());
        Timber.Tree treeTag = Timber.tag("AKSONDAGES");
        StringBuilder sb2 = new StringBuilder("key : ");
        sb2.append(a.getAbtestIdSondageKey());
        sb2.append("v : ");
        sb2.append(campaign == null ? AbstractJsonLexerKt.NULL : campaign);
        sb2.append(" - poll : ");
        sb2.append(sharedPreferences.getString("sondageAffiche", ""));
        treeTag.d(sb2.toString(), new Object[0]);
        return campaign == null || sharedPreferences.getString("sondageAffiche", "").equals(campaign);
    }
}
