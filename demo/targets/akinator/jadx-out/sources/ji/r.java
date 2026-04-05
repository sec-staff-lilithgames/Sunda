package ji;

import androidx.core.app.NotificationCompat;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ui.a f69613a = new wi.e().configureWith(b.f69576a).build();

    public static r create(String str, String str2, String str3, String str4, long j10) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
        }
        return new c(str, str2, str3, str4, j10);
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public f2.e.d.AbstractC0731e toReportProto() {
        return f2.e.d.AbstractC0731e.builder().setRolloutVariant(f2.e.d.AbstractC0731e.b.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }
}
