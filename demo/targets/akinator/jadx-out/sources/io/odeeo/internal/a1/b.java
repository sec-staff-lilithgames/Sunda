package io.odeeo.internal.a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import io.odeeo.internal.d1.f;
import io.odeeo.internal.o1.e;
import io.odeeo.internal.o1.h;
import io.odeeo.internal.v1.d;
import io.odeeo.sdk.OdeeoSDK;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.d0;
import sv.n0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: j, reason: collision with root package name */
    public static final a f62542j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.u1.a f62543a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.d1.a f62544b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager f62545c;

    /* renamed from: d, reason: collision with root package name */
    public final e f62546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62547e;

    /* renamed from: f, reason: collision with root package name */
    public String f62548f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedPreferences f62549g;

    /* renamed from: h, reason: collision with root package name */
    public long f62550h;

    /* renamed from: i, reason: collision with root package name */
    public long f62551i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public b(io.odeeo.internal.u1.a infoManager, io.odeeo.internal.d1.a configManager, AudioManager audioManager, e eventPresenter, Context context) {
        e0.checkNotNullParameter(infoManager, "infoManager");
        e0.checkNotNullParameter(configManager, "configManager");
        e0.checkNotNullParameter(audioManager, "audioManager");
        e0.checkNotNullParameter(eventPresenter, "eventPresenter");
        e0.checkNotNullParameter(context, "context");
        this.f62543a = infoManager;
        this.f62544b = configManager;
        this.f62545c = audioManager;
        this.f62546d = eventPresenter;
        this.f62548f = "";
        SharedPreferences sharedPreferences = context.getSharedPreferences("io.odeeo.sdk.session.key", 0);
        e0.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        this.f62549g = sharedPreferences;
        this.f62550h = SystemClock.elapsedRealtime();
        this.f62551i = System.currentTimeMillis();
    }

    public static /* synthetic */ void sendSessionEvent$odeeoSdk_release$default(b bVar, String str, Double d10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSessionEvent");
        }
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        bVar.sendSessionEvent$odeeoSdk_release(str, d10);
    }

    public final long a() {
        return this.f62549g.getLong("sessionInactiveStartTime", 0L);
    }

    public final long b() {
        return this.f62549g.getLong("sessionInactiveStartUnixEpochTime", 0L);
    }

    public final LocalDateTime c(long j10) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j10), ZoneId.systemDefault());
        e0.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(\n        Insta…eId.systemDefault()\n    )");
        return localDateTimeOfInstant;
    }

    public final String d(long j10) {
        if (j10 == 0) {
            return "-";
        }
        String str = c(j10).format(DateTimeFormatter.ofPattern("MMMM dd HH:mm", Locale.ENGLISH));
        e0.checkNotNullExpressionValue(str, "time.format(formatter)");
        return str;
    }

    public String generateSessionId$odeeoSdk_release() {
        return i.c("randomUUID().toString()");
    }

    public final io.odeeo.internal.d1.a getConfigManager$odeeoSdk_release() {
        return this.f62544b;
    }

    public long getCurrentTime$odeeoSdk_release() {
        return SystemClock.elapsedRealtime();
    }

    public final io.odeeo.internal.u1.a getInfoManager$odeeoSdk_release() {
        return this.f62543a;
    }

    public final long getSessionActiveStartTime$odeeoSdk_release() {
        return this.f62550h;
    }

    public final long getSessionActiveStartUnixEpochTime$odeeoSdk_release() {
        return this.f62551i;
    }

    public final String getSessionID$odeeoSdk_release() {
        String string;
        SharedPreferences sharedPreferences = this.f62549g;
        return (sharedPreferences == null || (string = sharedPreferences.getString("sessionID", "")) == null) ? "" : string;
    }

    public final long getSessionLengthMillis$odeeoSdk_release() {
        return this.f62549g.getLong("sessionLengthMillis", 0L);
    }

    public final boolean getWasMinimumVolumeLevelSetByUserInCurrentSession() {
        return this.f62547e;
    }

    public void pause() {
        a(getCurrentTime$odeeoSdk_release());
        b(System.currentTimeMillis());
        if (a() == 0) {
            a(this.f62550h);
            b(this.f62551i);
        }
        setSessionLengthMillis$odeeoSdk_release((a() - this.f62550h) + getSessionLengthMillis$odeeoSdk_release());
        io.odeeo.internal.b2.a.d("SessionManager pause " + this + AbstractJsonLexerKt.END_OBJ, new Object[0]);
    }

    public void resume() {
        long currentTime$odeeoSdk_release = getCurrentTime$odeeoSdk_release();
        this.f62550h = currentTime$odeeoSdk_release;
        this.f62551i = System.currentTimeMillis();
        if ((currentTime$odeeoSdk_release - a()) / 1000 >= OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getSessionTimeout()) {
            sessionEnd$odeeoSdk_release();
            sessionStart();
        }
        io.odeeo.internal.b2.a.d("SessionManager resume " + this + AbstractJsonLexerKt.END_OBJ, new Object[0]);
    }

    public void sendSessionEvent$odeeoSdk_release(String eventId, Double d10) {
        Integer numValueOf;
        e0.checkNotNullParameter(eventId, "eventId");
        e eVar = this.f62546d;
        String str = this.f62548f;
        String sessionID$odeeoSdk_release = getSessionID$odeeoSdk_release();
        String odeeoSDKIdentifier$odeeoSdk_release = this.f62543a.getOdeeoSDKIdentifier$odeeoSdk_release();
        String applicationID$odeeoSdk_release = this.f62543a.getApplicationID$odeeoSdk_release();
        String engineName = f.f63660a.getEngineName();
        Long lValueOf = Long.valueOf(d.f67273a.getDeviceTime());
        if (d10 == null) {
            numValueOf = null;
        } else {
            double dDoubleValue = d10.doubleValue();
            Number numberValueOf = Double.valueOf(dDoubleValue);
            if (dDoubleValue <= 0.0d) {
                numberValueOf = null;
            }
            if (numberValueOf == null) {
                numberValueOf = 1;
            }
            numValueOf = Integer.valueOf(numberValueOf.intValue());
        }
        e.sendSessionEvent$default(eVar, str, new h(eventId, sessionID$odeeoSdk_release, odeeoSDKIdentifier$odeeoSdk_release, applicationID$odeeoSdk_release, OdeeoSDK.SDK_VERSION, engineName, "android", lValueOf, numValueOf, Float.valueOf(io.odeeo.internal.v1.h.roundTwo(io.odeeo.internal.v1.b.getDeviceVolumePercent$default(this.f62545c, 0, 1, null)))), null, 4, null);
    }

    public void sessionEnd$odeeoSdk_release() {
        sendSessionEvent$odeeoSdk_release("internalSessionEnd", Double.valueOf(Math.ceil(getSessionLengthMillis$odeeoSdk_release() / 1000.0d)));
        a(0L);
        b(0L);
        setSessionID$odeeoSdk_release("");
        this.f62547e = false;
        io.odeeo.internal.b2.a.d("SessionManager sessionEnd " + this + AbstractJsonLexerKt.END_OBJ, new Object[0]);
    }

    public void sessionStart() {
        io.odeeo.internal.b2.a.d("SessionManager sessionStart", new Object[0]);
        if (!n0.isBlank(getSessionID$odeeoSdk_release())) {
            sessionEnd$odeeoSdk_release();
        }
        setSessionLengthMillis$odeeoSdk_release(0L);
        this.f62550h = getCurrentTime$odeeoSdk_release();
        setSessionID$odeeoSdk_release(generateSessionId$odeeoSdk_release());
        this.f62547e = false;
        sendSessionEvent$odeeoSdk_release$default(this, "internalSessionStart", null, 2, null);
        io.odeeo.internal.d1.a.fetchAppConfig$default(this.f62544b, null, 1, null);
        io.odeeo.internal.b2.a.d("SessionManager sessionStart " + this + AbstractJsonLexerKt.END_OBJ, new Object[0]);
    }

    public final void setSessionActiveStartTime$odeeoSdk_release(long j10) {
        this.f62550h = j10;
    }

    public final void setSessionActiveStartUnixEpochTime$odeeoSdk_release(long j10) {
        this.f62551i = j10;
    }

    public final void setSessionID$odeeoSdk_release(String value) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        e0.checkNotNullParameter(value, "value");
        SharedPreferences sharedPreferences = this.f62549g;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutString = editorEdit.putString("sessionID", value)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public final void setSessionLengthMillis$odeeoSdk_release(long j10) {
        this.f62549g.edit().putLong("sessionLengthMillis", j10).apply();
    }

    public final void setTrackingEventURL(String str) {
        this.f62548f = str;
    }

    public final void setWasMinimumVolumeLevelSetByUserInCurrentSession(boolean z10) {
        this.f62547e = z10;
    }

    public String toString() {
        if (Build.VERSION.SDK_INT < 26) {
            return "==============\nSessionManager\nTODO(\"VERSION.SDK_INT < O (26)\")";
        }
        StringBuilder sb2 = new StringBuilder("\n             |==============\n             | SessionManager\n             | trackingEventURL         ::: ");
        sb2.append((Object) this.f62548f);
        sb2.append("\n             | sessionID                ::: ");
        sb2.append(getSessionID$odeeoSdk_release());
        sb2.append("\n             | sessionInactiveStartTime ::: ");
        sb2.append(d(b()));
        sb2.append("\n             | sessionInactiveStartTime ::: ");
        sb2.append(b());
        sb2.append("\n             | sessionLengthMillis      ::: ");
        sb2.append(getSessionLengthMillis$odeeoSdk_release());
        sb2.append("\n             | sessionActiveStartTime   ::: ");
        sb2.append(d(this.f62551i));
        sb2.append("\n             | sessionActiveStartTime   ::: ");
        return d0.trimMargin$default(a.b.g(this.f62551i, "\n             |\n        ", sb2), null, 1, null);
    }

    public final void a(long j10) {
        this.f62549g.edit().putLong("sessionInactiveStartTime", j10).apply();
    }

    public final void b(long j10) {
        this.f62549g.edit().putLong("sessionInactiveStartUnixEpochTime", j10).apply();
    }
}
