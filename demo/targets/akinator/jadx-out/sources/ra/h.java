package ra;

import bj.v0;
import ca.r;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import f.j0;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mt.b0;
import o5.s0;
import o9.x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f84068k = 0;

    public h(String userId, String baseId, String langue, int i10) {
        e0.checkNotNullParameter(userId, "userId");
        e0.checkNotNullParameter(baseId, "baseId");
        e0.checkNotNullParameter(langue, "langue");
        addParameter("user_id", userId);
        addParameter("base_logique_id", baseId);
        addParameter("theme_id", String.valueOf(i10));
        addParameter("langue", langue);
        StringBuilder sb2 = new StringBuilder("users/");
        sb2.append(userId);
        com.google.android.gms.internal.play_billing.a.B(sb2, "/", baseId, "/", langue);
        sb2.append("/infos.json");
        this.f84065i = sb2.toString();
    }

    public static void b() {
        b0.fromCallable(new x(13)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new v0(new j0(17), 27));
    }

    @Override // ra.b
    public final void a(JSONObject obj) throws JSONException {
        e0.checkNotNullParameter(obj, "obj");
        try {
            if (!e0.areEqual(obj.getJSONObject("parameters").getString("infos"), AbstractJsonLexerKt.NULL) && !e0.areEqual(obj.getJSONObject("parameters").getString("infos"), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                String string = obj.getJSONObject("parameters").getString("infos");
                e0.checkNotNullExpressionValue(string, "getString(...)");
                if (string.length() != 0) {
                    getInfoNotNull(obj);
                    return;
                }
            }
            b();
        } catch (JSONException e10) {
            if (!e0.areEqual(e10.getMessage(), "No value for infos")) {
                throw new JSONException("Error when parsing json");
            }
            b();
        }
    }

    public final void getInfoNotNull(JSONObject object) throws JSONException {
        e0.checkNotNullParameter(object, "object");
        AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
        JSONObject jSONObject = object.getJSONObject("parameters").getJSONObject("infos");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject.get(next) instanceof JSONObject) {
                if (e0.areEqual(next, "list_persos_played_jackpot")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("list_persos_played_jackpot");
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        Iterator<ba.a> it = accountDatabase.getDao().getAllAwardsForSpecificBaseLogique(ca.m.sharedInstance().getCurrentSubject(), ca.m.sharedInstance().getCurrentLanguage()).iterator();
                        while (it.hasNext()) {
                            if (!e0.areEqual(next2, it.next().getId()) && (jSONObject2.get(next2) instanceof JSONObject)) {
                                ba.a aVar = new ba.a();
                                String string = jSONObject2.getJSONObject(next2).getString("nom");
                                String string2 = jSONObject2.getJSONObject(next2).getString("type_award");
                                aVar.setName(string);
                                aVar.setType(string2);
                                aVar.setId(next2);
                                aVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
                                aVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
                                accountDatabase.getDao().insertAwardsInDB(aVar);
                            }
                        }
                    }
                }
            } else if ((jSONObject.get(next) instanceof Integer) && e0.areEqual(next, "geniz")) {
                String string3 = jSONObject.getString("geniz");
                r rVarSharedInstance = r.sharedInstance();
                e0.checkNotNull(string3);
                rVarSharedInstance.setGenizBalanceAccount(Integer.parseInt(string3));
            }
        }
    }
}
