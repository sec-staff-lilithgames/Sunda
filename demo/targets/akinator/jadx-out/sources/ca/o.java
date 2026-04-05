package ca;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.security.NoSuchAlgorithmException;
import lb.b1;
import lb.e;
import lb.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o {

    /* renamed from: r, reason: collision with root package name */
    public static o f11980r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11981a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11982b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f11983c;

    /* renamed from: g, reason: collision with root package name */
    public int f11987g;

    /* renamed from: h, reason: collision with root package name */
    public long f11988h;

    /* renamed from: i, reason: collision with root package name */
    public long f11989i;

    /* renamed from: j, reason: collision with root package name */
    public long f11990j;

    /* renamed from: l, reason: collision with root package name */
    public String f11992l;

    /* renamed from: p, reason: collision with root package name */
    public lb.e f11996p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11985e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f11986f = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11991k = true;

    /* renamed from: m, reason: collision with root package name */
    public int f11993m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f11994n = -1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11995o = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11997q = false;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f11984d = AkApplication.getAppContext().getSharedPreferences("game", 0);

    public static o sharedInstance() {
        if (f11980r == null) {
            f11980r = new o();
        }
        return f11980r;
    }

    public void addOneCelebCharacterPlayed() {
        int nbCelebCharactersPlayed = getNbCelebCharactersPlayed();
        if (nbCelebCharactersPlayed == -1) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putInt("nb_celebrities_played", nbCelebCharactersPlayed + 1);
        editorEdit.commit();
    }

    public void addOneLostGame() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putInt("games", getNbGames() + 1);
        editorEdit.commit();
    }

    public void addOneWonGame() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        int nbWonGames = getNbWonGames();
        int nbGames = getNbGames();
        editorEdit.putInt("wons", nbWonGames + 1);
        editorEdit.putInt("games", nbGames + 1);
        editorEdit.commit();
    }

    public boolean areAdsEnabled() {
        return m.sharedInstance().isAdsEnabledForCurrentInstance() && getAdsState() && getNoAdsTimestamp() < getCurrentTime();
    }

    public int callCMDB(String str) {
        s0.b bVar = s0.f72971j;
        s0.a aVarCallCMDB = bVar.sharedInstance().callCMDB(str);
        int returnCode = aVarCallCMDB.getReturnCode();
        if (returnCode == 0) {
            try {
                lb.a config = aVarCallCMDB.getConfig();
                m.sharedInstance().setValuesFromCMDB(config);
                bVar.sharedInstance().setTimeoutsWebservices(config.getTimeoutCourt() == 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : config.getTimeoutCourt(), config.getTimeoutLong() == 0 ? 7000 : config.getTimeoutLong());
            } catch (Exception unused) {
            }
        }
        return returnCode;
    }

    public boolean canIncTotalGameIncForThisGame() {
        return this.f11995o;
    }

    public boolean canShareAwardImage() {
        return this.f11985e;
    }

    public boolean canShowAd() {
        return this.f11984d.getBoolean("showAd", true);
    }

    public void cancelSession(FirebaseAnalytics firebaseAnalytics) {
        lb.e eVar = this.f11996p;
        if (eVar == null || !eVar.isActive()) {
            return;
        }
        v.sharedInstance().abortGameEvents(firebaseAnalytics);
        this.f11996p.cancelSessionOnSecondaryThread();
    }

    public int checkLogin(String str) {
        ra.c cVar = new ra.c(str);
        cVar.getResynchroIndicator();
        return cVar.call();
    }

    public int deleteAccount(String str) {
        return new ra.d(str).call();
    }

    public void disableAlertRateApp() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("app_rated", true);
        editorEdit.commit();
    }

    public int getAccountStatus(String str) {
        ra.a aVar = new ra.a(str);
        int iCall = aVar.call();
        if (iCall == 0) {
            m.sharedInstance().setStatusAccount(aVar.getStatusAccount());
        }
        return iCall;
    }

    public boolean getAdsState() {
        return this.f11984d.getBoolean("ads_state", true);
    }

    public int getAkinatorStatus() {
        int i10 = this.f11994n;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public String getBase64Img() {
        return this.f11984d.getString("home_banner_base64img", null);
    }

    public Bitmap getCharacterScreenshotDefi() {
        return this.f11983c;
    }

    public boolean getClickedBanner() {
        return this.f11981a;
    }

    public lb.e getCurrentSession() {
        return this.f11996p;
    }

    public long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public String getDateLastGame() {
        return this.f11984d.getString("datelastgame", "");
    }

    public long getDatePurchaseFull() {
        return this.f11988h;
    }

    public long getDatePurchaseNoAds() {
        return this.f11989i;
    }

    public long getDatePurchasePopu() {
        return this.f11990j;
    }

    public long getDelaiMoyen() {
        return this.f11987g;
    }

    public int getGameOverActivityState() {
        int i10 = this.f11993m;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    public int getGlobalUserInfos(String str) {
        return new ra.e(str).call();
    }

    public String getHomeBannerDate() {
        return this.f11984d.getString("home_banner_date", "");
    }

    public String getHomeBannerText() {
        return this.f11984d.getString("home_banner_text", "");
    }

    public String getHomeBannerUrl() {
        return this.f11984d.getString("home_banner_url", "");
    }

    public String getLastIdBasePlayed() {
        return this.f11986f;
    }

    public boolean getLimitedGameCountState() {
        return this.f11984d.getBoolean("game_count_state", true);
    }

    public String getMWGameOverActivityInfo() {
        return this.f11992l;
    }

    public int getNbCelebCharactersPlayed() {
        return this.f11984d.getInt("nb_celebrities_played", 0);
    }

    public int getNbGames() {
        return this.f11984d.getInt("games", 0);
    }

    public int getNbGamesInOneSession() {
        return this.f11984d.getInt("nbGamesInSession", 0);
    }

    public int getNbGamesInOneSessionWithoutClosingApp() {
        return this.f11984d.getInt("nbGamesInSessionWithoutClosingApp", 0);
    }

    public int getNbTimeAppIsOpen() {
        return this.f11984d.getInt("nbTimeAppIsOpen", 0);
    }

    public int getNbWonGames() {
        return this.f11984d.getInt("wons", 0);
    }

    public int getNextVarianteTextAjoutPerso() {
        SharedPreferences sharedPreferences = this.f11984d;
        int i10 = sharedPreferences.getInt("text_ajout_myworld_variant", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("text_ajout_myworld_variant", (i10 + 1) % 5);
        editorEdit.commit();
        return i10;
    }

    public int getNextVarianteTextAugmenteTaBase() {
        SharedPreferences sharedPreferences = this.f11984d;
        int i10 = sharedPreferences.getInt("text_augmente_myworld_variant", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("text_augmente_myworld_variant", (i10 + 1) % 6);
        editorEdit.commit();
        return i10;
    }

    public long getNoAdsTimestamp() {
        return this.f11984d.getLong("no_ads_timestamp", 0L);
    }

    public String getPollURL() {
        return this.f11984d.getString("url_poll", "");
    }

    public boolean getPopularityState() {
        return this.f11984d.getBoolean("popularity_state", true);
    }

    public boolean getSelectionThemeStatus() {
        return this.f11984d.getBoolean("open_selection_theme", true);
    }

    public boolean getStatusNetworkInvitation() {
        return this.f11984d.getBoolean("notify_network_invitation", true);
    }

    public long getTimestamp() {
        return this.f11984d.getLong("timestamp", 0L);
    }

    public long getUnlimitedGameCountTimestamp() {
        return this.f11984d.getLong("unlockedtime", 0L);
    }

    public long getUnlockedPopularityTimestamp() {
        return this.f11984d.getLong("unlocked_popularity_timestamp", 0L);
    }

    public int getUserInfos(String str, String str2, String str3, int i10) {
        return new ra.h(str, str2, str3, i10).call();
    }

    public int importUserData(String str) {
        return new ra.i(str).call();
    }

    public boolean isAppRated() {
        return this.f11984d.getBoolean("app_rated", false);
    }

    public boolean isFirstGameOverCreation() {
        return this.f11991k;
    }

    public boolean isGameCountLimited() {
        return getLimitedGameCountState() && getUnlimitedGameCountTimestamp() < getCurrentTime();
    }

    public boolean isPopularityLimited() {
        return m.sharedInstance().isPopularityCapEnabledForCurrentInstance() && getPopularityState() && getUnlockedPopularityTimestamp() < getCurrentTime();
    }

    public boolean isPrio() {
        if (m.sharedInstance().isPaid()) {
            return true;
        }
        if (m.sharedInstance().isFreemium()) {
            return isUnlocked() || !getPopularityState();
        }
        return false;
    }

    public boolean isUnlocked() {
        return this.f11984d.getBoolean("unlockedgame", !m.sharedInstance().isFreemium());
    }

    public void lockGame() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("unlockedgame", false);
        editorEdit.commit();
    }

    public int loginUser(String str, String str2, boolean z10) throws NoSuchAlgorithmException {
        ra.j jVar = new ra.j(str, str2, z10);
        int iCall = jVar.call();
        if (iCall != 0) {
            return iCall;
        }
        m.sharedInstance().setUserKey(jVar.getKey());
        m.sharedInstance().setPseudoUser(jVar.getName());
        m.sharedInstance().setUserId(jVar.getUserId());
        if (jVar.isKnownDevice()) {
            return -90;
        }
        return iCall;
    }

    public boolean mustAlertUserIsConnected() {
        return this.f11997q;
    }

    public int newPasswordAfterReset(String str, String str2) throws NoSuchAlgorithmException {
        return new ra.l(str, str2).call();
    }

    public int registerUser(String str, String str2, String str3, String str4) throws NoSuchAlgorithmException {
        return new ra.m(b1.sharedInstance().getApplicationLanguage(), str, str2, str3, str4).call();
    }

    public void replaceTimestampWithCurrentTime() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public int resendActivationMail(String str) {
        return new ra.n(str).call();
    }

    public int resetPassword(String str) {
        return new ra.o(str, b1.sharedInstance().getApplicationLanguage()).call();
    }

    public void resetUserMustBeAlertConnected() {
        this.f11997q = false;
    }

    public int sendConfirmationMail(String str, String str2) {
        return new ra.p(str, str2).call();
    }

    public void setAdsState(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("ads_state", z10);
        editorEdit.commit();
    }

    public void setAkinatorStatus(int i10) {
        this.f11994n = i10;
    }

    public void setBase64Image(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("home_banner_base64img", str);
        editorEdit.commit();
    }

    public void setCanShowAd(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("showAd", z10);
        editorEdit.commit();
    }

    public void setCharacterScreenshotDefi(Bitmap bitmap) {
        this.f11983c = bitmap;
    }

    public void setClickedBanner(boolean z10) {
        this.f11981a = z10;
    }

    public void setCurrentSession(lb.e eVar) {
        if (this.f11996p == eVar) {
            return;
        }
        cancelSession(FirebaseAnalytics.getInstance(AkApplication.getAppContext()));
        this.f11996p = eVar;
    }

    public void setDateLastGame(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("datelastgame", str);
        editorEdit.commit();
    }

    public void setDatePurchaseFull(long j10) {
        this.f11988h = j10;
    }

    public void setDatePurchaseNoAds(long j10) {
        this.f11989i = j10;
    }

    public void setDatePurchasePopu(long j10) {
        this.f11990j = j10;
    }

    public void setDelaiMoyen(int i10) {
        this.f11987g = i10;
    }

    public void setFirstGameOverCreation(boolean z10) {
        this.f11991k = z10;
    }

    public void setGameOverActivityState(int i10) {
        this.f11993m = i10;
    }

    public void setHomeBannerDate(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("home_banner_date", str);
        editorEdit.commit();
    }

    public void setHomeBannerText(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("home_banner_text", str);
        editorEdit.commit();
    }

    public void setHomeBannerUrl(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("home_banner_url", str);
        editorEdit.commit();
    }

    public void setLastIdBasePlayed(String str) {
        this.f11986f = str;
    }

    public void setLimitedGameCountState(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("game_count_state", z10);
        editorEdit.commit();
    }

    public void setMWGameOverActivityInfo(String str) {
        this.f11992l = str;
    }

    public void setNbGamesInOneSession(int i10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putInt("nbGamesInSession", i10);
        editorEdit.commit();
    }

    public void setNbGamesInOneSessionWithoutClosingApp(int i10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putInt("nbGamesInSessionWithoutClosingApp", i10);
        editorEdit.commit();
    }

    public void setNbTimeAppIsOpen(int i10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putInt("nbTimeAppIsOpen", i10);
        editorEdit.commit();
    }

    public void setNoAdsTimestamp(long j10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putLong("no_ads_timestamp", getCurrentTime() + j10);
        editorEdit.commit();
    }

    public void setPollURL(String str) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putString("url_poll", str);
        editorEdit.commit();
    }

    public void setPopularityState(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("popularity_state", z10);
        editorEdit.commit();
    }

    public void setSelectionThemeStatus(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("open_selection_theme", z10);
        editorEdit.commit();
    }

    public void setStatusNetworkInvitation(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("notify_network_invitation", z10);
        editorEdit.commit();
    }

    public void setUnlockedPopularity(long j10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putLong("unlocked_popularity_timestamp", getCurrentTime() + j10);
        editorEdit.commit();
    }

    public void setUnlockedTime(long j10) {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putLong("unlockedtime", getCurrentTime() + j10);
        editorEdit.commit();
    }

    public void setUserMustBeAlertConnected() {
        this.f11997q = true;
    }

    public void setWinFirstTry(boolean z10) {
        this.f11982b = z10;
    }

    public void unlockGame() {
        SharedPreferences.Editor editorEdit = this.f11984d.edit();
        editorEdit.putBoolean("unlockedgame", true);
        editorEdit.commit();
    }

    public void unlockTotalGameForThisGame(boolean z10) {
        this.f11995o = z10;
    }

    public int updateEmailOrPassword(String str, String str2, String str3, boolean z10) throws NoSuchAlgorithmException {
        return new ra.k(str, str2, str3, z10).call();
    }

    public int updateJoueurId(String str) {
        return new ra.q(str).call();
    }

    public int updateUserAccesories(boolean z10, boolean z11, String str, String str2, int i10, String str3) {
        int iCall = -1;
        for (int i11 = 0; i11 < 3; i11++) {
            iCall = new ra.q(z10, z11, str, str2, i10, str3).call();
            if (iCall == 0) {
                return iCall;
            }
        }
        return iCall;
    }

    public int updateUserInfos(int i10, String str, String str2, String str3) {
        return new ra.q(i10, str, str2, str3).call();
    }

    public int updateUserInfosDefi(String str, String str2, String str3, String str4) {
        return new ra.q(str, str2, str3, str4).call();
    }

    public int updateUserInfosGeniz(String str, String str2, String str3, int i10, boolean z10) {
        int iCall = -1;
        int i11 = 0;
        while (i11 < 3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i12 = i10;
            boolean z11 = z10;
            iCall = new ra.q(str6, str4, str5, i12, z11).call();
            if (iCall == 0) {
                return iCall;
            }
            i11++;
            str3 = str6;
            str = str4;
            str2 = str5;
            i10 = i12;
            z10 = z11;
        }
        return iCall;
    }

    public int updateUserInfosPersosFound(e.g gVar, int i10, String str, String str2, String str3) {
        int iCall = -1;
        int i11 = 0;
        while (i11 < 3) {
            e.g gVar2 = gVar;
            int i12 = i10;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            iCall = new ra.q(gVar2, i12, str6, str4, str5).call();
            if (iCall == 0) {
                return iCall;
            }
            i11++;
            gVar = gVar2;
            i10 = i12;
            str3 = str6;
            str = str4;
            str2 = str5;
        }
        return iCall;
    }

    public int updateUserJoker(String str, String str2, String str3) {
        return new ra.q(str, str2, str3).call();
    }

    public int updateUsername(String str, String str2) {
        return new ra.k(str2, str).call();
    }

    public boolean winFirstTry() {
        return this.f11982b;
    }

    public void canShareAwardImage(boolean z10) {
        this.f11985e = z10;
    }
}
