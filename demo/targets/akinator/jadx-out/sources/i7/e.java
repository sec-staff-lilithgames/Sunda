package i7;

import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.e0;
import l7.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements d {
    @Override // i7.d
    public /* bridge */ /* synthetic */ Object map(Object obj, o oVar) {
        return map(((Number) obj).intValue(), oVar);
    }

    public Uri map(int i10, o oVar) {
        try {
            if (oVar.getContext().getResources().getResourceEntryName(i10) == null) {
                return null;
            }
            Uri uri = Uri.parse("android.resource://" + oVar.getContext().getPackageName() + '/' + i10);
            e0.checkNotNullExpressionValue(uri, "parse(this)");
            return uri;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
