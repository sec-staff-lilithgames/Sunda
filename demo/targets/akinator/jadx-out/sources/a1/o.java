package a1;

import android.content.res.Resources;
import android.util.Log;
import b1.y;
import com.ironsource.Q6;
import com.moloco.sdk.internal.publisher.nativead.ui.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import e2.u0;
import f.x;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.UserAgent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.JsonBuilder;
import tu.x0;
import u5.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3413b;

    public /* synthetic */ o(int i10) {
        this.f3413b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        String text = null;
        switch (this.f3413b) {
            case 0:
                return obj;
            case 1:
                int i10 = b1.c.f8578p;
                synchronized (y.getLock()) {
                    List list = y.f8710i;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((kv.l) list.get(i11)).invoke(obj);
                    }
                }
                return x0.f87415a;
            case 2:
                o oVar = y.f8702a;
                return x0.f87415a;
            case 3:
                dVarPrepare = ((x5.b) obj).prepare("SELECT * FROM AccountNbAwards");
                try {
                    int columnIndexOrThrow = s.getColumnIndexOrThrow(dVarPrepare, "idThemeLangLevel");
                    int columnIndexOrThrow2 = s.getColumnIndexOrThrow(dVarPrepare, "nb");
                    int columnIndexOrThrow3 = s.getColumnIndexOrThrow(dVarPrepare, "theme_id");
                    int columnIndexOrThrow4 = s.getColumnIndexOrThrow(dVarPrepare, Q6.f35290q);
                    int columnIndexOrThrow5 = s.getColumnIndexOrThrow(dVarPrepare, "type_award");
                    if (dVarPrepare.step()) {
                        ba.m mVar = new ba.m();
                        mVar.setIdThemeLangLevel(dVarPrepare.isNull(columnIndexOrThrow) ? null : dVarPrepare.getText(columnIndexOrThrow));
                        mVar.setNb(dVarPrepare.isNull(columnIndexOrThrow2) ? null : dVarPrepare.getText(columnIndexOrThrow2));
                        mVar.setThemeId(dVarPrepare.isNull(columnIndexOrThrow3) ? null : dVarPrepare.getText(columnIndexOrThrow3));
                        mVar.setLang(dVarPrepare.isNull(columnIndexOrThrow4) ? null : dVarPrepare.getText(columnIndexOrThrow4));
                        if (!dVarPrepare.isNull(columnIndexOrThrow5)) {
                            text = dVarPrepare.getText(columnIndexOrThrow5);
                        }
                        mVar.setTypeAward(text);
                        text = mVar;
                    }
                    return text;
                } finally {
                }
            case 4:
                dVarPrepare = ((x5.b) obj).prepare("SELECT * FROM AccountAwards");
                try {
                    int columnIndexOrThrow6 = s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow7 = s.getColumnIndexOrThrow(dVarPrepare, "name");
                    int columnIndexOrThrow8 = s.getColumnIndexOrThrow(dVarPrepare, "type");
                    int columnIndexOrThrow9 = s.getColumnIndexOrThrow(dVarPrepare, "theme_id");
                    int columnIndexOrThrow10 = s.getColumnIndexOrThrow(dVarPrepare, Q6.f35290q);
                    int columnIndexOrThrow11 = s.getColumnIndexOrThrow(dVarPrepare, "description");
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        ba.a aVar = new ba.a();
                        aVar.setId(dVarPrepare.isNull(columnIndexOrThrow6) ? null : dVarPrepare.getText(columnIndexOrThrow6));
                        aVar.setName(dVarPrepare.isNull(columnIndexOrThrow7) ? null : dVarPrepare.getText(columnIndexOrThrow7));
                        aVar.setType(dVarPrepare.isNull(columnIndexOrThrow8) ? null : dVarPrepare.getText(columnIndexOrThrow8));
                        aVar.setThemeId(dVarPrepare.isNull(columnIndexOrThrow9) ? null : dVarPrepare.getText(columnIndexOrThrow9));
                        aVar.setLang(dVarPrepare.isNull(columnIndexOrThrow10) ? null : dVarPrepare.getText(columnIndexOrThrow10));
                        aVar.setDescription(dVarPrepare.isNull(columnIndexOrThrow11) ? null : dVarPrepare.getText(columnIndexOrThrow11));
                        arrayList.add(aVar);
                    }
                    return arrayList;
                } finally {
                }
            case 5:
                return com.moloco.sdk.acm.http.d.a((HttpClientConfig) obj);
            case 6:
                return com.moloco.sdk.internal.http.b.a((UserAgent.Config) obj);
            case 7:
                return com.moloco.sdk.internal.publisher.e.a((com.moloco.sdk.internal.ortb.model.p) obj);
            case 8:
                return com.moloco.sdk.internal.publisher.h.a((com.moloco.sdk.internal.ortb.model.p) obj);
            case 9:
                return a.C0382a.a("playback_control_button", (u0) obj);
            case 10:
                return com.moloco.sdk.internal.r.a((JsonBuilder) obj);
            case 11:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d.a("Watermark Overlay", (u0) obj);
            case 12:
                return Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i.b((File) obj));
            case 13:
                return MraidActivity.c.a((a.c) obj);
            case 14:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            case 15:
                return FullscreenWebviewActivity.a((x) obj);
            case 16:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a("Ad Badge", (u0) obj);
            case 17:
                return s.a.a((String) obj);
            case 18:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a("rewarded_countdown_timer", (u0) obj);
            case 19:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.b("rewarded_countdown_timer_custom", (u0) obj);
            case 20:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.h.a("custom_countdown_timer_text", (u0) obj);
            case 21:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.h.b("custom_timer_container", (u0) obj);
            case 22:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l.a("timer_container", (u0) obj);
            case 23:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l.b("countdown_timer_text", (u0) obj);
            case 24:
                return Boolean.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a((a0) obj));
            case 25:
                return x.f.a.a("mute_button", (u0) obj);
            case 26:
                return p.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj);
            case 27:
                k4.e ex2 = (k4.e) obj;
                e0.checkNotNullParameter(ex2, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex2);
                return ik.n.f59708a.getDefaultValue();
            case 28:
                e0.checkNotNullParameter((Resources) obj, "<unused var>");
                return Boolean.FALSE;
            default:
                e0.checkNotNullParameter((Resources) obj, "<unused var>");
                return Boolean.TRUE;
        }
    }
}
