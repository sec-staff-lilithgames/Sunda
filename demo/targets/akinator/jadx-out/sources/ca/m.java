package ca;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import lb.s0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: l, reason: collision with root package name */
    public static m f11956l = null;

    /* renamed from: m, reason: collision with root package name */
    public static int f11957m = 1;

    /* renamed from: a, reason: collision with root package name */
    public Date f11958a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11959b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f11960c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences.Editor f11961d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f11962e;

    /* renamed from: f, reason: collision with root package name */
    public final SharedPreferences.Editor f11963f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11964g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11965h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11966i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11967j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11968k;

    public m() {
        l lVar = new l();
        lVar.add("AT");
        lVar.add("BE");
        lVar.add("BG");
        lVar.add("CH");
        lVar.add("CY");
        lVar.add("DE");
        lVar.add("DK");
        lVar.add("ES");
        lVar.add("EE");
        lVar.add("FI");
        lVar.add("FR");
        lVar.add("GB");
        lVar.add("GR");
        lVar.add("HR");
        lVar.add("HU");
        lVar.add("IE");
        lVar.add(IronSourceConstants.INTERSTITIAL_EVENT_TYPE);
        lVar.add("IT");
        lVar.add("LI");
        lVar.add("LV");
        lVar.add("LT");
        lVar.add("LU");
        lVar.add("MT");
        lVar.add("NL");
        lVar.add("NO");
        lVar.add("PL");
        lVar.add("PO");
        lVar.add("PT");
        lVar.add("CZ");
        lVar.add("RO");
        lVar.add("SK");
        lVar.add("SI");
        lVar.add("SE");
        this.f11959b = lVar;
        this.f11964g = false;
        this.f11965h = false;
        this.f11966i = true;
        this.f11967j = false;
        this.f11968k = true;
        SharedPreferences sharedPreferences = AkApplication.getAppContext().getSharedPreferences("settings", 0);
        this.f11960c = sharedPreferences;
        this.f11961d = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = AkApplication.getAppContext().getSharedPreferences("settingsCurLang", 0);
        this.f11962e = sharedPreferences2;
        this.f11963f = sharedPreferences2.edit();
    }

    public static m sharedInstance() {
        if (f11956l == null) {
            f11956l = new m();
        }
        return f11956l;
    }

    public static String transFormLang(String str) {
        str.getClass();
        switch (str) {
            case "he":
            case "iw":
                return "il";
            case "ja":
                return "jp";
            case "ko":
                return "kr";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }

    public boolean canCheckFull() {
        return this.f11967j;
    }

    public boolean canDisplayRestoreOk() {
        return this.f11965h;
    }

    public boolean canDisplayRgpd() {
        return this.f11960c.getBoolean("keyCanDisplayCookieAlert3", true);
    }

    public boolean canDownloadPicture() {
        return true;
    }

    public int canPlay() {
        return f11957m;
    }

    public boolean canSendAnalytics() {
        return this.f11966i;
    }

    public void changeClassementState(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("classementEtat", i10);
        editor.commit();
    }

    public void changeLanguageManually(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("keyHasAlreadyChangeLang", z10);
        editor.commit();
    }

    public int classementState() {
        return this.f11960c.getInt("classementEtat", 0);
    }

    public boolean displayAlertFirstTime() {
        return this.f11960c.getBoolean("displayAlert", true);
    }

    public void displayRestoreOk(boolean z10) {
        this.f11965h = z10;
    }

    public void doNotDisplayedDidac() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("mustDisplayedDidac", false);
        editor.commit();
    }

    public void dontNeedToDownloadFlagAnymore() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("keyDownloadFlag", false);
        editor.commit();
    }

    public void eraseUserData() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.clear();
        editor.apply();
    }

    public String getApplicationIdForAnalytics() {
        return sharedInstance().isFreemium() ? "JAGPFR" : sharedInstance().isPaid() ? "JAGPPR" : "";
    }

    public float getCoeffAnimationSpeed() {
        return this.f11960c.getFloat("coeffVitesseAnimations", 1.0f);
    }

    public String getCreatedDeviceRecord() {
        return this.f11960c.getString("createdDeviceRecord", "0");
    }

    public lb.c getCurrentInstance() {
        return s0.f72971j.sharedInstance().getInstance(getCurrentLanguage(), getCurrentSubject());
    }

    public String getCurrentLanguage() {
        return this.f11962e.getString("gameLanguageId", this.f11960c.getString("gameLanguageId", "en"));
    }

    public int getCurrentSubject() {
        return this.f11962e.getInt("gameSubjectId", this.f11960c.getInt("gameSubjectId", 1));
    }

    public int getCustomMaxRanking() {
        int i10 = this.f11960c.getInt("custom_max_ranking", 0);
        return i10 == 0 ? getOriginalMaxRanking() : i10;
    }

    public int getDelaiTimerBanniereCom() {
        return this.f11960c.getInt("delaitTimerBanniereCom", 5000);
    }

    public String getDeviceId() {
        String string = this.f11960c.getString("userId", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userId", string2);
        editor.commit();
        return string2;
    }

    public boolean getDisponibiliteAccessoires() {
        return this.f11960c.getBoolean("disponibiliteAccessoires", true);
    }

    public int getDureeMaxSinceLastSession() {
        return this.f11960c.getInt("dureeMaxDepuisDeniereSession", 30);
    }

    public String getFcmToken() {
        return this.f11960c.getString("fcmtoken", null);
    }

    public Date getFirstLaunchDate() {
        return this.f11958a;
    }

    public String getHat() {
        return getDisponibiliteAccessoires() ? this.f11960c.getString("question_hat", "turban") : "turban";
    }

    public String getKeyUser() {
        return this.f11960c.getString("userKey", null);
    }

    public String getLastClassementCourantId() {
        return this.f11960c.getString("lastIdCourant", null);
    }

    public String getLastClassementIdUpdateScore() {
        return this.f11960c.getString("lastClassement", null);
    }

    public int getLastRvDay() {
        return this.f11960c.getInt("lastRvDay", -1);
    }

    public int getLastVersionCode() {
        return this.f11960c.getInt("keyversioncode", -1);
    }

    public int getLimitAwardIdRare() {
        return this.f11960c.getInt("limitAwardIdRare", 3);
    }

    public String getMailUser() {
        return this.f11960c.getString("userMail", null);
    }

    public String getMediaFootprint() {
        return o.sharedInstance().isUnlocked() ? "cd8e6509f3420878e18d75b9831b317f" : "82de69085436aba8a6f6b37c0d5c8a1e";
    }

    public String getMediaId() {
        return o.sharedInstance().isUnlocked() ? "14" : DtbConstants.NETWORK_TYPE_LTE;
    }

    public int getNbGamesSinceRefuseClassement() {
        return this.f11960c.getInt("nbPartiesRefuse", 0);
    }

    public int getNbGamesSinceRefuseInscription() {
        return this.f11960c.getInt("nbPartiesRefuseInscription", 0);
    }

    public int getNbPartieAvantPremierLancementPubAudio() {
        return this.f11960c.getInt("nbPArtieAvantPremierLancement", 1);
    }

    public int getNbPartieReproposeInscriptionClassement() {
        return this.f11960c.getInt("nbPartieReproposeInscriptionClassement", 10);
    }

    public int getNbPartieSessionAvantLancementPubAudio() {
        return this.f11960c.getInt("nbPartieSessionAvantLancement", 3);
    }

    public int getOriginalMaxRanking() {
        return this.f11960c.getInt("original_max_ranking", 0);
    }

    public String getPartnerAuthKey(boolean z10) {
        switch (getPartnerId(z10)) {
            case 0:
                return "47b20bba74b3ecd6967fa6763d69be42";
            case 3:
                return "aad9dc3aaab05c61060907e91f2a0584";
            case 5:
                return "63648ce490abbc5fe9c8eb16c68476a1";
            case 135:
                return "dd63afc42d11ac826179e0fdb536b81c";
            case 138:
                return "6a868a796b56cb9a705fdf40bfacc46e";
            case 410:
            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                return "82de69085436aba8a6f6b37c0d5c8a1e";
            case 420:
            case 423:
            case 430:
            case 433:
            case 441:
            case 444:
                return "cd8e6509f3420878e18d75b9831b317f";
            case 424:
                return "d324e811f753a25a97768aa07f57a050";
            case 427:
                return "6059ebd3f98cd70234b36d80248ee180";
            case 440:
                return "28fb66a058e82e54553f982790164677";
            case 443:
                return "f53de731d6fb25dc62d3e0aa06bf341e";
            case 450:
                return "f773532bb2eeff3b666e818f148fd445";
            case 453:
                return "46f1ad5f1389fcbeb6e3abac276505c0";
            case 460:
                return "98109a23bd74b73d889f9aa7702aa5ef";
            case 463:
                return "60eb779a0ce53fe4414a63a5eddffa8f";
            case IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED /* 700 */:
                return "7df2228b6c65bd2e8e8c3005d0fdc169";
            case 914:
                return "29c0a0f11398be7d52f7ccd0975bdd92";
            case 1138:
                return "82e688fc32326999dc5c5ba23fbf00bf";
            default:
                return "";
        }
    }

    public int getPartnerId(boolean z10) {
        int i10 = o.sharedInstance().isPopularityLimited() ? 410 : !o.sharedInstance().isPopularityLimited() ? 430 : 0;
        return z10 ? i10 + 3 : i10;
    }

    public String getPhoneLang() {
        return this.f11960c.getString(Q6.f35290q, transFormLang(Locale.getDefault().getLanguage()));
    }

    public String getPseudoUser() {
        return this.f11960c.getString("userPseudo", null);
    }

    public int getShortMusic() {
        return this.f11960c.getInt("musicShort", 0);
    }

    public String getSliderDefault() {
        return this.f11960c.getString("sliderDefault", null);
    }

    public int getStatusAccount() {
        return this.f11960c.getInt("statusAccount", -1);
    }

    public String getUidUser() {
        return this.f11960c.getString("userId", "");
    }

    public int getUserChoice() {
        return this.f11960c.getInt("userChoice", -1);
    }

    public boolean hasAlreadyBeenBlockedInCurrentGame() {
        return this.f11960c.getBoolean("hasBeenAlreadyBlocked", false);
    }

    public boolean hasAlreadyChangeLangManually() {
        return this.f11960c.getBoolean("keyHasAlreadyChangeLang", false);
    }

    public boolean hasBeenForcedToDisconnect() {
        return this.f11960c.getBoolean("hasBeenForcedToDc", false);
    }

    public boolean hasDisplayedAlerteChild() {
        return this.f11960c.getBoolean("hasDisplayedAlertChild", false);
    }

    public boolean hasGivenConsent() {
        return this.f11960c.getBoolean("consentement", false);
    }

    public boolean hasGivenConsentForThisAccount() {
        return this.f11960c.getBoolean("hasGivenConsentForsThisAccount", false);
    }

    public boolean hasToDownloadFlagOnSplash() {
        return this.f11960c.getBoolean("keyDownloadFlag", true);
    }

    public void incNbGamesSinceRefuseClassement() {
        int nbGamesSinceRefuseClassement = getNbGamesSinceRefuseClassement() + 1;
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("nbPartiesRefuse", nbGamesSinceRefuseClassement);
        editor.commit();
    }

    public void incNbGamesSinceRefuseInscription() {
        int nbGamesSinceRefuseInscription = getNbGamesSinceRefuseInscription() + 1;
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("nbPartiesRefuseInscription", nbGamesSinceRefuseInscription);
        editor.commit();
    }

    public boolean isAddObjectEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableAddObject()) ? false : true;
    }

    public boolean isAddPhotoEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableAddPhoto()) ? false : true;
    }

    public boolean isAddQuestionEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableAddQuestion()) ? false : true;
    }

    public boolean isAdsEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableAds()) ? false : true;
    }

    public boolean isAkiAwardsEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableAkiAwards()) ? false : true;
    }

    public boolean isChildFilterEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableChildFilter()) ? false : true;
    }

    public boolean isChildProtectEnabled() {
        return this.f11960c.getBoolean("childprotect", false);
    }

    public boolean isComingFromPopupClassement() {
        return this.f11960c.getBoolean("isComingFromPopupClassement", false);
    }

    public boolean isComplementaryQuestionEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableComplementaryQuestion()) ? false : true;
    }

    public boolean isConsent1Enabled() {
        return this.f11960c.getBoolean("consent1", false);
    }

    public boolean isConsent2Enabled() {
        return this.f11960c.getBoolean("consent2", false);
    }

    public boolean isConsent3Enabled() {
        return this.f11960c.getBoolean("consent3", false);
    }

    public boolean isCountryAvailableForGdrp(String str) {
        return (str == null || str.isEmpty() || !this.f11959b.contains(str)) ? false : true;
    }

    public boolean isCustomizeAkinatorEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableCustomizeAkinator()) ? false : true;
    }

    public boolean isDailyChallengeEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableDailyChallenge()) ? false : true;
    }

    public boolean isDescriptionEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableDescription()) ? false : true;
    }

    public boolean isDeviceConnectedWithSpecialAccount() {
        return this.f11960c.getBoolean("isDeviceConnectedWithSpecialAccount", false);
    }

    public boolean isFirstConnexion() {
        return this.f11968k;
    }

    public boolean isFirstHomeCreate() {
        return this.f11960c.getBoolean("firsthomecreate", true);
    }

    public boolean isFirstLaunch() {
        return this.f11960c.getBoolean("firstLaunch", true);
    }

    public boolean isFirstNameDisplayedInHOF() {
        return this.f11960c.getBoolean("keyPublishedNameOneTime", false);
    }

    public boolean isFreemium() {
        return true;
    }

    public boolean isGSMConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) AkApplication.getAppContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) ? false : true;
    }

    public boolean isGameReportEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableGameReport()) ? false : true;
    }

    public boolean isHallOfFameEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableHallOfFame()) ? false : true;
    }

    public boolean isHomeBannerAvailable() {
        return this.f11960c.getBoolean("homebanner_available", false);
    }

    public boolean isHomeBannerOpened() {
        return this.f11960c.getBoolean("homebanner_state", true);
    }

    public boolean isMusicEnabled() {
        return this.f11960c.getBoolean("music", true);
    }

    public boolean isNameCorrectionEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableCorrectName()) ? false : true;
    }

    public boolean isNotifAsked() {
        return this.f11960c.getBoolean("isNotifAsked", false);
    }

    public boolean isOnline() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) AkApplication.getAppContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public boolean isPaid() {
        return false;
    }

    public boolean isPlayerTrappable() {
        return this.f11960c.getBoolean("isPlayerTrappable", false);
    }

    public boolean isPopularityCapEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisablePopularityCap()) ? false : true;
    }

    public boolean isPrio() {
        if (isPaid()) {
            return true;
        }
        if (isFreemium() && o.sharedInstance().isUnlocked()) {
            return true;
        }
        return isFreemium() && !o.sharedInstance().isPopularityLimited();
    }

    public boolean isRGPDCountry() {
        return this.f11959b.contains(Locale.getDefault().getCountry());
    }

    public boolean isSignalementDoublonsEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableSignalementDoublons()) ? false : true;
    }

    public boolean isSoundEnabled() {
        return this.f11960c.getBoolean("sound", true);
    }

    public boolean isSoundLikeAutoCompletionEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableSoundlikeCompletion()) ? false : true;
    }

    public boolean isTTSEnabled() {
        return this.f11960c.getBoolean("isTTSEnabled", false);
    }

    public boolean isTablet() {
        return this.f11960c.getBoolean("tablet", false);
    }

    public boolean isUserConnected() {
        return this.f11960c.getBoolean("isUserConnected", false);
    }

    public boolean isVoteForClassementEnabledForCurrentInstance() {
        return (getCurrentInstance() == null || getCurrentInstance().isDisableVoteClassement()) ? false : true;
    }

    public boolean isWifiConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) AkApplication.getAppContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public boolean mustDisplayDidacVote() {
        return this.f11960c.getBoolean("mustDisplayedDidac", true);
    }

    public boolean mustDisplayUpdateIcon() {
        SharedPreferences sharedPreferences = this.f11960c;
        if (sharedPreferences.getLong("lastpersofinddate", -1L) != -1) {
            return System.currentTimeMillis() - sharedPreferences.getLong("lastpersofinddate", -1L) <= 259200000 && this.f11964g;
        }
        boolean zIsAtLeastOnePersoFound = aa.f.sharedInstance().isAtLeastOnePersoFound(true);
        if (zIsAtLeastOnePersoFound) {
            updateLastDDJFound();
        }
        return zIsAtLeastOnePersoFound;
    }

    public boolean mustNotDisplayButtonInscriptionWithoutAcc() {
        return this.f11960c.getBoolean("mustNotDisplayButtonInscriptionWithoutAcc", false);
    }

    public boolean mustReinitNbSessions() {
        return this.f11960c.getBoolean("keyMustIncNbSession", true);
    }

    public void neverDisplayAlert() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("displayAlert", false);
        editor.commit();
    }

    public void notFirstHomeCreateAnymore() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("firsthomecreate", false);
        editor.commit();
    }

    public void setCanCheckFull(boolean z10) {
        this.f11967j = z10;
    }

    public void setCanPlay(int i10) {
        f11957m = i10;
    }

    public void setCanSendAnalytics(boolean z10) {
        this.f11966i = z10;
    }

    public void setChildProtectEnabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("childprotect", z10);
        editor.commit();
    }

    public void setCloth(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("question_cloth", str);
        editor.commit();
    }

    public void setCodeSubject(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("subjectid", str);
        editor.commit();
    }

    public void setCoeffAnimationSpeed(float f10) {
        this.f11961d.putFloat("coeffVitesseAnimations", f10);
    }

    public void setConsent(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("consentement", z10);
        editor.commit();
    }

    public void setCreatedDeviceRecord(String str) {
        if (this.f11960c.getString("createdDeviceRecord", "0").equals("0")) {
            SharedPreferences.Editor editor = this.f11961d;
            editor.putString("createdDeviceRecord", str);
            editor.commit();
        }
    }

    public void setCurrentLanguage(String str) {
        SharedPreferences.Editor editor = this.f11963f;
        editor.putString("gameLanguageId", str);
        editor.commit();
    }

    public void setCurrentSubject(int i10) {
        SharedPreferences.Editor editor = this.f11963f;
        editor.putInt("gameSubjectId", i10);
        editor.commit();
    }

    public void setDelaiTimerBanniereCom(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("delaitTimerBanniereCom", i10);
        editor.commit();
    }

    public void setDisplayUpdateIcon(boolean z10) {
        this.f11964g = z10;
    }

    public void setDisplayedAlertChild() {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("hasDisplayedAlertChild", true);
        editor.commit();
    }

    public void setDureeMaxSinceLastSession(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("dureeMaxDepuisDeniereSession", i10);
        editor.commit();
    }

    public void setFcmToken(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("fcmtoken", str);
        editor.commit();
    }

    public void setFirstLaunch(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("firstLaunch", z10);
        editor.commit();
    }

    public void setFirstLaunchDate(Date date) {
        this.f11958a = date;
    }

    public void setFirstNameDisplayedInHOF(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("keyPublishedNameOneTime", z10);
        editor.commit();
    }

    public void setHasAlreadyBeenBlockedInCurrentGame(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("hasBeenAlreadyBlocked", z10);
        editor.commit();
    }

    public void setHasBeenForcedToDisconnect(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("hasBeenForcedToDc", z10);
        editor.commit();
    }

    public void setHasGivenConsentForThisAccount(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("hasGivenConsentForsThisAccount", z10);
        editor.commit();
    }

    public void setHat(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("question_hat", str);
        editor.commit();
    }

    public void setHomeBannerAvailable(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("homebanner_available", z10);
        editor.commit();
    }

    public void setHomeBannerOpened(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("homebanner_state", z10);
        editor.commit();
    }

    public void setIsComingFromPopupClassement(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isComingFromPopupClassement", z10);
        editor.commit();
    }

    public void setIsConsent1Enabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("consent1", z10);
        editor.commit();
    }

    public void setIsConsent2Enabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("consent2", z10);
        editor.commit();
    }

    public void setIsConsent3Enabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("consent3", z10);
        editor.commit();
    }

    public void setIsDeviceConnectedWithSpecialAccount(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isDeviceConnectedWithSpecialAccount", z10);
        editor.commit();
    }

    public void setIsFirstConnexion(boolean z10) {
        this.f11968k = z10;
    }

    public void setIsTablet(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("tablet", z10);
        editor.commit();
    }

    public void setLimitAwardIdRare(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("limitAwardIdRare", i10);
        editor.commit();
    }

    public void setMusicEnabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("music", z10);
        editor.commit();
    }

    public void setMustNotDisplayButtonInscriptionWithoutAcc(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("mustNotDisplayButtonInscriptionWithoutAcc", z10);
        editor.commit();
    }

    public void setMustReinitNbSessions(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("keyMustIncNbSession", z10);
        editor.commit();
    }

    public void setNbPartieAvantPremierLancementPubAudio(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("nbPArtieAvantPremierLancement", i10);
        editor.commit();
    }

    public void setNbPartieReproposeInscriptionClassement(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("nbPartieReproposeInscriptionClassement", i10);
        editor.commit();
    }

    public void setNbPartieSessionAvantLancementPubAudio(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("nbPartieSessionAvantLancement", i10);
        editor.commit();
    }

    public void setNotifAsked(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isNotifAsked", z10);
        editor.commit();
    }

    public void setOriginalMaxRanking(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("original_max_ranking", i10);
        editor.commit();
    }

    public void setPhoneLang(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString(Q6.f35290q, str);
        editor.commit();
    }

    public void setPlayerTrappable(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isPlayerTrappable", z10);
        editor.commit();
    }

    public void setPseudoUser(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userPseudo", str);
        editor.commit();
    }

    public void setShortMusic(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("musicShort", i10);
        editor.commit();
    }

    public void setSliderDefault(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("sliderDefault", str);
        editor.commit();
    }

    public void setSoundEnabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("sound", z10);
        editor.commit();
    }

    public void setStatusAccount(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("statusAccount", i10);
        editor.commit();
    }

    public void setTTSEnabled(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isTTSEnabled", z10);
        editor.commit();
    }

    public void setUserConnectionStatus(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("isUserConnected", z10);
        editor.commit();
    }

    public void setUserId(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userId", str);
        editor.commit();
    }

    public void setUserKey(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userKey", str);
        editor.commit();
    }

    public void setUserMail(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userMail", str);
        editor.commit();
    }

    public void setUserPassword(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("userPassword", str);
        editor.commit();
    }

    public void setValuesFromCMDB(lb.a aVar) {
        int dureeMaxDepuisDernierePartieDansSession = aVar.getDureeMaxDepuisDernierePartieDansSession();
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("dureeMaxDepuisDeniereSession", dureeMaxDepuisDernierePartieDansSession);
        editor.putInt("nbPArtieAvantPremierLancement", aVar.getNbPartiesAvantPremierLancementPubAudio());
        editor.putInt("nbPartieSessionAvantLancement", aVar.getNbPartiesSessionAvantLancementPubAudio());
        editor.putInt("delaitTimerBanniereCom", aVar.getDelaiTimerBanniereCom());
        editor.putInt("nbPartieReproposeInscriptionClassement", aVar.getNbPartieReproposeInscriptionClassement());
        editor.putInt("limitAwardIdRare", aVar.getLimitAwardIdRare());
        editor.putBoolean("disponibiliteAccessoires", aVar.getDisponibiliteAccessoires());
        editor.putFloat("coeffVitesseAnimations", aVar.getCoeffAnimationSpeed());
        Timber.tag("CMDB").d("setValuesFromCMDB : " + aVar.getCoeffAnimationSpeed(), new Object[0]);
        editor.commit();
    }

    public void setVersionCode(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("keyversioncode", i10);
        editor.commit();
    }

    public void updateClassementCourantId(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("lastIdCourant", str);
        editor.commit();
    }

    public void updateCustomMaxRanking(int i10) {
        int customMaxRanking = getCustomMaxRanking();
        SharedPreferences.Editor editor = this.f11961d;
        if (customMaxRanking == 0) {
            editor.putInt("custom_max_ranking", getOriginalMaxRanking() + i10);
            editor.commit();
        } else {
            editor.putInt("custom_max_ranking", customMaxRanking + i10);
            editor.commit();
        }
    }

    public void updateLastClassementScore(String str) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putString("lastClassement", str);
        editor.commit();
    }

    public void updateLastDDJFound() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f11961d;
        editor.putLong("lastpersofinddate", jCurrentTimeMillis);
        editor.commit();
    }

    public void updateLastRvDay(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("lastRvDay", i10);
        editor.commit();
    }

    public void updateRgpdStatus(boolean z10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putBoolean("keyCanDisplayCookieAlert3", z10);
        editor.commit();
    }

    public void updateUserChoice(int i10) {
        SharedPreferences.Editor editor = this.f11961d;
        editor.putInt("userChoice", i10);
        editor.commit();
    }

    public String getPasswordUser() {
        return this.f11960c.getString(PcrIk.LtjOL, null);
    }

    public String getCloth() {
        if (!getDisponibiliteAccessoires()) {
            return "orient";
        }
        return this.f11960c.getString(QFzuMMDfrzagDN.IHY, "orient");
    }

    public void setNotifAsked() {
        setNotifAsked(true);
    }
}
