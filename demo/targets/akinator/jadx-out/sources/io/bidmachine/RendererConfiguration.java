package io.bidmachine;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RendererConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String GOOGLE_WATERMARK = "google_watermark";
    private final Map<String, Object> extras;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public RendererConfiguration(Map<String, ? extends Object> extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        this.extras = extras;
    }

    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    public final String getWatermark() {
        Object obj = this.extras.get(GOOGLE_WATERMARK);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Drawable getWatermarkDrawable(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return cr.v.f50929a.convertToRepeatedDrawable(context, getWatermark());
    }
}
