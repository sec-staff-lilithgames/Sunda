package com.vungle.ads.internal.session;

import android.util.Pair;
import ca.m;
import ca.o;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.InscriptionActivity;
import com.digidust.elokence.akinator.activities.ModifyPasswordAfterResetActivity;
import com.digidust.elokence.akinator.activities.ModifyProfileActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.ActivityInscriptionBinding;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.f;
import hi.a0;
import hi.u;
import hi.z;
import ii.g;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.e0;
import l6.d1;
import l6.y;
import lb.c;
import o5.s0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import timber.log.Timber;
import tj.e;
import tj.h;
import w6.i;
import w6.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50780c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f50779b = i10;
        this.f50780c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws h, NoSuchAlgorithmException {
        String upperCase;
        int iLoginUser;
        boolean z10 = false;
        ActivityInscriptionBinding activityInscriptionBinding = null;
        switch (this.f50779b) {
            case 0:
                return UnclosedAdDetector.m3641readUnclosedAdFromFile$lambda4((UnclosedAdDetector) this.f50780c);
            case 1:
                u uVar = ((z) this.f50780c).f58920h;
                uVar.getClass();
                g.checkBackgroundThread();
                a0 a0Var = uVar.f58883c;
                if (!a0Var.isPresent()) {
                    String strF = uVar.f();
                    if (strF != null && uVar.f58890j.hasCrashDataForSession(strF)) {
                    }
                    return Boolean.valueOf(z10);
                }
                f.getLogger().v("Found previous crash marker.");
                a0Var.remove();
                z10 = true;
                return Boolean.valueOf(z10);
            case 2:
                return new y((JsReplyProxyBoundaryInterface) this.f50780c);
            case 3:
                return new d1((WebViewRendererBoundaryInterface) this.f50780c);
            case 4:
                return ((nj.h) this.f50780c).f76921d;
            case 5:
                ((TaskCompletionSource) this.f50780c).setResult(null);
                return null;
            case 6:
                CompteActivity compteActivity = (CompteActivity) this.f50780c;
                int i10 = CompteActivity.R;
                compteActivity.getClass();
                return Integer.valueOf(o.sharedInstance().updateUsername(compteActivity.H.getText().toString().toUpperCase(), m.sharedInstance().getKeyUser()));
            case 7:
                return Integer.valueOf(o.sharedInstance().resetPassword((String) this.f50780c));
            case 8:
                DefiDuJourActivity defiDuJourActivity = (DefiDuJourActivity) this.f50780c;
                int[] iArr = DefiDuJourActivity.P;
                defiDuJourActivity.getClass();
                defiDuJourActivity.L = ((AccountDatabase) s0.databaseBuilder(AkApplication.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build()).getDao().getTrouveInfosForSpecificThemeLang(m.sharedInstance().getCurrentSubject() + "_" + m.sharedInstance().getCurrentLanguage());
                return 0;
            case 9:
                InscriptionActivity inscriptionActivity = (InscriptionActivity) this.f50780c;
                int i11 = InscriptionActivity.J;
                o oVarSharedInstance = o.sharedInstance();
                c currentInstance = m.sharedInstance().getCurrentInstance();
                e0.checkNotNull(currentInstance);
                String strValueOf = String.valueOf(currentInstance.getBaseLogiqueId());
                if (inscriptionActivity.C) {
                    upperCase = m.sharedInstance().getPseudoUser();
                } else {
                    ActivityInscriptionBinding activityInscriptionBinding2 = inscriptionActivity.F;
                    if (activityInscriptionBinding2 == null) {
                        e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding2 = null;
                    }
                    String string = activityInscriptionBinding2.nameEditText.getText().toString();
                    Locale locale = Locale.getDefault();
                    e0.checkNotNullExpressionValue(locale, "getDefault(...)");
                    upperCase = string.toUpperCase(locale);
                    e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                }
                ActivityInscriptionBinding activityInscriptionBinding3 = inscriptionActivity.F;
                if (activityInscriptionBinding3 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    activityInscriptionBinding3 = null;
                }
                String string2 = activityInscriptionBinding3.passwordEditText.getText().toString();
                ActivityInscriptionBinding activityInscriptionBinding4 = inscriptionActivity.F;
                if (activityInscriptionBinding4 == null) {
                    e0.throwUninitializedPropertyAccessException("binding");
                    activityInscriptionBinding4 = null;
                }
                int iRegisterUser = oVarSharedInstance.registerUser(strValueOf, upperCase, string2, activityInscriptionBinding4.emailEditText.getText().toString());
                Timber.Forest forest = Timber.Forest;
                forest.d("Result1 : %s", Integer.valueOf(iRegisterUser));
                if (iRegisterUser == 0) {
                    forest.d("Result1 OK", new Object[0]);
                    o oVarSharedInstance2 = o.sharedInstance();
                    ActivityInscriptionBinding activityInscriptionBinding5 = inscriptionActivity.F;
                    if (activityInscriptionBinding5 == null) {
                        e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding5 = null;
                    }
                    String string3 = activityInscriptionBinding5.emailEditText.getText().toString();
                    ActivityInscriptionBinding activityInscriptionBinding6 = inscriptionActivity.F;
                    if (activityInscriptionBinding6 == null) {
                        e0.throwUninitializedPropertyAccessException("binding");
                        activityInscriptionBinding6 = null;
                    }
                    iLoginUser = oVarSharedInstance2.loginUser(string3, activityInscriptionBinding6.passwordEditText.getText().toString(), true);
                    forest.d("Result2 : %s", Integer.valueOf(iLoginUser));
                    if (iLoginUser == 0) {
                        iLoginUser = o.sharedInstance().getGlobalUserInfos(m.sharedInstance().getUidUser());
                        if (iLoginUser == 0) {
                            m.sharedInstance().setUserConnectionStatus(true);
                            m mVarSharedInstance = m.sharedInstance();
                            ActivityInscriptionBinding activityInscriptionBinding7 = inscriptionActivity.F;
                            if (activityInscriptionBinding7 == null) {
                                e0.throwUninitializedPropertyAccessException("binding");
                            } else {
                                activityInscriptionBinding = activityInscriptionBinding7;
                            }
                            mVarSharedInstance.setUserMail(activityInscriptionBinding.emailEditText.getText().toString());
                        }
                        forest.d("Result2 apres : %s", Integer.valueOf(iLoginUser));
                    }
                } else {
                    iLoginUser = -3;
                }
                return new Pair(Integer.valueOf(iRegisterUser), Integer.valueOf(iLoginUser));
            case 10:
                ModifyPasswordAfterResetActivity modifyPasswordAfterResetActivity = (ModifyPasswordAfterResetActivity) this.f50780c;
                int i12 = ModifyPasswordAfterResetActivity.M;
                modifyPasswordAfterResetActivity.getClass();
                return Integer.valueOf(o.sharedInstance().newPasswordAfterReset(modifyPasswordAfterResetActivity.F.getText().toString(), modifyPasswordAfterResetActivity.I));
            case 11:
                ModifyProfileActivity modifyProfileActivity = (ModifyProfileActivity) this.f50780c;
                int i13 = ModifyProfileActivity.Q;
                modifyProfileActivity.getClass();
                return Integer.valueOf(o.sharedInstance().updateEmailOrPassword(m.sharedInstance().getKeyUser(), modifyProfileActivity.G.getText().toString(), modifyProfileActivity.H.getText().toString(), modifyProfileActivity.K));
            case 12:
                pi.g gVar = ((pi.f) this.f50780c).f81397c;
                return gVar.f81403f.invoke(gVar.f81399b, true);
            case 13:
                e eVar = (e) this.f50780c;
                synchronized (eVar) {
                    eVar.f86939j = null;
                }
                vj.f fVarC = eVar.c();
                if (fVarC.isRegistered()) {
                    eVar.f86931b.deleteFirebaseInstallation(eVar.f86930a.getOptions().getApiKey(), fVarC.getFirebaseInstallationId(), eVar.f86930a.getOptions().getProjectId(), fVarC.getRefreshToken());
                }
                eVar.d(fVarC.withNoGeneratedFid());
                return null;
            default:
                return Integer.valueOf(j.access$nextId(((i) this.f50780c).f90419a, "next_alarm_manager_id"));
        }
    }
}
