package j;

import android.content.Context;
import android.content.Intent;
import j.a;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends a {
    @Override // j.a
    public Intent createIntent(Context context, String input) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(input, "input");
        return b.f68740a.createIntent$activity_release(new String[]{input});
    }

    @Override // j.a
    public a.C0708a getSynchronousResult(Context context, String input) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(input, "input");
        if (m3.a.checkSelfPermission(context, input) == 0) {
            return new a.C0708a(Boolean.TRUE);
        }
        return null;
    }

    @Override // j.a
    public Boolean parseResult(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
