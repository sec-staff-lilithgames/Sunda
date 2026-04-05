package ta;

import com.amazon.device.ads.DtbConstants;
import hx.t;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import mt.n0;
import retrofit2.Call;
import retrofit2.Retrofit;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final d f86666a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public static String f86667b = a.b.l(DtbConstants.HTTP, g.f86657a.getADRESSE_CLASSEMENT(), ":18666/");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        @hx.f("get_classement_legendes.php")
        Call<c> getLegends(@t("basel_id") int i10, @t("device_uid") String str);

        @hx.f("get_classement_legendes.php")
        n0<c> getLegendsRx(@t("basel_id") int i10, @t("device_uid") String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f86668a;

        /* renamed from: b, reason: collision with root package name */
        public int f86669b;

        /* renamed from: c, reason: collision with root package name */
        public int f86670c;

        /* renamed from: d, reason: collision with root package name */
        public int f86671d;

        /* renamed from: e, reason: collision with root package name */
        public int f86672e;

        /* renamed from: f, reason: collision with root package name */
        public int f86673f;

        /* renamed from: g, reason: collision with root package name */
        public int f86674g;

        /* renamed from: h, reason: collision with root package name */
        public int f86675h;

        /* renamed from: i, reason: collision with root package name */
        public int f86676i;

        /* renamed from: j, reason: collision with root package name */
        public int f86677j;

        public final int getNbAwardsBlack() {
            return this.f86672e;
        }

        public final int getNbAwardsBronze() {
            return this.f86676i;
        }

        public final int getNbAwardsGold() {
            return this.f86674g;
        }

        public final int getNbAwardsPlatinum() {
            return this.f86673f;
        }

        public final int getNbAwardsSilver() {
            return this.f86675h;
        }

        public final int getNbTropheBronze() {
            return this.f86671d;
        }

        public final int getNbTropheDefi() {
            return this.f86677j;
        }

        public final int getNbTropheGold() {
            return this.f86669b;
        }

        public final int getNbTropheSilver() {
            return this.f86670c;
        }

        public final String getPseudo() {
            return this.f86668a;
        }

        public final void setNbAwardsBlack(int i10) {
            this.f86672e = i10;
        }

        public final void setNbAwardsBronze(int i10) {
            this.f86676i = i10;
        }

        public final void setNbAwardsGold(int i10) {
            this.f86674g = i10;
        }

        public final void setNbAwardsPlatinum(int i10) {
            this.f86673f = i10;
        }

        public final void setNbAwardsSilver(int i10) {
            this.f86675h = i10;
        }

        public final void setNbTropheBronze(int i10) {
            this.f86671d = i10;
        }

        public final void setNbTropheDefi(int i10) {
            this.f86677j = i10;
        }

        public final void setNbTropheGold(int i10) {
            this.f86669b = i10;
        }

        public final void setNbTropheSilver(int i10) {
            this.f86670c = i10;
        }

        public final void setPseudo(String str) {
            this.f86668a = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f86678a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f86679b;

        public final String getCompletion() {
            return this.f86678a;
        }

        public final ArrayList<b> getLegends() {
            return this.f86679b;
        }

        public final boolean isCompletionOk() {
            String str = this.f86678a;
            return str != null && str.equals("OK");
        }

        public final void setCompletion(String str) {
            this.f86678a = str;
        }

        public final void setLegends(ArrayList<b> arrayList) {
            this.f86679b = arrayList;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {
        public d(u uVar) {
        }

        public final a createLegendsAPI() throws SecurityException {
            Object objCreate = new Retrofit.Builder().baseUrl(getBASE_URL()).client(new l0()).addConverterFactory(gx.a.create()).build().create(a.class);
            e0.checkNotNullExpressionValue(objCreate, "create(...)");
            return (a) objCreate;
        }

        public final a createLegendsApiWithRxAndroid() {
            Object objCreate = new Retrofit.Builder().baseUrl(getBASE_URL()).client(new l0()).addConverterFactory(gx.a.create()).addCallAdapterFactory(fx.j.create()).build().create(a.class);
            e0.checkNotNullExpressionValue(objCreate, "create(...)");
            return (a) objCreate;
        }

        public final String getBASE_URL() {
            return k.f86667b;
        }

        public final void setBASE_URL(String str) {
            e0.checkNotNullParameter(str, "<set-?>");
            k.f86667b = str;
        }
    }
}
