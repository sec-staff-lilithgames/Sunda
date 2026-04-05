package l5;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends h {
    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        e0.checkNotNullParameter(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        e0.checkNotNullExpressionValue(measurementManager, "get(context)");
        super(measurementManager);
    }
}
