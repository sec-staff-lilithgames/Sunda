package ca;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f12000e = {"orient", "japon", "farwest", "marin", "halloween"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f12001f = {"turban", "rap", "scuba", "chevalier", "elvis", "cowboy", "mexicain", "disco", "indien", "punk", "pirate"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f12002g = {"orient", "yukata", "rap", "chevalier", "scuba", "mexicain", "cowboy", "disco", "catcheur", "indien", "dracula", "superheros", "pirate"};

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f12003h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public static r f12004i = null;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12005a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f12006b;

    /* renamed from: c, reason: collision with root package name */
    public int f12007c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f12008d = new HashSet();

    public r() {
        SharedPreferences sharedPreferences = AkApplication.getAppContext().getSharedPreferences("bank", 0);
        this.f12005a = sharedPreferences;
        this.f12006b = sharedPreferences.edit();
    }

    public static String getBackgroundName(int i10) {
        if (i10 < 0 || i10 > getNbHats()) {
            return null;
        }
        return f12000e[i10];
    }

    public static String getClothName(int i10) {
        if (i10 < 0 || i10 > getNbCloths()) {
            return null;
        }
        return f12002g[i10];
    }

    public static String getHatName(int i10) {
        if (i10 < 0 || i10 > getNbHats()) {
            return null;
        }
        return f12001f[i10];
    }

    public static int getNbCloths() {
        return 13;
    }

    public static int getNbHats() {
        return 11;
    }

    public static r sharedInstance() {
        if (f12004i == null) {
            f12004i = new r();
        }
        return f12004i;
    }

    public final void a(int i10) {
        ArrayList arrayList;
        synchronized (this.f12008d) {
            arrayList = new ArrayList(this.f12008d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).onGenizAwarded(i10);
        }
    }

    public void addListener(q qVar) {
        synchronized (this.f12008d) {
            this.f12008d.add(qVar);
        }
    }

    public void addToSetIdUnlocked(String str) {
        f12003h.add(str);
    }

    public boolean canDisplayScreenShopAfterGameOver() {
        return this.f12005a.getBoolean("canDisplayShopAfterGameOver", true);
    }

    public void clearIdSet() {
        f12003h.clear();
    }

    public boolean depositGeniz(int i10) {
        return depositGeniz(i10, true);
    }

    public boolean depositGenizWithoutNotif(int i10) {
        return depositGeniz(i10, false);
    }

    public void doNotDisplayScreenShopAnymore() {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putBoolean("canDisplayShopAfterGameOver", false);
        editor.commit();
    }

    public int getCurrentClothIndex() {
        return this.f12005a.getInt("clothIndex", 0);
    }

    public int getCurrentHatIndex() {
        return this.f12005a.getInt("hatIndex", 0);
    }

    public int getGenizBalance() {
        return this.f12005a.getInt("akbankbalance", 0);
    }

    public int getGenizBalanceAccount() {
        return this.f12005a.getInt("akbankbalanceaccount", 0);
    }

    public String getIdJoueur() {
        return this.f12005a.getString("joueurId", "none");
    }

    public String getIdJoueurAccount() {
        return this.f12005a.getString("joueurIdAccount", "none");
    }

    public int getNbPopuUnlocked() {
        return this.f12005a.getInt("nbPopuUnlocked", 0);
    }

    public String getNomJoueur() {
        return this.f12005a.getString("nomJoueur", null);
    }

    public boolean hasAlreadyUsedFreeUnlock() {
        return this.f12005a.getBoolean("hasAlreadyUsedFreeUnlock", false);
    }

    public void incNbPopuUnlocked() {
        int nbPopuUnlocked = getNbPopuUnlocked() + 1;
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("nbPopuUnlocked", nbPopuUnlocked);
        editor.commit();
    }

    public boolean isIdAlreadyUnlocked(String str) {
        return f12003h.contains(str);
    }

    public boolean isItemBought(String str, String str2) {
        return this.f12005a.getBoolean(str + "_" + str2, false);
    }

    public void removeListener(q qVar) {
        synchronized (this.f12008d) {
            this.f12008d.remove(qVar);
        }
    }

    public void setCurrentClothIndex(int i10) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("clothIndex", i10);
        editor.commit();
    }

    public void setCurrentHatIndex(int i10) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("hatIndex", i10);
        editor.commit();
    }

    public void setGenizBalance(int i10) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("akbankbalance", i10);
        editor.commit();
    }

    public void setGenizBalanceAccount(int i10) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("akbankbalanceaccount", i10);
        editor.commit();
    }

    public void setHasAlreadyUsedFreeUnlock(boolean z10) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putBoolean("hasAlreadyUsedFreeUnlock", z10);
        editor.commit();
    }

    public void setIdJoueur(String str) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putString("joueurId", str);
        editor.commit();
    }

    public void setIdJoueurAccount(String str) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putString("joueurIdAccount", str);
        editor.commit();
    }

    public void setItemBought(String str, String str2) {
        SharedPreferences.Editor editor = this.f12006b;
        editor.putBoolean(str + "_" + str2, true);
        editor.commit();
    }

    public void setItemsBought(Collection<Pair<String, String>> collection) {
        collection.forEach(new p(this, 0));
        this.f12006b.commit();
    }

    public void setNomJoueur(String str) {
        ArrayList arrayList;
        this.f12006b.putString("nomJoueur", str);
        this.f12006b.commit();
        synchronized (this.f12008d) {
            arrayList = new ArrayList(this.f12008d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).onPseudoChange(str);
        }
    }

    public boolean withdrawGeniz(int i10) {
        int genizBalance;
        if (i10 <= 0 || (genizBalance = getGenizBalance() - i10) < 0) {
            return false;
        }
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("akbankbalance", genizBalance);
        editor.commit();
        a(-i10);
        return true;
    }

    public boolean depositGeniz(int i10, boolean z10) {
        if (i10 <= 0) {
            return false;
        }
        int genizBalance = getGenizBalance() + i10;
        SharedPreferences.Editor editor = this.f12006b;
        editor.putInt("akbankbalance", genizBalance);
        editor.commit();
        if (z10) {
            Context appContext = AkApplication.getAppContext();
            String strReplace = b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "" + i10);
            NotificationManager notificationManager = (NotificationManager) appContext.getSystemService("notification");
            NotificationCompat.d sound = new NotificationCompat.d(appContext, "geniz").setSmallIcon(R.drawable.ak_tete_akinator).setContentTitle(" ").setContentText(strReplace).setTicker(strReplace).setWhen(System.currentTimeMillis()).setSound(RingtoneManager.getDefaultUri(2));
            int i11 = this.f12007c;
            this.f12007c = i11 + 1;
            notificationManager.notify(i11, sound.build());
        }
        a(i10);
        return true;
    }
}
