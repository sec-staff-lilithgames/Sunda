package d2;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final Resources a(w wVar) {
        wVar.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        e0.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final String pluralStringResource(int i10, int i11, w wVar, int i12) throws Resources.NotFoundException {
        String quantityString = a(wVar).getQuantityString(i10, i11);
        e0.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, count)");
        return quantityString;
    }

    public static final String[] stringArrayResource(int i10, w wVar, int i11) throws Resources.NotFoundException {
        String[] stringArray = a(wVar).getStringArray(i10);
        e0.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    public static final String stringResource(int i10, w wVar, int i11) throws Resources.NotFoundException {
        String string = a(wVar).getString(i10);
        e0.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }

    public static final String pluralStringResource(int i10, int i11, Object[] formatArgs, w wVar, int i12) throws Resources.NotFoundException {
        e0.checkNotNullParameter(formatArgs, "formatArgs");
        String quantityString = a(wVar).getQuantityString(i10, i11, Arrays.copyOf(formatArgs, formatArgs.length));
        e0.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        return quantityString;
    }

    public static final String stringResource(int i10, Object[] formatArgs, w wVar, int i11) throws Resources.NotFoundException {
        e0.checkNotNullParameter(formatArgs, "formatArgs");
        String string = a(wVar).getString(i10, Arrays.copyOf(formatArgs, formatArgs.length));
        e0.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        return string;
    }
}
